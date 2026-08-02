package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
public abstract class MC {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27059a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d9) {
        if (d9 > 0.0d && MA.s(d9)) {
            long a9 = MA.a(d9);
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
    public static int b(double d9) {
        boolean a9;
        RoundingMode roundingMode = RoundingMode.CEILING;
        AbstractC2792Sd.q("x must be positive and finite", d9 > 0.0d && MA.s(d9));
        int exponent = Math.getExponent(d9);
        if (Math.getExponent(d9) < -1022) {
            return b(d9 * 4.503599627370496E15d) - 52;
        }
        switch (LC.f26874a[roundingMode.ordinal()]) {
            case 1:
                QC.j(a(d9));
                return exponent;
            case 2:
                return exponent;
            case 3:
                r2 = !a(d9);
                return !r2 ? exponent + 1 : exponent;
            case 4:
                r2 = exponent < 0;
                a9 = a(d9);
                r2 &= !a9;
                if (!r2) {
                }
                break;
            case 5:
                r2 = exponent >= 0;
                a9 = a(d9);
                r2 &= !a9;
                if (!r2) {
                }
                break;
            case 6:
            case 7:
            case 8:
                double longBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d9) & 4503599627370495L) | 4607182418800017408L);
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

    public static boolean c(double d9) {
        if (MA.s(d9)) {
            return d9 == 0.0d || 52 - Long.numberOfTrailingZeros(MA.a(d9)) <= Math.getExponent(d9);
        }
        return false;
    }
}
