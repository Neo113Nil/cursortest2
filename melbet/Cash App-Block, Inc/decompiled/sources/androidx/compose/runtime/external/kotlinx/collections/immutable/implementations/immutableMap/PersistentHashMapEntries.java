package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractSet;

/* loaded from: classes.dex */
public final class PersistentHashMapEntries extends AbstractSet implements ImmutableSet {
    public final PersistentHashMap map;

    public PersistentHashMapEntries(PersistentHashMap persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        PersistentHashMap persistentHashMap = this.map;
        Object obj2 = persistentHashMap.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && persistentHashMap.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.map.size;
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        TrieNode trieNode = this.map.node;
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i = 0; i < 8; i++) {
            trieNodeBaseIteratorArr[i] = new TrieNodeEntriesIterator();
        }
        return new PersistentHashMapEntriesIterator(trieNode, trieNodeBaseIteratorArr);
    }
}
