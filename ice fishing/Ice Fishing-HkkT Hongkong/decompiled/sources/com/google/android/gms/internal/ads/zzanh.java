package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzanh implements zzamy {
    private final zzanz zza;
    private long zze;
    private String zzg;
    private zzaea zzh;
    private zzang zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzann zzb = new zzann(7, 128);
    private final zzann zzc = new zzann(8, 128);
    private final zzann zzd = new zzann(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfp zzm = new zzfp();

    public zzanh(zzanz zzanzVar, boolean z, boolean z2) {
        this.zza = zzanzVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01a5 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzamy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) {
        int i;
        int i2;
        zzek.zzb(this.zzh);
        int i3 = zzfy.zza;
        int zzd = zzfpVar.zzd();
        int zze = zzfpVar.zze();
        byte[] zzM = zzfpVar.zzM();
        this.zze += zzfpVar.zzb();
        this.zzh.zzr(zzfpVar, zzfpVar.zzb());
        while (true) {
            int zza = zzgm.zza(zzM, zzd, zze, this.zzf);
            if (zza == zze) {
                zzf(zzM, zzd, zze);
                return;
            }
            int i4 = zza + 3;
            int i5 = zzM[i4] & Ascii.US;
            int i6 = zza - zzd;
            if (i6 > 0) {
                zzf(zzM, zzd, zza);
            }
            int i7 = zze - zza;
            long j = this.zze - i7;
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = zze;
                    i2 = i4;
                    zzann zzannVar = this.zzb;
                    if (zzannVar.zze()) {
                        this.zzi.zzc(zzgm.zze(zzannVar.zza, 4, zzannVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzann zzannVar2 = this.zzc;
                        if (zzannVar2.zze()) {
                            this.zzi.zzb(zzgm.zzd(zzannVar2.zza, 4, zzannVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzann zzannVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzannVar3.zza, zzannVar3.zzb));
                    zzann zzannVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzannVar4.zza, zzannVar4.zzb));
                    zzann zzannVar5 = this.zzb;
                    zzgl zze2 = zzgm.zze(zzannVar5.zza, 4, zzannVar5.zzb);
                    zzann zzannVar6 = this.zzc;
                    zzgk zzd2 = zzgm.zzd(zzannVar6.zza, 4, zzannVar6.zzb);
                    i2 = i4;
                    String zza2 = zzem.zza(zze2.zza, zze2.zzb, zze2.zzc);
                    zzaea zzaeaVar = this.zzh;
                    zzak zzakVar = new zzak();
                    i = zze;
                    zzakVar.zzK(this.zzg);
                    zzakVar.zzW("video/avc");
                    zzakVar.zzz(zza2);
                    zzakVar.zzab(zze2.zze);
                    zzakVar.zzI(zze2.zzf);
                    zzr zzrVar = new zzr();
                    zzrVar.zzc(zze2.zzj);
                    zzrVar.zzb(zze2.zzk);
                    zzrVar.zzd(zze2.zzl);
                    zzrVar.zzf(zze2.zzh + 8);
                    zzrVar.zza(zze2.zzi + 8);
                    zzakVar.zzA(zzrVar.zzg());
                    zzakVar.zzS(zze2.zzg);
                    zzakVar.zzL(arrayList);
                    zzaeaVar.zzl(zzakVar.zzac());
                    this.zzj = true;
                    this.zzi.zzc(zze2);
                    this.zzi.zzb(zzd2);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
                if (this.zzd.zzd(i8)) {
                    zzann zzannVar7 = this.zzd;
                    this.zzm.zzI(this.zzd.zza, zzgm.zzb(zzannVar7.zza, zzannVar7.zzb));
                    this.zzm.zzK(4);
                    this.zza.zza(j2, this.zzm);
                }
                if (this.zzi.zzf(j, i7, this.zzj)) {
                    this.zzl = false;
                }
                long j3 = this.zzk;
                if (this.zzj) {
                    this.zzb.zzc(i5);
                    this.zzc.zzc(i5);
                }
                this.zzd.zzc(i5);
                this.zzi.zze(j, i5, j3, this.zzl);
                zzd = i2;
                zze = i;
            }
            i = zze;
            i2 = i4;
            if (this.zzd.zzd(i8)) {
            }
            if (this.zzi.zzf(j, i7, this.zzj)) {
            }
            long j32 = this.zzk;
            if (this.zzj) {
            }
            this.zzd.zzc(i5);
            this.zzi.zze(j, i5, j32, this.zzl);
            zzd = i2;
            zze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        this.zzg = zzaokVar.zzb();
        this.zzh = zzacxVar.zzw(zzaokVar.zza(), 2);
        this.zzi = new zzang(this.zzh, false, false);
        this.zza.zzb(zzacxVar, zzaokVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z) {
        zzek.zzb(this.zzh);
        int i = zzfy.zza;
        if (z) {
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzgm.zzf(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzang zzangVar = this.zzi;
        if (zzangVar != null) {
            zzangVar.zzd();
        }
    }
}
