package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractSet;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapLinksIterator;

/* loaded from: classes.dex */
public final class PersistentOrderedSet extends AbstractSet implements ImmutableSet, Collection, KMappedMarker {
    public static final PersistentOrderedSet EMPTY;
    public final Object firstElement;
    public final PersistentHashMap hashMap;
    public final Object lastElement;

    static {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        EMPTY = new PersistentOrderedSet(endOfChain, endOfChain, PersistentHashMap.EMPTY);
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = persistentHashMap;
    }

    @Override // java.util.Collection, java.util.Set
    public final PersistentOrderedSet add(Object obj) {
        PersistentHashMap persistentHashMap = this.hashMap;
        if (persistentHashMap.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(obj, obj, persistentHashMap.put(obj, new Links()));
        }
        Object obj2 = this.lastElement;
        Object obj3 = persistentHashMap.get(obj2);
        obj3.getClass();
        return new PersistentOrderedSet(this.firstElement, obj, persistentHashMap.put(obj2, new Links(((Links) obj3).previous, obj)).put(obj, new Links(obj2)));
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.hashMap.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.hashMap.getSize();
    }

    @Override // kotlin.collections.AbstractSet, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new PersistentOrderedMapLinksIterator(this.firstElement, this.hashMap, 1);
    }

    @Override // java.util.Collection, java.util.Set
    public final PersistentOrderedSet remove(Object obj) {
        PersistentHashMap persistentHashMap = this.hashMap;
        Links links = (Links) persistentHashMap.get(obj);
        if (links == null) {
            return this;
        }
        Object obj2 = links.previous;
        Object obj3 = links.next;
        TrieNode trieNode = persistentHashMap.node;
        TrieNode remove = trieNode.remove(obj != null ? obj.hashCode() : 0, 0, obj);
        if (trieNode != remove) {
            persistentHashMap = remove == null ? PersistentHashMap.EMPTY : new PersistentHashMap(remove, persistentHashMap.size - 1);
        }
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        if (obj2 != endOfChain) {
            Object obj4 = persistentHashMap.get(obj2);
            obj4.getClass();
            persistentHashMap = persistentHashMap.put(obj2, new Links(((Links) obj4).previous, obj3));
        }
        if (obj3 != endOfChain) {
            Object obj5 = persistentHashMap.get(obj3);
            obj5.getClass();
            persistentHashMap = persistentHashMap.put(obj3, new Links(obj2, ((Links) obj5).next));
        }
        Object obj6 = obj2 != endOfChain ? this.firstElement : obj3;
        if (obj3 != endOfChain) {
            obj2 = this.lastElement;
        }
        return new PersistentOrderedSet(obj6, obj2, persistentHashMap);
    }
}
