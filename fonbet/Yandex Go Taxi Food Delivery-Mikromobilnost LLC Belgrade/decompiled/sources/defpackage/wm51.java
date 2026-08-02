package defpackage;

import android.graphics.Typeface;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes9.dex */
public final class wm51 implements lp11 {
    public static Typeface a(TaxiApplication taxiApplication, int i, int i2) {
        return (i2 & 2) == 2 ? lp11.i(taxiApplication, y4h0.ys_text_regular_italic) : i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? lp11.i(taxiApplication, y4h0.ya_regular) : lp11.i(taxiApplication, s5h0.ya_display_heavy) : lp11.i(taxiApplication, e5h0.ya_bold) : lp11.i(taxiApplication, x4h0.ya_medium) : lp11.i(taxiApplication, u4h0.ya_display_thin) : lp11.i(taxiApplication, v4h0.ya_light) : lp11.i(taxiApplication, y4h0.ya_regular);
    }

    @Override // defpackage.lp11
    public final Typeface b(int i, int i2) {
        TaxiApplication.Companion.getClass();
        TaxiApplication taxiApplication = TaxiApplication.sInstance;
        if (taxiApplication == null) {
            return Typeface.DEFAULT;
        }
        i5z a = taxiApplication.getUserLocalePreferences(taxiApplication).a();
        if (jl40.l(a, i5z.d) || jl40.l(a, i5z.e) || jl40.l(a, i5z.i)) {
            try {
                return a(taxiApplication, i, i2);
            } catch (Exception e) {
                jst.e.k(e, "Failed to load Yandex Sans");
                return gi.c(taxiApplication, i);
            }
        }
        if (jl40.l(a, i5z.f)) {
            Typeface b = wuj0.b(a5h0.noto_sans_armenian_regular, taxiApplication);
            return b == null ? Typeface.DEFAULT : b;
        }
        if (!jl40.l(a, i5z.h)) {
            return gi.c(taxiApplication, i);
        }
        Typeface b2 = wuj0.b(b5h0.noto_sans_georgian_regular, taxiApplication);
        return b2 == null ? Typeface.DEFAULT : b2;
    }
}
