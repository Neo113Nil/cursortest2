package defpackage;

/* loaded from: classes.dex */
public final class ky0 extends java.util.AbstractList implements java.util.RandomAccess, defpackage.p70 {
    public static final defpackage.ky0 EXtogiMhuM = new defpackage.ky0(new java.lang.Object[0], 0, false);
    public int AARZUJiTa;
    public boolean adDC3e2L;
    public java.lang.Object[] xiZrDbcSW0;

    public ky0(java.lang.Object[] objArr, int i, boolean z) {
        this.adDC3e2L = z;
        this.xiZrDbcSW0 = objArr;
        this.AARZUJiTa = i;
    }

    public final void IHQe1A4L2xu(int i) {
        if (i < 0 || i >= this.AARZUJiTa) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Index:", ", Size:");
            JlrlGoKF.append(this.AARZUJiTa);
            throw new java.lang.IndexOutOfBoundsException(JlrlGoKF.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        oh6vYeIP();
        if (i < 0 || i > (i2 = this.AARZUJiTa)) {
            java.lang.StringBuilder JlrlGoKF = defpackage.fx0.JlrlGoKF(i, "Index:", ", Size:");
            JlrlGoKF.append(this.AARZUJiTa);
            throw new java.lang.IndexOutOfBoundsException(JlrlGoKF.toString());
        }
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (i2 < objArr.length) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[((i2 * 3) / 2) + 1];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i);
            java.lang.System.arraycopy(this.xiZrDbcSW0, i, objArr2, i + 1, this.AARZUJiTa - i);
            this.xiZrDbcSW0 = objArr2;
        }
        this.xiZrDbcSW0[i] = obj;
        this.AARZUJiTa++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        oh6vYeIP();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        oh6vYeIP();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        IHQe1A4L2xu(i);
        return this.xiZrDbcSW0[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final void oh6vYeIP() {
        if (!this.adDC3e2L) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final defpackage.ky0 r1MBDhnF(int i) {
        if (i >= this.AARZUJiTa) {
            return new defpackage.ky0(java.util.Arrays.copyOf(this.xiZrDbcSW0, i), this.AARZUJiTa, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i) {
        oh6vYeIP();
        IHQe1A4L2xu(i);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj = objArr[i];
        if (i < this.AARZUJiTa - 1) {
            java.lang.System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.AARZUJiTa--;
        ((java.util.AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        oh6vYeIP();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        oh6vYeIP();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        oh6vYeIP();
        IHQe1A4L2xu(i);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        ((java.util.AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.AARZUJiTa;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        oh6vYeIP();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        oh6vYeIP();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        oh6vYeIP();
        int i = this.AARZUJiTa;
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (i == objArr.length) {
            this.xiZrDbcSW0 = java.util.Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        java.lang.Object[] objArr2 = this.xiZrDbcSW0;
        int i2 = this.AARZUJiTa;
        this.AARZUJiTa = i2 + 1;
        objArr2[i2] = obj;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }
}
