package com.google.android.libraries.places.internal;

import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbva extends zzbrv {
    public final /* synthetic */ zzbvb zzf;
    public final zzbrm zzg;
    public zzbrv zzh;
    public zzbrx zzi;

    public zzbva(zzbvb zzbvbVar, zzbrm zzbrmVar) {
        Objects.requireNonNull(zzbvbVar);
        this.zzf = zzbvbVar;
        this.zzg = zzbrmVar;
        zzbrx zzbrxVar = zzbvbVar.zzb;
        this.zzi = zzbrxVar;
        this.zzh = zzbrxVar.zza(zzbrmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final zzbtx zza(zzbrr zzbrrVar) {
        zzcfy zzcfyVar = (zzcfy) zzbrrVar.zzc;
        if (zzcfyVar == null) {
            zzcfyVar = new zzcfy(this.zzf.zzb, null);
        }
        zzbrx zzbrxVar = zzcfyVar.zza;
        zzbrx zzbrxVar2 = this.zzi;
        zzbrm zzbrmVar = this.zzg;
        if (zzbrxVar2 == null || !zzbrxVar.zzd().equals(this.zzi.zzd())) {
            zzbrmVar.zzb(zzbpq.zza, new zzbrl(zzbro.zza));
            this.zzh.zzc();
            this.zzi = zzbrxVar;
            zzbrv zzbrvVar = this.zzh;
            this.zzh = zzbrxVar.zza(zzbrmVar);
            ((zzcbg) zzbrmVar).zzb.zzU.zzb("Load balancer changed from {0} to {1}", 2, zzbrvVar.getClass().getSimpleName(), this.zzh.getClass().getSimpleName());
        }
        Object obj = zzcfyVar.zzb;
        if (obj != null) {
            ((zzcbg) zzbrmVar).zzb.zzU.zzb("Load-balancing config: {0}", 1, obj);
        }
        zzbrv zzbrvVar2 = this.zzh;
        zzbrq zzbrqVar = new zzbrq();
        List list = zzbrrVar.zza;
        zzbrqVar.zza = list;
        zzbor zzborVar = zzbrrVar.zzb;
        zzbrqVar.zzc = obj;
        return zzbrvVar2.zza(new zzbrr(list, zzborVar, obj));
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzb(zzbtx zzbtxVar) {
        this.zzh.zzb(zzbtxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzc() {
        this.zzh.zzc();
        this.zzh = null;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzd() {
        this.zzh.zzd();
    }
}
