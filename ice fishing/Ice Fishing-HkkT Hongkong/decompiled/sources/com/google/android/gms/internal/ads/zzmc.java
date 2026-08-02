package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzmc extends zzuf {
    private final zzcw zzd;

    zzmc(zzmd zzmdVar, zzcx zzcxVar) {
        super(zzcxVar);
        this.zzd = new zzcw();
    }

    @Override // com.google.android.gms.internal.ads.zzuf, com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        zzcu zzd = this.zzc.zzd(i, zzcuVar, z);
        if (this.zzc.zze(zzd.zzd, this.zzd, 0L).zzb()) {
            Object obj = zzcuVar.zzb;
            Object obj2 = zzcuVar.zzc;
            int i2 = zzcuVar.zzd;
            long j = zzcuVar.zze;
            long j2 = zzcuVar.zzf;
            zzd.zzl(obj, obj2, i2, j, 0L, zzd.zza, true);
        } else {
            zzd.zzg = true;
        }
        return zzd;
    }
}
