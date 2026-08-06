package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class VFeft99leXEK implements java.util.ListIterator, defpackage.nb0 {
    public int WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    public VFeft99leXEK(int i, int i2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = i2;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.WDYagTQQm9ns < this.oh71FJcDz6S2;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.WDYagTQQm9ns > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.WDYagTQQm9ns;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.WDYagTQQm9ns - 1;
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
