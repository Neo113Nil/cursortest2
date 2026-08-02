package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzzz extends zzaaa {
    public final Map zza;

    public zzzz(zzjx zzjxVar, zzjx zzjxVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzd(linkedHashMap, zzjxVar);
        zzd(linkedHashMap, zzjxVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzyl) entry.getKey()).zzc) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.zza = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void zzd(LinkedHashMap linkedHashMap, zzjx zzjxVar) {
        for (int i = 0; i < zzjxVar.zza(); i++) {
            zzyl zzb = zzjxVar.zzb(i);
            Object obj = linkedHashMap.get(zzb);
            boolean z = zzb.zzc;
            Class cls = zzb.zzb;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(zzb, list);
                }
                list.add(cls.cast(zzjxVar.zzc(i)));
            } else {
                linkedHashMap.put(zzb, cls.cast(zzjxVar.zzc(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void zza(zzzm zzzmVar, zzzc zzzcVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            zzyl zzylVar = (zzyl) entry.getKey();
            Object value = entry.getValue();
            if (zzylVar.zzc) {
                zzzmVar.zzb(zzylVar, ((List) value).iterator(), zzzcVar);
            } else {
                zzzmVar.zza(zzylVar, value, zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set zzc() {
        return this.zza.keySet();
    }
}
