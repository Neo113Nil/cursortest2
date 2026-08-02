package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzan extends zzaj {
    public final transient zzaq zza;
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzan(zzaq zzaqVar, Object[] objArr, int i) {
        this.zza = zzaqVar;
        this.zzb = objArr;
        this.zzc = i;
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
        zzaf zzafVar = super.zza;
        if (zzafVar == null) {
            zzafVar = new zzam(this);
            super.zza = zzafVar;
        }
        return zzafVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzab
    public final int zza(Object[] objArr) {
        zzaf zzafVar = super.zza;
        if (zzafVar == null) {
            zzafVar = new zzam(this);
            super.zza = zzafVar;
        }
        return zzafVar.zza(objArr);
    }
}
