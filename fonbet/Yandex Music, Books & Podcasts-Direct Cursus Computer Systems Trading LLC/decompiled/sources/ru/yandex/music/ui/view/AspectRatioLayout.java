package ru.yandex.music.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.pq1;
import defpackage.zdn;

/* loaded from: classes6.dex */
public class AspectRatioLayout extends FrameLayout {
    public final float a;
    public int b;
    public int c;

    public AspectRatioLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zdn.a, i, 0);
        float f = obtainStyledAttributes.getFloat(2, 1.0f);
        this.a = f;
        float f2 = obtainStyledAttributes.getFloat(1, 1.0f);
        pq1 pq1Var = pq1.values()[obtainStyledAttributes.getInt(0, 0)];
        obtainStyledAttributes.recycle();
        int ordinal = pq1Var.ordinal();
        if (ordinal == 0) {
            int i2 = (int) (f2 * getResources().getDisplayMetrics().widthPixels);
            this.b = i2;
            this.c = (int) (f * i2);
        } else {
            if (ordinal != 1) {
                throw new EnumConstantNotPresentException(pq1.class, pq1Var.toString());
            }
            int i3 = (int) (f2 * getResources().getDisplayMetrics().heightPixels);
            this.c = i3;
            this.b = (int) (i3 / f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, size);
        } else if (mode != 0) {
            i3 = mode != 1073741824 ? 0 : size;
        }
        int i5 = this.c;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i5, size2);
        } else if (mode2 == 0) {
            i4 = i5;
        } else if (mode2 == 1073741824) {
            i4 = size2;
        }
        int i6 = this.b;
        float f = this.a;
        if (i3 < i6) {
            this.b = i3;
            this.c = (int) (i3 * f);
        }
        if (i4 < this.c) {
            this.c = i4;
            this.b = (int) (i4 / f);
        }
        setMeasuredDimension(i3, i4);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
    }

    public AspectRatioLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioLayout(Context context) {
        this(context, null);
    }
}
