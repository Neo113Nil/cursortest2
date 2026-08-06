package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class k50 implements java.util.List, defpackage.nb0 {
    public final defpackage.sn0 WDYagTQQm9ns = new defpackage.sn0(16);
    public final defpackage.jn0 oh71FJcDz6S2 = new defpackage.jn0(16);
    public int QiMR8OkAhezm = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ZpBGe2uQfcn8() {
        long P05cfTpS5W5L = defpackage.nq1.P05cfTpS5W5L(Float.POSITIVE_INFINITY, false, false);
        int i = this.QiMR8OkAhezm + 1;
        int i2 = this.WDYagTQQm9ns.giKS3J6vZuNy - 1;
        if (i > i2) {
            return P05cfTpS5W5L;
        }
        while (true) {
            defpackage.jn0 jn0Var = this.oh71FJcDz6S2;
            if (i < 0) {
                jn0Var.getClass();
                break;
            }
            if (i >= jn0Var.giKS3J6vZuNy) {
                break;
            }
            long j = jn0Var.ZpBGe2uQfcn8[i];
            if (defpackage.nn.P05cfTpS5W5L(j, P05cfTpS5W5L) < 0) {
                P05cfTpS5W5L = j;
            }
            if ((defpackage.nn.maCixPsq4ml2(P05cfTpS5W5L) >= 0.0f || !defpackage.nn.dG7RjM6DqYVL(P05cfTpS5W5L)) && i != i2) {
                i++;
            }
        }
        defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
        return 0L;
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
        this.QiMR8OkAhezm = -1;
        this.WDYagTQQm9ns.JhCgjQRTAOCT();
        this.oh71FJcDz6S2.giKS3J6vZuNy = 0;
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
        java.lang.Object oh71FJcDz6S2 = this.WDYagTQQm9ns.oh71FJcDz6S2(i);
        oh71FJcDz6S2.getClass();
        return (defpackage.ul0) oh71FJcDz6S2;
    }

    public final void giKS3J6vZuNy(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.WDYagTQQm9ns.fNwYGHIYeJcR(i, i2);
        defpackage.jn0 jn0Var = this.oh71FJcDz6S2;
        if (i >= 0) {
            int i3 = jn0Var.giKS3J6vZuNy;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    defpackage.h7.w7APNrr0aGRc("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = jn0Var.ZpBGe2uQfcn8;
                            defpackage.y7.omM9cAlgeGXx(jArr, jArr, i, i2, i3);
                        }
                        jn0Var.giKS3J6vZuNy -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            jn0Var.getClass();
        }
        defpackage.h7.WmetiUbpKU9I("Index must be between 0 and size");
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ul0)) {
            return -1;
        }
        defpackage.ul0 ul0Var = (defpackage.ul0) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns.oh71FJcDz6S2(i), ul0Var)) {
                if (i != size) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.P05cfTpS5W5L();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.i50(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ul0)) {
            return -1;
        }
        defpackage.ul0 ul0Var = (defpackage.ul0) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns.oh71FJcDz6S2(size), ul0Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.i50(this, 0, 7);
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
        return this.WDYagTQQm9ns.giKS3J6vZuNy;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.j50(this, i, i2);
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

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.i50(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
