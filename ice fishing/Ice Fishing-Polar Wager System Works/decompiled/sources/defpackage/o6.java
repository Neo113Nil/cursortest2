package defpackage;

/* loaded from: classes.dex */
public final class o6 implements java.util.Set {
    public final /* synthetic */ defpackage.r6 adDC3e2L;

    public o6(defpackage.r6 r6Var) {
        this.adDC3e2L = r6Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.adDC3e2L.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.adDC3e2L.riuEU0zW4(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        defpackage.r6 r6Var = this.adDC3e2L;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        try {
            if (r6Var.AARZUJiTa == set.size()) {
                return r6Var.riuEU0zW4(set);
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = 0;
        for (int i2 = r6Var.AARZUJiTa - 1; i2 >= 0; i2--) {
            java.lang.Object adDC3e2L = r6Var.adDC3e2L(i2);
            i += adDC3e2L == null ? 0 : adDC3e2L.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.n6(this.adDC3e2L, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int r1MBDhnF = r6Var.r1MBDhnF(obj);
        if (r1MBDhnF < 0) {
            return false;
        }
        r6Var.xiZrDbcSW0(r1MBDhnF);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return this.adDC3e2L.SH1y5HwkJhh(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(r6Var.adDC3e2L(i2))) {
                r6Var.xiZrDbcSW0(i2);
            }
        }
        return i != r6Var.AARZUJiTa;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.adDC3e2L.AARZUJiTa;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r6Var.adDC3e2L(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        defpackage.r6 r6Var = this.adDC3e2L;
        int i = r6Var.AARZUJiTa;
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = r6Var.adDC3e2L(i2);
        }
        return objArr;
    }
}
