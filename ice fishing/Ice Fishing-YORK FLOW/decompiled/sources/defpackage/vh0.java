package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class vh0 extends defpackage.oCu53ZX2v4Ju implements java.util.RandomAccess, java.io.Serializable {
    public final defpackage.vh0 P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public java.lang.Object[] WDYagTQQm9ns;
    public final defpackage.wh0 e6mdH7fiFuta;
    public final int oh71FJcDz6S2;

    public vh0(java.lang.Object[] objArr, int i, int i2, defpackage.vh0 vh0Var, defpackage.wh0 wh0Var) {
        int i3;
        objArr.getClass();
        wh0Var.getClass();
        this.WDYagTQQm9ns = objArr;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = i2;
        this.P05cfTpS5W5L = vh0Var;
        this.e6mdH7fiFuta = wh0Var;
        i3 = ((java.util.AbstractList) wh0Var).modCount;
        ((java.util.AbstractList) this).modCount = i3;
    }

    public final int GE9mJIPrb8gP(int i, int i2, java.util.Collection collection, boolean z) {
        int GE9mJIPrb8gP;
        defpackage.vh0 vh0Var = this.P05cfTpS5W5L;
        if (vh0Var != null) {
            GE9mJIPrb8gP = vh0Var.GE9mJIPrb8gP(i, i2, collection, z);
        } else {
            defpackage.wh0 wh0Var = defpackage.wh0.P05cfTpS5W5L;
            GE9mJIPrb8gP = this.e6mdH7fiFuta.GE9mJIPrb8gP(i, i2, collection, z);
        }
        if (GE9mJIPrb8gP > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.QiMR8OkAhezm -= GE9mJIPrb8gP;
        return GE9mJIPrb8gP;
    }

    public final void JhCgjQRTAOCT(int i, java.util.Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        defpackage.wh0 wh0Var = this.e6mdH7fiFuta;
        defpackage.vh0 vh0Var = this.P05cfTpS5W5L;
        if (vh0Var != null) {
            vh0Var.JhCgjQRTAOCT(i, collection, i2);
        } else {
            defpackage.wh0 wh0Var2 = defpackage.wh0.P05cfTpS5W5L;
            wh0Var.JhCgjQRTAOCT(i, collection, i2);
        }
        this.WDYagTQQm9ns = wh0Var.WDYagTQQm9ns;
        this.QiMR8OkAhezm += i2;
    }

    public final java.lang.Object P05cfTpS5W5L(int i) {
        java.lang.Object P05cfTpS5W5L;
        ((java.util.AbstractList) this).modCount++;
        defpackage.vh0 vh0Var = this.P05cfTpS5W5L;
        if (vh0Var != null) {
            P05cfTpS5W5L = vh0Var.P05cfTpS5W5L(i);
        } else {
            defpackage.wh0 wh0Var = defpackage.wh0.P05cfTpS5W5L;
            P05cfTpS5W5L = this.e6mdH7fiFuta.P05cfTpS5W5L(i);
        }
        this.QiMR8OkAhezm--;
        return P05cfTpS5W5L;
    }

    public final void QiMR8OkAhezm() {
        if (this.e6mdH7fiFuta.QiMR8OkAhezm) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void WDYagTQQm9ns(int i, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        defpackage.wh0 wh0Var = this.e6mdH7fiFuta;
        defpackage.vh0 vh0Var = this.P05cfTpS5W5L;
        if (vh0Var != null) {
            vh0Var.WDYagTQQm9ns(i, obj);
        } else {
            defpackage.wh0 wh0Var2 = defpackage.wh0.P05cfTpS5W5L;
            wh0Var.WDYagTQQm9ns(i, obj);
        }
        this.WDYagTQQm9ns = wh0Var.WDYagTQQm9ns;
        this.QiMR8OkAhezm++;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final int ZpBGe2uQfcn8() {
        oh71FJcDz6S2();
        return this.QiMR8OkAhezm;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        } else {
            WDYagTQQm9ns(this.oh71FJcDz6S2 + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        JhCgjQRTAOCT(this.oh71FJcDz6S2 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        e6mdH7fiFuta(this.oh71FJcDz6S2, this.QiMR8OkAhezm);
    }

    public final void e6mdH7fiFuta(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        defpackage.vh0 vh0Var = this.P05cfTpS5W5L;
        if (vh0Var != null) {
            vh0Var.e6mdH7fiFuta(i, i2);
        } else {
            defpackage.wh0 wh0Var = defpackage.wh0.P05cfTpS5W5L;
            this.e6mdH7fiFuta.e6mdH7fiFuta(i, i2);
        }
        this.QiMR8OkAhezm -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        oh71FJcDz6S2();
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            java.lang.Object[] objArr = this.WDYagTQQm9ns;
            int i = this.QiMR8OkAhezm;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (defpackage.ma0.QiMR8OkAhezm(objArr[this.oh71FJcDz6S2 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i >= 0 && i < i2) {
            return this.WDYagTQQm9ns[this.oh71FJcDz6S2 + i];
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final java.lang.Object giKS3J6vZuNy(int i) {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i >= 0 && i < i2) {
            return P05cfTpS5W5L(this.oh71FJcDz6S2 + i);
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        oh71FJcDz6S2();
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i = this.QiMR8OkAhezm;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[this.oh71FJcDz6S2 + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        oh71FJcDz6S2();
        for (int i = 0; i < this.QiMR8OkAhezm; i++) {
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[this.oh71FJcDz6S2 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        oh71FJcDz6S2();
        return this.QiMR8OkAhezm == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        oh71FJcDz6S2();
        for (int i = this.QiMR8OkAhezm - 1; i >= 0; i--) {
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[this.oh71FJcDz6S2 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i >= 0 && i <= i2) {
            return new defpackage.i50(this, i);
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void oh71FJcDz6S2() {
        int i;
        i = ((java.util.AbstractList) this.e6mdH7fiFuta).modCount;
        if (i != ((java.util.AbstractList) this).modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            giKS3J6vZuNy(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        return GE9mJIPrb8gP(this.oh71FJcDz6S2, this.QiMR8OkAhezm, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        return GE9mJIPrb8gP(this.oh71FJcDz6S2, this.QiMR8OkAhezm, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int i2 = this.QiMR8OkAhezm;
        if (i < 0 || i >= i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return null;
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i3 = this.oh71FJcDz6S2;
        java.lang.Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ok0.ZVVdXbWmyCSK(i, i2, this.QiMR8OkAhezm);
        return new defpackage.vh0(this.WDYagTQQm9ns, this.oh71FJcDz6S2 + i, i2 - i, this, this.e6mdH7fiFuta);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        oh71FJcDz6S2();
        int length = objArr.length;
        int i = this.QiMR8OkAhezm;
        java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
        int i2 = this.oh71FJcDz6S2;
        if (length < i) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        defpackage.y7.hwoZxnIesQBZ(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.QiMR8OkAhezm;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        oh71FJcDz6S2();
        return defpackage.wc1.e6mdH7fiFuta(this.WDYagTQQm9ns, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        WDYagTQQm9ns(this.oh71FJcDz6S2 + this.QiMR8OkAhezm, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        oh71FJcDz6S2();
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i = this.QiMR8OkAhezm;
        int i2 = this.oh71FJcDz6S2;
        return defpackage.y7.LCK4GGEwbWAr(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        QiMR8OkAhezm();
        oh71FJcDz6S2();
        int size = collection.size();
        JhCgjQRTAOCT(this.oh71FJcDz6S2 + this.QiMR8OkAhezm, collection, size);
        return size > 0;
    }
}
