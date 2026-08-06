package defpackage;

/* loaded from: classes.dex */
public final class q6 implements java.util.Collection {
    public final /* synthetic */ defpackage.r6 adDC3e2L;

    public q6(defpackage.r6 r6Var) {
        this.adDC3e2L = r6Var;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.adDC3e2L.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.IHQe1A4L2xu(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.n6(this.adDC3e2L, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int IHQe1A4L2xu = r6Var.IHQe1A4L2xu(obj);
        if (IHQe1A4L2xu < 0) {
            return false;
        }
        r6Var.xiZrDbcSW0(IHQe1A4L2xu);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(r6Var.EXtogiMhuM(i2))) {
                r6Var.xiZrDbcSW0(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(r6Var.EXtogiMhuM(i2))) {
                r6Var.xiZrDbcSW0(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.adDC3e2L.AARZUJiTa;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r6Var.EXtogiMhuM(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r6Var.EXtogiMhuM(i2);
        }
        return objArr;
    }
}
