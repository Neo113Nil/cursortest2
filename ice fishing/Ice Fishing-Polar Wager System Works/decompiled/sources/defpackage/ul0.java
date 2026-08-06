package defpackage;

/* loaded from: classes.dex */
public final class ul0 implements java.util.List, defpackage.g90 {
    public final defpackage.xl0 adDC3e2L;

    public ul0(defpackage.xl0 xl0Var) {
        this.adDC3e2L = xl0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        this.adDC3e2L.oh6vYeIP(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        defpackage.xl0 xl0Var = this.adDC3e2L;
        return xl0Var.adDC3e2L(xl0Var.AARZUJiTa, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.adDC3e2L.AARZUJiTa();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.EXtogiMhuM(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.adDC3e2L.EXtogiMhuM(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        return this.adDC3e2L.adDC3e2L[i];
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return this.adDC3e2L.riuEU0zW4(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.AARZUJiTa == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.wl0(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        defpackage.xl0 xl0Var = this.adDC3e2L;
        java.lang.Object[] objArr = xl0Var.adDC3e2L;
        for (int i = xl0Var.AARZUJiTa - 1; i >= 0; i--) {
            if (defpackage.x70.QoRHpC4k(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.wl0(0, this);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        return this.adDC3e2L.ez2rX8ReCYw(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        defpackage.xl0 xl0Var = this.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            xl0Var.SH1y5HwkJhh(it.next());
        }
        return i != xl0Var.AARZUJiTa;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.xl0 xl0Var = this.adDC3e2L;
        int i = xl0Var.AARZUJiTa;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(xl0Var.adDC3e2L[i2])) {
                xl0Var.ez2rX8ReCYw(i2);
            }
        }
        return i != xl0Var.AARZUJiTa;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        defpackage.yl0.IHQe1A4L2xu(i, this);
        java.lang.Object[] objArr = this.adDC3e2L.adDC3e2L;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.adDC3e2L.AARZUJiTa;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.yl0.oh6vYeIP(this, i, i2);
        return new defpackage.vl0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        this.adDC3e2L.IHQe1A4L2xu(i, obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new defpackage.wl0(i, this);
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return this.adDC3e2L.adDC3e2L(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.adDC3e2L.SH1y5HwkJhh(obj);
    }
}
