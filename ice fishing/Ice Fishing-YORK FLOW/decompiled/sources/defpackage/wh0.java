package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wh0 extends defpackage.oCu53ZX2v4Ju implements java.util.RandomAccess, java.io.Serializable {
    public static final defpackage.wh0 P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public java.lang.Object[] WDYagTQQm9ns;
    public int oh71FJcDz6S2;

    static {
        defpackage.wh0 wh0Var = new defpackage.wh0(0);
        wh0Var.QiMR8OkAhezm = true;
        P05cfTpS5W5L = wh0Var;
    }

    public wh0(int i) {
        if (i >= 0) {
            this.WDYagTQQm9ns = new java.lang.Object[i];
        } else {
            defpackage.h7.w7APNrr0aGRc("capacity must be non-negative.");
            throw null;
        }
    }

    public final int GE9mJIPrb8gP(int i, int i2, java.util.Collection collection, boolean z) {
        java.lang.Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.WDYagTQQm9ns;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i + i4, i2 + i, this.oh71FJcDz6S2);
        java.lang.Object[] objArr3 = this.WDYagTQQm9ns;
        int i7 = this.oh71FJcDz6S2;
        defpackage.wc1.NkfcFfdaVTox(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.oh71FJcDz6S2 -= i6;
        return i6;
    }

    public final void JhCgjQRTAOCT(int i, java.util.Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        QiMR8OkAhezm(i, i2);
        java.util.Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.WDYagTQQm9ns[i + i3] = it.next();
        }
    }

    public final java.lang.Object P05cfTpS5W5L(int i) {
        ((java.util.AbstractList) this).modCount++;
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        java.lang.Object obj = objArr[i];
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i, i + 1, this.oh71FJcDz6S2);
        java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
        int i2 = this.oh71FJcDz6S2 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.oh71FJcDz6S2--;
        return obj;
    }

    public final void QiMR8OkAhezm(int i, int i2) {
        int i3 = this.oh71FJcDz6S2 + i2;
        if (i3 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.WDYagTQQm9ns = java.util.Arrays.copyOf(objArr, i4);
        }
        java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
        defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i + i2, i, this.oh71FJcDz6S2);
        this.oh71FJcDz6S2 += i2;
    }

    public final void WDYagTQQm9ns(int i, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        QiMR8OkAhezm(i, 1);
        this.WDYagTQQm9ns[i] = obj;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final int ZpBGe2uQfcn8() {
        return this.oh71FJcDz6S2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        oh71FJcDz6S2();
        int i2 = this.oh71FJcDz6S2;
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        QiMR8OkAhezm(i, 1);
        this.WDYagTQQm9ns[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        oh71FJcDz6S2();
        int i2 = this.oh71FJcDz6S2;
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        JhCgjQRTAOCT(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        oh71FJcDz6S2();
        e6mdH7fiFuta(0, this.oh71FJcDz6S2);
    }

    public final void e6mdH7fiFuta(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i, i + i2, this.oh71FJcDz6S2);
        java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
        int i3 = this.oh71FJcDz6S2;
        defpackage.wc1.NkfcFfdaVTox(objArr2, i3 - i2, i3);
        this.oh71FJcDz6S2 -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            java.lang.Object[] objArr = this.WDYagTQQm9ns;
            int i = this.oh71FJcDz6S2;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (defpackage.ma0.QiMR8OkAhezm(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        int i2 = this.oh71FJcDz6S2;
        if (i >= 0 && i < i2) {
            return this.WDYagTQQm9ns[i];
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final java.lang.Object giKS3J6vZuNy(int i) {
        oh71FJcDz6S2();
        int i2 = this.oh71FJcDz6S2;
        if (i >= 0 && i < i2) {
            return P05cfTpS5W5L(i);
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i = this.oh71FJcDz6S2;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        for (int i = 0; i < this.oh71FJcDz6S2; i++) {
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.oh71FJcDz6S2 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        for (int i = this.oh71FJcDz6S2 - 1; i >= 0; i--) {
            if (defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        int i2 = this.oh71FJcDz6S2;
        if (i >= 0 && i <= i2) {
            return new defpackage.i50(this, i);
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void oh71FJcDz6S2() {
        if (this.QiMR8OkAhezm) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
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
        oh71FJcDz6S2();
        return GE9mJIPrb8gP(0, this.oh71FJcDz6S2, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        oh71FJcDz6S2();
        return GE9mJIPrb8gP(0, this.oh71FJcDz6S2, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        oh71FJcDz6S2();
        int i2 = this.oh71FJcDz6S2;
        if (i < 0 || i >= i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return null;
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ok0.ZVVdXbWmyCSK(i, i2, this.oh71FJcDz6S2);
        return new defpackage.vh0(this.WDYagTQQm9ns, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.oh71FJcDz6S2;
        java.lang.Object[] objArr2 = this.WDYagTQQm9ns;
        if (length < i) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        defpackage.y7.hwoZxnIesQBZ(objArr2, objArr, 0, 0, i);
        int i2 = this.oh71FJcDz6S2;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return defpackage.wc1.e6mdH7fiFuta(this.WDYagTQQm9ns, 0, this.oh71FJcDz6S2, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        oh71FJcDz6S2();
        int i = this.oh71FJcDz6S2;
        ((java.util.AbstractList) this).modCount++;
        QiMR8OkAhezm(i, 1);
        this.WDYagTQQm9ns[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return defpackage.y7.LCK4GGEwbWAr(this.WDYagTQQm9ns, 0, this.oh71FJcDz6S2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        oh71FJcDz6S2();
        int size = collection.size();
        JhCgjQRTAOCT(this.oh71FJcDz6S2, collection, size);
        return size > 0;
    }
}
