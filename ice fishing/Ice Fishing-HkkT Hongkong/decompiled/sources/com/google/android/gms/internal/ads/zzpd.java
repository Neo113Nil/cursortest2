package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzpd {
    public static final zzpd zza = new zzpd(new int[]{2}, 10);
    private static final zzgaa zzb = zzgaa.zzo(2, 5, 6);
    private static final zzgad zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzgac zzgacVar = new zzgac();
        zzgacVar.zza(5, 6);
        zzgacVar.zza(17, 6);
        zzgacVar.zza(7, 6);
        zzgacVar.zza(30, 10);
        zzgacVar.zza(18, 6);
        zzgacVar.zza(6, 8);
        zzgacVar.zza(8, 8);
        zzgacVar.zza(14, 8);
        zzc = zzgacVar.zzc();
    }

    public zzpd(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
        this.zze = 10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzpd)) {
            return false;
        }
        zzpd zzpdVar = (zzpd) obj;
        if (!Arrays.equals(this.zzd, zzpdVar.zzd)) {
            return false;
        }
        int i = zzpdVar.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        if (r6 != 5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x003e, code lost:
    
        if (zzc(30) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zza(zzam zzamVar, zzk zzkVar) {
        int zzg;
        String str = zzamVar.zzm;
        str.getClass();
        int zza2 = zzcb.zza(str, zzamVar.zzj);
        zzgad zzgadVar = zzc;
        if (!zzgadVar.containsKey(Integer.valueOf(zza2))) {
            return null;
        }
        int i = 6;
        if (zza2 == 18) {
            if (zzc(18)) {
                zza2 = 18;
            } else {
                zza2 = 6;
                if (!zzc(zza2)) {
                    return null;
                }
                int i2 = zzamVar.zzz;
                if (i2 == -1 || zza2 == 18) {
                    int i3 = zzamVar.zzA;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    if (zzfy.zza >= 29) {
                        i2 = zzpc.zza(zza2, i3, zzkVar);
                    } else {
                        Integer num = (Integer) zzgadVar.getOrDefault(Integer.valueOf(zza2), 0);
                        num.getClass();
                        i2 = num.intValue();
                    }
                } else if (zzamVar.zzm.equals("audio/vnd.dts.uhd;profile=p2")) {
                    if (i2 > 10) {
                        return null;
                    }
                } else if (i2 > 10) {
                    return null;
                }
                if (zzfy.zza <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (zzfy.zza <= 26 && "fugu".equals(zzfy.zzb) && i == 1) {
                        i = 2;
                    }
                    zzg = zzfy.zzg(i);
                    if (zzg == 0) {
                        return Pair.create(Integer.valueOf(zza2), Integer.valueOf(zzg));
                    }
                    return null;
                }
                i = i2;
                if (zzfy.zza <= 26) {
                    i = 2;
                }
                zzg = zzfy.zzg(i);
                if (zzg == 0) {
                }
            }
        }
        if (zza2 == 8) {
            if (zzc(8)) {
                zza2 = 8;
            }
            zza2 = 7;
            if (!zzc(zza2)) {
            }
        }
        if (zza2 == 30) {
        }
        if (!zzc(zza2)) {
        }
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
