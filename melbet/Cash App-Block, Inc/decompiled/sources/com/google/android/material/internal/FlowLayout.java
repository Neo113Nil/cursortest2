package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R$styleable;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {
    public int itemSpacing;
    public int lineSpacing;
    public int rowCount;
    public boolean singleLine;

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.singleLine = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FlowLayout, 0, 0);
        this.lineSpacing = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.itemSpacing = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7 = 0;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        boolean z3 = true;
        this.rowCount = 1;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = 0;
        int i9 = paddingRight;
        int i10 = paddingTop;
        while (i8 < getChildCount()) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z2 = z3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = i7;
                    i6 = i5;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i9 + i6;
                int i11 = i3 - i;
                z2 = z3;
                int i12 = i11 - paddingLeft;
                if (!this.singleLine && measuredWidth > i12) {
                    measuredWidth = childAt.getMeasuredWidth() + paddingRight + i6;
                    i10 = paddingTop + this.lineSpacing;
                    this.rowCount++;
                    i9 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                if (z4) {
                    childAt.layout(i11 - measuredWidth, i10, (i11 - i9) - i6, measuredHeight);
                } else {
                    childAt.layout(i9 + i6, i10, measuredWidth, measuredHeight);
                }
                i9 += childAt.getMeasuredWidth() + i6 + i5 + this.itemSpacing;
                paddingTop = measuredHeight;
            }
            i8++;
            z3 = z2;
            i7 = 0;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = i4;
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !isSingleLine()) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.lineSpacing;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i10 + this.itemSpacing + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i10;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context) {
        this(context, null);
    }
}
