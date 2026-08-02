package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbyp extends zzbrv {
    public final /* synthetic */ zzbyq zzf;
    public final zzbrm zzg;

    public zzbyp(zzbyq zzbyqVar, zzbrm zzbrmVar) {
        this.zzf = zzbyqVar;
        Objects.requireNonNull(zzbrmVar, "helper");
        this.zzg = zzbrmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final zzbtx zza(zzbrr zzbrrVar) {
        zzbyq zzbyqVar = this.zzf;
        this.zzg.zzb(zzbyqVar.zza, zzbyqVar.zzb);
        return zzbyqVar.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzb(zzbtx zzbtxVar) {
        zzbyq zzbyqVar = this.zzf;
        this.zzg.zzb(zzbyqVar.zza, zzbyqVar.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzc() {
    }
}
