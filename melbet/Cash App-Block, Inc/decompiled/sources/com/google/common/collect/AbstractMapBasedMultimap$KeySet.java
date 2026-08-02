package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzag;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class AbstractMapBasedMultimap$KeySet extends Sets$ImprovedAbstractSet {
    public final Map map;
    public final /* synthetic */ Multimaps$CustomListMultimap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$KeySet(Multimaps$CustomListMultimap multimaps$CustomListMultimap, Map map) {
        super(0);
        this.this$0 = multimaps$CustomListMultimap;
        map.getClass();
        this.map = map;
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
        return this.map.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.map.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.map.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.map.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzag(this, this.map.entrySet().iterator(), 4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.map.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.this$0.totalSize -= i;
        } else {
            i = 0;
        }
        return i > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.map.size();
    }
}
