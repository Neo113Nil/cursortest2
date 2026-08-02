package com.google.android.libraries.places.internal;

import com.google.android.filament.Box;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcba extends zzbqh {
    public final zzbqu zza;
    public final zzbow zzb;
    public final Executor zzc;
    public final Schema zzd;
    public final zzbpv zze;
    public zzbov zzf;
    public zzbpa zzg;

    public zzcba(zzbqu zzbquVar, zzcbj zzcbjVar, Executor executor, Schema schema, zzbov zzbovVar) {
        this.zza = zzbquVar;
        this.zzb = zzcbjVar;
        this.zzd = schema;
        Executor executor2 = zzbovVar.zzc;
        executor = executor2 != null ? executor2 : executor;
        this.zzc = executor;
        zzbot zzp = zzbov.zzp(zzbovVar);
        zzp.zzb = executor;
        this.zzf = new zzbov(zzp);
        Logger logger = zzbpv.zza;
        zzbpv zzc = zzbpt.zza.zzc();
        this.zze = zzc == null ? zzbpv.zzb : zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbqh, com.google.android.libraries.places.internal.zzbpa
    public final void zza(zzboz zzbozVar, zzbsn zzbsnVar) {
        zzbov zzbovVar = this.zzf;
        zzcau zzcauVar = zzcby.zzi;
        Schema schema = this.zzd;
        new zzcdq(schema, zzbsnVar, zzbovVar, zzcauVar);
        Box zza = this.zza.zza();
        zzbtx zzbtxVar = (zzbtx) zza.mCenter;
        if (!zzbtxVar.zzj()) {
            this.zzc.execute(new zzbws(this, zzbozVar, zzbzg.zzi(zzbtxVar)));
            this.zzg = zzcby.zzai;
            return;
        }
        zzcci zzcciVar = (zzcci) zza.mHalfExtent;
        zzccg zzccgVar = (zzccg) zzcciVar.zzb.get((String) schema.mVersion);
        if (zzccgVar == null) {
            zzccgVar = (zzccg) zzcciVar.zzc.get((String) schema.elementTypes);
        }
        if (zzccgVar == null) {
            zzccgVar = zzcciVar.zza;
        }
        if (zzccgVar != null) {
            this.zzf = this.zzf.zzh(zzccg.zza, zzccgVar);
        }
        zzbpa zza2 = this.zzb.zza(schema, this.zzf);
        this.zzg = zza2;
        zza2.zza(zzbozVar, zzbsnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbtl, com.google.android.libraries.places.internal.zzbpa
    public final void zze(String str, Throwable th) {
        zzbpa zzbpaVar = this.zzg;
        if (zzbpaVar != null) {
            zzbpaVar.zze(str, th);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final zzbpa zzf() {
        return this.zzg;
    }
}
