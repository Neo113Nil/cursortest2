package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzand implements zzamy {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaon zzb;
    private final zzfp zzc;
    private final boolean[] zzd;
    private final zzanb zze;
    private final zzann zzf;
    private zzanc zzg;
    private long zzh;
    private String zzi;
    private zzaea zzj;
    private boolean zzk;
    private long zzl;

    public zzand() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) {
        int i;
        int i2;
        zzek.zzb(this.zzg);
        zzek.zzb(this.zzj);
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        byte[] zzM = zzfpVar.zzM();
        this.zzh += zzfpVar.zzb();
        this.zzj.zzr(zzfpVar, zzfpVar.zzb());
        while (true) {
            int zza2 = zzgm.zza(zzM, zzd, zze, this.zzd);
            if (zza2 == zze) {
                break;
            }
            int i3 = zza2 + 3;
            int i4 = zzfpVar.zzM()[i3] & 255;
            int i5 = zza2 - zzd;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(zzM, zzd, zza2);
                }
                if (this.zze.zzc(i4, i5 < 0 ? -i5 : 0)) {
                    zzaea zzaeaVar = this.zzj;
                    zzanb zzanbVar = this.zze;
                    int i6 = zzanbVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzanbVar.zzc, zzanbVar.zza);
                    zzfo zzfoVar = new zzfo(copyOf, copyOf.length);
                    zzfoVar.zzn(i6);
                    zzfoVar.zzn(4);
                    zzfoVar.zzl();
                    zzfoVar.zzm(8);
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(4);
                        zzfoVar.zzm(3);
                    }
                    int zzd2 = zzfoVar.zzd(4);
                    float f = 1.0f;
                    if (zzd2 == 15) {
                        int zzd3 = zzfoVar.zzd(8);
                        int zzd4 = zzfoVar.zzd(8);
                        if (zzd4 == 0) {
                            zzff.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzd3 / zzd4;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                    } else {
                        zzff.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzfoVar.zzo()) {
                        zzfoVar.zzm(2);
                        zzfoVar.zzm(1);
                        if (zzfoVar.zzo()) {
                            zzfoVar.zzm(15);
                            zzfoVar.zzl();
                            zzfoVar.zzm(15);
                            zzfoVar.zzl();
                            zzfoVar.zzm(15);
                            zzfoVar.zzl();
                            zzfoVar.zzm(3);
                            zzfoVar.zzm(11);
                            zzfoVar.zzl();
                            zzfoVar.zzm(15);
                            zzfoVar.zzl();
                            i2 = 2;
                            if (zzfoVar.zzd(i2) != 0) {
                                zzff.zzf("H263Reader", "Unhandled video object layer shape");
                            }
                            zzfoVar.zzl();
                            int zzd5 = zzfoVar.zzd(16);
                            zzfoVar.zzl();
                            if (zzfoVar.zzo()) {
                                if (zzd5 == 0) {
                                    zzff.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i7 = zzd5 - 1;
                                    int i8 = 0;
                                    while (i7 > 0) {
                                        i7 >>= 1;
                                        i8++;
                                    }
                                    zzfoVar.zzm(i8);
                                }
                            }
                            zzfoVar.zzl();
                            int zzd6 = zzfoVar.zzd(13);
                            zzfoVar.zzl();
                            int zzd7 = zzfoVar.zzd(13);
                            zzfoVar.zzl();
                            zzfoVar.zzl();
                            zzak zzakVar = new zzak();
                            zzakVar.zzK(str);
                            zzakVar.zzW("video/mp4v-es");
                            zzakVar.zzab(zzd6);
                            zzakVar.zzI(zzd7);
                            zzakVar.zzS(f2);
                            zzakVar.zzL(Collections.singletonList(copyOf));
                            zzaeaVar.zzl(zzakVar.zzac());
                            this.zzk = true;
                        }
                    }
                    i2 = 2;
                    if (zzfoVar.zzd(i2) != 0) {
                    }
                    zzfoVar.zzl();
                    int zzd52 = zzfoVar.zzd(16);
                    zzfoVar.zzl();
                    if (zzfoVar.zzo()) {
                    }
                    zzfoVar.zzl();
                    int zzd62 = zzfoVar.zzd(13);
                    zzfoVar.zzl();
                    int zzd72 = zzfoVar.zzd(13);
                    zzfoVar.zzl();
                    zzfoVar.zzl();
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzK(str);
                    zzakVar2.zzW("video/mp4v-es");
                    zzakVar2.zzab(zzd62);
                    zzakVar2.zzI(zzd72);
                    zzakVar2.zzS(f2);
                    zzakVar2.zzL(Collections.singletonList(copyOf));
                    zzaeaVar.zzl(zzakVar2.zzac());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzM, zzd, zza2);
            zzann zzannVar = this.zzf;
            if (i5 > 0) {
                zzannVar.zza(zzM, zzd, zza2);
                i = 0;
            } else {
                i = -i5;
            }
            if (this.zzf.zzd(i)) {
                zzann zzannVar2 = this.zzf;
                int zzb = zzgm.zzb(zzannVar2.zza, zzannVar2.zzb);
                zzfp zzfpVar2 = this.zzc;
                int i9 = zzfy.zza;
                zzfpVar2.zzI(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i4 == 178) {
                if (zzfpVar.zzM()[zza2 + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i4 = 178;
            }
            int i10 = zze - zza2;
            this.zzg.zzb(this.zzh - i10, i10, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            zzd = i3;
        }
        if (!this.zzk) {
            this.zze.zza(zzM, zzd, zze);
        }
        this.zzg.zza(zzM, zzd, zze);
        this.zzf.zza(zzM, zzd, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzi = zzaokVar.zzb();
        this.zzj = zzacxVar.zzw(zzaokVar.zza(), 2);
        this.zzg = new zzanc(this.zzj);
        this.zzb.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
        zzek.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        zzgm.zzf(this.zzd);
        this.zze.zzb();
        zzanc zzancVar = this.zzg;
        if (zzancVar != null) {
            zzancVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzand(zzaon zzaonVar) {
        this.zzb = zzaonVar;
        this.zzd = new boolean[4];
        this.zze = new zzanb(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzann(178, 128);
        this.zzc = new zzfp();
    }
}
