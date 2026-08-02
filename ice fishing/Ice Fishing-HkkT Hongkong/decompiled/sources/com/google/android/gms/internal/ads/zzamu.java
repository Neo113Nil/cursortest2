package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzamu implements zzamy {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfo zzc = new zzfo(new byte[7], 7);
    private final zzfp zzd = new zzfp(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzaea zzg;
    private zzaea zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzaea zzu;
    private long zzv;

    public zzamu(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzaea zzaeaVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzaeaVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzfp zzfpVar, byte[] bArr, int i) {
        int min = Math.min(zzfpVar.zzb(), i - this.zzj);
        zzfpVar.zzG(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfp zzfpVar, byte[] bArr, int i) {
        if (zzfpVar.zzb() < i) {
            return false;
        }
        zzfpVar.zzG(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) throws zzcc {
        int i;
        byte b;
        char c;
        int i2;
        int i3;
        char c2;
        boolean z;
        int i4;
        this.zzg.getClass();
        int i5 = zzfy.zza;
        while (zzfpVar.zzb() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            char c3 = 7;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzM = zzfpVar.zzM();
                int zzd = zzfpVar.zzd();
                int zze = zzfpVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzfpVar.zzK(zzd);
                        break;
                    }
                    i = zzd + 1;
                    b = zzM[zzd];
                    int i9 = b & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i9)) {
                        if (this.zzm) {
                            break;
                        }
                        int i10 = zzd - 1;
                        zzfpVar.zzK(zzd);
                        if (zzm(zzfpVar, this.zzc.zza, 1)) {
                            this.zzc.zzk(4);
                            int zzd2 = this.zzc.zzd(1);
                            int i11 = this.zzn;
                            if (i11 == -1 || zzd2 == i11) {
                                if (this.zzo != -1) {
                                    if (!zzm(zzfpVar, this.zzc.zza, 1)) {
                                        break;
                                    }
                                    this.zzc.zzk(i8);
                                    if (this.zzc.zzd(4) == this.zzo) {
                                        zzfpVar.zzK(zzd + 1);
                                    }
                                }
                                if (!zzm(zzfpVar, this.zzc.zza, 4)) {
                                    break;
                                }
                                this.zzc.zzk(14);
                                int zzd3 = this.zzc.zzd(i7);
                                c = 7;
                                if (zzd3 >= 7) {
                                    byte[] zzM2 = zzfpVar.zzM();
                                    int zze2 = zzfpVar.zze();
                                    int i12 = i10 + zzd3;
                                    if (i12 < zze2) {
                                        byte b2 = zzM2[i12];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i13 = i12 + 1;
                                                if (i13 == zze2) {
                                                    break;
                                                }
                                                if (zzM2[i13] == 68) {
                                                    int i14 = i12 + 2;
                                                    if (i14 == zze2) {
                                                        break;
                                                    } else if (zzM2[i14] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i15 = i12 + 1;
                                            if (i15 == zze2) {
                                                break;
                                            }
                                            byte b3 = zzM2[i15];
                                            if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzd2) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                int i16 = this.zzk;
                                i2 = i16 | i9;
                                if (i2 == 329) {
                                    i3 = 2;
                                    c2 = 3;
                                    z = false;
                                    i4 = ViewUtils.EDGE_TO_EDGE_FLAGS;
                                } else if (i2 == 511) {
                                    i3 = 2;
                                    c2 = 3;
                                    z = false;
                                    i4 = 512;
                                } else if (i2 == 836) {
                                    i3 = 2;
                                    c2 = 3;
                                    z = false;
                                    i4 = 1024;
                                } else {
                                    if (i2 == 1075) {
                                        this.zzi = 2;
                                        this.zzj = 3;
                                        this.zzs = 0;
                                        this.zzd.zzK(0);
                                        zzfpVar.zzK(i);
                                        break;
                                    }
                                    if (i16 != 256) {
                                        this.zzk = 256;
                                        c3 = c;
                                        i7 = 13;
                                        i8 = 2;
                                    } else {
                                        i3 = 2;
                                        c2 = 3;
                                        z = false;
                                        zzd = i;
                                        c3 = c;
                                        i8 = i3;
                                        i7 = 13;
                                    }
                                }
                                this.zzk = i4;
                                zzd = i;
                                c3 = c;
                                i8 = i3;
                                i7 = 13;
                            }
                            c = 7;
                            int i162 = this.zzk;
                            i2 = i162 | i9;
                            if (i2 == 329) {
                            }
                            this.zzk = i4;
                            zzd = i;
                            c3 = c;
                            i8 = i3;
                            i7 = 13;
                        }
                    }
                    c = c3;
                    int i1622 = this.zzk;
                    i2 = i1622 | i9;
                    if (i2 == 329) {
                    }
                    this.zzk = i4;
                    zzd = i;
                    c3 = c;
                    i8 = i3;
                    i7 = 13;
                }
                this.zzp = (b & 8) >> 3;
                this.zzl = 1 == ((b & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzfpVar.zzK(i);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzfpVar.zzb(), this.zzs - this.zzj);
                        this.zzu.zzr(zzfpVar, min);
                        int i17 = this.zzj + min;
                        this.zzj = i17;
                        if (i17 == this.zzs) {
                            zzek.zzf(this.zzt != -9223372036854775807L);
                            this.zzu.zzt(this.zzt, 1, this.zzs, 0, null);
                            this.zzt += this.zzv;
                            zzh();
                        }
                    } else {
                        if (zzk(zzfpVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzk(0);
                            if (this.zzq) {
                                this.zzc.zzm(10);
                            } else {
                                int zzd4 = this.zzc.zzd(2) + 1;
                                if (zzd4 != 2) {
                                    zzff.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzm(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i18 = this.zzo;
                                int i19 = zzabs.zza;
                                byte[] bArr = {(byte) (((i18 >> 1) & 7) | 16), (byte) (((zzd5 << 3) & 120) | ((i18 << 7) & 128))};
                                zzabr zza2 = zzabs.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(this.zzf);
                                zzakVar.zzW("audio/mp4a-latm");
                                zzakVar.zzz(zza2.zzc);
                                zzakVar.zzy(zza2.zzb);
                                zzakVar.zzX(zza2.zza);
                                zzakVar.zzL(Collections.singletonList(bArr));
                                zzakVar.zzN(this.zze);
                                zzam zzac = zzakVar.zzac();
                                this.zzr = 1024000000 / zzac.zzA;
                                this.zzg.zzl(zzac);
                                this.zzq = true;
                            }
                            this.zzc.zzm(4);
                            int zzd6 = this.zzc.zzd(13);
                            zzj(this.zzg, this.zzr, 0, this.zzl ? zzd6 - 9 : zzd6 - 7);
                        }
                    }
                } else if (zzk(zzfpVar, this.zzd.zzM(), 10)) {
                    this.zzh.zzr(this.zzd, 10);
                    this.zzd.zzK(6);
                    zzj(this.zzh, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzfpVar.zzb() != 0) {
                zzfo zzfoVar = this.zzc;
                zzfoVar.zza[0] = zzfpVar.zzM()[zzfpVar.zzd()];
                zzfoVar.zzk(2);
                int zzd7 = this.zzc.zzd(4);
                int i20 = this.zzo;
                if (i20 == -1 || zzd7 == i20) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzf = zzaokVar.zzb();
        zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 1);
        this.zzg = zzw;
        this.zzu = zzw;
        if (!this.zzb) {
            this.zzh = new zzact();
            return;
        }
        zzaokVar.zzc();
        zzaea zzw2 = zzacxVar.zzw(zzaokVar.zza(), 5);
        this.zzh = zzw2;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzaokVar.zzb());
        zzakVar.zzW("application/id3");
        zzw2.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzt = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
