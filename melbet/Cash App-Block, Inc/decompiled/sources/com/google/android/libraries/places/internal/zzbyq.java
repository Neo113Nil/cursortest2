package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbyq extends zzbrx {
    public final zzbpq zza = zzbpq.zzc;
    public final zzbrl zzb;
    public final zzbtx zzc;

    public zzbyq(zzbrl zzbrlVar, zzbtx zzbtxVar) {
        this.zzb = zzbrlVar;
        this.zzc = zzbtxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbrk
    public final zzbrv zza(zzbrm zzbrmVar) {
        return new zzbyp(this, zzbrmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrx
    public final String zzd() {
        return "fixed_picker_lb_internal";
    }
}
