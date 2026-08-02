package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbl extends Sets$ImprovedAbstractSet {
    public final /* synthetic */ zzbw zza;
    public final Map zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbl(zzbw zzbwVar, Map map) {
        super(1);
        this.zza = zzbwVar;
        this.zzb = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            zzbh zzbhVar = (zzbh) it;
            if (!zzbhVar.hasNext()) {
                return;
            }
            zzbhVar.next();
            zzbhVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zzb.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzb.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzb.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzb.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.zzb.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzbh(this, this.zzb.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzb.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.zza.zzb -= size;
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzb.size();
    }
}
