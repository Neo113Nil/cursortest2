package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator;

/* loaded from: classes.dex */
public final class BufferIterator extends AbstractListIterator {
    public final Object[] buffer;

    public BufferIterator(int i, int i2, Object[] objArr) {
        super(i, i2, 1);
        this.buffer = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index;
        this.index = i + 1;
        return this.buffer[i];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int i = this.index - 1;
        this.index = i;
        return this.buffer[i];
    }
}
