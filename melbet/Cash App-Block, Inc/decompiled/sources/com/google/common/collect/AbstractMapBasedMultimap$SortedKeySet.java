package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public class AbstractMapBasedMultimap$SortedKeySet extends AbstractMapBasedMultimap$KeySet implements SortedSet {
    public final /* synthetic */ Multimaps$CustomListMultimap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$SortedKeySet(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap);
        this.this$0 = multimaps$CustomListMultimap;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return sortedMap().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return sortedMap().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new AbstractMapBasedMultimap$SortedKeySet(this.this$0, sortedMap().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return sortedMap().lastKey();
    }

    public SortedMap sortedMap() {
        return (SortedMap) this.map;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new AbstractMapBasedMultimap$SortedKeySet(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new AbstractMapBasedMultimap$SortedKeySet(this.this$0, sortedMap().tailMap(obj));
    }
}
