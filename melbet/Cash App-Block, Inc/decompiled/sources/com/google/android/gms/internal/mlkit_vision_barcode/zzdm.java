package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.internal.mlkit_vision_face.zzch;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzdm extends zzcv {
    public final transient zzch zza;
    public final transient Object[] zzb;
    public final transient int zzc = 1;

    public zzdm(zzch zzchVar, Object[] objArr) {
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
        zzcs zzcsVar = super.zza;
        if (zzcsVar == null) {
            zzcsVar = new zzdl(this);
            super.zza = zzcsVar;
        }
        return zzcsVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn
    public final int zza(int i, Object[] objArr) {
        zzcs zzcsVar = super.zza;
        if (zzcsVar == null) {
            zzcsVar = new zzdl(this);
            super.zza = zzcsVar;
        }
        return zzcsVar.zza(i, objArr);
    }
}
