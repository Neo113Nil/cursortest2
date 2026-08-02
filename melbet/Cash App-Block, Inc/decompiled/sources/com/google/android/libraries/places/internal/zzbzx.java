package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzx extends zzbys {
    public final /* synthetic */ zzbvt zza;
    public final /* synthetic */ zzbzy zzb;

    public zzbzx(zzbzy zzbzyVar, zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
        this.zzb = zzbzyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbys, com.google.android.libraries.places.internal.zzbvt
    public final void zzc(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        zzyr zzyrVar = this.zzb.zzb.zzb;
        if (zzbtxVar.zzj()) {
            ((zzcan) zzyrVar.zze).zza();
        } else {
            ((zzcan) zzyrVar.zzf).zza();
        }
        this.zza.zzc(zzbtxVar, zzbvsVar, zzbsnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbys
    public final zzbvt zze() {
        return this.zza;
    }
}
