package com.google.android.gms.internal.mlkit_genai_prompt;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzit extends zzip {
    public final transient zziw zza;
    public final transient Object[] zzb;
    public final transient int zzc;

    public zzit(zziw zziwVar, Object[] objArr, int i) {
        this.zza = zziwVar;
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
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzih
    public final int zza(Object[] objArr) {
        return zzd().zza(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_genai_prompt.zzip
    public final zzil zzh() {
        return new zzis(this);
    }
}
