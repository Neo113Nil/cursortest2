package com.google.android.libraries.places.internal;

import androidx.collection.SimpleArrayMap;
import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzux extends zzuy {
    public static final zzuy zza;

    static {
        zzuy zzb = new zzux(null, new SimpleArrayMap(0)).zzb();
        zza = zzb;
        zzux zzuxVar = new zzux(zzb, new SimpleArrayMap(0));
        boolean z = !zzuxVar.zzd;
        Boolean bool = Boolean.TRUE;
        Trace.checkState("Can't mutate after handing to trace", z);
        Trace.checkState("Key already present", !zzuxVar.zzd());
        zzuxVar.zzc.put(zzuy.zza, bool);
        zzuxVar.zzb();
    }
}
