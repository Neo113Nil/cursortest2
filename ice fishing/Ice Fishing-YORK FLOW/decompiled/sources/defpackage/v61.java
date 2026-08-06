package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class v61 implements defpackage.vk0, defpackage.s61 {
    public final defpackage.k7 ZpBGe2uQfcn8;
    public final defpackage.da giKS3J6vZuNy;

    public v61(defpackage.k7 k7Var, defpackage.da daVar) {
        this.ZpBGe2uQfcn8 = k7Var;
        this.giKS3J6vZuNy = daVar;
    }

    @Override // defpackage.s61
    public final defpackage.wk0 GE9mJIPrb8gP(defpackage.ry0[] ry0VarArr, defpackage.xk0 xk0Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return xk0Var.hwoZxnIesQBZ(i, i2, defpackage.bv.WDYagTQQm9ns, new defpackage.op(ry0VarArr, this, i2, iArr));
    }

    @Override // defpackage.s61
    public final long JhCgjQRTAOCT(int i, int i2, int i3, boolean z) {
        return !z ? defpackage.nk.ZpBGe2uQfcn8(i, i2, 0, i3) : defpackage.nn.WmetiUbpKU9I(i, i2, 0, i3);
    }

    @Override // defpackage.s61
    public final int P05cfTpS5W5L(defpackage.ry0 ry0Var) {
        return ry0Var.WDYagTQQm9ns;
    }

    @Override // defpackage.vk0
    public final int QiMR8OkAhezm(defpackage.fa0 fa0Var, java.util.List list, int i) {
        int OVwOqzUGHcCU = fa0Var.OVwOqzUGHcCU(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        if (list.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((list.size() - 1) * OVwOqzUGHcCU, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.qk0 qk0Var = (defpackage.qk0) list.get(i3);
            float ZVVdXbWmyCSK = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var));
            if (ZVVdXbWmyCSK == 0.0f) {
                int min2 = java.lang.Math.min(qk0Var.GoIRkIe1iwj6(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, qk0Var.FhgBoOud6zyW(min2));
            } else if (ZVVdXbWmyCSK > 0.0f) {
                f += ZVVdXbWmyCSK;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.qk0 qk0Var2 = (defpackage.qk0) list.get(i4);
            float ZVVdXbWmyCSK2 = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var2));
            if (ZVVdXbWmyCSK2 > 0.0f) {
                i2 = java.lang.Math.max(i2, qk0Var2.FhgBoOud6zyW(round != Integer.MAX_VALUE ? java.lang.Math.round(round * ZVVdXbWmyCSK2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.s61
    public final int WDYagTQQm9ns(defpackage.ry0 ry0Var) {
        return ry0Var.oh71FJcDz6S2;
    }

    @Override // defpackage.vk0
    public final int ZpBGe2uQfcn8(defpackage.fa0 fa0Var, java.util.List list, int i) {
        int OVwOqzUGHcCU = fa0Var.OVwOqzUGHcCU(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        if (list.isEmpty()) {
            return 0;
        }
        int min = java.lang.Math.min((list.size() - 1) * OVwOqzUGHcCU, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.qk0 qk0Var = (defpackage.qk0) list.get(i3);
            float ZVVdXbWmyCSK = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var));
            if (ZVVdXbWmyCSK == 0.0f) {
                int min2 = java.lang.Math.min(qk0Var.GoIRkIe1iwj6(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = java.lang.Math.max(i2, qk0Var.oh71FJcDz6S2(min2));
            } else if (ZVVdXbWmyCSK > 0.0f) {
                f += ZVVdXbWmyCSK;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : java.lang.Math.round(java.lang.Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            defpackage.qk0 qk0Var2 = (defpackage.qk0) list.get(i4);
            float ZVVdXbWmyCSK2 = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var2));
            if (ZVVdXbWmyCSK2 > 0.0f) {
                i2 = java.lang.Math.max(i2, qk0Var2.oh71FJcDz6S2(round != Integer.MAX_VALUE ? java.lang.Math.round(round * ZVVdXbWmyCSK2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.vk0
    public final int e6mdH7fiFuta(defpackage.fa0 fa0Var, java.util.List list, int i) {
        int OVwOqzUGHcCU = fa0Var.OVwOqzUGHcCU(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.qk0 qk0Var = (defpackage.qk0) list.get(i4);
            float ZVVdXbWmyCSK = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var));
            int Jkfc0NcwyPL8 = qk0Var.Jkfc0NcwyPL8(i);
            if (ZVVdXbWmyCSK == 0.0f) {
                i3 += Jkfc0NcwyPL8;
            } else if (ZVVdXbWmyCSK > 0.0f) {
                f += ZVVdXbWmyCSK;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(Jkfc0NcwyPL8 / ZVVdXbWmyCSK));
            }
        }
        return ((list.size() - 1) * OVwOqzUGHcCU) + java.lang.Math.round(i2 * f) + i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.v61)) {
            return false;
        }
        defpackage.v61 v61Var = (defpackage.v61) obj;
        return this.ZpBGe2uQfcn8.equals(v61Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, v61Var.giKS3J6vZuNy);
    }

    @Override // defpackage.vk0
    public final int fWTAfUmVKrZq(defpackage.fa0 fa0Var, java.util.List list, int i) {
        int OVwOqzUGHcCU = fa0Var.OVwOqzUGHcCU(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            defpackage.qk0 qk0Var = (defpackage.qk0) list.get(i4);
            float ZVVdXbWmyCSK = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var));
            int GoIRkIe1iwj6 = qk0Var.GoIRkIe1iwj6(i);
            if (ZVVdXbWmyCSK == 0.0f) {
                i3 += GoIRkIe1iwj6;
            } else if (ZVVdXbWmyCSK > 0.0f) {
                f += ZVVdXbWmyCSK;
                i2 = java.lang.Math.max(i2, java.lang.Math.round(GoIRkIe1iwj6 / ZVVdXbWmyCSK));
            }
        }
        return ((list.size() - 1) * OVwOqzUGHcCU) + java.lang.Math.round(i2 * f) + i3;
    }

    @Override // defpackage.s61
    public final void giKS3J6vZuNy(int i, defpackage.xk0 xk0Var, int[] iArr, int[] iArr2) {
        this.ZpBGe2uQfcn8.JhCgjQRTAOCT(xk0Var, i, iArr, xk0Var.getLayoutDirection(), iArr2);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy.ZpBGe2uQfcn8) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    @Override // defpackage.vk0
    public final defpackage.wk0 oh71FJcDz6S2(defpackage.xk0 xk0Var, java.util.List list, long j) {
        return defpackage.q70.frSwwKIlbUhK(this, defpackage.mk.GE9mJIPrb8gP(j), defpackage.mk.e6mdH7fiFuta(j), defpackage.mk.P05cfTpS5W5L(j), defpackage.mk.QiMR8OkAhezm(j), xk0Var.OVwOqzUGHcCU(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8()), xk0Var, list, new defpackage.ry0[list.size()], 0, list.size(), null, 0);
    }

    public final java.lang.String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.ZpBGe2uQfcn8 + ", verticalAlignment=" + this.giKS3J6vZuNy + ')';
    }
}
