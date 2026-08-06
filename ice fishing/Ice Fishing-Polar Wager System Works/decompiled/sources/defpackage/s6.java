package defpackage;

/* loaded from: classes.dex */
public final class s6 implements java.util.Collection, java.util.Set, defpackage.g90, defpackage.i90 {
    public int AARZUJiTa;
    public int[] adDC3e2L = defpackage.s21.r1MBDhnF;
    public java.lang.Object[] xiZrDbcSW0 = defpackage.s21.adDC3e2L;

    public final java.lang.Object IHQe1A4L2xu(int i) {
        int i2 = this.AARZUJiTa;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.adDC3e2L;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                defpackage.t6.Ye0N2xE9Hc(iArr, iArr, i, i4, i2);
                java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i, i4, i2);
            }
            this.xiZrDbcSW0[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.adDC3e2L = iArr2;
            this.xiZrDbcSW0 = new java.lang.Object[i5];
            if (i > 0) {
                defpackage.t6.AsxAYCCkb3Hi(iArr, iArr2, 0, i, 6);
                defpackage.t6.RmCzwkUxICV(objArr, this.xiZrDbcSW0, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                defpackage.t6.Ye0N2xE9Hc(iArr, this.adDC3e2L, i, i6, i2);
                defpackage.t6.wKlPRKlRnfqr(objArr, this.xiZrDbcSW0, i, i6, i2);
            }
        }
        if (i2 != this.AARZUJiTa) {
            throw new java.util.ConcurrentModificationException();
        }
        this.AARZUJiTa = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i;
        int frpfPPIgqM9O;
        int i2 = this.AARZUJiTa;
        if (obj == null) {
            frpfPPIgqM9O = defpackage.s21.frpfPPIgqM9O(this, null, 0);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            frpfPPIgqM9O = defpackage.s21.frpfPPIgqM9O(this, obj, hashCode);
        }
        if (frpfPPIgqM9O >= 0) {
            return false;
        }
        int i3 = ~frpfPPIgqM9O;
        int[] iArr = this.adDC3e2L;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            int[] iArr2 = new int[i4];
            this.adDC3e2L = iArr2;
            this.xiZrDbcSW0 = new java.lang.Object[i4];
            if (i2 != this.AARZUJiTa) {
                throw new java.util.ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                defpackage.t6.AsxAYCCkb3Hi(iArr, iArr2, 0, iArr.length, 6);
                defpackage.t6.RmCzwkUxICV(objArr, this.xiZrDbcSW0, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.adDC3e2L;
            int i5 = i3 + 1;
            defpackage.t6.Ye0N2xE9Hc(iArr3, iArr3, i5, i3, i2);
            java.lang.Object[] objArr2 = this.xiZrDbcSW0;
            defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.AARZUJiTa;
        if (i2 == i6) {
            int[] iArr4 = this.adDC3e2L;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.xiZrDbcSW0[i3] = obj;
                this.AARZUJiTa = i6 + 1;
                return true;
            }
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        int size = collection.size() + this.AARZUJiTa;
        int i = this.AARZUJiTa;
        int[] iArr = this.adDC3e2L;
        boolean z = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            int[] iArr2 = new int[size];
            this.adDC3e2L = iArr2;
            this.xiZrDbcSW0 = new java.lang.Object[size];
            if (i > 0) {
                defpackage.t6.AsxAYCCkb3Hi(iArr, iArr2, 0, i, 6);
                defpackage.t6.RmCzwkUxICV(objArr, this.xiZrDbcSW0, 0, this.AARZUJiTa, 6);
            }
        }
        if (this.AARZUJiTa != i) {
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
        if (this.AARZUJiTa != 0) {
            this.adDC3e2L = defpackage.s21.r1MBDhnF;
            this.xiZrDbcSW0 = defpackage.s21.adDC3e2L;
            this.AARZUJiTa = 0;
        }
        if (this.AARZUJiTa != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj == null ? defpackage.s21.frpfPPIgqM9O(this, null, 0) : defpackage.s21.frpfPPIgqM9O(this, obj, obj.hashCode())) >= 0;
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
        if (!(obj instanceof java.util.Set) || this.AARZUJiTa != ((java.util.Set) obj).size()) {
            return false;
        }
        try {
            int i = this.AARZUJiTa;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((java.util.Set) obj).contains(this.xiZrDbcSW0[i2])) {
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
        int[] iArr = this.adDC3e2L;
        int i = this.AARZUJiTa;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.AARZUJiTa <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.n6(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int frpfPPIgqM9O = obj == null ? defpackage.s21.frpfPPIgqM9O(this, null, 0) : defpackage.s21.frpfPPIgqM9O(this, obj, obj.hashCode());
        if (frpfPPIgqM9O < 0) {
            return false;
        }
        IHQe1A4L2xu(frpfPPIgqM9O);
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
        for (int i = this.AARZUJiTa - 1; -1 < i; i--) {
            if (!defpackage.td.CGXpA9s3RjIa(collection, this.xiZrDbcSW0[i])) {
                IHQe1A4L2xu(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.AARZUJiTa;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int i = this.AARZUJiTa;
        if (objArr.length < i) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        defpackage.t6.wKlPRKlRnfqr(this.xiZrDbcSW0, objArr, 0, 0, this.AARZUJiTa);
        return objArr;
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.AARZUJiTa * 14);
        sb.append('{');
        int i = this.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.xiZrDbcSW0[i2];
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
        return defpackage.t6.QUKZkWRtw6(this.xiZrDbcSW0, 0, this.AARZUJiTa);
    }
}
