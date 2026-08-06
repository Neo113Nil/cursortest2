package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class IJ0hOnjhPOri extends defpackage.lr1 implements java.util.List {
    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.Collection collection = (java.util.Collection) obj;
        if (size() == collection.size()) {
            java.util.Iterator it = collection.iterator();
            java.util.Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!defpackage.ma0.QiMR8OkAhezm(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int i = 1;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        java.util.Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (defpackage.ma0.QiMR8OkAhezm(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new defpackage.ZVVdXbWmyCSK(0, this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (defpackage.ma0.QiMR8OkAhezm(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator() {
        return new defpackage.w7APNrr0aGRc(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List subList(int i, int i2) {
        return new defpackage.maCixPsq4ml2(this, i, i2);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i) {
        return new defpackage.w7APNrr0aGRc(this, i);
    }
}
