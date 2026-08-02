package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: n, reason: collision with root package name */
    public int f36788n;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f36788n = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f36788n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i6 - i) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int baseline = (this.f36788n == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f36788n + paddingTop) - childAt.getBaseline();
                childAt.layout(i11, baseline, measuredWidth + i11, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int childCount = getChildCount();
        int i6 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i4);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i11 = Math.max(i11, baseline);
                    i12 = Math.max(i12, childAt.getMeasuredHeight() - baseline);
                }
                i9 = Math.max(i9, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
            }
        }
        if (i11 != -1) {
            i6 = Math.max(i6, Math.max(i12, getPaddingBottom()) + i11);
            this.f36788n = i11;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i9, getSuggestedMinimumWidth()), i, i10), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i4, i10 << 16));
    }
}
