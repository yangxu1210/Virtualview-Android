/*
 * MIT License
 *
 * Copyright (c) 2018 Alibaba Group
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.tmall.wireless.vaf.virtualview.view.nlayout;

import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.tmall.wireless.vaf.virtualview.container.ClickHelper;
import com.tmall.wireless.vaf.virtualview.container.Container;
import com.tmall.wireless.vaf.virtualview.core.IContainer;
import com.tmall.wireless.vaf.virtualview.core.IView;
import com.tmall.wireless.vaf.virtualview.core.Layout;
import com.tmall.wireless.vaf.virtualview.core.ViewBase;

/**
 * Created by longerian on 2018/3/12.
 *
 * @author longerian
 * @date 2018/03/12
 */

public class NativeLayoutImpl extends Container {

    private final static String TAG = "NativeLayoutImpl_TMTEST";

    protected ViewBase mView;

    public NativeLayoutImpl(Context context) {
        super(context);
    }

    public void setComMeasuredDimension(int measuredWidth, int measuredHeight) {
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    //@Override
    //protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    //    onComMeasure(widthMeasureSpec, heightMeasureSpec);
    //}
    //
    //@Override
    //protected void onLayout(boolean changed, int l, int t, int r, int b) {
    //    Log.d("Longer", "NativeLayoutImpl_TMTEST onLayout " + " " + l + " " + t + " " + r
    //        + " " + b);
    //    onComLayout(changed, l, t, r, b);
    //}
    //
    //@Override
    //protected void onDraw(Canvas canvas) {
    //    super.onDraw(canvas);
    //    if (null != mView && mView.shouldDraw()) {
    //        mView.comDraw(canvas);
    //    }
    //}
    //
    //@Override
    //public void attachViews() {
    //    attachViews(mView);
    //}
    //
    //public void attachViews(ViewBase view) {
    //    if (view instanceof Layout) {
    //        View v = view.getNativeView();
    //        if (null != v && v != this) {
    //            LayoutParams layoutParams = new LayoutParams(view.getComLayoutParams().mLayoutWidth, view.getComLayoutParams().mLayoutHeight);
    //            addView(v, layoutParams);
    //            if (v instanceof NativeLayoutImpl) {
    //                Layout layout = (Layout) view;
    //                List<ViewBase> subViews = layout.getSubViews();
    //                if (null != subViews) {
    //                    for (ViewBase com : subViews) {
    //                        ((NativeLayoutImpl) v).attachViews(com);
    //                    }
    //                }
    //            }
    //        } else {
    //            Layout layout = (Layout) view;
    //            List<ViewBase> subViews = layout.getSubViews();
    //            if (null != subViews) {
    //                for (ViewBase com : subViews) {
    //                    attachViews(com);
    //                }
    //            }
    //        }
    //    } else {
    //        View v = view.getNativeView();
    //        if (null != v) {
    //            LayoutParams layoutParams = new LayoutParams(view.getComLayoutParams().mLayoutWidth, view.getComLayoutParams().mLayoutHeight);
    //            addView(v, layoutParams);
    //        }
    //    }
    //}
    //
    //@Override
    //public void setVirtualView(ViewBase view) {
    //    if (null != view) {
    //        mView = view;
    //        mView.setHoldView(this);
    //        if (mView.shouldDraw()) {
    //            setWillNotDraw(false);
    //        }
    //        //new ClickHelper(this);
    //    }
    //}
    //
    //@Override
    //public ViewBase getVirtualView() {
    //    return mView;
    //}
    //
    //@Override
    //public View getHolderView() {
    //    return this;
    //}
    //
    //@Override
    //public void destroy() {
    //
    //}
    //
    @Override
    public int getType() {
        return -1;
    }
    //
    //@Override
    //public void measureComponent(int widthMeasureSpec, int heightMeasureSpec) {
    //    if (null != mView) {
    //        mView.measureComponent(widthMeasureSpec, heightMeasureSpec);
    //        setMeasuredDimension(mView.getComMeasuredWidth(), mView.getComMeasuredHeight());
    //    }
    //}
    //
    //@Override
    //public void comLayout(int l, int t, int r, int b) {
    //    if (null != mView) {
    //        mView.comLayout(0, 0, r - l, b - t);
    //        this.layout(l, t, r, b);
    //        Log.d("Longer", "NativeLayoutImpl_TMTEST comLayout " + " " + l + " " + t + " " + r
    //            + " " + b);
    //    }
    //}
    //
    //@Override
    //public void onComMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    //    if (null != mView) {
    //        mView.onComMeasure(widthMeasureSpec, heightMeasureSpec);
    //        setMeasuredDimension(mView.getComMeasuredWidth(), mView.getComMeasuredHeight());
    //    }
    //}
    //
    //@Override
    //public void onComLayout(boolean changed, int l, int t, int r, int b) {
    //    if (null != mView) {
    //        mView.onComLayout(changed, 0, 0, r - l, b - t);
    //        Log.d("Longer", "NativeLayoutImpl_TMTEST onComLayout " + " " + l + " " + t + " " + r
    //            + " " + b);
    //    }
    //    this.layout(l, t, r, b);
    //}
    //
    //@Override
    //public int getComMeasuredWidth() {
    //    return this.getMeasuredWidth();
    //}
    //
    //@Override
    //public int getComMeasuredHeight() {
    //    return this.getMeasuredHeight();
    //}
}