package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzah;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes4.dex */
public class AbstractMapBasedMultimap$SortedAsMap extends zzah implements SortedMap {
    public SortedSet sortedKeySet;
    public final /* synthetic */ Multimaps$CustomListMultimap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractMapBasedMultimap$SortedAsMap(Multimaps$CustomListMultimap multimaps$CustomListMultimap, SortedMap sortedMap) {
        super(multimaps$CustomListMultimap, sortedMap, 3);
        this.this$0 = multimaps$CustomListMultimap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return sortedMap().comparator();
    }

    public SortedSet createKeySet() {
        return new AbstractMapBasedMultimap$SortedKeySet(this.this$0, sortedMap());
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return sortedMap().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new AbstractMapBasedMultimap$SortedAsMap(this.this$0, sortedMap().headMap(obj));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzah, java.util.AbstractMap, java.util.Map
    public SortedSet keySet() {
        SortedSet sortedSet = this.sortedKeySet;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet createKeySet = createKeySet();
        this.sortedKeySet = createKeySet;
        return createKeySet;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return sortedMap().lastKey();
    }

    public SortedMap sortedMap() {
        return (SortedMap) this.zza;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new AbstractMapBasedMultimap$SortedAsMap(this.this$0, sortedMap().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new AbstractMapBasedMultimap$SortedAsMap(this.this$0, sortedMap().tailMap(obj));
    }
}
