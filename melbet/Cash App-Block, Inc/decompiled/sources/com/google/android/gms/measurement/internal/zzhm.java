package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.zzae;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzhm extends LruCache {
    public final /* synthetic */ zzht zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhm(zzht zzhtVar) {
        super(20);
        this.zza = zzhtVar;
    }

    @Override // androidx.collection.LruCache
    public final Object create(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        zzae.checkNotEmpty(str);
        zzht zzhtVar = this.zza;
        zzhtVar.zzay();
        zzae.checkNotEmpty(str);
        zzaw zzawVar = zzhtVar.zzg.zze;
        zzpg.zzaT(zzawVar);
        com.google.android.gms.maps.zzah zzy = zzawVar.zzy(str);
        if (zzy == null) {
            return null;
        }
        zzgu zzguVar = ((zzic) zzhtVar.$$delegate_0).zzi;
        zzic.zzP(zzguVar);
        zzguVar.zzl.zzb(str, "Populate EES config from database on cache miss. appId");
        zzhtVar.zzH(str, zzhtVar.zzI(str, (byte[]) zzy.f68zza));
        zzhm zzhmVar = zzhtVar.zze;
        synchronized (zzhmVar.lock) {
            Set entrySet = zzhmVar.map.map.entrySet();
            entrySet.getClass();
            linkedHashMap = new LinkedHashMap(entrySet.size());
            Set<Map.Entry> entrySet2 = zzhmVar.map.map.entrySet();
            entrySet2.getClass();
            for (Map.Entry entry : entrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.zzc) linkedHashMap.get(str);
    }
}
