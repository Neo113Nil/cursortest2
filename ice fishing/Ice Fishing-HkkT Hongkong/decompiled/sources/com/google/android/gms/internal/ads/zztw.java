package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zztw implements zzup, zzuo {
    public final zzup zza;
    long zzb;
    private zzuo zzc;
    private zztv[] zzd = new zztv[0];
    private long zze = 0;

    public zztw(zzup zzupVar, boolean z, long j, long j2) {
        this.zza = zzupVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zza(long j, zzmj zzmjVar) {
        if (j == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzmjVar.zzf, j));
        long j2 = zzmjVar.zzg;
        long j3 = this.zzb;
        long max2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (max != zzmjVar.zzf || max2 != zzmjVar.zzg) {
            zzmjVar = new zzmj(max, max2);
        }
        return this.zza.zza(j, zzmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzek.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzek.zzf(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zztv zztvVar : this.zzd) {
            if (zztvVar != null) {
                zztvVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzek.zzf(z);
            return zze;
        }
        z = true;
        zzek.zzf(z);
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzyi[] zzyiVarArr, boolean[] zArr, zzwh[] zzwhVarArr, boolean[] zArr2, long j) {
        int length = zzwhVarArr.length;
        this.zzd = new zztv[length];
        zzwh[] zzwhVarArr2 = new zzwh[length];
        int i = 0;
        while (true) {
            zzwh zzwhVar = null;
            if (i >= zzwhVarArr.length) {
                break;
            }
            zztv[] zztvVarArr = this.zzd;
            zztv zztvVar = (zztv) zzwhVarArr[i];
            zztvVarArr[i] = zztvVar;
            if (zztvVar != null) {
                zzwhVar = zztvVar.zza;
            }
            zzwhVarArr2[i] = zzwhVar;
            i++;
        }
        long zzf = this.zza.zzf(zzyiVarArr, zArr, zzwhVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (zzf != j2) {
            if (zzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        zzek.zzf(z);
        for (int i2 = 0; i2 < zzwhVarArr.length; i2++) {
            zzwh zzwhVar2 = zzwhVarArr2[i2];
            if (zzwhVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zztv[] zztvVarArr2 = this.zzd;
                zztv zztvVar2 = zztvVarArr2[i2];
                if (zztvVar2 == null || zztvVar2.zza != zzwhVar2) {
                    zztvVarArr2[i2] = new zztv(this, zzwhVar2);
                }
            }
            zzwhVarArr[i2] = this.zzd[i2];
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzwi
    public final /* bridge */ /* synthetic */ void zzg(zzwj zzwjVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final zzws zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzup
    public final void zzl(zzuo zzuoVar, long j) {
        this.zzc = zzuoVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzo(zzlg zzlgVar) {
        return this.zza.zzo(zzlgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzwj
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzi(zzup zzupVar) {
        zzuo zzuoVar = this.zzc;
        zzuoVar.getClass();
        zzuoVar.zzi(this);
    }
}
