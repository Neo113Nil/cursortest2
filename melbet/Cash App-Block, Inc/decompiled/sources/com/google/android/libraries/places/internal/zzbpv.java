package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbpv {
    public static final Logger zza = Logger.getLogger(zzbpv.class.getName());
    public static final zzbpv zzb = new zzbpv();

    private zzbpv() {
    }

    public final zzbpv zzb() {
        zzbpv zza2 = zzbpt.zza.zza(this);
        return zza2 == null ? zzb : zza2;
    }

    public final void zzc(zzbpv zzbpvVar) {
        if (zzbpvVar != null) {
            zzbpt.zza.zzb(this, zzbpvVar);
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("toAttach");
        }
    }
}
