package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator;

/* loaded from: classes3.dex */
public final class SingleElementListIterator extends AbstractListIterator {
    public final Object element;

    public SingleElementListIterator(Object obj, int i) {
        super(i, 1, 1);
        this.element = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.index++;
            return this.element;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.index--;
            return this.element;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
