package com.google.android.gms.internal.mlkit_vision_face;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.squareup.cash.fidesmo.views.ScanningShapePulseKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzaf extends Sets$ImprovedAbstractSet {
    public final /* synthetic */ zzah zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaf(zzah zzahVar) {
        super(2);
        this.zza = zzahVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzag(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzas zzasVar = (zzas) this.zza.zzb;
        Object key = entry.getKey();
        zzbd zzbdVar = zzasVar.zza;
        zzbdVar.getClass();
        try {
            obj2 = zzbdVar.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        zzasVar.zzb -= size;
        return true;
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return ScanningShapePulseKt.zzb(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= remove(it.next());
            }
            return z;
        }
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            } else {
                if (size < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size, "expectedSize cannot be negative but was: "));
                    return false;
                }
                ceil = size + 1;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            zzas zzasVar = (zzas) this.zza.zzb;
            zzaj zzajVar = ((zzar) zzasVar).zza;
            if (zzajVar == null) {
                zzajVar = new zzaj(zzasVar, zzasVar.zza);
                ((zzar) zzasVar).zza = zzajVar;
            }
            return zzajVar.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zza.size();
    }
}
