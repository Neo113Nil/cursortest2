package defpackage;

/* loaded from: classes.dex */
public final class nt implements java.util.List, java.io.Serializable, java.util.RandomAccess, defpackage.g90 {
    public static final defpackage.nt adDC3e2L = new defpackage.nt();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.List) && ((java.util.List) obj).isEmpty();
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        throw new java.lang.IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return defpackage.mt.adDC3e2L;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        if (i == 0) {
            return defpackage.mt.adDC3e2L;
        }
        defpackage.db.cnag84Bm(defpackage.fx0.SH1y5HwkJhh("Index: ", i));
        return null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "fromIndex: ", ", toIndex: "));
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    public final java.lang.String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return defpackage.mt.adDC3e2L;
    }
}
