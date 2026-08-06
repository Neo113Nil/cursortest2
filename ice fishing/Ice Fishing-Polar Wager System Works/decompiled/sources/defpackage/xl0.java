package defpackage;

/* loaded from: classes.dex */
public final class xl0 implements java.util.RandomAccess {
    public int AARZUJiTa = 0;
    public java.lang.Object[] adDC3e2L;
    public defpackage.ul0 xiZrDbcSW0;

    public xl0(java.lang.Object[] objArr) {
        this.adDC3e2L = objArr;
    }

    public final void AARZUJiTa() {
        java.lang.Object[] objArr = this.adDC3e2L;
        int i = this.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.AARZUJiTa = 0;
    }

    public final void DFo87pBq1E5(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, length * 2)];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        this.adDC3e2L = objArr2;
    }

    public final boolean EXtogiMhuM(java.lang.Object obj) {
        int i = this.AARZUJiTa - 1;
        if (i >= 0) {
            for (int i2 = 0; !defpackage.x70.QoRHpC4k(this.adDC3e2L[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void F7NU4MC0GW(int i, java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.AARZUJiTa + size;
        if (this.adDC3e2L.length < i2) {
            DFo87pBq1E5(i2);
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i3 = this.AARZUJiTa;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.AARZUJiTa += size;
    }

    public final void IHQe1A4L2xu(int i, java.lang.Object obj) {
        int i2 = this.AARZUJiTa + 1;
        if (this.adDC3e2L.length < i2) {
            DFo87pBq1E5(i2);
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i3 = this.AARZUJiTa;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.AARZUJiTa++;
    }

    public final void JlrlGoKF(int i, int i2) {
        if (i2 > i) {
            int i3 = this.AARZUJiTa;
            if (i2 < i3) {
                java.lang.Object[] objArr = this.adDC3e2L;
                java.lang.System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.AARZUJiTa;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.adDC3e2L[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.AARZUJiTa = i5;
        }
    }

    public final boolean SH1y5HwkJhh(java.lang.Object obj) {
        int riuEU0zW4 = riuEU0zW4(obj);
        if (riuEU0zW4 < 0) {
            return false;
        }
        ez2rX8ReCYw(riuEU0zW4);
        return true;
    }

    public final boolean adDC3e2L(int i, java.util.Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.AARZUJiTa + size;
        if (this.adDC3e2L.length < i3) {
            DFo87pBq1E5(i3);
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i4 = this.AARZUJiTa;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (java.lang.Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.AARZUJiTa += size;
        return true;
    }

    public final java.lang.Object ez2rX8ReCYw(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        java.lang.Object obj = objArr[i];
        int i2 = this.AARZUJiTa;
        if (i != i2 - 1) {
            int i3 = i + 1;
            java.lang.System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.AARZUJiTa - 1;
        this.AARZUJiTa = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void oh6vYeIP(java.lang.Object obj) {
        int i = this.AARZUJiTa + 1;
        if (this.adDC3e2L.length < i) {
            DFo87pBq1E5(i);
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i2 = this.AARZUJiTa;
        objArr[i2] = obj;
        this.AARZUJiTa = i2 + 1;
    }

    public final void r1MBDhnF(int i, defpackage.xl0 xl0Var) {
        int i2 = xl0Var.AARZUJiTa;
        if (i2 == 0) {
            return;
        }
        int i3 = this.AARZUJiTa + i2;
        if (this.adDC3e2L.length < i3) {
            DFo87pBq1E5(i3);
        }
        java.lang.Object[] objArr = this.adDC3e2L;
        int i4 = this.AARZUJiTa;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        java.lang.System.arraycopy(xl0Var.adDC3e2L, 0, objArr, i, i2);
        this.AARZUJiTa += i2;
    }

    public final int riuEU0zW4(java.lang.Object obj) {
        java.lang.Object[] objArr = this.adDC3e2L;
        int i = this.AARZUJiTa;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.x70.QoRHpC4k(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final java.util.List xiZrDbcSW0() {
        defpackage.ul0 ul0Var = this.xiZrDbcSW0;
        if (ul0Var != null) {
            return ul0Var;
        }
        defpackage.ul0 ul0Var2 = new defpackage.ul0(this);
        this.xiZrDbcSW0 = ul0Var2;
        return ul0Var2;
    }
}
