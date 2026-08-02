package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdh {
    public final zzbrs zza;
    public zzbpq zzb;
    public boolean zzc = false;
    public zzbpr zzd;

    public zzcdh(zzbrs zzbrsVar) {
        zzbpq zzbpqVar = zzbpq.zzd;
        this.zzd = zzbpr.zza(zzbpqVar);
        this.zza = zzbrsVar;
        this.zzb = zzbpqVar;
    }

    public final /* synthetic */ void zzd(zzbpq zzbpqVar) {
        boolean z;
        this.zzb = zzbpqVar;
        if (zzbpqVar == zzbpq.zzb || zzbpqVar == zzbpq.zzc) {
            z = true;
        } else if (zzbpqVar != zzbpq.zzd) {
            return;
        } else {
            z = false;
        }
        this.zzc = z;
    }
}
