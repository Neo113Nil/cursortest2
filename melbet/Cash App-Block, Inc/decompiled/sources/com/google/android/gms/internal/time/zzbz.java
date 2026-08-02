package com.google.android.gms.internal.time;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzbz {
    public static void zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzcw.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza = zzcw.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static long zzb(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        long j3 = j * j2;
        if (numberOfLeadingZeros > 65) {
            return j3;
        }
        zzd(j, j2, "checkedMultiply", numberOfLeadingZeros >= 64);
        zzd(j, j2, "checkedMultiply", (j >= 0) | (j2 != Long.MIN_VALUE));
        zzd(j, j2, "checkedMultiply", j == 0 || j3 / j == j2);
        return j3;
    }

    public static void zzc(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzd(i2, i3, "end index") : zzcw.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzd(int i, int i2, String str) {
        if (i < 0) {
            return zzcw.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzcw.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public static void zzd(long j, long j2, String str, boolean z) {
        if (z) {
            return;
        }
        Mod$$ExternalSyntheticBUOutline0.m$2(Boxes$$ExternalSyntheticOutline1.m(j2, ", ", ")", re$$ExternalSyntheticOutline0.m("overflow: ", str, "(", j)));
    }

    public static long zzc(long j, long j2) {
        long j3 = j - j2;
        zzd(j, j2, "checkedSubtract", ((j ^ j2) >= 0) | ((j ^ j3) >= 0));
        return j3;
    }

    public static String zza(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static long zza(long j, long j2) {
        long j3 = j + j2;
        zzd(j, j2, "checkedAdd", ((j ^ j2) < 0) | ((j ^ j3) >= 0));
        return j3;
    }

    public static /* synthetic */ boolean zza(int i, zzdg zzdgVar, StringBuilder sb) {
        if (i - 1 != 0 || zzdgVar == zzdg.zza) {
            return false;
        }
        sb.append("<unknown class>");
        sb.append('.');
        sb.append("<unknown method>");
        sb.append(":0");
        return true;
    }

    public static int zzb(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }
}
