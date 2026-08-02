package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class zzbpn {
    public static final zzbpn zzb = new zzbpn(new zzbpj(), zzbpk.zza);
    public final ConcurrentHashMap zzc = new ConcurrentHashMap();

    public zzbpn(zzbpl... zzbplVarArr) {
        for (int i = 0; i < 2; i++) {
            zzbpl zzbplVar = zzbplVarArr[i];
            this.zzc.put(zzbplVar.zza(), zzbplVar);
        }
    }
}
