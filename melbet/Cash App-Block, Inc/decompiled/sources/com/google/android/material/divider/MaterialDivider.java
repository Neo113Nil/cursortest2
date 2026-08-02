package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public class MaterialDivider extends View {
    public int color;
    public final MaterialShapeDrawable dividerDrawable;
    public int insetEnd;
    public int insetStart;
    public int thickness;

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        this.dividerDrawable = new MaterialShapeDrawable();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialDivider, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        setDividerColor(ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 0).getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.insetEnd : this.insetStart;
        if (z) {
            width = getWidth();
            i = this.insetStart;
        } else {
            width = getWidth();
            i = this.insetEnd;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        MaterialShapeDrawable materialShapeDrawable = this.dividerDrawable;
        materialShapeDrawable.setBounds(i2, 0, i3, bottom);
        materialShapeDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.thickness;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.color != i) {
            this.color = i;
            this.dividerDrawable.setFillColor(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.thickness != i) {
            this.thickness = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context) {
        this(context, null);
    }
}
