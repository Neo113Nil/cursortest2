package com.anythink.expressad.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* loaded from: classes.dex */
public class FeedbackRadioGroup extends RadioGroup {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23280a = "FeedbackRadioGroup";

    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i6 - i) {
                paddingLeft = getPaddingLeft();
                paddingTop += i10;
                i10 = getChildAt(i11).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i10 = Math.max(i10, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i12 = marginLayoutParams.leftMargin + paddingLeft;
            int i13 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i12, i13, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + i13);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i4) {
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i4);
        measureChildren(i, i4);
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i14 = i12 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i14 > size) {
                int max = Math.max(i12, i9);
                i10 += i11;
                i11 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v(f23280a, "maxHeight:" + i10 + "---maxWidth:" + max);
                i6 = max;
                i12 = measuredWidth;
            } else {
                i11 = Math.max(i11, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i6 = i9;
                i12 = i14;
            }
            if (i13 == childCount - 1) {
                i10 += i11;
                i9 = Math.max(i12, i9);
            } else {
                i9 = i6;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i10;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
