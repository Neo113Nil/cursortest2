package defpackage;

/* loaded from: classes.dex */
public final class wl0 implements java.util.ListIterator, defpackage.g90 {
    public final java.util.List adDC3e2L;
    public int xiZrDbcSW0;

    public wl0(int i, java.util.List list) {
        this.adDC3e2L = list;
        this.xiZrDbcSW0 = i;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        this.adDC3e2L.add(this.xiZrDbcSW0, obj);
        this.xiZrDbcSW0++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.xiZrDbcSW0 < this.adDC3e2L.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.xiZrDbcSW0 > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.xiZrDbcSW0;
        this.xiZrDbcSW0 = i + 1;
        return this.adDC3e2L.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.xiZrDbcSW0;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.xiZrDbcSW0 - 1;
        this.xiZrDbcSW0 = i;
        return this.adDC3e2L.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.xiZrDbcSW0 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.xiZrDbcSW0 - 1;
        this.xiZrDbcSW0 = i;
        this.adDC3e2L.remove(i);
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        this.adDC3e2L.set(this.xiZrDbcSW0, obj);
    }
}
