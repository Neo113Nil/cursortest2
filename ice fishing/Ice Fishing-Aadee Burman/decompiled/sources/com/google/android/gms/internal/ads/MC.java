package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public abstract class MC {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26268a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d2) {
        if (d2 > 0.0d && MA.s(d2)) {
            long a9 = MA.a(d2);
            if ((a9 & ((-1) + a9)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(double d2) {
        boolean a9;
        RoundingMode roundingMode = RoundingMode.CEILING;
        AbstractC2772Sd.q("x must be positive and finite", d2 > 0.0d && MA.s(d2));
        int exponent = Math.getExponent(d2);
        if (Math.getExponent(d2) < -1022) {
            return b(d2 * 4.503599627370496E15d) - 52;
        }
        switch (LC.f26074a[roundingMode.ordinal()]) {
            case 1:
                QC.j(a(d2));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r2 = !a(d2);
                return !r2 ? exponent + 1 : exponent;
            case 4:
                r2 = exponent < 0;
                a9 = a(d2);
                r2 &= !a9;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                a9 = a(d2);
                r2 &= !a9;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d2) & 4503599627370495L) | 4607182418800017408L);
                if (longBitsToDouble * longBitsToDouble > 2.0d) {
                    r2 = true;
                }
                if (!r2) {
                }
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean c(double d2) {
        if (MA.s(d2)) {
            return d2 == 0.0d || 52 - Long.numberOfTrailingZeros(MA.a(d2)) <= Math.getExponent(d2);
        }
        return false;
    }
}
