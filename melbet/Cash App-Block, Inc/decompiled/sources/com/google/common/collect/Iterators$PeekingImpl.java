package com.google.common.collect;

import androidx.tracing.Trace;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class Iterators$PeekingImpl implements Iterator {
    public boolean hasPeeked;
    public final Iterator iterator;
    public Object peekedElement;

    public Iterators$PeekingImpl(Iterator it) {
        it.getClass();
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.hasPeeked || this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.hasPeeked) {
            return this.iterator.next();
        }
        Object obj = this.peekedElement;
        this.hasPeeked = false;
        this.peekedElement = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Trace.checkState("Can't remove after you've peeked at next", !this.hasPeeked);
        this.iterator.remove();
    }
}
