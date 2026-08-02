package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzcg extends zzbn {
    public final transient com.google.android.gms.internal.mlkit_vision_face.zzch zza;
    public final transient Object[] zzb;
    public final transient int zzc = 1;

    public zzcg(com.google.android.gms.internal.mlkit_vision_face.zzch zzchVar, Object[] objArr) {
        this.zza = zzchVar;
        this.zzb = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbk zzbkVar = super.zza;
        if (zzbkVar == null) {
            zzbkVar = new zzcf(this);
            super.zza = zzbkVar;
        }
        return zzbkVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zza(Object[] objArr) {
        zzbk zzbkVar = super.zza;
        if (zzbkVar == null) {
            zzbkVar = new zzcf(this);
            super.zza = zzbkVar;
        }
        return zzbkVar.zza(objArr);
    }
}
