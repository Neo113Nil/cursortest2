package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzalk {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalk(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        if (r5 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8 A[Catch: RuntimeException -> 0x0127, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0127, blocks: (B:7:0x003c, B:9:0x004b, B:10:0x0058, B:12:0x005c, B:13:0x0069, B:15:0x006d, B:16:0x007a, B:18:0x007e, B:20:0x0084, B:22:0x00a1, B:24:0x00a6, B:27:0x00b5, B:29:0x00b9, B:32:0x00ca, B:34:0x00ce, B:37:0x00df, B:39:0x00e3, B:42:0x00f4, B:44:0x00f8, B:46:0x00fe, B:51:0x0119, B:50:0x010b, B:64:0x008c), top: B:6:0x003c, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzalk zzb(String str, zzali zzaliVar) {
        float f;
        int i;
        int i2;
        String trim;
        zzek.zzd(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i3 = zzaliVar.zzk;
        if (length != i3) {
            zzff.zzf("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i3), Integer.valueOf(length), str));
            return null;
        }
        try {
            String trim2 = split[zzaliVar.zza].trim();
            int i4 = zzaliVar.zzb;
            int zzd = i4 != -1 ? zzd(split[i4].trim()) : -1;
            int i5 = zzaliVar.zzc;
            Integer zzc = i5 != -1 ? zzc(split[i5].trim()) : null;
            int i6 = zzaliVar.zzd;
            Integer zzc2 = i6 != -1 ? zzc(split[i6].trim()) : null;
            int i7 = zzaliVar.zze;
            if (i7 != -1) {
                String trim3 = split[i7].trim();
                try {
                    f = Float.parseFloat(trim3);
                } catch (NumberFormatException e) {
                    zzff.zzg("SsaStyle", "Failed to parse font size: '" + trim3 + "'", e);
                }
                int i8 = zzaliVar.zzf;
                boolean z = i8 == -1 && zze(split[i8].trim());
                int i9 = zzaliVar.zzg;
                boolean z2 = i9 == -1 && zze(split[i9].trim());
                int i10 = zzaliVar.zzh;
                boolean z3 = i10 == -1 && zze(split[i10].trim());
                int i11 = zzaliVar.zzi;
                boolean z4 = i11 == -1 && zze(split[i11].trim());
                i = zzaliVar.zzj;
                if (i != -1) {
                    trim = split[i].trim();
                    try {
                        i2 = Integer.parseInt(trim.trim());
                        if (i2 != 1) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return new zzalk(trim2, zzd, zzc, zzc2, f, z, z2, z3, z4, i2);
                }
                i2 = -1;
                return new zzalk(trim2, zzd, zzc, zzc2, f, z, z2, z3, z4, i2);
            }
            f = -3.4028235E38f;
            int i82 = zzaliVar.zzf;
            if (i82 == -1) {
            }
            int i92 = zzaliVar.zzg;
            if (i92 == -1) {
            }
            int i102 = zzaliVar.zzh;
            if (i102 == -1) {
            }
            int i112 = zzaliVar.zzi;
            if (i112 == -1) {
            }
            i = zzaliVar.zzj;
            if (i != -1) {
            }
            i2 = -1;
            return new zzalk(trim2, zzd, zzc, zzc2, f, z, z2, z3, z4, i2);
        } catch (RuntimeException e2) {
            zzff.zzg("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
        zzff.zzf("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim)));
        i2 = -1;
        return new zzalk(trim2, zzd, zzc, zzc2, f, z, z2, z3, z4, i2);
    }

    public static Integer zzc(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzek.zzd(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgcu.zza(((parseLong >> 24) & 255) ^ 255), zzgcu.zza(parseLong & 255), zzgcu.zza((parseLong >> 8) & 255), zzgcu.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            zzff.zzg("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                zzff.zzf("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            zzff.zzg("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
