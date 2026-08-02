package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.IceFishing.LiveIceFishing.C5248R;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final G3.e f36710a;

    /* renamed from: b, reason: collision with root package name */
    public final G3.e f36711b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.bumptech.glide.e.h(context, j.class.getCanonicalName(), C5248R.attr.materialCalendarStyle).data, AbstractC4742a.f39428l);
        G3.e.p(context, obtainStyledAttributes.getResourceId(4, 0));
        G3.e.p(context, obtainStyledAttributes.getResourceId(2, 0));
        G3.e.p(context, obtainStyledAttributes.getResourceId(3, 0));
        G3.e.p(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList j6 = com.bumptech.glide.f.j(context, obtainStyledAttributes, 7);
        this.f36710a = G3.e.p(context, obtainStyledAttributes.getResourceId(9, 0));
        G3.e.p(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f36711b = G3.e.p(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(j6.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
