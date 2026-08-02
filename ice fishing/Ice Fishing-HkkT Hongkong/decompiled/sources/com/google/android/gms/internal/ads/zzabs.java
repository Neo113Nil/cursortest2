package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzabs {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzabr zza(byte[] bArr) throws zzcc {
        return zzb(new zzfo(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabr zzb(zzfo zzfoVar, boolean z) throws zzcc {
        int zzc2 = zzc(zzfoVar);
        int zzd = zzd(zzfoVar);
        int zzd2 = zzfoVar.zzd(4);
        String str = "mp4a.40." + zzc2;
        int i = 22;
        if (zzc2 == 5 || zzc2 == 29) {
            zzd = zzd(zzfoVar);
            zzc2 = zzc(zzfoVar);
            if (zzc2 == 22) {
                zzd2 = zzfoVar.zzd(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (zzc2 != 1 && zzc2 != 2 && zzc2 != 3 && zzc2 != 4 && zzc2 != 6 && zzc2 != 7 && zzc2 != 17) {
                switch (zzc2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw zzcc.zzc("Unsupported audio object type: " + zzc2);
                }
            }
            if (zzfoVar.zzo()) {
                zzff.zzf("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zzfoVar.zzo()) {
                zzfoVar.zzm(14);
            }
            boolean zzo = zzfoVar.zzo();
            if (zzd2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (zzc2 != 6) {
                if (zzc2 == 20) {
                    zzc2 = 20;
                }
                if (zzo) {
                    if (zzc2 == 22) {
                        zzfoVar.zzm(16);
                    } else {
                        i = zzc2;
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        zzfoVar.zzm(3);
                    }
                    zzfoVar.zzm(1);
                }
                switch (zzc2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int zzd3 = zzfoVar.zzd(2);
                        if (zzd3 == 2) {
                            i2 = zzd3;
                        }
                        throw zzcc.zzc("Unsupported epConfig: " + i2);
                }
            }
            zzfoVar.zzm(3);
            if (zzo) {
            }
            switch (zzc2) {
            }
        }
        int i3 = zzc[zzd2];
        if (i3 != -1) {
            return new zzabr(zzd, i3, str, null);
        }
        throw zzcc.zza(null, null);
    }

    private static int zzc(zzfo zzfoVar) {
        int zzd = zzfoVar.zzd(5);
        return zzd == 31 ? zzfoVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzfo zzfoVar) throws zzcc {
        int zzd = zzfoVar.zzd(4);
        if (zzd == 15) {
            if (zzfoVar.zza() >= 24) {
                return zzfoVar.zzd(24);
            }
            throw zzcc.zza("AAC header insufficient data", null);
        }
        if (zzd < 13) {
            return zzb[zzd];
        }
        throw zzcc.zza("AAC header wrong Sampling Frequency Index", null);
    }
}
