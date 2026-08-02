package com.google.android.gms.internal.mlkit_vision_face;

import com.google.common.collect.Sets$ImprovedAbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzaj extends Sets$ImprovedAbstractSet {
    public final /* synthetic */ zzas zza;
    public final Map zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzas zzasVar, Map map) {
        super(2);
        this.zza = zzasVar;
        map.getClass();
        this.zzb = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            zzag zzagVar = (zzag) it;
            if (!zzagVar.hasNext()) {
                return;
            }
            zzagVar.next();
            zzagVar.remove();
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
        return new zzag(this, this.zzb.entrySet().iterator(), 1);
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
