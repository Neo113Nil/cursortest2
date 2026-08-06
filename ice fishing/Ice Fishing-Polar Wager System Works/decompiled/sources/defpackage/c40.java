package defpackage;

/* loaded from: classes.dex */
public final class c40 implements java.util.List, defpackage.g90 {
    public final /* synthetic */ defpackage.d40 AARZUJiTa;
    public final int adDC3e2L;
    public final int xiZrDbcSW0;

    public c40(defpackage.d40 d40Var, int i, int i2) {
        this.AARZUJiTa = d40Var;
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = i2;
    }

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
        return (obj instanceof defpackage.lj0) && indexOf((defpackage.lj0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((defpackage.lj0) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object xiZrDbcSW0 = this.AARZUJiTa.adDC3e2L.xiZrDbcSW0(i + this.adDC3e2L);
        xiZrDbcSW0.getClass();
        return (defpackage.lj0) xiZrDbcSW0;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.lj0)) {
            return -1;
        }
        defpackage.lj0 lj0Var = (defpackage.lj0) obj;
        int i = this.adDC3e2L;
        int i2 = this.xiZrDbcSW0;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!defpackage.x70.QoRHpC4k(this.AARZUJiTa.adDC3e2L.xiZrDbcSW0(i3), lj0Var)) {
            if (i3 == i2) {
                return -1;
            }
            i3++;
        }
        return i3 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i = this.adDC3e2L;
        return new defpackage.b40(this.AARZUJiTa, i, i, this.xiZrDbcSW0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.lj0)) {
            return -1;
        }
        defpackage.lj0 lj0Var = (defpackage.lj0) obj;
        int i = this.xiZrDbcSW0;
        int i2 = this.adDC3e2L;
        if (i2 > i) {
            return -1;
        }
        while (!defpackage.x70.QoRHpC4k(this.AARZUJiTa.adDC3e2L.xiZrDbcSW0(i), lj0Var)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        int i2 = this.adDC3e2L;
        int i3 = this.xiZrDbcSW0;
        return new defpackage.b40(this.AARZUJiTa, i + i2, i2, i3);
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
        return this.xiZrDbcSW0 - this.adDC3e2L;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        int i3 = this.adDC3e2L;
        return new defpackage.c40(this.AARZUJiTa, i + i3, i3 + i2);
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
        int i = this.adDC3e2L;
        return new defpackage.b40(this.AARZUJiTa, i, i, this.xiZrDbcSW0);
    }
}
