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
    private static final String f22493a = "FeedbackRadioGroup";

    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i9 - i) {
                paddingLeft = getPaddingLeft();
                paddingTop += i11;
                i11 = getChildAt(i12).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i11 = Math.max(i11, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i13 = marginLayoutParams.leftMargin + paddingLeft;
            int i14 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i13, i14, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + i14);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i6) {
        int i9;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        measureChildren(i, i6);
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i15 = i13 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i15 > size) {
                int max = Math.max(i13, i10);
                i11 += i12;
                i12 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v(f22493a, "maxHeight:" + i11 + "---maxWidth:" + max);
                i9 = max;
                i13 = measuredWidth;
            } else {
                i12 = Math.max(i12, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                i9 = i10;
                i13 = i15;
            }
            if (i14 == childCount - 1) {
                i11 += i12;
                i10 = Math.max(i13, i10);
            } else {
                i10 = i9;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + i10;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i11;
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
