package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzah;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public final class AbstractMapBasedMultimap$NavigableAsMap extends AbstractMapBasedMultimap$SortedAsMap implements NavigableMap {
    public final /* synthetic */ Multimaps$CustomListMultimap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$NavigableAsMap(Multimaps$CustomListMultimap multimaps$CustomListMultimap, NavigableMap navigableMap) {
        super(multimaps$CustomListMultimap, navigableMap);
        this.this$0 = multimaps$CustomListMultimap;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = sortedMap().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return wrapEntry(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return sortedMap().ceilingKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
    public final SortedSet createKeySet() {
        return new AbstractMapBasedMultimap$NavigableKeySet(this.this$0, sortedMap());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new AbstractMapBasedMultimap$NavigableAsMap(this.this$0, sortedMap().descendingMap());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = sortedMap().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return wrapEntry(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = sortedMap().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return wrapEntry(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return sortedMap().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new AbstractMapBasedMultimap$NavigableAsMap(this.this$0, sortedMap().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = sortedMap().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return wrapEntry(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return sortedMap().higherKey(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap, com.google.android.gms.internal.mlkit_vision_face.zzah, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = sortedMap().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return wrapEntry(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = sortedMap().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return wrapEntry(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return sortedMap().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    public final AbstractMap.SimpleImmutableEntry pollAsMapEntry(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.this$0.factory.get();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new AbstractMap.SimpleImmutableEntry(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return pollAsMapEntry(((AbstractMapBasedMultimap$AsMap$AsMapEntries) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return pollAsMapEntry(((AbstractMapBasedMultimap$AsMap$AsMapEntries) ((zzah) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap
    public final NavigableMap sortedMap() {
        return (NavigableMap) ((SortedMap) this.zza);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new AbstractMapBasedMultimap$NavigableAsMap(this.this$0, sortedMap().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new AbstractMapBasedMultimap$NavigableAsMap(this.this$0, sortedMap().tailMap(obj, z));
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap, com.google.android.gms.internal.mlkit_vision_face.zzah, java.util.AbstractMap, java.util.Map
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap$SortedAsMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
