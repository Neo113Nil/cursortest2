package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbsa {
    public static final Logger zza = Logger.getLogger(zzbsa.class.getName());
    public static zzbsa zzb;
    public final LinkedHashSet zzc = new LinkedHashSet();
    public final LinkedHashMap zzd = new LinkedHashMap();

    public final synchronized zzbrx zzb(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.zzd;
        Trace.checkNotNull(str, "policy");
        return (zzbrx) linkedHashMap.get(str);
    }

    public final synchronized void zze() {
        LinkedHashMap linkedHashMap = this.zzd;
        linkedHashMap.clear();
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzbrx zzbrxVar = (zzbrx) it.next();
            String zzd = zzbrxVar.zzd();
            if (((zzbrx) linkedHashMap.get(zzd)) == null) {
                linkedHashMap.put(zzd, zzbrxVar);
            }
        }
    }
}
