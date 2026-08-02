package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcky extends zzckt {
    public final /* synthetic */ zzckz zza;
    public final /* synthetic */ zzckz zzb;

    public zzcky(zzckz zzckzVar) {
        this.zzb = zzckzVar;
        this.zza = zzckzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzckt, com.google.android.libraries.places.internal.zzbrm
    public final void zzb(zzbpq zzbpqVar, zzbrt zzbrtVar) {
        zzckz zzckzVar = this.zza;
        if (zzckzVar.zzd != zzbpq.zze) {
            zzckzVar.zzd = zzbpqVar;
            zzckzVar.zze = zzbrtVar;
            zzclb zzclbVar = zzckzVar.zza;
            if (!zzclbVar.zzf) {
                zzclbVar.zze$1();
            }
        }
        zzckz zzckzVar2 = this.zzb;
        if (zzckzVar2.zzb.zzf || zzbpqVar != zzbpq.zzd) {
            return;
        }
        zzckzVar2.zzc.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzckt
    public final zzbrm zzf() {
        return this.zza.zza.zzl;
    }
}
