package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;
import com.google.common.primitives.SignedBytes;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaby {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, PointerIconCompat.TYPE_CONTEXT_MENU, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
    
        if (r12 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r12 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzabx zza(zzfo zzfoVar) {
        int i;
        int i2;
        int zzd;
        int zzd2 = zzfoVar.zzd(16);
        int zzd3 = zzfoVar.zzd(16);
        if (zzd3 == 65535) {
            zzd3 = zzfoVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzd3 + i;
        if (zzd2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzd4 = zzfoVar.zzd(2);
        int i5 = 0;
        if (zzd4 == 3) {
            int i6 = 0;
            while (true) {
                zzd = i6 + zzfoVar.zzd(2);
                if (!zzfoVar.zzo()) {
                    break;
                }
                i6 = (zzd + 1) << 2;
            }
            zzd4 = zzd + 3;
        }
        int i7 = zzd4;
        int zzd5 = zzfoVar.zzd(10);
        if (zzfoVar.zzo() && zzfoVar.zzd(3) > 0) {
            zzfoVar.zzm(2);
        }
        int i8 = true != zzfoVar.zzo() ? 44100 : 48000;
        int zzd6 = zzfoVar.zzd(4);
        if (i8 == 44100 && zzd6 == 13) {
            i2 = zzb[13];
        } else {
            if (i8 == 48000 && zzd6 < 14) {
                i5 = zzb[zzd6];
                int i9 = zzd5 % 5;
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (zzd6 != 8) {
                        }
                        i5++;
                    } else if (i9 != 3) {
                        if (i9 == 4) {
                            if (zzd6 != 3) {
                                if (zzd6 != 8) {
                                }
                            }
                            i5++;
                        }
                    }
                }
                if (zzd6 != 3) {
                }
                i5++;
            }
            i2 = i5;
        }
        return new zzabx(i7, 2, i8, i4, i2, null);
    }

    public static void zzb(int i, zzfp zzfpVar) {
        zzfpVar.zzH(7);
        byte[] zzM = zzfpVar.zzM();
        zzM[0] = -84;
        zzM[1] = SignedBytes.MAX_POWER_OF_TWO;
        zzM[2] = -1;
        zzM[3] = -1;
        zzM[4] = (byte) ((i >> 16) & 255);
        zzM[5] = (byte) ((i >> 8) & 255);
        zzM[6] = (byte) (i & 255);
    }
}
