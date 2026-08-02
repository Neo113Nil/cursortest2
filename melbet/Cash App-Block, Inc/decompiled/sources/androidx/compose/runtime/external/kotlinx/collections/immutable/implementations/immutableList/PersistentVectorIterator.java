package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator;

/* loaded from: classes3.dex */
public final class PersistentVectorIterator extends AbstractListIterator {
    public final Object[] tail;
    public final TrieIterator trieIterator;

    public PersistentVectorIterator(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.tail = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.trieIterator = new TrieIterator(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        TrieIterator trieIterator = this.trieIterator;
        if (trieIterator.hasNext()) {
            this.index++;
            return trieIterator.next();
        }
        int i = this.index;
        this.index = i + 1;
        return this.tail[i - trieIterator.size];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        TrieIterator trieIterator = this.trieIterator;
        int i2 = trieIterator.size;
        if (i <= i2) {
            this.index = i - 1;
            return trieIterator.previous();
        }
        int i3 = i - 1;
        this.index = i3;
        return this.tail[i3 - i2];
    }
}
