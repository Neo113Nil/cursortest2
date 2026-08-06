package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class x7 implements java.util.Collection, java.util.Set, defpackage.nb0, defpackage.pb0 {
    public int QiMR8OkAhezm;
    public int[] WDYagTQQm9ns = defpackage.vx1.P05cfTpS5W5L;
    public java.lang.Object[] oh71FJcDz6S2 = defpackage.vx1.GE9mJIPrb8gP;

    public final java.lang.Object ZpBGe2uQfcn8(int i) {
        int i2 = this.QiMR8OkAhezm;
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.WDYagTQQm9ns;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                defpackage.y7.cCeDCHgnx5OL(iArr, iArr, i, i4, i2);
                java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i, i4, i2);
            }
            this.oh71FJcDz6S2[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.WDYagTQQm9ns = iArr2;
            this.oh71FJcDz6S2 = new java.lang.Object[i5];
            if (i > 0) {
                defpackage.y7.m6iZQUu7XjoL(iArr, iArr2, 0, i, 6);
                defpackage.y7.EgL5gQQnyJKX(objArr, this.oh71FJcDz6S2, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                defpackage.y7.cCeDCHgnx5OL(iArr, this.WDYagTQQm9ns, i, i6, i2);
                defpackage.y7.hwoZxnIesQBZ(objArr, this.oh71FJcDz6S2, i, i6, i2);
            }
        }
        if (i2 != this.QiMR8OkAhezm) {
            throw new java.util.ConcurrentModificationException();
        }
        this.QiMR8OkAhezm = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i;
        int maCixPsq4ml2;
        int i2 = this.QiMR8OkAhezm;
        if (obj == null) {
            maCixPsq4ml2 = defpackage.i61.maCixPsq4ml2(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            maCixPsq4ml2 = defpackage.i61.maCixPsq4ml2(this, obj, hashCode);
        }
        if (maCixPsq4ml2 >= 0) {
            return false;
        }
        int i3 = ~maCixPsq4ml2;
        int[] iArr = this.WDYagTQQm9ns;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            int[] iArr2 = new int[i4];
            this.WDYagTQQm9ns = iArr2;
            this.oh71FJcDz6S2 = new java.lang.Object[i4];
            if (i2 != this.QiMR8OkAhezm) {
                throw new java.util.ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                defpackage.y7.m6iZQUu7XjoL(iArr, iArr2, 0, iArr.length, 6);
                defpackage.y7.EgL5gQQnyJKX(objArr, this.oh71FJcDz6S2, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.WDYagTQQm9ns;
            int i5 = i3 + 1;
            defpackage.y7.cCeDCHgnx5OL(iArr3, iArr3, i5, i3, i2);
            java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
            defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.QiMR8OkAhezm;
        if (i2 == i6) {
            int[] iArr4 = this.WDYagTQQm9ns;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.oh71FJcDz6S2[i3] = obj;
                this.QiMR8OkAhezm = i6 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        int size = collection.size() + this.QiMR8OkAhezm;
        int i = this.QiMR8OkAhezm;
        int[] iArr = this.WDYagTQQm9ns;
        boolean z = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            int[] iArr2 = new int[size];
            this.WDYagTQQm9ns = iArr2;
            this.oh71FJcDz6S2 = new java.lang.Object[size];
            if (i > 0) {
                defpackage.y7.m6iZQUu7XjoL(iArr, iArr2, 0, i, 6);
                defpackage.y7.EgL5gQQnyJKX(objArr, this.oh71FJcDz6S2, 0, this.QiMR8OkAhezm, 6);
            }
        }
        if (this.QiMR8OkAhezm != i) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.QiMR8OkAhezm != 0) {
            this.WDYagTQQm9ns = defpackage.vx1.P05cfTpS5W5L;
            this.oh71FJcDz6S2 = defpackage.vx1.GE9mJIPrb8gP;
            this.QiMR8OkAhezm = 0;
        }
        if (this.QiMR8OkAhezm != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj == null ? defpackage.i61.maCixPsq4ml2(this, null, 0) : defpackage.i61.maCixPsq4ml2(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set) || this.QiMR8OkAhezm != ((java.util.Set) obj).size()) {
            return false;
        }
        try {
            int i = this.QiMR8OkAhezm;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((java.util.Set) obj).contains(this.oh71FJcDz6S2[i2])) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.WDYagTQQm9ns;
        int i = this.QiMR8OkAhezm;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.QiMR8OkAhezm <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.s7(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int maCixPsq4ml2 = obj == null ? defpackage.i61.maCixPsq4ml2(this, null, 0) : defpackage.i61.maCixPsq4ml2(this, obj, obj.hashCode());
        if (maCixPsq4ml2 < 0) {
            return false;
        }
        ZpBGe2uQfcn8(maCixPsq4ml2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.QiMR8OkAhezm - 1; -1 < i; i--) {
            if (!defpackage.hf.PS16moFv2oLu(collection, this.oh71FJcDz6S2[i])) {
                ZpBGe2uQfcn8(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.QiMR8OkAhezm;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int i = this.QiMR8OkAhezm;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        defpackage.y7.hwoZxnIesQBZ(this.oh71FJcDz6S2, objArr, 0, 0, this.QiMR8OkAhezm);
        return objArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.QiMR8OkAhezm * 14);
        sb.append('{');
        int i = this.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.oh71FJcDz6S2[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return defpackage.y7.LCK4GGEwbWAr(this.oh71FJcDz6S2, 0, this.QiMR8OkAhezm);
    }
}
