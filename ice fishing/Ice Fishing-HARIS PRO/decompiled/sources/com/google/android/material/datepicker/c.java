package com.google.android.material.datepicker;

import a.AbstractC0078a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.lumenpath.harispro.hrnavigator.R;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final S0.e f2510a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.e f2511b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0078a.Y(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, AbstractC0358a.f4450o);
        S0.e.d(context, obtainStyledAttributes.getResourceId(4, 0));
        S0.e.d(context, obtainStyledAttributes.getResourceId(2, 0));
        S0.e.d(context, obtainStyledAttributes.getResourceId(3, 0));
        S0.e.d(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList B2 = AbstractC0078a.B(context, obtainStyledAttributes, 7);
        this.f2510a = S0.e.d(context, obtainStyledAttributes.getResourceId(9, 0));
        S0.e.d(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2511b = S0.e.d(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(B2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
