package com.google.android.libraries.places.internal;

import com.google.android.gms.auth.api.zbc;

/* loaded from: classes4.dex */
public abstract class zzbrv {
    public static final zbc zzb;
    public static final zbc zzc;
    public static final zzboq zza = new zzboq("internal:health-checking-config", 0);
    public static final zzboq zzd = new zzboq("internal:has-health-check-producer-listener", 0);
    public static final zzboq zze = new zzboq("io.grpc.IS_PETIOLE_POLICY", 0);

    static {
        int i = 18;
        zzb = new zbc(i, "internal:health-check-consumer-listener", (Object) null);
        zzc = new zbc(i, "internal:disable-subchannel-reconnect", Boolean.FALSE);
    }

    public zzbtx zza(zzbrr zzbrrVar) {
        throw null;
    }

    public abstract void zzb(zzbtx zzbtxVar);

    public abstract void zzc();

    public void zzd() {
    }
}
