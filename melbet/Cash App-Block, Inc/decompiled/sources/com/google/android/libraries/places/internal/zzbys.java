package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;

/* loaded from: classes4.dex */
public abstract class zzbys implements zzbvt {
    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zze(), "delegate");
        return stringHelper.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zza(zzbsn zzbsnVar) {
        zze().zza(zzbsnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzfv zzfvVar) {
        zze().zzb(zzfvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public void zzc(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzd() {
        zze().zzd();
    }

    public abstract zzbvt zze();
}
