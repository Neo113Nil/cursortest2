package com.google.android.material.datepicker;

import L3.F;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.icefishingapp.icefishing.C5275R;
import k3.AbstractC4632a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final M2.i f35942a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.i f35943b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F.r(context, j.class.getCanonicalName(), C5275R.attr.materialCalendarStyle).data, AbstractC4632a.f38639l);
        M2.i.o(context, obtainStyledAttributes.getResourceId(4, 0));
        M2.i.o(context, obtainStyledAttributes.getResourceId(2, 0));
        M2.i.o(context, obtainStyledAttributes.getResourceId(3, 0));
        M2.i.o(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList m4 = O3.b.m(context, obtainStyledAttributes, 7);
        this.f35942a = M2.i.o(context, obtainStyledAttributes.getResourceId(9, 0));
        M2.i.o(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f35943b = M2.i.o(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(m4.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
