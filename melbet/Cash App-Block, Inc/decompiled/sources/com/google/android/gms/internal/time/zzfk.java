package com.google.android.gms.internal.time;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzfk extends zzfm {
    public final Map zza;

    public zzfk(zzcw zzcwVar, zzcw zzcwVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzd(linkedHashMap, zzcwVar);
        zzd(linkedHashMap, zzcwVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((zzdq) entry.getKey()).zzc) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.zza = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void zzd(LinkedHashMap linkedHashMap, zzcw zzcwVar) {
        for (int i = 0; i < zzcwVar.zza(); i++) {
            zzdq zzb = zzcwVar.zzb(i);
            Object obj = linkedHashMap.get(zzb);
            boolean z = zzb.zzc;
            Class cls = zzb.zzb;
            if (z) {
                List list = (List) obj;
                if (list == null) {
                    list = new ArrayList();
                    linkedHashMap.put(zzb, list);
                }
                list.add(cls.cast(zzcwVar.zzd(i)));
            } else {
                linkedHashMap.put(zzb, cls.cast(zzcwVar.zzd(i)));
            }
        }
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final int zza() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final Set zzb() {
        return this.zza.keySet();
    }

    @Override // com.google.android.gms.internal.time.zzfm
    public final void zzc(zzew zzewVar, zzem zzemVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            zzdq zzdqVar = (zzdq) entry.getKey();
            Object value = entry.getValue();
            if (zzdqVar.zzc) {
                zzewVar.zzb(zzdqVar, ((List) value).iterator(), zzemVar);
            } else {
                zzewVar.zza(zzdqVar, value, zzemVar);
            }
        }
    }
}
