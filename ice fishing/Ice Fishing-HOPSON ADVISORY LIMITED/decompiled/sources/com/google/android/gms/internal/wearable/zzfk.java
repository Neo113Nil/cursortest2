package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzfk extends zzfi {
    zzfk() {
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzfj) obj).zzk(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zzfj) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zzfj) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zzcg zzcgVar) {
        ((zzfj) obj).zzk((i << 3) | 2, zzcgVar);
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zzfj) obj).zzk((i << 3) | 3, (zzfj) obj2);
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* synthetic */ Object zzf() {
        return zzfj.zzb();
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* synthetic */ Object zzg(Object obj) {
        zzfj zzfjVar = (zzfj) obj;
        zzfjVar.zzd();
        return zzfjVar;
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzdg zzdgVar = (zzdg) obj;
        zzfj zzfjVar = zzdgVar.zzc;
        if (zzfjVar != zzfj.zza()) {
            return zzfjVar;
        }
        zzfj zzb = zzfj.zzb();
        zzdgVar.zzc = zzb;
        return zzb;
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzdg) obj).zzc = (zzfj) obj2;
    }

    @Override // com.google.android.gms.internal.wearable.zzfi
    final void zzj(Object obj) {
        ((zzdg) obj).zzc.zzd();
    }
}
