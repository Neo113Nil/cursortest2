package com.squareup.cash.payments.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.ui.widget.MaxWidthFrameLayout;

/* loaded from: classes4.dex */
public final class BillConstraintLayout extends MaxWidthFrameLayout {
    public final float aspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BillConstraintLayout);
        obtainStyledAttributes.getClass();
        float f = obtainStyledAttributes.getFloat(0, RecyclerView.DECELERATION_RATE);
        obtainStyledAttributes.recycle();
        this.aspectRatio = f;
    }

    @Override // com.squareup.cash.ui.widget.MaxWidthFrameLayout, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float f = this.aspectRatio;
        if (f == RecyclerView.DECELERATION_RATE) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i3 = (int) (measuredWidth / f);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            childAt.measure(ViewGroup.getChildMeasureSpec(1073741824, 0, measuredWidth - (layoutParams2.leftMargin + layoutParams2.rightMargin)), ViewGroup.getChildMeasureSpec(1073741824, 0, i3 - (layoutParams2.topMargin + layoutParams2.bottomMargin)));
        }
        setMeasuredDimension(measuredWidth, i3);
    }
}
