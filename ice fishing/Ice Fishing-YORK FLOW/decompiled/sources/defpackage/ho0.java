package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ho0 implements java.util.RandomAccess {
    public int QiMR8OkAhezm = 0;
    public java.lang.Object[] WDYagTQQm9ns;
    public defpackage.qn0 oh71FJcDz6S2;

    public ho0(java.lang.Object[] objArr) {
        this.WDYagTQQm9ns = objArr;
    }

    public final boolean GE9mJIPrb8gP(java.lang.Object obj) {
        int e6mdH7fiFuta = e6mdH7fiFuta(obj);
        if (e6mdH7fiFuta < 0) {
            return false;
        }
        Ns0WNyEWdPsk(e6mdH7fiFuta);
        return true;
    }

    public final void JhCgjQRTAOCT(int i, java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.QiMR8OkAhezm + size;
        if (this.WDYagTQQm9ns.length < i2) {
            h3m55N1URyyK(i2);
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.QiMR8OkAhezm += size;
    }

    public final java.lang.Object Ns0WNyEWdPsk(int i) {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        java.lang.Object obj = objArr[i];
        int i2 = this.QiMR8OkAhezm;
        if (i != i2 - 1) {
            int i3 = i + 1;
            java.lang.System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.QiMR8OkAhezm - 1;
        this.QiMR8OkAhezm = i4;
        objArr[i4] = null;
        return obj;
    }

    public final boolean P05cfTpS5W5L(java.lang.Object obj) {
        int i = this.QiMR8OkAhezm - 1;
        if (i >= 0) {
            for (int i2 = 0; !defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final void QiMR8OkAhezm() {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i = this.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.QiMR8OkAhezm = 0;
    }

    public final boolean WDYagTQQm9ns(int i, java.util.Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.QiMR8OkAhezm + size;
        if (this.WDYagTQQm9ns.length < i3) {
            h3m55N1URyyK(i3);
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i4 = this.QiMR8OkAhezm;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (java.lang.Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.QiMR8OkAhezm += size;
        return true;
    }

    public final void ZpBGe2uQfcn8(int i, java.lang.Object obj) {
        int i2 = this.QiMR8OkAhezm + 1;
        if (this.WDYagTQQm9ns.length < i2) {
            h3m55N1URyyK(i2);
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i3 = this.QiMR8OkAhezm;
        if (i != i3) {
            java.lang.System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.QiMR8OkAhezm++;
    }

    public final int e6mdH7fiFuta(java.lang.Object obj) {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i = this.QiMR8OkAhezm;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.ma0.QiMR8OkAhezm(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final void fNwYGHIYeJcR(int i, int i2) {
        if (i2 > i) {
            int i3 = this.QiMR8OkAhezm;
            if (i2 < i3) {
                java.lang.Object[] objArr = this.WDYagTQQm9ns;
                java.lang.System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.QiMR8OkAhezm;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.WDYagTQQm9ns[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.QiMR8OkAhezm = i5;
        }
    }

    public final void fWTAfUmVKrZq(int i, defpackage.ho0 ho0Var) {
        int i2 = ho0Var.QiMR8OkAhezm;
        if (i2 == 0) {
            return;
        }
        int i3 = this.QiMR8OkAhezm + i2;
        if (this.WDYagTQQm9ns.length < i3) {
            h3m55N1URyyK(i3);
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i4 = this.QiMR8OkAhezm;
        if (i != i4) {
            java.lang.System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        java.lang.System.arraycopy(ho0Var.WDYagTQQm9ns, 0, objArr, i, i2);
        this.QiMR8OkAhezm += i2;
    }

    public final void giKS3J6vZuNy(java.lang.Object obj) {
        int i = this.QiMR8OkAhezm + 1;
        if (this.WDYagTQQm9ns.length < i) {
            h3m55N1URyyK(i);
        }
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int i2 = this.QiMR8OkAhezm;
        objArr[i2] = obj;
        this.QiMR8OkAhezm = i2 + 1;
    }

    public final void h3m55N1URyyK(int i) {
        java.lang.Object[] objArr = this.WDYagTQQm9ns;
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, length * 2)];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
        this.WDYagTQQm9ns = objArr2;
    }

    public final java.util.List oh71FJcDz6S2() {
        defpackage.qn0 qn0Var = this.oh71FJcDz6S2;
        if (qn0Var != null) {
            return qn0Var;
        }
        defpackage.qn0 qn0Var2 = new defpackage.qn0(1, this);
        this.oh71FJcDz6S2 = qn0Var2;
        return qn0Var2;
    }
}
