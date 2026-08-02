package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzou {
    final /* synthetic */ zzov zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzur zze;
    private boolean zzf;
    private boolean zzg;

    public zzou(zzov zzovVar, String str, int i, zzur zzurVar) {
        this.zza = zzovVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzurVar == null ? -1L : zzurVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            return;
        }
        this.zze = zzurVar;
    }

    public final void zzg(int i, zzur zzurVar) {
        long zzl;
        if (this.zzd == -1 && i == this.zzc && zzurVar != null) {
            zzov zzovVar = this.zza;
            long j = zzurVar.zzd;
            zzl = zzovVar.zzl();
            if (j >= zzl) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzur zzurVar) {
        if (zzurVar == null) {
            return i == this.zzc;
        }
        zzur zzurVar2 = this.zze;
        return zzurVar2 == null ? !zzurVar.zzb() && zzurVar.zzd == this.zzd : zzurVar.zzd == zzurVar2.zzd && zzurVar.zzb == zzurVar2.zzb && zzurVar.zzc == zzurVar2.zzc;
    }

    public final boolean zzk(zzmq zzmqVar) {
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar == null) {
            return this.zzc != zzmqVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzurVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcx zzcxVar = zzmqVar.zzb;
        int zza = zzcxVar.zza(zzurVar.zza);
        int zza2 = zzcxVar.zza(this.zze.zza);
        zzur zzurVar2 = zzmqVar.zzd;
        if (zzurVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzurVar2.zzb()) {
            int i = zzmqVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzur zzurVar3 = zzmqVar.zzd;
        int i2 = zzurVar3.zzb;
        int i3 = zzurVar3.zzc;
        zzur zzurVar4 = this.zze;
        int i4 = zzurVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzurVar4.zzc;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.zzc()) goto L15;
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x002e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzl(zzcx zzcxVar, zzcx zzcxVar2) {
        zzcw zzcwVar;
        zzcw zzcwVar2;
        zzcw zzcwVar3;
        zzcu zzcuVar;
        int i = this.zzc;
        if (i < zzcxVar.zzc()) {
            zzcwVar = this.zza.zzc;
            zzcxVar.zze(i, zzcwVar, 0L);
            zzcwVar2 = this.zza.zzc;
            for (int i2 = zzcwVar2.zzp; i2 <= zzcwVar3.zzq; i2++) {
                int zza = zzcxVar2.zza(zzcxVar.zzf(i2));
                if (zza != -1) {
                    zzcuVar = this.zza.zzd;
                    i = zzcxVar2.zzd(zza, zzcuVar, false).zzd;
                    break;
                }
            }
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzur zzurVar = this.zze;
        return zzurVar == null || zzcxVar2.zza(zzurVar.zza) != -1;
    }
}
