package com.google.common.collect;

import com.google.android.gms.internal.mlkit_vision_face.zzah;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class Multimaps$CustomListMultimap extends AbstractMultimap implements Serializable {
    public transient MultimapBuilder$ArrayListSupplier factory;
    public transient Map map;
    public transient int totalSize;

    public final void clear() {
        Map map = this.map;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.totalSize = 0;
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Map createAsMap() {
        Map map = this.map;
        return map instanceof NavigableMap ? new AbstractMapBasedMultimap$NavigableAsMap(this, (NavigableMap) map) : map instanceof SortedMap ? new AbstractMapBasedMultimap$SortedAsMap(this, (SortedMap) map) : new zzah(this, map, 3);
    }

    @Override // com.google.common.collect.AbstractMultimap
    public final Set createKeySet() {
        Map map = this.map;
        return map instanceof NavigableMap ? new AbstractMapBasedMultimap$NavigableKeySet(this, (NavigableMap) map) : map instanceof SortedMap ? new AbstractMapBasedMultimap$SortedKeySet(this, (SortedMap) map) : new AbstractMapBasedMultimap$KeySet(this, map);
    }
}
