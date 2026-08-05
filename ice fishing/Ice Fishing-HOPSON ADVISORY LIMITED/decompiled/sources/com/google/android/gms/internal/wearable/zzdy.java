package com.google.android.gms.internal.wearable;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
final class zzdy {
    zzdy() {
    }

    public static final List zza(Object obj, long j) {
        zzdp zzdpVar = (zzdp) zzfp.zzm(obj, j);
        if (zzdpVar.zza()) {
            return zzdpVar;
        }
        int size = zzdpVar.size();
        zzdp zzg = zzdpVar.zzg(size == 0 ? 10 : size + size);
        zzfp.zzn(obj, j, zzg);
        return zzg;
    }
}
