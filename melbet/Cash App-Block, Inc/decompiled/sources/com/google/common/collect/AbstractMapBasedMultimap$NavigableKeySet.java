package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzag;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public final class AbstractMapBasedMultimap$NavigableKeySet extends AbstractMapBasedMultimap$SortedKeySet implements NavigableSet {
    public final /* synthetic */ Multimaps$CustomListMultimap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$NavigableKeySet(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
        super(multimaps$CustomListMultimap, navigableMap);
        this.this$0 = multimaps$CustomListMultimap;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((AbstractMapBasedMultimap$KeySet) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new AbstractMapBasedMultimap$NavigableKeySet(this.this$0, sortedMap().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return sortedMap().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new AbstractMapBasedMultimap$NavigableKeySet(this.this$0, sortedMap().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return sortedMap().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        zzag zzagVar = (zzag) iterator();
        if (!zzagVar.hasNext()) {
            return null;
        }
        Object next = zzagVar.next();
        zzagVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet
    public final NavigableMap sortedMap() {
        return (NavigableMap) ((SortedMap) this.map);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new AbstractMapBasedMultimap$NavigableKeySet(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new AbstractMapBasedMultimap$NavigableKeySet(this.this$0, sortedMap().tailMap(obj, z));
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedKeySet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
