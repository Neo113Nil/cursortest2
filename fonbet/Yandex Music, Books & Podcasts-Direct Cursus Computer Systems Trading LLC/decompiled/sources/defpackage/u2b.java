package defpackage;

import android.content.Context;
import android.graphics.Color;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class u2b {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public u2b(Context context) {
        boolean D = ngg.D(context, R.attr.elevationOverlayEnabled, false);
        int O = qgg.O(context, R.attr.elevationOverlayColor, 0);
        int O2 = qgg.O(context, R.attr.elevationOverlayAccentColor, 0);
        int O3 = qgg.O(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = D;
        this.b = O;
        this.c = O2;
        this.d = O3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || aa5.l(i, KotlinVersion.MAX_COMPONENT_VALUE) != this.d) {
            return i;
        }
        float min = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int W = qgg.W(aa5.l(i, KotlinVersion.MAX_COMPONENT_VALUE), min, this.b);
        if (min > 0.0f && (i2 = this.c) != 0) {
            W = aa5.i(aa5.l(i2, f), W);
        }
        return aa5.l(W, alpha);
    }
}
