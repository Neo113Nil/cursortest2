package com.google.android.libraries.places.internal;

import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcdp extends zzbrx {
    public static final boolean zza;

    static {
        Logger logger = zzbzg.zzp;
        zza = zzbqe.zzb("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // com.google.android.libraries.places.internal.zzbrk
    public final zzbrv zza(zzbrm zzbrmVar) {
        return zza ? new zzcdj(zzbrmVar) : new zzcdo(zzbrmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbrx
    public final String zzd() {
        return "pick_first";
    }

    @Override // com.google.android.libraries.places.internal.zzbrx
    public final zzbsz zze(Map map) {
        try {
            Boolean zzi = zzwr.zzi("shuffleAddressList", map);
            return new zzbsz(zza ? new zzcde(zzi) : new zzcdl(zzi));
        } catch (RuntimeException e) {
            return new zzbsz(zzbtx.zzi.zzd(e).zze("Failed parsing configuration for pick_first"));
        }
    }
}
