package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public abstract class zzbyt implements zzbwf {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zza(), "delegate");
        return stringHelper.toString();
    }

    public abstract zzbwf zza();

    @Override // com.google.android.libraries.places.internal.zzcck
    public final void zzaq(zzccj zzccjVar) {
        zza().zzaq(zzccjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbvu
    public zzbvr zzb(Schema schema, zzbsn zzbsnVar, zzbov zzbovVar, zzbph[] zzbphVarArr) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbqz
    public final zzbra zzc() {
        return zza().zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public void zzd(zzbtx zzbtxVar) {
        zza().zzd(zzbtxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcck
    public void zze(zzbtx zzbtxVar) {
        zza().zze(zzbtxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbwf
    public final zzbor zzf() {
        return zza().zzf();
    }
}
