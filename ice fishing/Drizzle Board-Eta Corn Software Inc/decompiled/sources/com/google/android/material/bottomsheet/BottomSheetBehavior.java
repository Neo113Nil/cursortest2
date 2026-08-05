package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.kolosta.rejin.jilosa.R;
import defpackage.ej0;
import defpackage.m1;
import defpackage.t60;
import defpackage.tg0;
import defpackage.tr;
import defpackage.u2;
import defpackage.w30;
import defpackage.y00;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends ej0 {
    public final t60 Ey6iv0m0;
    public final int FySoLYna;
    public boolean I5GHvsYW;
    public final boolean KlHjfFWx;
    public final tr OxcuoDLp;
    public final ValueAnimator RXQxj5Oe;
    public int WYNAV5pd;
    public final ColorStateList amk52bBQ;
    public final boolean gjV1z5T1;
    public int lDXGDhIF;
    public boolean sjUBp5pO;
    public final boolean ygLcUYwZ;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        this.ygLcUYwZ = true;
        new tg0(this);
        this.WYNAV5pd = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
        context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.wxUZMvaN);
        int i3 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.amk52bBQ = w30.gjV1z5T1(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.Ey6iv0m0 = t60.P7K7Inc8(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).qoPGr6Ce();
        }
        t60 t60Var = this.Ey6iv0m0;
        if (t60Var != null) {
            tr trVar = new tr(t60Var);
            this.OxcuoDLp = trVar;
            trVar.OnDfzHZD(context);
            ColorStateList colorStateList = this.amk52bBQ;
            if (colorStateList != null) {
                this.OxcuoDLp.OxcuoDLp(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.OxcuoDLp.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.RXQxj5Oe = ofFloat;
        ofFloat.setDuration(500L);
        this.RXQxj5Oe.addUpdateListener(new u2(0, this));
        obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            g2aRJUAd(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            g2aRJUAd(i2);
        }
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        if (this.gjV1z5T1 != z) {
            this.gjV1z5T1 = z;
            if (!z && this.WYNAV5pd == 5 && this.WYNAV5pd != 4) {
                this.WYNAV5pd = 4;
            }
        }
        obtainStyledAttributes.getBoolean(16, false);
        boolean z2 = obtainStyledAttributes.getBoolean(8, true);
        if (this.ygLcUYwZ != z2) {
            this.ygLcUYwZ = z2;
            if (!z2 || (i = this.WYNAV5pd) != 6) {
                i3 = this.WYNAV5pd;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.WYNAV5pd = i3;
            }
            ESscZ9M1(i3);
        }
        obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getInt(13, 0);
        float f = obtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            m1.sjUBp5pO("ratio must be a float value between 0 and 1");
            throw null;
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                m1.sjUBp5pO("offset must be greater than or equal to 0");
                throw null;
            }
            this.FySoLYna = dimensionPixelOffset;
            ESscZ9M1(this.WYNAV5pd);
        } else {
            int i4 = peekValue2.data;
            if (i4 < 0) {
                m1.sjUBp5pO("offset must be greater than or equal to 0");
                throw null;
            }
            this.FySoLYna = i4;
            ESscZ9M1(this.WYNAV5pd);
        }
        obtainStyledAttributes.getInt(14, 500);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.getBoolean(20, false);
        obtainStyledAttributes.getBoolean(21, false);
        obtainStyledAttributes.getBoolean(22, false);
        obtainStyledAttributes.getBoolean(23, true);
        obtainStyledAttributes.getBoolean(17, false);
        obtainStyledAttributes.getBoolean(18, false);
        obtainStyledAttributes.getBoolean(19, false);
        this.KlHjfFWx = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void ESscZ9M1(int i) {
        tr trVar;
        if (i == 2) {
            return;
        }
        boolean z = this.WYNAV5pd == 3 && this.KlHjfFWx;
        if (this.I5GHvsYW == z || (trVar = this.OxcuoDLp) == null) {
            return;
        }
        this.I5GHvsYW = z;
        ValueAnimator valueAnimator = this.RXQxj5Oe;
        if (valueAnimator == null) {
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            trVar.amk52bBQ(this.I5GHvsYW ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            valueAnimator.reverse();
        } else {
            valueAnimator.setFloatValues(trVar.MdtA4re8.jb9XjC4I, z ? 0.0f : 1.0f);
            valueAnimator.start();
        }
    }

    public final void g2aRJUAd(int i) {
        boolean z = this.sjUBp5pO;
        if (i == -1) {
            if (z) {
                return;
            }
            this.sjUBp5pO = true;
        } else if (z || this.lDXGDhIF != i) {
            this.sjUBp5pO = false;
            this.lDXGDhIF = Math.max(0, i);
        }
    }

    public BottomSheetBehavior() {
        this.ygLcUYwZ = true;
        new tg0(this);
        this.WYNAV5pd = 4;
        new ArrayList();
        new ArrayList();
        new SparseIntArray();
        new SparseIntArray();
        new SparseIntArray();
        new Rect();
    }
}
