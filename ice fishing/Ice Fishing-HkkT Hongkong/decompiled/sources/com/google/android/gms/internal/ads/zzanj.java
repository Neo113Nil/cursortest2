package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzanj implements zzamy {
    private final zzanz zza;
    private String zzb;
    private zzaea zzc;
    private zzani zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzann zzg = new zzann(32, 128);
    private final zzann zzh = new zzann(33, 128);
    private final zzann zzi = new zzann(34, 128);
    private final zzann zzj = new zzann(39, 128);
    private final zzann zzk = new zzann(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfp zzn = new zzfp();

    public zzanj(zzanz zzanzVar) {
        this.zza = zzanzVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01aa  */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) {
        int i;
        byte[] bArr;
        int i2;
        long j;
        int i3;
        zzek.zzb(this.zzc);
        int i4 = zzfy.zza;
        while (zzfpVar.zzb() > 0) {
            int zzd = zzfpVar.zzd();
            int zze = zzfpVar.zze();
            byte[] zzM = zzfpVar.zzM();
            this.zzl += zzfpVar.zzb();
            this.zzc.zzr(zzfpVar, zzfpVar.zzb());
            while (zzd < zze) {
                int zza = zzgm.zza(zzM, zzd, zze, this.zzf);
                if (zza == zze) {
                    zzf(zzM, zzd, zze);
                    return;
                }
                int i5 = zza + 3;
                int i6 = zzM[i5] & 126;
                int i7 = zza - zzd;
                if (i7 > 0) {
                    zzf(zzM, zzd, zza);
                }
                int i8 = zze - zza;
                long j2 = this.zzl - i8;
                int i9 = i7 < 0 ? -i7 : 0;
                long j3 = this.zzm;
                this.zzd.zzb(j2, i8, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i9);
                    this.zzh.zzd(i9);
                    this.zzi.zzd(i9);
                    zzann zzannVar = this.zzg;
                    if (zzannVar.zze()) {
                        zzann zzannVar2 = this.zzh;
                        if (zzannVar2.zze()) {
                            zzann zzannVar3 = this.zzi;
                            if (zzannVar3.zze()) {
                                zzaea zzaeaVar = this.zzc;
                                i2 = i5;
                                String str = this.zzb;
                                int i10 = zzannVar.zzb;
                                i = zze;
                                bArr = zzM;
                                byte[] bArr2 = new byte[zzannVar2.zzb + i10 + zzannVar3.zzb];
                                i3 = i8;
                                System.arraycopy(zzannVar.zza, 0, bArr2, 0, i10);
                                j = j2;
                                System.arraycopy(zzannVar2.zza, 0, bArr2, zzannVar.zzb, zzannVar2.zzb);
                                System.arraycopy(zzannVar3.zza, 0, bArr2, zzannVar.zzb + zzannVar2.zzb, zzannVar3.zzb);
                                zzgj zzc = zzgm.zzc(zzannVar2.zza, 5, zzannVar2.zzb);
                                String zzb = zzem.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(str);
                                zzakVar.zzW("video/hevc");
                                zzakVar.zzz(zzb);
                                zzakVar.zzab(zzc.zzi);
                                zzakVar.zzI(zzc.zzj);
                                zzr zzrVar = new zzr();
                                zzrVar.zzc(zzc.zzl);
                                zzrVar.zzb(zzc.zzm);
                                zzrVar.zzd(zzc.zzn);
                                zzrVar.zzf(zzc.zze + 8);
                                zzrVar.zza(zzc.zzf + 8);
                                zzakVar.zzA(zzrVar.zzg());
                                zzakVar.zzS(zzc.zzk);
                                zzakVar.zzL(Collections.singletonList(bArr2));
                                zzaeaVar.zzl(zzakVar.zzac());
                                this.zze = true;
                                if (this.zzj.zzd(i9)) {
                                    zzann zzannVar4 = this.zzj;
                                    this.zzn.zzI(this.zzj.zza, zzgm.zzb(zzannVar4.zza, zzannVar4.zzb));
                                    this.zzn.zzL(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i9)) {
                                    zzann zzannVar5 = this.zzk;
                                    this.zzn.zzI(this.zzk.zza, zzgm.zzb(zzannVar5.zza, zzannVar5.zzb));
                                    this.zzn.zzL(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                int i11 = i6 >> 1;
                                this.zzd.zze(j, i3, i11, this.zzm, this.zze);
                                if (!this.zze) {
                                    this.zzg.zzc(i11);
                                    this.zzh.zzc(i11);
                                    this.zzi.zzc(i11);
                                }
                                this.zzj.zzc(i11);
                                this.zzk.zzc(i11);
                                zzd = i2;
                                zze = i;
                                zzM = bArr;
                            }
                        }
                    }
                }
                i = zze;
                bArr = zzM;
                i2 = i5;
                j = j2;
                i3 = i8;
                if (this.zzj.zzd(i9)) {
                }
                if (this.zzk.zzd(i9)) {
                }
                int i112 = i6 >> 1;
                this.zzd.zze(j, i3, i112, this.zzm, this.zze);
                if (!this.zze) {
                }
                this.zzj.zzc(i112);
                this.zzk.zzc(i112);
                zzd = i2;
                zze = i;
                zzM = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzb = zzaokVar.zzb();
        this.zzc = zzacxVar.zzw(zzaokVar.zza(), 2);
        this.zzd = new zzani(this.zzc);
        this.zza.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
        zzek.zzb(this.zzc);
        int i = zzfy.zza;
        if (z) {
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzgm.zzf(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzani zzaniVar = this.zzd;
        if (zzaniVar != null) {
            zzaniVar.zzd();
        }
    }
}
