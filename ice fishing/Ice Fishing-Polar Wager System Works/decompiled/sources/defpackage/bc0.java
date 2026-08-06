package defpackage;

/* loaded from: classes.dex */
public final class bc0 implements java.util.List, defpackage.g90 {
    public final defpackage.gb1 adDC3e2L = new defpackage.gb1();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof defpackage.zb0)) {
            return false;
        }
        return this.adDC3e2L.contains((defpackage.zb0) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.adDC3e2L.containsAll(collection);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return (defpackage.zb0) this.adDC3e2L.get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.zb0)) {
            return -1;
        }
        return this.adDC3e2L.indexOf((defpackage.zb0) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.adDC3e2L.listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.zb0)) {
            return -1;
        }
        return this.adDC3e2L.lastIndexOf((defpackage.zb0) obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        defpackage.gb1 gb1Var = this.adDC3e2L;
        gb1Var.getClass();
        return new defpackage.b40(gb1Var, i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
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
    public final int size() {
        return this.adDC3e2L.size();
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return this.adDC3e2L.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
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

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return this.adDC3e2L.listIterator();
    }
}
