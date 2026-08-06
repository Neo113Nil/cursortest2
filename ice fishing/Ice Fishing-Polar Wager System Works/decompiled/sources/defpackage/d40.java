package defpackage;

/* loaded from: classes.dex */
public final class d40 implements java.util.List, defpackage.g90 {
    public final defpackage.gl0 adDC3e2L = new defpackage.gl0(16);
    public final defpackage.al0 xiZrDbcSW0 = new defpackage.al0(16);
    public int AARZUJiTa = -1;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long IHQe1A4L2xu() {
        long AARZUJiTa = defpackage.x70.AARZUJiTa(Float.POSITIVE_INFINITY, false, false);
        int i = this.AARZUJiTa + 1;
        int i2 = this.adDC3e2L.oh6vYeIP - 1;
        if (i > i2) {
            return AARZUJiTa;
        }
        while (true) {
            defpackage.al0 al0Var = this.xiZrDbcSW0;
            if (i < 0) {
                al0Var.getClass();
                break;
            }
            if (i >= al0Var.oh6vYeIP) {
                break;
            }
            long j = al0Var.IHQe1A4L2xu[i];
            if (defpackage.x70.PAEGRtP0bX(j, AARZUJiTa) < 0) {
                AARZUJiTa = j;
            }
            if ((defpackage.x70.nBH8hAHy(AARZUJiTa) >= 0.0f || !defpackage.x70.SiPhmbmu(AARZUJiTa)) && i != i2) {
                i++;
            }
        }
        defpackage.db.cnag84Bm("Index must be between 0 and size");
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
        this.AARZUJiTa = -1;
        this.adDC3e2L.F7NU4MC0GW();
        this.xiZrDbcSW0.oh6vYeIP = 0;
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
        java.lang.Object xiZrDbcSW0 = this.adDC3e2L.xiZrDbcSW0(i);
        xiZrDbcSW0.getClass();
        return (defpackage.lj0) xiZrDbcSW0;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.lj0)) {
            return -1;
        }
        defpackage.lj0 lj0Var = (defpackage.lj0) obj;
        int size = size() - 1;
        if (size >= 0) {
            int i = 0;
            while (!defpackage.x70.QoRHpC4k(this.adDC3e2L.xiZrDbcSW0(i), lj0Var)) {
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
        return this.adDC3e2L.EXtogiMhuM();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.b40(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.lj0)) {
            return -1;
        }
        defpackage.lj0 lj0Var = (defpackage.lj0) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L.xiZrDbcSW0(size), lj0Var)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.b40(this, 0, 7);
    }

    public final void oh6vYeIP(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.adDC3e2L.JlrlGoKF(i, i2);
        defpackage.al0 al0Var = this.xiZrDbcSW0;
        if (i >= 0) {
            int i3 = al0Var.oh6vYeIP;
            if (i <= i3 && i2 >= 0 && i2 <= i3) {
                if (i2 < i) {
                    defpackage.db.fnWB2E7cs("The end index must be < start index");
                    return;
                } else {
                    if (i2 != i) {
                        if (i2 < i3) {
                            long[] jArr = al0Var.IHQe1A4L2xu;
                            defpackage.t6.EoOhNTTfIN7K(jArr, jArr, i, i2, i3);
                        }
                        al0Var.oh6vYeIP -= i2 - i;
                        return;
                    }
                    return;
                }
            }
        } else {
            al0Var.getClass();
        }
        defpackage.db.cnag84Bm("Index must be between 0 and size");
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
        return this.adDC3e2L.oh6vYeIP;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.c40(this, i, i2);
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

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.b40(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
