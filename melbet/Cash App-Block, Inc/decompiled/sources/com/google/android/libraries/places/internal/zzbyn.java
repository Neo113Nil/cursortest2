package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbyn implements zzbvu {
    public final zzbtx zza;
    public final zzbvs zzb;

    public zzbyn(zzbtx zzbtxVar, zzbvs zzbvsVar) {
        Trace.checkArgument("error must not be OK", !zzbtxVar.zzj());
        this.zza = zzbtxVar;
        this.zzb = zzbvsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbvu
    public final zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        return new zzbym(this.zza, this.zzb, zzbphVarArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
