package com.google.android.gms.internal.time;

/* loaded from: classes4.dex */
public final class zzds extends zzdw {
    public final /* synthetic */ zzdw zza;
    public final /* synthetic */ zzdw zzb;

    public zzds(zzdw zzdwVar, zzdw zzdwVar2) {
        this.zza = zzdwVar;
        this.zzb = zzdwVar2;
    }

    @Override // com.google.android.gms.internal.time.zzdw
    public final void zzb() {
        zzdw zzdwVar = this.zzb;
        try {
            this.zza.zzb();
        } finally {
            zzdwVar.zzb();
        }
    }
}
