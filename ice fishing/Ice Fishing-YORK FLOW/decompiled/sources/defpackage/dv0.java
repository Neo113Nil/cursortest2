package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class dv0 extends defpackage.v70 {
    public int JhCgjQRTAOCT;
    public int P05cfTpS5W5L;
    public int oh71FJcDz6S2;
    public defpackage.bv0[] fWTAfUmVKrZq = new defpackage.bv0[16];
    public int[] WDYagTQQm9ns = new int[16];
    public java.lang.Object[] QiMR8OkAhezm = new java.lang.Object[16];

    public final void GcLuU6pT9wO9(defpackage.e7 e7Var, defpackage.je1 je1Var, defpackage.i41 i41Var, defpackage.cv0 cv0Var) {
        if (this.JhCgjQRTAOCT != 0) {
            defpackage.z20 z20Var = new defpackage.z20(this);
            defpackage.dv0 dv0Var = (defpackage.dv0) z20Var.WDYagTQQm9ns;
            while (true) {
                defpackage.bv0 bv0Var = dv0Var.fWTAfUmVKrZq[z20Var.giKS3J6vZuNy];
                defpackage.y20 giKS3J6vZuNy = bv0Var.giKS3J6vZuNy(z20Var);
                defpackage.e7 e7Var2 = e7Var;
                defpackage.je1 je1Var2 = je1Var;
                defpackage.i41 i41Var2 = i41Var;
                defpackage.cv0 cv0Var2 = cv0Var;
                try {
                    bv0Var.ZpBGe2uQfcn8(z20Var, e7Var2, je1Var2, i41Var2, cv0Var2);
                    int i = z20Var.giKS3J6vZuNy;
                    int i2 = dv0Var.JhCgjQRTAOCT;
                    if (i < i2) {
                        defpackage.bv0 bv0Var2 = dv0Var.fWTAfUmVKrZq[i];
                        z20Var.fWTAfUmVKrZq += bv0Var2.ZpBGe2uQfcn8;
                        z20Var.JhCgjQRTAOCT += bv0Var2.giKS3J6vZuNy;
                        int i3 = i + 1;
                        z20Var.giKS3J6vZuNy = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        e7Var = e7Var2;
                        je1Var = je1Var2;
                        i41Var = i41Var2;
                        cv0Var = cv0Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        hH0RRJrNssvh();
    }

    public final void hH0RRJrNssvh() {
        this.JhCgjQRTAOCT = 0;
        this.oh71FJcDz6S2 = 0;
        java.util.Arrays.fill(this.QiMR8OkAhezm, 0, this.P05cfTpS5W5L, (java.lang.Object) null);
        this.P05cfTpS5W5L = 0;
    }

    public final void w6IV1lieBIux(defpackage.bv0 bv0Var) {
        int i = this.JhCgjQRTAOCT;
        defpackage.bv0[] bv0VarArr = this.fWTAfUmVKrZq;
        if (i == bv0VarArr.length) {
            defpackage.bv0[] bv0VarArr2 = new defpackage.bv0[(i > 1024 ? 1024 : i) + i];
            java.lang.System.arraycopy(bv0VarArr, 0, bv0VarArr2, 0, i);
            this.fWTAfUmVKrZq = bv0VarArr2;
        }
        int i2 = this.oh71FJcDz6S2;
        int i3 = bv0Var.ZpBGe2uQfcn8;
        int i4 = bv0Var.giKS3J6vZuNy;
        int i5 = i2 + i3;
        int[] iArr = this.WDYagTQQm9ns;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            defpackage.y7.cCeDCHgnx5OL(iArr, iArr2, 0, 0, length);
            this.WDYagTQQm9ns = iArr2;
        }
        int i7 = this.P05cfTpS5W5L + i4;
        java.lang.Object[] objArr = this.QiMR8OkAhezm;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[i7];
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.QiMR8OkAhezm = objArr2;
        }
        defpackage.bv0[] bv0VarArr3 = this.fWTAfUmVKrZq;
        int i9 = this.JhCgjQRTAOCT;
        this.JhCgjQRTAOCT = i9 + 1;
        bv0VarArr3[i9] = bv0Var;
        this.oh71FJcDz6S2 += bv0Var.ZpBGe2uQfcn8;
        this.P05cfTpS5W5L += i4;
    }

    public final boolean xahdJg25P1Bv() {
        return this.JhCgjQRTAOCT == 0;
    }
}
