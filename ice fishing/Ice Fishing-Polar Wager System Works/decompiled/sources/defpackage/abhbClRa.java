package defpackage;

/* loaded from: classes.dex */
public abstract class abhbClRa extends defpackage.SyNS6RMn implements java.util.List {
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
                if (!defpackage.x70.QoRHpC4k(it2.next(), it.next())) {
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
            if (defpackage.x70.QoRHpC4k(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new defpackage.kNAkVymC(0, this);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        java.util.ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (defpackage.x70.QoRHpC4k(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public java.util.ListIterator listIterator() {
        return new defpackage.V7bD7b8KA(this, 0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public java.util.List subList(int i, int i2) {
        return new defpackage.PAEGRtP0bX(this, i, i2);
    }

    @Override // java.util.List
    public java.util.ListIterator listIterator(int i) {
        return new defpackage.V7bD7b8KA(this, i);
    }
}
