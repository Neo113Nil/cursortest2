package defpackage;

/* loaded from: classes.dex */
public final class k6 implements java.util.Collection, defpackage.g90 {
    public final java.lang.Object[] adDC3e2L;

    public k6(java.lang.Object[] objArr) {
        this.adDC3e2L = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return defpackage.t6.JcqDrWrgMf(this.adDC3e2L, obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (defpackage.t6.JcqDrWrgMf(this.adDC3e2L, it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.kNAkVymC(1, this.adDC3e2L);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.adDC3e2L.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.adDC3e2L;
        if (objArr.getClass().equals(java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        copyOf.getClass();
        return copyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }
}
