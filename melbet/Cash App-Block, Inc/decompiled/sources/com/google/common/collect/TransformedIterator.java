package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class TransformedIterator implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public final Iterator backingIterator;

    public TransformedIterator(Iterator it, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                it.getClass();
                this.backingIterator = it;
                break;
            default:
                it.getClass();
                this.backingIterator = it;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
        }
        return this.backingIterator.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                return transform(this.backingIterator.next());
            default:
                return zza(this.backingIterator.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                this.backingIterator.remove();
                break;
            default:
                this.backingIterator.remove();
                break;
        }
    }

    public abstract Object transform(Object obj);

    public abstract Object zza(Object obj);
}
