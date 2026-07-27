package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
final class zzel {
    private static final zzel zza = new zzel();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzep zzb = new zzdu();

    private zzel() {
    }

    public static zzel zza() {
        return zza;
    }

    public final zzeo zzb(Class cls) {
        zzda.zzc(cls, "messageType");
        zzeo zzeoVar = (zzeo) this.zzc.get(cls);
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zza2 = this.zzb.zza(cls);
        zzda.zzc(cls, "messageType");
        zzeo zzeoVar2 = (zzeo) this.zzc.putIfAbsent(cls, zza2);
        return zzeoVar2 == null ? zza2 : zzeoVar2;
    }
}
