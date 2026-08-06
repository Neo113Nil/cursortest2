package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v7 implements java.util.Collection {
    public final /* synthetic */ defpackage.w7 WDYagTQQm9ns;

    public v7(defpackage.w7 w7Var) {
        this.WDYagTQQm9ns = w7Var;
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
        this.WDYagTQQm9ns.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8(obj) >= 0;
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
        return this.WDYagTQQm9ns.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.s7(this.WDYagTQQm9ns, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int ZpBGe2uQfcn8 = w7Var.ZpBGe2uQfcn8(obj);
        if (ZpBGe2uQfcn8 < 0) {
            return false;
        }
        w7Var.oh71FJcDz6S2(ZpBGe2uQfcn8);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(w7Var.P05cfTpS5W5L(i2))) {
                w7Var.oh71FJcDz6S2(i2);
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
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(w7Var.P05cfTpS5W5L(i2))) {
                w7Var.oh71FJcDz6S2(i2);
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
        return this.WDYagTQQm9ns.QiMR8OkAhezm;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w7Var.P05cfTpS5W5L(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        defpackage.w7 w7Var = this.WDYagTQQm9ns;
        int i = w7Var.QiMR8OkAhezm;
        java.lang.Object[] objArr = new java.lang.Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = w7Var.P05cfTpS5W5L(i2);
        }
        return objArr;
    }
}
