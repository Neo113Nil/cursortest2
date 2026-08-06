package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class t7 implements java.util.Set {
    public final /* synthetic */ defpackage.w7 WDYagTQQm9ns;

    public t7(defpackage.w7 w7Var) {
        this.WDYagTQQm9ns = w7Var;
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
        this.WDYagTQQm9ns.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.WDYagTQQm9ns.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.WDYagTQQm9ns.e6mdH7fiFuta(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        try {
            if (w7Var.QiMR8OkAhezm == set.size()) {
                return w7Var.e6mdH7fiFuta(set);
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = 0;
        for (int i2 = w7Var.QiMR8OkAhezm - 1; i2 >= 0; i2--) {
            java.lang.Object WDYagTQQm9ns = w7Var.WDYagTQQm9ns(i2);
            i += WDYagTQQm9ns == null ? 0 : WDYagTQQm9ns.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.WDYagTQQm9ns.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.s7(this.WDYagTQQm9ns, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int fWTAfUmVKrZq = w7Var.fWTAfUmVKrZq(obj);
        if (fWTAfUmVKrZq < 0) {
            return false;
        }
        w7Var.oh71FJcDz6S2(fWTAfUmVKrZq);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return this.WDYagTQQm9ns.GE9mJIPrb8gP(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(w7Var.WDYagTQQm9ns(i2))) {
                w7Var.oh71FJcDz6S2(i2);
            }
        }
        return i != w7Var.QiMR8OkAhezm;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.WDYagTQQm9ns.QiMR8OkAhezm;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w7Var.WDYagTQQm9ns(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w7Var.WDYagTQQm9ns(i2);
        }
        return objArr;
    }
}
