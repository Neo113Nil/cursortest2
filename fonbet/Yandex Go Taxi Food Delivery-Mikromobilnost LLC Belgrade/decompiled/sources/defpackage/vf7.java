package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes11.dex */
public final class vf7 {
    public final mf7 a;
    public final mf7 b;
    public final mf7 c;
    public final mf7 d;
    public final mf7 e;
    public final mf7 f;
    public final mf7 g;
    public final Paint h;

    public vf7(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(z610.f(context, eng0.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, z2i0.MaterialCalendar);
        this.a = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_dayStyle, 0), context);
        this.g = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_dayInvalidStyle, 0), context);
        this.b = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_daySelectedStyle, 0), context);
        this.c = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_dayTodayStyle, 0), context);
        ColorStateList o = jx81.o(context, obtainStyledAttributes, z2i0.MaterialCalendar_rangeFillColor);
        this.d = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_yearStyle, 0), context);
        this.e = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_yearSelectedStyle, 0), context);
        this.f = mf7.a(obtainStyledAttributes.getResourceId(z2i0.MaterialCalendar_yearTodayStyle, 0), context);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(o.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
