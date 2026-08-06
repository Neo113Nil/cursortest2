package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fe1 {
    public final defpackage.v90 GE9mJIPrb8gP;
    public java.lang.Object[] JhCgjQRTAOCT;
    public int Ns0WNyEWdPsk;
    public int P05cfTpS5W5L;
    public int QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final defpackage.ge1 ZpBGe2uQfcn8;
    public int e6mdH7fiFuta;
    public int fNwYGHIYeJcR;
    public final int fWTAfUmVKrZq;
    public boolean gUjdnLbkVAaA;
    public final int[] giKS3J6vZuNy;
    public int h3m55N1URyyK;
    public boolean oh71FJcDz6S2;

    public fe1(defpackage.ge1 ge1Var) {
        this.ZpBGe2uQfcn8 = ge1Var;
        this.giKS3J6vZuNy = ge1Var.WDYagTQQm9ns;
        int i = ge1Var.oh71FJcDz6S2;
        this.fWTAfUmVKrZq = i;
        this.JhCgjQRTAOCT = ge1Var.QiMR8OkAhezm;
        this.WDYagTQQm9ns = ge1Var.P05cfTpS5W5L;
        this.P05cfTpS5W5L = i;
        this.e6mdH7fiFuta = -1;
        this.GE9mJIPrb8gP = new defpackage.v90();
    }

    public final int BHfvd2J71qpO() {
        if (this.Ns0WNyEWdPsk != 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot skip while in an empty region");
        }
        int i = this.QiMR8OkAhezm;
        int i2 = i * 5;
        int[] iArr = this.giKS3J6vZuNy;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.QiMR8OkAhezm = iArr[i2 + 3] + i;
        return i4;
    }

    public final boolean GE9mJIPrb8gP(int i) {
        return (this.giKS3J6vZuNy[(i * 5) + 1] & 134217728) != 0;
    }

    public final boolean JhCgjQRTAOCT(int i) {
        return (this.giKS3J6vZuNy[(i * 5) + 1] & 67108864) != 0;
    }

    public final boolean Ns0WNyEWdPsk(int i) {
        return (this.giKS3J6vZuNy[(i * 5) + 1] & 536870912) != 0;
    }

    public final java.lang.Object P05cfTpS5W5L(int i, int i2) {
        int[] iArr = this.giKS3J6vZuNy;
        int giKS3J6vZuNy = defpackage.ie1.giKS3J6vZuNy(iArr, i);
        int i3 = i + 1;
        int i4 = giKS3J6vZuNy + i2;
        return i4 < (i3 < this.fWTAfUmVKrZq ? iArr[(i3 * 5) + 4] : this.WDYagTQQm9ns) ? this.JhCgjQRTAOCT[i4] : defpackage.cj.ZpBGe2uQfcn8;
    }

    public final int QiMR8OkAhezm() {
        int i = this.QiMR8OkAhezm;
        if (i >= this.P05cfTpS5W5L) {
            return 0;
        }
        return this.giKS3J6vZuNy[i * 5];
    }

    public final int T1fB7bDYiVJQ(int i) {
        return this.giKS3J6vZuNy[(i * 5) + 1] & 67108863;
    }

    public final void WDYagTQQm9ns() {
        if (this.Ns0WNyEWdPsk == 0) {
            if (this.QiMR8OkAhezm != this.P05cfTpS5W5L) {
                defpackage.ej.ZpBGe2uQfcn8("endGroup() not called at the end of a group");
            }
            int i = (this.e6mdH7fiFuta * 5) + 2;
            int[] iArr = this.giKS3J6vZuNy;
            int i2 = iArr[i];
            this.e6mdH7fiFuta = i2;
            int i3 = this.fWTAfUmVKrZq;
            this.P05cfTpS5W5L = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int giKS3J6vZuNy = this.GE9mJIPrb8gP.giKS3J6vZuNy();
            if (giKS3J6vZuNy < 0) {
                this.fNwYGHIYeJcR = 0;
                this.h3m55N1URyyK = 0;
            } else {
                this.fNwYGHIYeJcR = giKS3J6vZuNy;
                this.h3m55N1URyyK = i2 >= i3 + (-1) ? this.WDYagTQQm9ns : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final int WmetiUbpKU9I(int i) {
        return this.giKS3J6vZuNy[(i * 5) + 2];
    }

    public final java.lang.Object XntWc4eZSQ8j(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.JhCgjQRTAOCT[java.lang.Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void ZVVdXbWmyCSK() {
        if (!(this.Ns0WNyEWdPsk == 0)) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot skip the enclosing group while in an empty region");
        }
        this.QiMR8OkAhezm = this.P05cfTpS5W5L;
        this.fNwYGHIYeJcR = 0;
        this.h3m55N1URyyK = 0;
    }

    public final defpackage.y20 ZpBGe2uQfcn8(int i) {
        java.util.ArrayList arrayList = this.ZpBGe2uQfcn8.h3m55N1URyyK;
        int WDYagTQQm9ns = defpackage.ie1.WDYagTQQm9ns(arrayList, i, this.fWTAfUmVKrZq);
        if (WDYagTQQm9ns >= 0) {
            return (defpackage.y20) arrayList.get(WDYagTQQm9ns);
        }
        defpackage.y20 y20Var = new defpackage.y20(i);
        arrayList.add(-(WDYagTQQm9ns + 1), y20Var);
        return y20Var;
    }

    public final int e6mdH7fiFuta(int i) {
        return this.giKS3J6vZuNy[i * 5];
    }

    public final boolean fNwYGHIYeJcR(int i) {
        return (this.giKS3J6vZuNy[(i * 5) + 1] & 1073741824) != 0;
    }

    public final void fWTAfUmVKrZq() {
        this.oh71FJcDz6S2 = true;
        if (this.ZpBGe2uQfcn8.e6mdH7fiFuta <= 0) {
            defpackage.ej.ZpBGe2uQfcn8("Unexpected reader close()");
        }
        r0.e6mdH7fiFuta--;
        this.JhCgjQRTAOCT = new java.lang.Object[0];
    }

    public final java.lang.Object gUjdnLbkVAaA(int i) {
        int i2 = i * 5;
        int[] iArr = this.giKS3J6vZuNy;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.JhCgjQRTAOCT[iArr[i2 + 4]] : defpackage.cj.ZpBGe2uQfcn8;
        }
        return null;
    }

    public final java.lang.Object giKS3J6vZuNy(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.JhCgjQRTAOCT[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + java.lang.Integer.bitCount(i3 >> 29)];
        }
        return defpackage.cj.ZpBGe2uQfcn8;
    }

    public final java.lang.Object h3m55N1URyyK() {
        int i;
        if (this.Ns0WNyEWdPsk > 0 || (i = this.fNwYGHIYeJcR) >= this.h3m55N1URyyK) {
            this.gUjdnLbkVAaA = false;
            return defpackage.cj.ZpBGe2uQfcn8;
        }
        this.gUjdnLbkVAaA = true;
        java.lang.Object[] objArr = this.JhCgjQRTAOCT;
        this.fNwYGHIYeJcR = i + 1;
        return objArr[i];
    }

    public final java.lang.Object oh71FJcDz6S2() {
        int i = this.QiMR8OkAhezm;
        if (i < this.P05cfTpS5W5L) {
            return giKS3J6vZuNy(this.giKS3J6vZuNy, i);
        }
        return 0;
    }

    public final void s0TASMVLSWD5(int i) {
        if (this.Ns0WNyEWdPsk != 0) {
            defpackage.ej.ZpBGe2uQfcn8("Cannot reposition while in an empty region");
        }
        this.QiMR8OkAhezm = i;
        int[] iArr = this.giKS3J6vZuNy;
        int i2 = this.fWTAfUmVKrZq;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.e6mdH7fiFuta) {
            this.e6mdH7fiFuta = i3;
            if (i3 < 0) {
                this.P05cfTpS5W5L = i2;
            } else {
                this.P05cfTpS5W5L = iArr[(i3 * 5) + 3] + i3;
            }
            this.fNwYGHIYeJcR = 0;
            this.h3m55N1URyyK = 0;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SlotReader(current=");
        sb.append(this.QiMR8OkAhezm);
        sb.append(", key=");
        sb.append(QiMR8OkAhezm());
        sb.append(", parent=");
        sb.append(this.e6mdH7fiFuta);
        sb.append(", end=");
        return defpackage.pVQOaWB9QMo4.Ns0WNyEWdPsk(sb, this.P05cfTpS5W5L, ')');
    }

    public final void w7APNrr0aGRc() {
        if (this.Ns0WNyEWdPsk <= 0) {
            int i = this.e6mdH7fiFuta;
            int i2 = this.QiMR8OkAhezm;
            int i3 = i2 * 5;
            int[] iArr = this.giKS3J6vZuNy;
            if (iArr[i3 + 2] != i) {
                defpackage.g11.ZpBGe2uQfcn8("Invalid slot table detected");
            }
            int i4 = this.fNwYGHIYeJcR;
            int i5 = this.h3m55N1URyyK;
            defpackage.v90 v90Var = this.GE9mJIPrb8gP;
            if (i4 == 0 && i5 == 0) {
                v90Var.fWTAfUmVKrZq(-1);
            } else {
                v90Var.fWTAfUmVKrZq(i4);
            }
            this.e6mdH7fiFuta = i2;
            this.P05cfTpS5W5L = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.QiMR8OkAhezm = i6;
            this.fNwYGHIYeJcR = defpackage.ie1.giKS3J6vZuNy(iArr, i2);
            this.h3m55N1URyyK = i2 >= this.fWTAfUmVKrZq + (-1) ? this.WDYagTQQm9ns : iArr[(i6 * 5) + 4];
        }
    }
}
