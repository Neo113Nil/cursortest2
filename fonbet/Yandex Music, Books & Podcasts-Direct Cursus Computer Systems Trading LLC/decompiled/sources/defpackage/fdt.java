package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fdt {
    public static final ThreadLocal a = new ThreadLocal();

    public static Typeface a(Typeface typeface, rqc rqcVar, Context context) {
        ArrayList arrayList = rqcVar.a;
        if (typeface == null) {
            return null;
        }
        if (arrayList.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(lag.b(arrayList, null, new u8b(21, ff7.i(context)), 31));
        return paint.getTypeface();
    }
}
