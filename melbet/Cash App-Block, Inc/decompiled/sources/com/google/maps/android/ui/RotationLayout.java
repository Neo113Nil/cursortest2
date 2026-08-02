package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class RotationLayout extends FrameLayout {
    public int mRotation;

    public RotationLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i = this.mRotation;
        if (i == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i == 1) {
            canvas.translate(getWidth(), RecyclerView.DECELERATION_RATE);
            canvas.rotate(90.0f, getWidth() / 2, RecyclerView.DECELERATION_RATE);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(RecyclerView.DECELERATION_RATE, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, RecyclerView.DECELERATION_RATE);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.mRotation;
        if (i3 != 1 && i3 != 3) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i) {
        this.mRotation = ((i + 360) % 360) / 90;
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
