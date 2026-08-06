package defpackage;

/* loaded from: classes.dex */
public final class se0 extends defpackage.UsuH8pd5P implements java.util.RandomAccess, java.io.Serializable {
    public int AARZUJiTa;
    public final defpackage.se0 EXtogiMhuM;
    public java.lang.Object[] adDC3e2L;
    public final defpackage.te0 riuEU0zW4;
    public final int xiZrDbcSW0;

    public se0(java.lang.Object[] objArr, int i, int i2, defpackage.se0 se0Var, defpackage.te0 te0Var) {
        int i3;
        objArr.getClass();
        te0Var.getClass();
        this.adDC3e2L = objArr;
        this.xiZrDbcSW0 = i;
        this.AARZUJiTa = i2;
        this.EXtogiMhuM = se0Var;
        this.riuEU0zW4 = te0Var;
        i3 = ((java.util.AbstractList) te0Var).modCount;
        ((java.util.AbstractList) this).modCount = i3;
    }

    public final void AARZUJiTa() {
        int i;
        i = ((java.util.AbstractList) this.riuEU0zW4).modCount;
        if (i != ((java.util.AbstractList) this).modCount) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void EXtogiMhuM() {
        if (this.riuEU0zW4.AARZUJiTa) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // defpackage.UsuH8pd5P
    public final int IHQe1A4L2xu() {
        AARZUJiTa();
        return this.AARZUJiTa;
    }

    public final void SH1y5HwkJhh(int i, int i2) {
        if (i2 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        defpackage.se0 se0Var = this.EXtogiMhuM;
        if (se0Var != null) {
            se0Var.SH1y5HwkJhh(i, i2);
        } else {
            defpackage.te0 te0Var = defpackage.te0.EXtogiMhuM;
            this.riuEU0zW4.SH1y5HwkJhh(i, i2);
        }
        this.AARZUJiTa -= i2;
    }

    public final void adDC3e2L(int i, java.util.Collection collection, int i2) {
        ((java.util.AbstractList) this).modCount++;
        defpackage.te0 te0Var = this.riuEU0zW4;
        defpackage.se0 se0Var = this.EXtogiMhuM;
        if (se0Var != null) {
            se0Var.adDC3e2L(i, collection, i2);
        } else {
            defpackage.te0 te0Var2 = defpackage.te0.EXtogiMhuM;
            te0Var.adDC3e2L(i, collection, i2);
        }
        this.adDC3e2L = te0Var.adDC3e2L;
        this.AARZUJiTa += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        EXtogiMhuM();
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        } else {
            xiZrDbcSW0(this.xiZrDbcSW0 + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        EXtogiMhuM();
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        adDC3e2L(this.xiZrDbcSW0 + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        EXtogiMhuM();
        AARZUJiTa();
        SH1y5HwkJhh(this.xiZrDbcSW0, this.AARZUJiTa);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        AARZUJiTa();
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            java.lang.Object[] objArr = this.adDC3e2L;
            int i = this.AARZUJiTa;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (defpackage.x70.QoRHpC4k(objArr[this.xiZrDbcSW0 + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int ez2rX8ReCYw(int i, int i2, java.util.Collection collection, boolean z) {
        int ez2rX8ReCYw;
        defpackage.se0 se0Var = this.EXtogiMhuM;
        if (se0Var != null) {
            ez2rX8ReCYw = se0Var.ez2rX8ReCYw(i, i2, collection, z);
        } else {
            defpackage.te0 te0Var = defpackage.te0.EXtogiMhuM;
            ez2rX8ReCYw = this.riuEU0zW4.ez2rX8ReCYw(i, i2, collection, z);
        }
        if (ez2rX8ReCYw > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.AARZUJiTa -= ez2rX8ReCYw;
        return ez2rX8ReCYw;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i >= 0 && i < i2) {
            return this.adDC3e2L[this.xiZrDbcSW0 + i];
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        AARZUJiTa();
        java.lang.Object[] objArr = this.adDC3e2L;
        int i = this.AARZUJiTa;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[this.xiZrDbcSW0 + i3];
            i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        AARZUJiTa();
        for (int i = 0; i < this.AARZUJiTa; i++) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L[this.xiZrDbcSW0 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        AARZUJiTa();
        return this.AARZUJiTa == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        AARZUJiTa();
        for (int i = this.AARZUJiTa - 1; i >= 0; i--) {
            if (defpackage.x70.QoRHpC4k(this.adDC3e2L[this.xiZrDbcSW0 + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i >= 0 && i <= i2) {
            return new defpackage.b40(this, i);
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.UsuH8pd5P
    public final java.lang.Object oh6vYeIP(int i) {
        EXtogiMhuM();
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i >= 0 && i < i2) {
            return riuEU0zW4(this.xiZrDbcSW0 + i);
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        EXtogiMhuM();
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
        EXtogiMhuM();
        AARZUJiTa();
        return ez2rX8ReCYw(this.xiZrDbcSW0, this.AARZUJiTa, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        EXtogiMhuM();
        AARZUJiTa();
        return ez2rX8ReCYw(this.xiZrDbcSW0, this.AARZUJiTa, collection, true) > 0;
    }

    public final java.lang.Object riuEU0zW4(int i) {
        java.lang.Object riuEU0zW4;
        ((java.util.AbstractList) this).modCount++;
        defpackage.se0 se0Var = this.EXtogiMhuM;
        if (se0Var != null) {
            riuEU0zW4 = se0Var.riuEU0zW4(i);
        } else {
            defpackage.te0 te0Var = defpackage.te0.EXtogiMhuM;
            riuEU0zW4 = this.riuEU0zW4.riuEU0zW4(i);
        }
        this.AARZUJiTa--;
        return riuEU0zW4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        EXtogiMhuM();
        AARZUJiTa();
        int i2 = this.AARZUJiTa;
        if (i < 0 || i >= i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return null;
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i3 = this.xiZrDbcSW0;
        java.lang.Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i, int i2) {
        defpackage.ci0.SyNS6RMn(i, i2, this.AARZUJiTa);
        return new defpackage.se0(this.adDC3e2L, this.xiZrDbcSW0 + i, i2 - i, this, this.riuEU0zW4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        AARZUJiTa();
        int length = objArr.length;
        int i = this.AARZUJiTa;
        java.lang.Object[] objArr2 = this.adDC3e2L;
        int i2 = this.xiZrDbcSW0;
        if (length < i) {
            java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        defpackage.t6.wKlPRKlRnfqr(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.AARZUJiTa;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        AARZUJiTa();
        return defpackage.x80.xiZrDbcSW0(this.adDC3e2L, this.xiZrDbcSW0, this.AARZUJiTa, this);
    }

    public final void xiZrDbcSW0(int i, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        defpackage.te0 te0Var = this.riuEU0zW4;
        defpackage.se0 se0Var = this.EXtogiMhuM;
        if (se0Var != null) {
            se0Var.xiZrDbcSW0(i, obj);
        } else {
            defpackage.te0 te0Var2 = defpackage.te0.EXtogiMhuM;
            te0Var.xiZrDbcSW0(i, obj);
        }
        this.adDC3e2L = te0Var.adDC3e2L;
        this.AARZUJiTa++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        EXtogiMhuM();
        AARZUJiTa();
        xiZrDbcSW0(this.xiZrDbcSW0 + this.AARZUJiTa, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        AARZUJiTa();
        java.lang.Object[] objArr = this.adDC3e2L;
        int i = this.AARZUJiTa;
        int i2 = this.xiZrDbcSW0;
        return defpackage.t6.QUKZkWRtw6(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        EXtogiMhuM();
        AARZUJiTa();
        int size = collection.size();
        adDC3e2L(this.xiZrDbcSW0 + this.AARZUJiTa, collection, size);
        return size > 0;
    }
}
