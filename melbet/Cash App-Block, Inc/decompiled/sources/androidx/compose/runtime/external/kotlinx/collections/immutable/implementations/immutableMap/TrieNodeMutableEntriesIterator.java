package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes3.dex */
public final class TrieNodeMutableEntriesIterator extends TrieNodeBaseIterator {
    public final SmartSet.ArrayIterator parentIterator;

    public TrieNodeMutableEntriesIterator(SmartSet.ArrayIterator arrayIterator) {
        this.parentIterator = arrayIterator;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.index;
        this.index = i + 2;
        Object[] objArr = this.buffer;
        return new MutableMapEntry(this.parentIterator, objArr[i], objArr[i + 1]);
    }
}
