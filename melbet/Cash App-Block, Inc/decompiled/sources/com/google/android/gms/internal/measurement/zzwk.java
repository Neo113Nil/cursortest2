package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import androidx.tracing.Trace;

/* loaded from: classes4.dex */
public final class zzwk extends zzwl {
    public static final zzwl zza;
    public static final zzwl zzb;

    static {
        zzwl zzb2 = new zzwk(null, new SimpleArrayMap(0)).zzb();
        zza = zzb2;
        zzwk zzwkVar = new zzwk(zzb2, new SimpleArrayMap(0));
        boolean z = !zzwkVar.zzd;
        Boolean bool = Boolean.TRUE;
        Trace.checkState("Can't mutate after handing to trace", z);
        Trace.checkState("Key already present", !zzwkVar.zzd());
        zzwkVar.zzc.put(zzwl.zza, bool);
        zzb = zzwkVar.zzb();
    }
}
