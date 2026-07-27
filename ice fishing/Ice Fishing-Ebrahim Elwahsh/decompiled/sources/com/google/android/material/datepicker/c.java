package com.google.android.material.datepicker;

import a.AbstractC0415a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final L2.i f36105a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.i f36106b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0415a.B(context, k.class.getCanonicalName(), C5284R.attr.materialCalendarStyle).data, AbstractC4576a.f38302l);
        L2.i.l(context, obtainStyledAttributes.getResourceId(4, 0));
        L2.i.l(context, obtainStyledAttributes.getResourceId(2, 0));
        L2.i.l(context, obtainStyledAttributes.getResourceId(3, 0));
        L2.i.l(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList o9 = com.bumptech.glide.d.o(context, obtainStyledAttributes, 7);
        this.f36105a = L2.i.l(context, obtainStyledAttributes.getResourceId(9, 0));
        L2.i.l(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f36106b = L2.i.l(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(o9.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
