package com.google.android.gms.internal.mlkit_vision_text_common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzah;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.squareup.cash.filament.util.MeshLoaderKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzab extends Sets$ImprovedAbstractSet {
    public final /* synthetic */ int $r8$classId = 0;
    public final Map zza;

    public zzab(zzao zzaoVar, Map map) {
        super(3);
        map.getClass();
        this.zza = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.$r8$classId) {
            case 0:
                ((zzah) this.zza).clear();
                break;
            default:
                Iterator it = iterator();
                while (true) {
                    zzae zzaeVar = (zzae) it;
                    if (!zzaeVar.hasNext()) {
                        break;
                    } else {
                        zzaeVar.next();
                        zzaeVar.remove();
                    }
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                Set entrySet = ((zzah) map).zza.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return map.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.$r8$classId) {
            case 1:
                return this.zza.keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        switch (this.$r8$classId) {
            case 1:
                return this == obj || this.zza.keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.$r8$classId) {
            case 1:
                return this.zza.keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                return ((zzah) map).isEmpty();
            default:
                return map.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                return new zzac((zzah) map);
            default:
                return new zzae(this, map.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    Objects.requireNonNull(entry);
                    Object key = entry.getKey();
                    zzba zzbaVar = ((zzao) ((zzah) map).zzb).zza;
                    zzbaVar.getClass();
                    try {
                        obj2 = zzbaVar.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        obj2 = null;
                    }
                    Collection collection = (Collection) obj2;
                    if (collection != null) {
                        collection.size();
                        collection.clear();
                    }
                    break;
                }
                break;
            default:
                Collection collection2 = (Collection) map.remove(obj);
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    if (size > 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.$r8$classId) {
            case 0:
                try {
                    if (collection != null) {
                        return MeshLoaderKt.zzb(this, collection);
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
            default:
                return super.removeAll(collection);
        }
    }

    @Override // com.google.common.collect.Sets$ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        int ceil;
        switch (this.$r8$classId) {
            case 0:
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
                    zzao zzaoVar = (zzao) ((zzah) this.zza).zzb;
                    zzab zzabVar = ((zzan) zzaoVar).zza;
                    if (zzabVar == null) {
                        zzabVar = new zzab(zzaoVar, zzaoVar.zza);
                        ((zzan) zzaoVar).zza = zzabVar;
                    }
                    return zzabVar.retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.$r8$classId;
        Map map = this.zza;
        switch (i) {
            case 0:
                return ((zzah) map).zza.size();
            default:
                return map.size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzab(zzah zzahVar) {
        super(3);
        this.zza = zzahVar;
    }
}
