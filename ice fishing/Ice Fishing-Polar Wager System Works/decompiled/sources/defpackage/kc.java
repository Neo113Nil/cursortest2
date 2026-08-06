package defpackage;

/* loaded from: classes.dex */
public final class kc {
    public java.lang.Object F7NU4MC0GW;
    public boolean IHQe1A4L2xu;
    public java.lang.Object adDC3e2L;
    public java.lang.Object oh6vYeIP;
    public java.lang.Object r1MBDhnF;

    /* JADX WARN: Multi-variable type inference failed */
    public int IHQe1A4L2xu(defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.v0 v0Var, boolean z) {
        java.lang.Object[] objArr;
        int i;
        int i2;
        defpackage.a40 a40Var = (defpackage.a40) this.r1MBDhnF;
        defpackage.d40 d40Var = (defpackage.d40) this.adDC3e2L;
        if (this.IHQe1A4L2xu) {
            return 0;
        }
        try {
            this.IHQe1A4L2xu = true;
            defpackage.F7NU4MC0GW EXtogiMhuM = ((defpackage.c1NqjJifC7) this.F7NU4MC0GW).EXtogiMhuM(f7nu4mc0gw, v0Var);
            defpackage.vf0 vf0Var = (defpackage.vf0) EXtogiMhuM.xiZrDbcSW0;
            int F7NU4MC0GW = vf0Var.F7NU4MC0GW();
            for (int i3 = 0; i3 < F7NU4MC0GW; i3++) {
                defpackage.sv0 sv0Var = (defpackage.sv0) vf0Var.adDC3e2L(i3);
                if (!sv0Var.F7NU4MC0GW && !sv0Var.EXtogiMhuM) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int F7NU4MC0GW2 = vf0Var.F7NU4MC0GW();
            for (int i4 = 0; i4 < F7NU4MC0GW2; i4++) {
                defpackage.sv0 sv0Var2 = (defpackage.sv0) vf0Var.adDC3e2L(i4);
                if (objArr != false || defpackage.s70.JlrlGoKF(sv0Var2)) {
                    ((defpackage.ma0) this.oh6vYeIP).C0U8sNJm(sv0Var2.r1MBDhnF, (defpackage.d40) this.adDC3e2L, sv0Var2.riuEU0zW4, true);
                    if (!d40Var.adDC3e2L.EXtogiMhuM()) {
                        a40Var.IHQe1A4L2xu(sv0Var2.IHQe1A4L2xu, d40Var, defpackage.s70.JlrlGoKF(sv0Var2));
                        d40Var.clear();
                    }
                }
            }
            boolean oh6vYeIP = a40Var.oh6vYeIP(EXtogiMhuM, z);
            int F7NU4MC0GW3 = vf0Var.F7NU4MC0GW();
            int i5 = 0;
            while (true) {
                if (i5 >= F7NU4MC0GW3) {
                    i = 0;
                    break;
                }
                defpackage.sv0 sv0Var3 = (defpackage.sv0) vf0Var.adDC3e2L(i5);
                if (!defpackage.gq0.oh6vYeIP(defpackage.s70.wll2JLbTBC2(sv0Var3, true), 0L) && sv0Var3.oh6vYeIP()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int F7NU4MC0GW4 = vf0Var.F7NU4MC0GW();
            int i6 = 0;
            while (true) {
                if (i6 >= F7NU4MC0GW4) {
                    i2 = 0;
                    break;
                }
                if (((defpackage.sv0) vf0Var.adDC3e2L(i6)).oh6vYeIP()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (oh6vYeIP ? 1 : 0) | (i << 1) | (i2 << 2);
            this.IHQe1A4L2xu = false;
            return i7;
        } catch (java.lang.Throwable th) {
            this.IHQe1A4L2xu = false;
            throw th;
        }
    }

    public void oh6vYeIP(int i, int i2) {
        if (i < 0.0f) {
            defpackage.a60.IHQe1A4L2xu("Index should be non-negative (" + i + ')');
        }
        ((defpackage.nt0) this.oh6vYeIP).EXtogiMhuM(i);
        defpackage.yb0 yb0Var = (defpackage.yb0) this.adDC3e2L;
        if (i != yb0Var.xiZrDbcSW0) {
            yb0Var.xiZrDbcSW0 = i;
            int i3 = (i / 30) * 30;
            yb0Var.adDC3e2L.setValue(defpackage.x80.QPwENk36pDC(java.lang.Math.max(i3 - 100, 0), i3 + 130));
        }
        ((defpackage.nt0) this.r1MBDhnF).EXtogiMhuM(i2);
    }
}
