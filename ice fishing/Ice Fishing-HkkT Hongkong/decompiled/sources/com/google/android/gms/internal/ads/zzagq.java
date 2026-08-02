package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzagq {
    public static final zzago zza = new zzago() { // from class: com.google.android.gms.internal.ads.zzagn
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzby zza(byte[] bArr, int i, zzago zzagoVar, zzafr zzafrVar) {
        zzagp zzagpVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        zzfp zzfpVar = new zzfp(bArr, i);
        boolean z2 = false;
        if (zzfpVar.zzb() < 10) {
            zzff.zzf("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzo = zzfpVar.zzo();
            if (zzo == 4801587) {
                int zzm = zzfpVar.zzm();
                zzfpVar.zzL(1);
                int zzm2 = zzfpVar.zzm();
                int zzl = zzfpVar.zzl();
                if (zzm == 2) {
                    if ((zzm2 & 64) != 0) {
                        zzff.zzf("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzagpVar = new zzagp(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                } else {
                    if (zzm == 3) {
                        if ((zzm2 & 64) != 0) {
                            int zzg = zzfpVar.zzg();
                            zzfpVar.zzL(zzg);
                            zzl -= zzg + 4;
                        }
                    } else if (zzm == 4) {
                        if ((zzm2 & 64) != 0) {
                            int zzl2 = zzfpVar.zzl();
                            zzfpVar.zzL(zzl2 - 4);
                            zzl -= zzl2;
                        }
                        if ((zzm2 & 16) != 0) {
                            zzl -= 10;
                        }
                    } else {
                        zzff.zzf("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + zzm);
                    }
                    zzagpVar = new zzagp(zzm, zzm >= 4 && (zzm2 & 128) != 0, zzl);
                }
                if (zzagpVar != null) {
                    return null;
                }
                int zzd = zzfpVar.zzd();
                i2 = zzagpVar.zza;
                int i9 = i2 == 2 ? 6 : 10;
                i3 = zzagpVar.zzc;
                z = zzagpVar.zzb;
                if (z) {
                    i8 = zzagpVar.zzc;
                    i3 = zze(zzfpVar, i8);
                }
                zzfpVar.zzJ(zzd + i3);
                i4 = zzagpVar.zza;
                if (!zzk(zzfpVar, i4, i9, false)) {
                    i6 = zzagpVar.zza;
                    if (i6 != 4 || !zzk(zzfpVar, 4, i9, true)) {
                        i7 = zzagpVar.zza;
                        zzff.zzf("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z2 = true;
                }
                while (zzfpVar.zzb() >= i9) {
                    i5 = zzagpVar.zza;
                    zzagr zzf = zzf(i5, zzfpVar, z2, i9, zzagoVar);
                    if (zzf != null) {
                        arrayList.add(zzf);
                    }
                }
                return new zzby(arrayList);
            }
            zzff.zzf("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(zzo)))));
        }
        zzagpVar = null;
        if (zzagpVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            int i3 = zzd + 1;
            if ((zzd - i) % 2 == 0 && bArr[i3] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, i3);
        }
    }

    private static int zzd(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zze(zzfp zzfpVar, int i) {
        byte[] zzM = zzfpVar.zzM();
        int zzd = zzfpVar.zzd();
        int i2 = zzd;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzd + i) {
                return i;
            }
            if ((zzM[i2] & 255) == 255 && zzM[i3] == 0) {
                System.arraycopy(zzM, i2 + 2, zzM, i3, (i - (i2 - zzd)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private static com.google.android.gms.internal.ads.zzagr zzf(int r35, com.google.android.gms.internal.ads.zzfp r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzago r39) {
        /*
            Method dump skipped, instructions count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagq.zzf(int, com.google.android.gms.internal.ads.zzfp, boolean, int, com.google.android.gms.internal.ads.zzago):com.google.android.gms.internal.ads.zzagr");
    }

    private static zzgaa zzg(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgaa.zzm("");
        }
        zzfzx zzfzxVar = new zzfzx();
        int zzc = zzc(bArr, i2, i);
        while (i2 < zzc) {
            zzfzxVar.zzf(new String(bArr, i2, zzc - i2, zzj(i)));
            i2 = zzb(i) + zzc;
            zzc = zzc(bArr, i2, i);
        }
        zzgaa zzi = zzfzxVar.zzi();
        return zzi.isEmpty() ? zzgaa.zzm("") : zzi;
    }

    private static String zzh(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzk(zzfp zzfpVar, int i, int i2, boolean z) {
        boolean z2;
        int zzo;
        long zzo2;
        int i3;
        int i4;
        int zzd = zzfpVar.zzd();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzfpVar.zzb() >= i2) {
                    if (i >= 3) {
                        zzo = zzfpVar.zzg();
                        zzo2 = zzfpVar.zzu();
                        i3 = zzfpVar.zzq();
                    } else {
                        zzo = zzfpVar.zzo();
                        zzo2 = zzfpVar.zzo();
                        i3 = 0;
                    }
                    if (zzo == 0 && zzo2 == 0 && i3 == 0) {
                        break;
                    }
                    if (i == 4 && !z) {
                        if ((8421504 & zzo2) != 0) {
                            break;
                        }
                        zzo2 = ((zzo2 >> 24) << 21) | (((zzo2 >> 16) & 255) << 14) | (zzo2 & 255) | (((zzo2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                            i6 = 0;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (zzo2 >= i4 && zzfpVar.zzb() >= zzo2) {
                        zzfpVar.zzL((int) zzo2);
                    }
                } else {
                    break;
                }
            } finally {
                zzfpVar.zzK(zzd);
            }
        }
        return z2;
    }

    private static byte[] zzl(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfy.zzf : Arrays.copyOfRange(bArr, i, i2);
    }

    private static Charset zzj(int i) {
        return i != 1 ? i != 2 ? i != 3 ? zzfwq.zzb : zzfwq.zzc : zzfwq.zzd : zzfwq.zzf;
    }
}
