package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.android.gms.auth.api.zbc;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public final class zzcdo extends zzbrv {
    public final zzbrm zzf;
    public zzbrs zzg;
    public zzbpq zzh = zzbpq.zzd;

    public zzcdo(zzbrm zzbrmVar) {
        Trace.checkNotNull(zzbrmVar, "helper");
        this.zzf = zzbrmVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final zzbtx zza(zzbrr zzbrrVar) {
        Boolean bool;
        List list = zzbrrVar.zza;
        if (list.isEmpty()) {
            zzbtx zzbtxVar = zzbtx.zzi;
            String valueOf = String.valueOf(list);
            String valueOf2 = String.valueOf(zzbrrVar.zzb);
            zzbtx zze = zzbtxVar.zze(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(valueOf.length() + 55 + valueOf2.length()), "NameResolver returned no usable address. addrs=", valueOf, ", attrs=", valueOf2));
            zzb(zze);
            return zze;
        }
        Object obj = zzbrrVar.zzc;
        if ((obj instanceof zzcdl) && (bool = ((zzcdl) obj).zza) != null && bool.booleanValue()) {
            list = zzcdj.zzf(list, new Random());
        }
        zzbrs zzbrsVar = this.zzg;
        if (zzbrsVar == null) {
            zzbrh zzbrhVar = new zzbrh();
            Trace.checkArgument("addrs is empty", !list.isEmpty());
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            zzbrhVar.zzb = unmodifiableList;
            com.google.android.gms.maps.zzah zzahVar = new com.google.android.gms.maps.zzah(unmodifiableList, zzbrhVar.zzc, zzbrhVar.zzd);
            zzbrm zzbrmVar = this.zzf;
            zzbrs zza = zzbrmVar.zza(zzahVar);
            zza.zza(new zbc(21, this, zza));
            this.zzg = zza;
            zzbrl zzbrlVar = new zzbrl(zzbro.zza);
            zzbpq zzbpqVar = zzbpq.zza;
            this.zzh = zzbpqVar;
            zzbrmVar.zzb(zzbpqVar, zzbrlVar);
            zza.zzc();
        } else {
            zzbrsVar.zzd(list);
        }
        return zzbtx.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzb(zzbtx zzbtxVar) {
        zzbrs zzbrsVar = this.zzg;
        if (zzbrsVar != null) {
            zzbrsVar.zzb();
            this.zzg = null;
        }
        zzbrl zzbrlVar = new zzbrl(zzbro.zzb(zzbtxVar));
        zzbpq zzbpqVar = zzbpq.zzc;
        this.zzh = zzbpqVar;
        this.zzf.zzb(zzbpqVar, zzbrlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzc() {
        zzbrs zzbrsVar = this.zzg;
        if (zzbrsVar != null) {
            zzbrsVar.zzb();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbrv
    public final void zzd() {
        zzbrs zzbrsVar = this.zzg;
        if (zzbrsVar != null) {
            zzbrsVar.zzc();
        }
    }
}
