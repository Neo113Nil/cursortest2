package defpackage;

import android.content.Context;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class yqn {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public yqn(Context context) {
        boolean c = z610.c(context.getTheme(), eng0.elevationOverlayEnabled, false);
        Integer y = vez0.y(eng0.elevationOverlayColor, context);
        int intValue = y != null ? y.intValue() : 0;
        Integer y2 = vez0.y(eng0.elevationOverlayAccentColor, context);
        int intValue2 = y2 != null ? y2.intValue() : 0;
        Integer y3 = vez0.y(eng0.colorSurface, context);
        int intValue3 = y3 != null ? y3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = c;
        this.b = intValue;
        this.c = intValue2;
        this.d = intValue3;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || lhc.f(i, 255) != this.d) {
            return i;
        }
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int Q = vez0.Q(min, lhc.f(i, 255), this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            Q = lhc.d(lhc.f(i2, f), Q);
        }
        return lhc.f(Q, alpha);
    }
}
