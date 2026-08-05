package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.kolosta.rejin.jilosa.R;
import defpackage.ej0;
import defpackage.t60;
import defpackage.tg0;
import defpackage.tr;
import defpackage.w30;
import defpackage.y00;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends ej0 {
    public int OxcuoDLp;
    public final ColorStateList lDXGDhIF;
    public final t60 sjUBp5pO;
    public final tr ygLcUYwZ;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new tg0(this);
        this.OxcuoDLp = 5;
        new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y00.WYNAV5pd);
        if (obtainStyledAttributes.hasValue(3)) {
            this.lDXGDhIF = w30.gjV1z5T1(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.sjUBp5pO = t60.P7K7Inc8(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).qoPGr6Ce();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            obtainStyledAttributes.getResourceId(5, -1);
        }
        t60 t60Var = this.sjUBp5pO;
        if (t60Var != null) {
            tr trVar = new tr(t60Var);
            this.ygLcUYwZ = trVar;
            trVar.OnDfzHZD(context);
            ColorStateList colorStateList = this.lDXGDhIF;
            if (colorStateList != null) {
                this.ygLcUYwZ.OxcuoDLp(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.ygLcUYwZ.setTint(typedValue.data);
            }
        }
        obtainStyledAttributes.getDimension(2, -1.0f);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new tg0(this);
        this.OxcuoDLp = 5;
        new LinkedHashSet();
    }
}
