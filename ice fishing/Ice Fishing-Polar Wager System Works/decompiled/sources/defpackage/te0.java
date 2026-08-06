package defpackage;

/* loaded from: classes.dex */
public final class te0 extends defpackage.UsuH8pd5P implements java.util.RandomAccess, java.io.Serializable {
    public static final defpackage.te0 EXtogiMhuM;
    public boolean AARZUJiTa;
    public java.lang.Object[] adDC3e2L;
    public int xiZrDbcSW0;

    static {
        defpackage.te0 te0Var = new defpackage.te0(0);
        te0Var.AARZUJiTa = true;
        EXtogiMhuM = te0Var;
    }

    public te0(int i) {
        if (i >= 0) {
            this.adDC3e2L = new java.lang.Object[i];
        } else {
            defpackage.db.fnWB2E7cs("capacity must be non-negative.");
            throw null;
        }
    }

    public final void AARZUJiTa() {
        if (this.AARZUJiTa) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void EXtogiMhuM(int i, int i2) {
        int i3 = this.xiZrDbcSW0 + i2;
        if (i3 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.adDC3e2L = java.util.Arrays.copyOf(objArr, i4);
        }
        java.lang.Object[] objArr2 = this.adDC3e2L;
        defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i + i2, i, this.xiZrDbcSW0);
        this.xiZrDbcSW0 += i2;
    }

    @Override // defpackage.UsuH8pd5P
    public final int IHQe1A4L2xu() {
        return this.xiZrDbcSW0;
    }

    public final void SH1y5HwkJhh(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i, i + i2, this.xiZrDbcSW0);
        java.lang.Object[] objArr2 = this.adDC3e2L;
        int i3 = this.xiZrDbcSW0;
        defpackage.x80.mAr5m2L7gYDP(objArr2, i3 - i2, i3);
        this.xiZrDbcSW0 -= i2;
    }

    public final void adDC3e2L(int i, java.util.Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        EXtogiMhuM(i, i2);
        java.util.Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.adDC3e2L[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        AARZUJiTa();
        int i2 = this.xiZrDbcSW0;
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return;
        }
        ((java.util.AbstractList) this).modCount++;
        EXtogiMhuM(i, 1);
        this.adDC3e2L[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        AARZUJiTa();
        int i2 = this.xiZrDbcSW0;
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        adDC3e2L(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        AARZUJiTa();
        SH1y5HwkJhh(0, this.xiZrDbcSW0);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            java.lang.Object[] objArr = this.adDC3e2L;
            int i = this.xiZrDbcSW0;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (defpackage.x70.QoRHpC4k(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int ez2rX8ReCYw(int i, int i2, java.util.Collection collection, boolean z) {
        java.lang.Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.adDC3e2L;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                java.lang.Object[] objArr2 = this.adDC3e2L;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i + i4, i2 + i, this.xiZrDbcSW0);
        java.lang.Object[] objArr3 = this.adDC3e2L;
        int i7 = this.xiZrDbcSW0;
        defpackage.x80.mAr5m2L7gYDP(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.xiZrDbcSW0 -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        int i2 = this.xiZrDbcSW0;
        if (i >= 0 && i < i2) {
            return this.adDC3e2L[i];
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        java.lang.Object[] objArr = this.adDC3e2L;
        int i = this.xiZrDbcSW0;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        for (int i = 0; i < this.xiZrDbcSW0; i++) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.xiZrDbcSW0 == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        for (int i = this.xiZrDbcSW0 - 1; i >= 0; i--) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        int i2 = this.xiZrDbcSW0;
        if (i >= 0 && i <= i2) {
            return new defpackage.b40(this, i);
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.UsuH8pd5P
    public final java.lang.Object oh6vYeIP(int i) {
        AARZUJiTa();
        int i2 = this.xiZrDbcSW0;
        if (i >= 0 && i < i2) {
            return riuEU0zW4(i);
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        AARZUJiTa();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            oh6vYeIP(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        AARZUJiTa();
        return ez2rX8ReCYw(0, this.xiZrDbcSW0, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        AARZUJiTa();
        return ez2rX8ReCYw(0, this.xiZrDbcSW0, collection, true) > 0;
    }

    public final java.lang.Object riuEU0zW4(int i) {
        ((java.util.AbstractList) this).modCount++;
        java.lang.Object[] objArr = this.adDC3e2L;
        java.lang.Object obj = objArr[i];
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i, i + 1, this.xiZrDbcSW0);
        java.lang.Object[] objArr2 = this.adDC3e2L;
        int i2 = this.xiZrDbcSW0 - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.xiZrDbcSW0--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        AARZUJiTa();
        int i2 = this.xiZrDbcSW0;
        if (i < 0 || i >= i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return null;
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ci0.SyNS6RMn(i, i2, this.xiZrDbcSW0);
        return new defpackage.se0(this.adDC3e2L, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.xiZrDbcSW0;
        java.lang.Object[] objArr2 = this.adDC3e2L;
        if (length < i) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        defpackage.t6.wKlPRKlRnfqr(objArr2, objArr, 0, 0, i);
        int i2 = this.xiZrDbcSW0;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return defpackage.x80.xiZrDbcSW0(this.adDC3e2L, 0, this.xiZrDbcSW0, this);
    }

    public final void xiZrDbcSW0(int i, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        EXtogiMhuM(i, 1);
        this.adDC3e2L[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        AARZUJiTa();
        int i = this.xiZrDbcSW0;
        ((java.util.AbstractList) this).modCount++;
        EXtogiMhuM(i, 1);
        this.adDC3e2L[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return defpackage.t6.QUKZkWRtw6(this.adDC3e2L, 0, this.xiZrDbcSW0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        AARZUJiTa();
        int size = collection.size();
        adDC3e2L(this.xiZrDbcSW0, collection, size);
        return size > 0;
    }
}
