package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilderValues;

/* loaded from: classes.dex */
public class PersistentHashMapBuilder extends AbstractMutableMap implements Map, KMutableMap {
    public PersistentHashMap map;
    public int modCount;
    public TrieNode node;
    public Object operationResult;
    public EndOfChain ownership = new EndOfChain();
    public int size;

    public PersistentHashMapBuilder(PersistentHashMap persistentHashMap) {
        this.map = persistentHashMap;
        this.node = persistentHashMap.node;
        this.size = persistentHashMap.size;
    }

    /* renamed from: build */
    public PersistentHashMap build$1() {
        TrieNode trieNode = this.node;
        PersistentHashMap persistentHashMap = this.map;
        if (trieNode != persistentHashMap.node) {
            this.ownership = new EndOfChain();
            persistentHashMap = new PersistentHashMap(this.node, getSize());
        }
        this.map = persistentHashMap;
        return persistentHashMap;
    }

    public /* bridge */ PersistentHashMap build$1() {
        return build$1();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.node = TrieNode.EMPTY;
        setSize(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.node.containsKey(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.node.get(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getEntries() {
        return new PersistentHashMapBuilderKeys(1, this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Set getKeys() {
        return new PersistentHashMapBuilderKeys(0, this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public final Collection getValues() {
        return new PersistentHashMapBuilderValues(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.operationResult = null;
        this.node = this.node.mutablePut(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        PersistentHashMap persistentHashMap = null;
        PersistentHashMap persistentHashMap2 = map instanceof PersistentHashMap ? (PersistentHashMap) map : null;
        if (persistentHashMap2 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder = map instanceof PersistentHashMapBuilder ? (PersistentHashMapBuilder) map : null;
            if (persistentHashMapBuilder != null) {
                persistentHashMap = persistentHashMapBuilder.build$1();
            }
        } else {
            persistentHashMap = persistentHashMap2;
        }
        if (persistentHashMap == null) {
            super.putAll(map);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter();
        deltaCounter.count = 0;
        int i = this.size;
        TrieNode trieNode = this.node;
        TrieNode trieNode2 = persistentHashMap.node;
        trieNode2.getClass();
        this.node = trieNode.mutablePutAll(trieNode2, 0, deltaCounter, this);
        int i2 = (persistentHashMap.size + i) - deltaCounter.count;
        if (i != i2) {
            setSize(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = getSize();
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.EMPTY;
        }
        this.node = mutableRemove;
        return size != getSize();
    }

    public final void setSize(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.operationResult = null;
        TrieNode mutableRemove = this.node.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (mutableRemove == null) {
            mutableRemove = TrieNode.EMPTY;
        }
        this.node = mutableRemove;
        return this.operationResult;
    }
}
