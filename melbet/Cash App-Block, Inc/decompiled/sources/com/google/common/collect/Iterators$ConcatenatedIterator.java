package com.google.common.collect;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Iterators$ConcatenatedIterator implements Iterator {
    public Iterator iterator;
    public ArrayDeque metaIterators;
    public Iterator toRemove;
    public Iterator topMetaIterator;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.iterator;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.topMetaIterator;
                if (it3 != null && it3.hasNext()) {
                    it = this.topMetaIterator;
                    break;
                }
                ArrayDeque arrayDeque = this.metaIterators;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                this.topMetaIterator = (Iterator) this.metaIterators.removeFirst();
            }
            it = null;
            this.topMetaIterator = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.iterator = it4;
            if (it4 instanceof Iterators$ConcatenatedIterator) {
                Iterators$ConcatenatedIterator iterators$ConcatenatedIterator = (Iterators$ConcatenatedIterator) it4;
                this.iterator = iterators$ConcatenatedIterator.iterator;
                if (this.metaIterators == null) {
                    this.metaIterators = new ArrayDeque();
                }
                this.metaIterators.addFirst(this.topMetaIterator);
                if (iterators$ConcatenatedIterator.metaIterators != null) {
                    while (!iterators$ConcatenatedIterator.metaIterators.isEmpty()) {
                        this.metaIterators.addFirst((Iterator) iterators$ConcatenatedIterator.metaIterators.removeLast());
                    }
                }
                this.topMetaIterator = iterators$ConcatenatedIterator.topMetaIterator;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Iterator it = this.iterator;
        this.toRemove = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.toRemove;
        if (it == null) {
            a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
        } else {
            it.remove();
            this.toRemove = null;
        }
    }
}
