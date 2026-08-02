package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import java.util.Iterator;
import kotlin.collections.AbstractSet;

/* loaded from: classes3.dex */
public final class PersistentHashMapKeys extends AbstractSet implements ImmutableSet {
    public final PersistentHashMap map;

    public PersistentHashMapKeys(PersistentHashMap persistentHashMap) {
        this.map = persistentHashMap;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
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
            trieNodeBaseIteratorArr[i] = new TrieNodeKeysIterator(0);
        }
        return new PersistentHashMapKeysIterator(trieNode, trieNodeBaseIteratorArr);
    }
}
