package defpackage;

/* loaded from: classes.dex */
public abstract class NHJTzaLwkd implements java.util.ListIterator, defpackage.g90 {
    public int adDC3e2L;
    public int xiZrDbcSW0;

    public NHJTzaLwkd(int i, int i2) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.adDC3e2L < this.xiZrDbcSW0;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.adDC3e2L > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.adDC3e2L;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.adDC3e2L - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
