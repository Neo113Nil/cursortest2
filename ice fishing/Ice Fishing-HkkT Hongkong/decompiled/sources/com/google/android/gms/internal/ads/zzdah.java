package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzdah {
    private final Context zza;
    private final zzfhh zzb;
    private final Bundle zzc;
    private final zzfgz zzd;
    private final zzczz zze;
    private final zzeis zzf;

    /* synthetic */ zzdah(zzdaf zzdafVar, zzdag zzdagVar) {
        Context context;
        zzfhh zzfhhVar;
        Bundle bundle;
        zzfgz zzfgzVar;
        zzczz zzczzVar;
        zzeis zzeisVar;
        context = zzdafVar.zza;
        this.zza = context;
        zzfhhVar = zzdafVar.zzb;
        this.zzb = zzfhhVar;
        bundle = zzdafVar.zzc;
        this.zzc = bundle;
        zzfgzVar = zzdafVar.zzd;
        this.zzd = zzfgzVar;
        zzczzVar = zzdafVar.zze;
        this.zze = zzczzVar;
        zzeisVar = zzdafVar.zzf;
        this.zzf = zzeisVar;
    }

    final Context zza(Context context) {
        return this.zza;
    }

    final Bundle zzb() {
        return this.zzc;
    }

    final zzczz zzc() {
        return this.zze;
    }

    final zzdaf zzd() {
        zzdaf zzdafVar = new zzdaf();
        zzdafVar.zze(this.zza);
        zzdafVar.zzi(this.zzb);
        zzdafVar.zzf(this.zzc);
        zzdafVar.zzg(this.zze);
        zzdafVar.zzd(this.zzf);
        return zzdafVar;
    }

    final zzeis zze(String str) {
        zzeis zzeisVar = this.zzf;
        return zzeisVar != null ? zzeisVar : new zzeis(str);
    }

    final zzfgz zzf() {
        return this.zzd;
    }

    final zzfhh zzg() {
        return this.zzb;
    }
}
