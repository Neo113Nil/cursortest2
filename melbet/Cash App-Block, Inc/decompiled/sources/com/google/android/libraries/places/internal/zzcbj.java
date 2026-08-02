package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzcbj extends zzbow {
    public final /* synthetic */ zzcbs zza;

    public zzcbj(zzcbs zzcbsVar) {
        this.zza = zzcbsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final zzbpa zza(Schema schema, zzbov zzbovVar) {
        zzcby zzcbyVar = this.zza.zza;
        zzcbyVar.getClass();
        Executor executor = zzbovVar.zzc;
        if (executor == null) {
            executor = zzcbyVar.zzr;
        }
        zzbvq zzbvqVar = new zzbvq(schema, executor, zzbovVar, zzcbyVar.zzaf, zzcbyVar.zzP ? null : zzcbyVar.zzp.zza.zzb, zzcbyVar.zzS);
        zzbvqVar.zzo = zzcbyVar.zzw;
        return zzbvqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbow
    public final String zzb() {
        return this.zza.zzc;
    }
}
