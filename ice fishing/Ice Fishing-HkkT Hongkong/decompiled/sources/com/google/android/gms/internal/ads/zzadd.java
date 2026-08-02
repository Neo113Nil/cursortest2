package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzadd {
    public static int zza(zzfp zzfpVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzfpVar.zzm() + 1;
            case 7:
                return zzfpVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzacv zzacvVar, zzadh zzadhVar) throws IOException {
        zzacvVar.zzj();
        zzack zzackVar = (zzack) zzacvVar;
        zzackVar.zzl(1, false);
        byte[] bArr = new byte[1];
        zzackVar.zzm(bArr, 0, 1, false);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzackVar.zzl(2, false);
        int i2 = 1 != i ? 6 : 7;
        zzfp zzfpVar = new zzfp(i2);
        zzfpVar.zzJ(zzacy.zza(zzacvVar, zzfpVar.zzM(), 0, i2));
        zzacvVar.zzj();
        zzadc zzadcVar = new zzadc();
        if (zzd(zzfpVar, zzadhVar, z, zzadcVar)) {
            return zzadcVar.zza;
        }
        throw zzcc.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r3 != r22.zzf) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if ((r21.zzm() * 1000) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0099, code lost:
    
        if (r4 == r5) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zzc(zzfp zzfpVar, zzadh zzadhVar, int i, zzadc zzadcVar) {
        int zza;
        int zzd = zzfpVar.zzd();
        long zzu = zzfpVar.zzu();
        long j = zzu >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = zzu >> 12;
        long j3 = zzu >> 8;
        long j4 = zzu >> 4;
        long j5 = zzu >> 1;
        long j6 = zzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || zzadhVar.zzg != 2) : i2 == zzadhVar.zzg - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == zzadhVar.zzi) && j6 != 1 && zzd(zzfpVar, zzadhVar, z, zzadcVar) && (zza = zza(zzfpVar, (int) (j2 & 15))) != -1 && zza <= zzadhVar.zzb) {
                int i4 = zzadhVar.zze;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 > 11) {
                        if (i5 != 12) {
                            if (i5 <= 14) {
                                int zzq = zzfpVar.zzq();
                                if (i5 == 14) {
                                    zzq *= 10;
                                }
                            }
                        }
                    }
                }
                if (zzfpVar.zzm() == zzfy.zze(zzfpVar.zzM(), zzd, zzfpVar.zzd() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzfp zzfpVar, zzadh zzadhVar, boolean z, zzadc zzadcVar) {
        try {
            long zzw = zzfpVar.zzw();
            if (!z) {
                zzw *= zzadhVar.zzb;
            }
            zzadcVar.zza = zzw;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
