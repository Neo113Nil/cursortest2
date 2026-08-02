package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzgcl {
    static {
        Math.log(2.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (java.lang.Math.abs(r8 - r4) == 0.5d) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long zza(double d, RoundingMode roundingMode) {
        double d2;
        long j;
        long j2;
        if (!zzgcm.zza(d)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (zzgck.zza[roundingMode.ordinal()]) {
            case 1:
                zzgcr.zzb(zzb(d));
                d2 = d;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d + " and rounding mode " + String.valueOf(roundingMode));
            case 2:
                if (d < 0.0d && !zzb(d)) {
                    j = (long) d;
                    j2 = -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d > 0.0d && !zzb(d)) {
                    j = (long) d;
                    j2 = 1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!zzb(d)) {
                    j = (long) d;
                    j2 = d > 0.0d ? 1 : -1;
                    d2 = j + j2;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d);
                if (Math.abs(d - d2) == 0.5d) {
                    d2 = d + Math.copySign(0.5d, d);
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d);
                break;
            default:
                throw new AssertionError();
        }
    }

    public static boolean zzb(double d) {
        if (!zzgcm.zza(d)) {
            return false;
        }
        if (d == 0.0d) {
            return true;
        }
        zzfxe.zzf(zzgcm.zza(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? doubleToRawLongBits + doubleToRawLongBits : doubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d);
    }
}
