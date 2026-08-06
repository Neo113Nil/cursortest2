package defpackage;

/* loaded from: classes.dex */
public final class ql0 implements defpackage.i90, java.util.Set, defpackage.g90 {
    public final defpackage.ol0 adDC3e2L;
    public final defpackage.ol0 xiZrDbcSW0;

    public ql0(defpackage.ol0 ol0Var) {
        this.adDC3e2L = ol0Var;
        this.xiZrDbcSW0 = ol0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.xiZrDbcSW0.IHQe1A4L2xu(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.ol0 ol0Var = this.xiZrDbcSW0;
        int i = ol0Var.F7NU4MC0GW;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ol0Var.ez2rX8ReCYw(it.next());
        }
        return i != ol0Var.F7NU4MC0GW;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.xiZrDbcSW0.oh6vYeIP();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.adDC3e2L.r1MBDhnF(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        collection.getClass();
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.adDC3e2L.r1MBDhnF(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || defpackage.ql0.class != obj.getClass()) {
            return false;
        }
        return this.adDC3e2L.equals(((defpackage.ql0) obj).adDC3e2L);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.adDC3e2L.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.adDC3e2L.AARZUJiTa();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.f20(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.xiZrDbcSW0.JlrlGoKF(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.ol0 ol0Var = this.xiZrDbcSW0;
        int i = ol0Var.F7NU4MC0GW;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            ol0Var.riuEU0zW4(it.next());
        }
        return i != ol0Var.F7NU4MC0GW;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        defpackage.ol0 ol0Var = this.xiZrDbcSW0;
        java.lang.Object[] objArr = ol0Var.oh6vYeIP;
        int i = ol0Var.F7NU4MC0GW;
        long[] jArr = ol0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!defpackage.td.CGXpA9s3RjIa(collection, objArr[i5])) {
                                ol0Var.DFo87pBq1E5(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != ol0Var.F7NU4MC0GW;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.adDC3e2L.F7NU4MC0GW;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return defpackage.ci0.wKlPRKlRnfqr(this, objArr);
    }

    public final java.lang.String toString() {
        return this.adDC3e2L.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.ci0.EoOhNTTfIN7K(this);
    }
}
