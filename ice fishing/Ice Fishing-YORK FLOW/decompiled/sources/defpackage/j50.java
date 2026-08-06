package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j50 implements java.util.List, defpackage.nb0 {
    public final /* synthetic */ defpackage.k50 QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public j50(defpackage.k50 k50Var, int i, int i2) {
        this.QiMR8OkAhezm = k50Var;
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = i2;
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
        return (obj instanceof defpackage.ul0) && indexOf((defpackage.ul0) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((defpackage.ul0) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object oh71FJcDz6S2 = this.QiMR8OkAhezm.WDYagTQQm9ns.oh71FJcDz6S2(i + this.WDYagTQQm9ns);
        oh71FJcDz6S2.getClass();
        return (defpackage.ul0) oh71FJcDz6S2;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ul0)) {
            return -1;
        }
        defpackage.ul0 ul0Var = (defpackage.ul0) obj;
        int i = this.WDYagTQQm9ns;
        int i2 = this.oh71FJcDz6S2;
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (!defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm.WDYagTQQm9ns.oh71FJcDz6S2(i3), ul0Var)) {
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
        int i = this.WDYagTQQm9ns;
        return new defpackage.i50(this.QiMR8OkAhezm, i, i, this.oh71FJcDz6S2);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ul0)) {
            return -1;
        }
        defpackage.ul0 ul0Var = (defpackage.ul0) obj;
        int i = this.oh71FJcDz6S2;
        int i2 = this.WDYagTQQm9ns;
        if (i2 > i) {
            return -1;
        }
        while (!defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm.WDYagTQQm9ns.oh71FJcDz6S2(i), ul0Var)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        int i2 = this.WDYagTQQm9ns;
        int i3 = this.oh71FJcDz6S2;
        return new defpackage.i50(this.QiMR8OkAhezm, i + i2, i2, i3);
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
        return this.oh71FJcDz6S2 - this.WDYagTQQm9ns;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        int i3 = this.WDYagTQQm9ns;
        return new defpackage.j50(this.QiMR8OkAhezm, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.i61.jjTN4uUnoyEn(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.i61.Mearx7yMn90V(this, objArr);
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
        int i = this.WDYagTQQm9ns;
        return new defpackage.i50(this.QiMR8OkAhezm, i, i, this.oh71FJcDz6S2);
    }
}
