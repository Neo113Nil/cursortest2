package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class dy0 extends defpackage.cy0 {
    public boolean GE9mJIPrb8gP;
    public int Ns0WNyEWdPsk;
    public final defpackage.zx0 P05cfTpS5W5L;
    public java.lang.Object e6mdH7fiFuta;

    public dy0(defpackage.zx0 zx0Var, defpackage.wp1[] wp1VarArr) {
        super(zx0Var.oh71FJcDz6S2, wp1VarArr);
        this.P05cfTpS5W5L = zx0Var;
        this.Ns0WNyEWdPsk = zx0Var.P05cfTpS5W5L;
    }

    public final void fWTAfUmVKrZq(int i, defpackage.vp1 vp1Var, java.lang.Object obj, int i2) {
        int i3 = i2 * 5;
        defpackage.wp1[] wp1VarArr = this.WDYagTQQm9ns;
        if (i3 <= 30) {
            int dG7RjM6DqYVL = 1 << defpackage.m90.dG7RjM6DqYVL(i, i3);
            if (vp1Var.P05cfTpS5W5L(dG7RjM6DqYVL)) {
                wp1VarArr[i2].ZpBGe2uQfcn8(vp1Var.JhCgjQRTAOCT, java.lang.Integer.bitCount(vp1Var.ZpBGe2uQfcn8) * 2, vp1Var.oh71FJcDz6S2(dG7RjM6DqYVL));
                this.oh71FJcDz6S2 = i2;
                return;
            } else {
                int ZVVdXbWmyCSK = vp1Var.ZVVdXbWmyCSK(dG7RjM6DqYVL);
                defpackage.vp1 BHfvd2J71qpO = vp1Var.BHfvd2J71qpO(ZVVdXbWmyCSK);
                wp1VarArr[i2].ZpBGe2uQfcn8(vp1Var.JhCgjQRTAOCT, java.lang.Integer.bitCount(vp1Var.ZpBGe2uQfcn8) * 2, ZVVdXbWmyCSK);
                fWTAfUmVKrZq(i, BHfvd2J71qpO, obj, i2 + 1);
                return;
            }
        }
        defpackage.wp1 wp1Var = wp1VarArr[i2];
        java.lang.Object[] objArr = vp1Var.JhCgjQRTAOCT;
        wp1Var.ZpBGe2uQfcn8(objArr, objArr.length, 0);
        while (true) {
            defpackage.wp1 wp1Var2 = wp1VarArr[i2];
            if (defpackage.ma0.QiMR8OkAhezm(wp1Var2.WDYagTQQm9ns[wp1Var2.QiMR8OkAhezm], obj)) {
                this.oh71FJcDz6S2 = i2;
                return;
            } else {
                wp1VarArr[i2].QiMR8OkAhezm += 2;
            }
        }
    }

    @Override // defpackage.cy0, java.util.Iterator
    public final java.lang.Object next() {
        if (this.P05cfTpS5W5L.P05cfTpS5W5L != this.Ns0WNyEWdPsk) {
            throw new java.util.ConcurrentModificationException();
        }
        if (!this.QiMR8OkAhezm) {
            defpackage.h7.BHfvd2J71qpO();
            return null;
        }
        defpackage.wp1 wp1Var = this.WDYagTQQm9ns[this.oh71FJcDz6S2];
        this.e6mdH7fiFuta = wp1Var.WDYagTQQm9ns[wp1Var.QiMR8OkAhezm];
        this.GE9mJIPrb8gP = true;
        return super.next();
    }

    @Override // defpackage.cy0, java.util.Iterator
    public final void remove() {
        if (!this.GE9mJIPrb8gP) {
            throw new java.lang.IllegalStateException();
        }
        boolean z = this.QiMR8OkAhezm;
        defpackage.zx0 zx0Var = this.P05cfTpS5W5L;
        if (!z) {
            defpackage.nq1.maCixPsq4ml2(zx0Var).remove(this.e6mdH7fiFuta);
        } else {
            if (!z) {
                defpackage.h7.BHfvd2J71qpO();
                return;
            }
            defpackage.wp1 wp1Var = this.WDYagTQQm9ns[this.oh71FJcDz6S2];
            java.lang.Object obj = wp1Var.WDYagTQQm9ns[wp1Var.QiMR8OkAhezm];
            defpackage.nq1.maCixPsq4ml2(zx0Var).remove(this.e6mdH7fiFuta);
            fWTAfUmVKrZq(obj != null ? obj.hashCode() : 0, zx0Var.oh71FJcDz6S2, obj, 0);
        }
        this.e6mdH7fiFuta = null;
        this.GE9mJIPrb8gP = false;
        this.Ns0WNyEWdPsk = zx0Var.P05cfTpS5W5L;
    }
}
