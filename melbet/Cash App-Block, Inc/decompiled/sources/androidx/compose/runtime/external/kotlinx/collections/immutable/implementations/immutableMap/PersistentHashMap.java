package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.Links;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.MatcherMatchResult$groups$1;
import okio.PriorityQueue;

/* loaded from: classes.dex */
public class PersistentHashMap extends AbstractMap implements Map, KMappedMarker {
    public static final PersistentHashMap EMPTY = new PersistentHashMap(TrieNode.EMPTY, 0);
    public final TrieNode node;
    public final int size;

    public PersistentHashMap(TrieNode trieNode, int i) {
        this.node = trieNode;
        this.size = i;
    }

    public PersistentHashMapBuilder builder() {
        return new PersistentHashMapBuilder(this);
    }

    public /* bridge */ PersistentHashMapBuilder builder$1() {
        return builder();
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.node.containsKey(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.node.get(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getEntries() {
        return new PersistentHashMapEntries(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set getKeys() {
        return new PersistentHashMapKeys(this);
    }

    @Override // kotlin.collections.AbstractMap
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMap
    public final Collection getValues() {
        return new MatcherMatchResult$groups$1(this, 1);
    }

    public final PersistentHashMap put(Object obj, Links links) {
        PriorityQueue put = this.node.put(obj != null ? obj.hashCode() : 0, obj, links, 0);
        return put == null ? this : new PersistentHashMap((TrieNode) put.f1547array, this.size + put.size);
    }
}
