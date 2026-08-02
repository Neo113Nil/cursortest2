package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzy extends zzbyr {
    public final /* synthetic */ zzbvr zza;
    public final /* synthetic */ zzbzz zzb;

    public zzbzy(zzbzz zzbzzVar, zzbvr zzbvrVar) {
        this.zza = zzbvrVar;
        this.zzb = zzbzzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbyr
    public final zzbvr zze() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbyr, com.google.android.libraries.places.internal.zzbvr
    public final void zzf(zzbvt zzbvtVar) {
        zzyr zzyrVar = this.zzb.zzb;
        ((zzcan) zzyrVar.zzd).zza();
        ((zzcgm) zzyrVar.zzc).zza();
        this.zza.zzf(new zzbzx(this, zzbvtVar));
    }
}
