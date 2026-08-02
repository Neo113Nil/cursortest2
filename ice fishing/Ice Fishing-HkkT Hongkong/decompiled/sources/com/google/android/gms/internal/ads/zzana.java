package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzana implements zzamy {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzaea zzc;
    private final zzaon zzd;
    private final zzfp zze;
    private final zzann zzf;
    private final boolean[] zzg;
    private final zzamz zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzana() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01be  */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) {
        int i;
        zzann zzannVar;
        int i2;
        long j;
        boolean z;
        boolean z2;
        long j2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        long j3;
        byte b;
        int i7;
        zzek.zzb(this.zzc);
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        byte[] zzM = zzfpVar.zzM();
        this.zzi += zzfpVar.zzb();
        this.zzc.zzr(zzfpVar, zzfpVar.zzb());
        while (true) {
            int zza2 = zzgm.zza(zzM, zzd, zze, this.zzg);
            if (zza2 == zze) {
                break;
            }
            int i8 = zza2 + 3;
            int i9 = zzfpVar.zzM()[i8] & 255;
            int i10 = zza2 - zzd;
            if (!this.zzk) {
                if (i10 > 0) {
                    this.zzh.zza(zzM, zzd, zza2);
                }
                if (this.zzh.zzc(i9, i10 < 0 ? -i10 : 0)) {
                    zzamz zzamzVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzamzVar.zzc, zzamzVar.zza);
                    int i11 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    int i12 = copyOf[6] & 255;
                    i = i8;
                    int i13 = ((b2 & 255) >> 4) | (i11 << 4);
                    int i14 = (copyOf[7] & 240) >> 4;
                    int i15 = ((b2 & Ascii.SI) << 8) | i12;
                    if (i14 == 2) {
                        i4 = i15 * 4;
                        i5 = i13 * 3;
                    } else if (i14 == 3) {
                        i4 = i15 * 16;
                        i5 = i13 * 9;
                    } else if (i14 != 4) {
                        f = 1.0f;
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(str);
                        zzakVar.zzW("video/mpeg2");
                        zzakVar.zzab(i13);
                        zzakVar.zzI(i15);
                        zzakVar.zzS(f);
                        zzakVar.zzL(Collections.singletonList(copyOf));
                        zzam zzac = zzakVar.zzac();
                        i6 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i6 >= 0 && i6 < 8) {
                            double d = zza[i6];
                            b = copyOf[zzamzVar.zzb + 9];
                            i7 = (b & 96) >> 5;
                            if (i7 != (b & Ascii.US)) {
                                d *= (i7 + 1.0d) / (r7 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzac, Long.valueOf(j3));
                        this.zzc.zzl((zzam) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                        zzannVar = this.zzf;
                        if (zzannVar != null) {
                            if (i10 > 0) {
                                zzannVar.zza(zzM, zzd, zza2);
                                i3 = 0;
                            } else {
                                i3 = -i10;
                            }
                            if (this.zzf.zzd(i3)) {
                                zzann zzannVar2 = this.zzf;
                                int zzb = zzgm.zzb(zzannVar2.zza, zzannVar2.zzb);
                                zzfp zzfpVar2 = this.zze;
                                int i16 = zzfy.zza;
                                zzfpVar2.zzI(this.zzf.zza, zzb);
                                this.zzd.zza(this.zzo, this.zze);
                            }
                            if (i9 == 178) {
                                if (zzfpVar.zzM()[zza2 + 2] == 1) {
                                    this.zzf.zzc(178);
                                }
                                i9 = 178;
                            }
                        }
                        if (i9 != 0 || i9 == 179) {
                            i2 = zze - zza2;
                            if (this.zzq && this.zzk) {
                                j2 = this.zzo;
                                if (j2 != -9223372036854775807L) {
                                    this.zzc.zzt(j2, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i2, i2, null);
                                }
                            }
                            if (this.zzj || this.zzq) {
                                this.zzn = this.zzi - i2;
                                j = this.zzm;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzo;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzl : -9223372036854775807L;
                                }
                                this.zzo = j;
                                z = false;
                                this.zzp = false;
                                this.zzm = -9223372036854775807L;
                                z2 = true;
                                this.zzj = true;
                            } else {
                                z = false;
                                z2 = true;
                            }
                            this.zzq = i9 == 0 ? z2 : z;
                        } else if (i9 == 184) {
                            this.zzp = true;
                        }
                        zzd = i;
                    } else {
                        i4 = i15 * 121;
                        i5 = i13 * 100;
                    }
                    f = i4 / i5;
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzK(str);
                    zzakVar2.zzW("video/mpeg2");
                    zzakVar2.zzab(i13);
                    zzakVar2.zzI(i15);
                    zzakVar2.zzS(f);
                    zzakVar2.zzL(Collections.singletonList(copyOf));
                    zzam zzac2 = zzakVar2.zzac();
                    i6 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i6 >= 0) {
                        double d2 = zza[i6];
                        b = copyOf[zzamzVar.zzb + 9];
                        i7 = (b & 96) >> 5;
                        if (i7 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzac2, Long.valueOf(j3));
                    this.zzc.zzl((zzam) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                    zzannVar = this.zzf;
                    if (zzannVar != null) {
                    }
                    if (i9 != 0) {
                    }
                    i2 = zze - zza2;
                    if (this.zzq) {
                        j2 = this.zzo;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzj) {
                    }
                    this.zzn = this.zzi - i2;
                    j = this.zzm;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzo = j;
                    z = false;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    z2 = true;
                    this.zzj = true;
                    this.zzq = i9 == 0 ? z2 : z;
                    zzd = i;
                }
            }
            i = i8;
            zzannVar = this.zzf;
            if (zzannVar != null) {
            }
            if (i9 != 0) {
            }
            i2 = zze - zza2;
            if (this.zzq) {
            }
            if (this.zzj) {
            }
            this.zzn = this.zzi - i2;
            j = this.zzm;
            if (j == -9223372036854775807L) {
            }
            this.zzo = j;
            z = false;
            this.zzp = false;
            this.zzm = -9223372036854775807L;
            z2 = true;
            this.zzj = true;
            this.zzq = i9 == 0 ? z2 : z;
            zzd = i;
        }
        if (!this.zzk) {
            this.zzh.zza(zzM, zzd, zze);
        }
        zzann zzannVar3 = this.zzf;
        if (zzannVar3 != null) {
            zzannVar3.zza(zzM, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzb = zzaokVar.zzb();
        this.zzc = zzacxVar.zzw(zzaokVar.zza(), 2);
        zzaon zzaonVar = this.zzd;
        if (zzaonVar != null) {
            zzaonVar.zzb(zzacxVar, zzaokVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
        zzek.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzt(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        zzgm.zzf(this.zzg);
        this.zzh.zzb();
        zzann zzannVar = this.zzf;
        if (zzannVar != null) {
            zzannVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    zzana(zzaon zzaonVar) {
        zzfp zzfpVar;
        this.zzd = zzaonVar;
        this.zzg = new boolean[4];
        this.zzh = new zzamz(128);
        if (zzaonVar != null) {
            this.zzf = new zzann(178, 128);
            zzfpVar = new zzfp();
        } else {
            zzfpVar = null;
            this.zzf = null;
        }
        this.zze = zzfpVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
