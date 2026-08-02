package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes3.dex */
public final class MutableMapEntry extends MapEntry implements KMutableMap.Entry {
    public final SmartSet.ArrayIterator parentIterator;
    public Object value;

    public MutableMapEntry(SmartSet.ArrayIterator arrayIterator, Object obj, Object obj2) {
        super(obj, obj2);
        this.parentIterator = arrayIterator;
        this.value = obj2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object getValue() {
        return this.value;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.value;
        this.value = obj;
        PersistentHashMapBuilderBaseIterator persistentHashMapBuilderBaseIterator = (PersistentHashMapBuilderBaseIterator) this.parentIterator.arrayIterator;
        PersistentHashMapBuilder persistentHashMapBuilder = persistentHashMapBuilderBaseIterator.builder;
        Object obj3 = this.key;
        if (!persistentHashMapBuilder.containsKey(obj3)) {
            return obj2;
        }
        boolean z = persistentHashMapBuilderBaseIterator.hasNext;
        if (!z) {
            persistentHashMapBuilder.put(obj3, obj);
        } else {
            if (!z) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            TrieNodeBaseIterator trieNodeBaseIterator = persistentHashMapBuilderBaseIterator.path[persistentHashMapBuilderBaseIterator.pathLastIndex];
            Object obj4 = trieNodeBaseIterator.buffer[trieNodeBaseIterator.index];
            persistentHashMapBuilder.put(obj3, obj);
            persistentHashMapBuilderBaseIterator.resetPath(obj4 != null ? obj4.hashCode() : 0, persistentHashMapBuilder.node, obj4, 0);
        }
        persistentHashMapBuilderBaseIterator.expectedModCount = persistentHashMapBuilder.modCount;
        return obj2;
    }
}
