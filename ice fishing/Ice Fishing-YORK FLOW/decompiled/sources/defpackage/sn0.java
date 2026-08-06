package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class sn0 {
    public java.lang.Object[] ZpBGe2uQfcn8;
    public defpackage.qn0 fWTAfUmVKrZq;
    public int giKS3J6vZuNy;

    public sn0(int i) {
        this.ZpBGe2uQfcn8 = i == 0 ? defpackage.ns0.ZpBGe2uQfcn8 : new java.lang.Object[i];
    }

    public final boolean GE9mJIPrb8gP(java.lang.Object obj) {
        int QiMR8OkAhezm = QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm < 0) {
            return false;
        }
        Ns0WNyEWdPsk(QiMR8OkAhezm);
        return true;
    }

    public final void JhCgjQRTAOCT() {
        defpackage.y7.I5Vdbaz9SDkL(0, this.giKS3J6vZuNy, null, this.ZpBGe2uQfcn8);
        this.giKS3J6vZuNy = 0;
    }

    public final java.lang.Object Ns0WNyEWdPsk(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.giKS3J6vZuNy)) {
            T1fB7bDYiVJQ(i);
            throw null;
        }
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        java.lang.Object obj = objArr[i];
        if (i != i2 - 1) {
            defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.giKS3J6vZuNy - 1;
        this.giKS3J6vZuNy = i3;
        objArr[i3] = null;
        return obj;
    }

    public final boolean P05cfTpS5W5L() {
        return this.giKS3J6vZuNy == 0;
    }

    public final int QiMR8OkAhezm(java.lang.Object obj) {
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        int i = 0;
        if (obj == null) {
            int i2 = this.giKS3J6vZuNy;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.giKS3J6vZuNy;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void T1fB7bDYiVJQ(int i) {
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Index ", " must be in 0..");
        h3m55N1URyyK.append(this.giKS3J6vZuNy - 1);
        throw new java.lang.IndexOutOfBoundsException(h3m55N1URyyK.toString());
    }

    public final java.lang.Object WDYagTQQm9ns() {
        if (P05cfTpS5W5L()) {
            throw new java.util.NoSuchElementException("ObjectList is empty.");
        }
        return this.ZpBGe2uQfcn8[0];
    }

    public final void XntWc4eZSQ8j(int i) {
        java.lang.StringBuilder h3m55N1URyyK = defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Index ", " must be in 0..");
        h3m55N1URyyK.append(this.giKS3J6vZuNy);
        throw new java.lang.IndexOutOfBoundsException(h3m55N1URyyK.toString());
    }

    public final void ZpBGe2uQfcn8(java.lang.Object obj) {
        int i = this.giKS3J6vZuNy + 1;
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        if (objArr.length < i) {
            h3m55N1URyyK(i, objArr);
        }
        java.lang.Object[] objArr2 = this.ZpBGe2uQfcn8;
        int i2 = this.giKS3J6vZuNy;
        objArr2[i2] = obj;
        this.giKS3J6vZuNy = i2 + 1;
    }

    public final boolean e6mdH7fiFuta() {
        return this.giKS3J6vZuNy != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.sn0) {
            defpackage.sn0 sn0Var = (defpackage.sn0) obj;
            int i = sn0Var.giKS3J6vZuNy;
            int i2 = this.giKS3J6vZuNy;
            if (i == i2) {
                java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
                java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
                defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(0, i2);
                int i3 = OVwOqzUGHcCU.WDYagTQQm9ns;
                int i4 = OVwOqzUGHcCU.oh71FJcDz6S2;
                if (i3 > i4) {
                    return true;
                }
                while (defpackage.ma0.QiMR8OkAhezm(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void fNwYGHIYeJcR(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.giKS3J6vZuNy) || i2 < 0 || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.giKS3J6vZuNy);
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
                defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i, i2, i3);
            }
            int i4 = this.giKS3J6vZuNy;
            int i5 = i4 - (i2 - i);
            defpackage.y7.I5Vdbaz9SDkL(i5, i4, null, this.ZpBGe2uQfcn8);
            this.giKS3J6vZuNy = i5;
        }
    }

    public final void fWTAfUmVKrZq(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.giKS3J6vZuNy;
        int size = list.size() + i;
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        if (objArr.length < size) {
            h3m55N1URyyK(size, objArr);
        }
        java.lang.Object[] objArr2 = this.ZpBGe2uQfcn8;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.giKS3J6vZuNy = list.size() + this.giKS3J6vZuNy;
    }

    public final java.lang.Object gUjdnLbkVAaA(int i, java.lang.Object obj) {
        if (i < 0 || i >= this.giKS3J6vZuNy) {
            T1fB7bDYiVJQ(i);
            throw null;
        }
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void giKS3J6vZuNy(defpackage.sn0 sn0Var) {
        sn0Var.getClass();
        if (sn0Var.P05cfTpS5W5L()) {
            return;
        }
        int i = this.giKS3J6vZuNy + sn0Var.giKS3J6vZuNy;
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        if (objArr.length < i) {
            h3m55N1URyyK(i, objArr);
        }
        defpackage.y7.hwoZxnIesQBZ(sn0Var.ZpBGe2uQfcn8, this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, 0, sn0Var.giKS3J6vZuNy);
        this.giKS3J6vZuNy += sn0Var.giKS3J6vZuNy;
    }

    public final void h3m55N1URyyK(int i, java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        java.lang.Object[] objArr2 = new java.lang.Object[java.lang.Math.max(i, (length * 3) / 2)];
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, 0, 0, length);
        this.ZpBGe2uQfcn8 = objArr2;
    }

    public final int hashCode() {
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final java.lang.Object oh71FJcDz6S2(int i) {
        if (i >= 0 && i < this.giKS3J6vZuNy) {
            return this.ZpBGe2uQfcn8[i];
        }
        T1fB7bDYiVJQ(i);
        throw null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.CharSequence) "[");
        java.lang.Object[] objArr = this.ZpBGe2uQfcn8;
        int i = this.giKS3J6vZuNy;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((java.lang.CharSequence) "]");
                break;
            }
            java.lang.Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((java.lang.CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((java.lang.CharSequence) ", ");
            }
            sb.append((java.lang.CharSequence) (obj == this ? "(this)" : java.lang.String.valueOf(obj)));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ sn0() {
        this(16);
    }
}
