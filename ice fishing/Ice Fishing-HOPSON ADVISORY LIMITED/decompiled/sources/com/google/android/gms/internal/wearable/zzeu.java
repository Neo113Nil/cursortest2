package com.google.android.gms.internal.wearable;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzeu {
    private static final zzeu zza = new zzeu();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzed zzb = new zzed();

    private zzeu() {
    }

    static zzeu zza() {
        return zza;
    }

    private <T> zzey<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zzey<T> zza2 = this.zzb.zza(cls);
        zzey<T> zzeyVar = (zzey) concurrentMap.putIfAbsent(cls, zza2);
        return zzeyVar != null ? zzeyVar : zza2;
    }

    final zzey zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zzey) obj;
    }
}
