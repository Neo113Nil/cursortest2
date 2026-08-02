package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ValueHolder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import okio.PriorityQueue;

/* loaded from: classes.dex */
public final class PersistentCompositionLocalHashMap extends PersistentHashMap implements CompositionLocalMap {
    public static final PersistentCompositionLocalHashMap Empty = new PersistentCompositionLocalHashMap(TrieNode.EMPTY, 0);

    public final class Builder extends PersistentHashMapBuilder {
        public PersistentCompositionLocalHashMap map;

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder
        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final PersistentCompositionLocalHashMap build$1() {
            TrieNode trieNode = this.node;
            PersistentCompositionLocalHashMap persistentCompositionLocalHashMap = this.map;
            if (trieNode != persistentCompositionLocalHashMap.node) {
                this.ownership = new EndOfChain();
                persistentCompositionLocalHashMap = new PersistentCompositionLocalHashMap(this.node, getSize());
            }
            this.map = persistentCompositionLocalHashMap;
            return persistentCompositionLocalHashMap;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof ProvidableCompositionLocal) {
                return super.containsKey((ProvidableCompositionLocal) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof ValueHolder) {
                return super.containsValue((ValueHolder) obj);
            }
            return false;
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof ProvidableCompositionLocal) {
                return (ValueHolder) super.get((ProvidableCompositionLocal) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof ProvidableCompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((ProvidableCompositionLocal) obj, (ValueHolder) obj2);
        }

        @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof ProvidableCompositionLocal) {
                return (ValueHolder) super.remove((ProvidableCompositionLocal) obj);
            }
            return null;
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    public final PersistentHashMapBuilder builder() {
        Builder builder = new Builder(this);
        builder.map = this;
        return builder;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap
    public final PersistentHashMapBuilder builder$1() {
        Builder builder = new Builder(this);
        builder.map = this;
        return builder;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof ProvidableCompositionLocal) {
            return super.containsKey((ProvidableCompositionLocal) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof ValueHolder) {
            return super.containsValue((ValueHolder) obj);
        }
        return false;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap, kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof ProvidableCompositionLocal) {
            return (ValueHolder) super.get((ProvidableCompositionLocal) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof ProvidableCompositionLocal) ? obj2 : (ValueHolder) super.getOrDefault((ProvidableCompositionLocal) obj, (ValueHolder) obj2);
    }

    public final PersistentCompositionLocalHashMap putValue(ProvidableCompositionLocal providableCompositionLocal, ValueHolder valueHolder) {
        PriorityQueue put = this.node.put(providableCompositionLocal.hashCode(), providableCompositionLocal, valueHolder, 0);
        return put == null ? this : new PersistentCompositionLocalHashMap((TrieNode) put.f1547array, this.size + put.size);
    }
}
