package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

/* loaded from: classes.dex */
public final class TrieNodeEntriesIterator extends TrieNodeBaseIterator {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.index;
        this.index = i + 2;
        Object[] objArr = this.buffer;
        return new MapEntry(objArr[i], objArr[i + 1]);
    }
}
