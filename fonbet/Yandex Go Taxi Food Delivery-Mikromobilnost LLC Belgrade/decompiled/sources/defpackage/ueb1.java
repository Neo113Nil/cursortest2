package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class ueb1 {
    public static final boolean a(Rational rational) {
        return jl40.l(rational, Rational.NaN) || jl40.l(rational, Rational.ZERO) || jl40.l(rational, Rational.NEGATIVE_INFINITY) || jl40.l(rational, Rational.POSITIVE_INFINITY);
    }

    public static final float b(long j, float f, fwi fwiVar) {
        if (sty0.a(j, sty0.c)) {
            return f;
        }
        long b = sty0.b(j);
        if (tty0.a(b, 4294967296L)) {
            return fwiVar.i0(j);
        }
        if (tty0.a(b, 8589934592L)) {
            return sty0.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float c(long j, float f, fwi fwiVar) {
        float c;
        long b = sty0.b(j);
        if (tty0.a(b, 4294967296L)) {
            if (fwiVar.u0() <= 1.05d) {
                return fwiVar.i0(j);
            }
            c = sty0.c(j) / sty0.c(fwiVar.n(f));
        } else {
            if (!tty0.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = sty0.c(j);
        }
        return c * f;
    }

    public static final void d(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(rzo.X(j)), i, i2, 33);
        }
    }

    public static final void e(Spannable spannable, long j, fwi fwiVar, int i, int i2) {
        long b = sty0.b(j);
        if (tty0.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(m810.b(fwiVar.i0(j)), false), i, i2, 33);
        } else if (tty0.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(sty0.c(j)), i, i2, 33);
        }
    }

    public static final void f(Spannable spannable, k5z k5zVar, int i, int i2) {
        if (k5zVar != null) {
            ArrayList arrayList = new ArrayList(tcc.n(k5zVar, 10));
            Iterator it = k5zVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((h5z) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final int g(int i, Rational rational) {
        if (rational == null) {
            return i;
        }
        if (!a(rational)) {
            return m810.b(rational.floatValue() * i);
        }
        rational.toString();
        sgb1.g(5, "CaptureEncodeRates");
        return i;
    }
}
