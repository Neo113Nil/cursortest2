package com.google.android.libraries.places.internal;

import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public final class zzbzz extends zzbyt {
    public final zzbwf zza;
    public final zzyr zzb;

    public /* synthetic */ zzbzz(zzbwf zzbwfVar, zzyr zzyrVar) {
        this.zza = zzbwfVar;
        this.zzb = zzyrVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbyt
    public final zzbwf zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbyt, com.google.android.libraries.places.internal.zzbvu
    public final zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        return new zzbzy(this, this.zza.zzb(schema, zzbsnVar, zzbovVar, zzbphVarArr));
    }
}
