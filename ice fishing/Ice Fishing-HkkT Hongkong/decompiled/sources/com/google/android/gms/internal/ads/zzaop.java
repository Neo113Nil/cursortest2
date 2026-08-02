package com.google.android.gms.internal.ads;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaop implements zzaoq {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, FacebookRequestErrorClassification.EC_INVALID_TOKEN, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzacx zzc;
    private final zzaea zzd;
    private final zzaot zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfp zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaop(zzacx zzacxVar, zzaea zzaeaVar, zzaot zzaotVar) throws zzcc {
        this.zzc = zzacxVar;
        this.zzd = zzaeaVar;
        this.zze = zzaotVar;
        int max = Math.max(1, zzaotVar.zzc / 10);
        this.zzi = max;
        zzfp zzfpVar = new zzfp(zzaotVar.zzf);
        zzfpVar.zzk();
        int zzk = zzfpVar.zzk();
        this.zzf = zzk;
        int i = zzaotVar.zzb;
        int i2 = (((zzaotVar.zzd - (i * 4)) * 8) / (zzaotVar.zze * i)) + 1;
        if (zzk != i2) {
            throw zzcc.zza("Expected frames per block: " + i2 + "; got: " + zzk, null);
        }
        int i3 = zzfy.zza;
        int i4 = ((max + zzk) - 1) / zzk;
        this.zzg = new byte[zzaotVar.zzd * i4];
        this.zzh = new zzfp(i4 * (zzk + zzk) * i);
        int i5 = ((zzaotVar.zzc * zzaotVar.zzd) * 8) / zzk;
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/raw");
        zzakVar.zzx(i5);
        zzakVar.zzR(i5);
        zzakVar.zzO((max + max) * i);
        zzakVar.zzy(zzaotVar.zzb);
        zzakVar.zzX(zzaotVar.zzc);
        zzakVar.zzQ(2);
        this.zzj = zzakVar.zzac();
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzs = this.zzl + zzfy.zzs(this.zzn, 1000000L, this.zze.zzc, RoundingMode.FLOOR);
        int zze = zze(i);
        this.zzd.zzt(zzs, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zza(int i, long j) {
        this.zzc.zzO(new zzaow(this.zze, this.zzf, i, j));
        this.zzd.zzl(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzaoq
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003b -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzc(zzacv zzacvVar, long j) throws IOException {
        boolean z;
        int i;
        int zzd;
        int zzd2 = this.zzi - zzd(this.zzm);
        int i2 = zzfy.zza;
        int i3 = (((zzd2 + r3) - 1) / this.zzf) * this.zze.zzd;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.zzk >= i3) {
                    break;
                }
                int zza2 = zzacvVar.zza(this.zzg, this.zzk, (int) Math.min(i3 - r8, j));
                if (zza2 != -1) {
                    this.zzk += zza2;
                }
            }
            i = this.zzk / this.zze.zzd;
            if (i > 0) {
                byte[] bArr = this.zzg;
                zzfp zzfpVar = this.zzh;
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = 0;
                    while (true) {
                        zzaot zzaotVar = this.zze;
                        int i6 = zzaotVar.zzb;
                        if (i5 < i6) {
                            byte[] zzM = zzfpVar.zzM();
                            int i7 = zzaotVar.zzd;
                            int i8 = i4 * i7;
                            int i9 = (i7 / i6) - 4;
                            int i10 = i8 + (i5 * 4);
                            int i11 = bArr[i10 + 1] & 255;
                            int i12 = bArr[i10] & 255;
                            int min = Math.min(bArr[i10 + 2] & 255, 88);
                            int i13 = zzb[min];
                            int i14 = (this.zzf * i4 * i6) + i5;
                            int i15 = (short) ((i11 << 8) | i12);
                            int i16 = i14 + i14;
                            zzM[i16] = (byte) (i15 & 255);
                            zzM[i16 + 1] = (byte) (i15 >> 8);
                            int i17 = 0;
                            while (i17 < i9 + i9) {
                                byte b = bArr[(i6 * 4) + i10 + ((i17 / 8) * i6 * 4) + ((i17 / 2) % 4)];
                                byte[] bArr2 = bArr;
                                int i18 = i17 % 2 == 0 ? b & Ascii.SI : (b & 255) >> 4;
                                int i19 = i18 & 7;
                                int i20 = (((i19 + i19) + 1) * i13) >> 3;
                                if ((i18 & 8) != 0) {
                                    i20 = -i20;
                                }
                                i15 = Math.max(-32768, Math.min(i15 + i20, 32767));
                                int i21 = i16 + i6 + i6;
                                zzM[i21] = (byte) (i15 & 255);
                                zzM[i21 + 1] = (byte) (i15 >> 8);
                                min = Math.max(0, Math.min(min + zza[i18], 88));
                                i13 = zzb[min];
                                i17++;
                                i16 = i21;
                                bArr = bArr2;
                            }
                            i5++;
                        }
                    }
                }
                int zze = zze(this.zzf * i);
                zzfpVar.zzK(0);
                zzfpVar.zzJ(zze);
                this.zzk -= i * this.zze.zzd;
                zzfp zzfpVar2 = this.zzh;
                zzaea zzaeaVar = this.zzd;
                int zze2 = zzfpVar2.zze();
                zzady.zzb(zzaeaVar, zzfpVar2, zze2);
                int i22 = this.zzm + zze2;
                this.zzm = i22;
                int zzd3 = zzd(i22);
                int i23 = this.zzi;
                if (zzd3 >= i23) {
                    zzf(i23);
                }
            }
            if (z && (zzd = zzd(this.zzm)) > 0) {
                zzf(zzd);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.zzk / this.zze.zzd;
        if (i > 0) {
        }
        if (z) {
            zzf(zzd);
        }
        return z;
    }
}
