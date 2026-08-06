package defpackage;

/* loaded from: classes.dex */
public final class hz0 implements defpackage.b6 {
    public final java.lang.Object AARZUJiTa;
    public final defpackage.wk0 adDC3e2L = new defpackage.wk0();
    public final defpackage.gl0 xiZrDbcSW0 = new defpackage.gl0();

    public hz0(java.lang.Object obj) {
        this.AARZUJiTa = obj;
    }

    @Override // defpackage.b6
    public final void DFo87pBq1E5(defpackage.k00 k00Var, java.lang.Object obj) {
        this.adDC3e2L.IHQe1A4L2xu(7);
        defpackage.gl0 gl0Var = this.xiZrDbcSW0;
        gl0Var.IHQe1A4L2xu(k00Var);
        gl0Var.IHQe1A4L2xu(obj);
    }

    @Override // defpackage.b6
    public final void EXtogiMhuM(int i, int i2, int i3) {
        defpackage.wk0 wk0Var = this.adDC3e2L;
        wk0Var.IHQe1A4L2xu(3);
        wk0Var.IHQe1A4L2xu(i);
        wk0Var.IHQe1A4L2xu(i2);
        wk0Var.IHQe1A4L2xu(i3);
    }

    @Override // defpackage.b6
    public final void F7NU4MC0GW(java.lang.Object obj) {
        this.adDC3e2L.IHQe1A4L2xu(1);
        this.xiZrDbcSW0.IHQe1A4L2xu(obj);
    }

    @Override // defpackage.b6
    public final void G3OKOH3wZRC() {
        this.adDC3e2L.IHQe1A4L2xu(0);
    }

    public final void IHQe1A4L2xu(defpackage.gk1 gk1Var, defpackage.v01 v01Var) {
        java.lang.Exception exc;
        defpackage.wk0 wk0Var = this.adDC3e2L;
        int i = wk0Var.oh6vYeIP;
        defpackage.gl0 gl0Var = new defpackage.gl0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            defpackage.gl0 gl0Var2 = this.xiZrDbcSW0;
            if (i2 >= i) {
                if (i3 != gl0Var2.oh6vYeIP) {
                    defpackage.dh.IHQe1A4L2xu("Applier operation size mismatch");
                }
                gl0Var2.F7NU4MC0GW();
                wk0Var.oh6vYeIP = 0;
                gk1Var.AARZUJiTa();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (wk0Var.oh6vYeIP(i2)) {
                        case 0:
                            gk1Var.G3OKOH3wZRC();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            gk1Var.F7NU4MC0GW(gl0Var2.xiZrDbcSW0(i3));
                            i3 = i5;
                            i2 = i4;
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            int i6 = i2 + 2;
                            i2 += 3;
                            gk1Var.SH1y5HwkJhh(wk0Var.oh6vYeIP(i4), wk0Var.oh6vYeIP(i6));
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    gk1Var.EXtogiMhuM(wk0Var.oh6vYeIP(i4), wk0Var.oh6vYeIP(i7), wk0Var.oh6vYeIP(i8));
                                } catch (java.lang.Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (java.lang.Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                            gk1Var.IHQe1A4L2xu();
                            i2 = i4;
                        case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            gk1Var.r1MBDhnF(wk0Var.oh6vYeIP(i4), gl0Var2.xiZrDbcSW0(i3));
                            i3 = i9;
                        case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                wk0Var.oh6vYeIP(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (java.lang.Exception e3) {
                                exc = e3;
                                break;
                            }
                        case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            java.lang.Object xiZrDbcSW0 = gl0Var2.xiZrDbcSW0(i3);
                            xiZrDbcSW0.getClass();
                            defpackage.mj1.kNAkVymC(2, xiZrDbcSW0);
                            i3 += 2;
                            gk1Var.DFo87pBq1E5((defpackage.k00) xiZrDbcSW0, gl0Var2.xiZrDbcSW0(i11));
                            i2 = i4;
                        case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                            java.lang.Object obj = gk1Var.AARZUJiTa;
                            if (obj instanceof defpackage.ig) {
                                defpackage.ig igVar = (defpackage.ig) obj;
                                if (v01Var.xiZrDbcSW0.SH1y5HwkJhh(igVar)) {
                                    igVar.oh6vYeIP();
                                }
                            }
                            gl0Var.IHQe1A4L2xu(obj);
                            gk1Var.adDC3e2L();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (java.lang.Throwable th) {
                    gk1Var.AARZUJiTa();
                    throw th;
                }
            } catch (java.lang.Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new defpackage.kg(gl0Var2, gl0Var, wk0Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.b6
    public final void SH1y5HwkJhh(int i, int i2) {
        defpackage.wk0 wk0Var = this.adDC3e2L;
        wk0Var.IHQe1A4L2xu(2);
        wk0Var.IHQe1A4L2xu(i);
        wk0Var.IHQe1A4L2xu(i2);
    }

    @Override // defpackage.b6
    public final void adDC3e2L() {
        this.adDC3e2L.IHQe1A4L2xu(8);
    }

    @Override // defpackage.b6
    public final void r1MBDhnF(int i, java.lang.Object obj) {
        defpackage.wk0 wk0Var = this.adDC3e2L;
        wk0Var.IHQe1A4L2xu(5);
        wk0Var.IHQe1A4L2xu(i);
        this.xiZrDbcSW0.IHQe1A4L2xu(obj);
    }

    @Override // defpackage.b6
    public final java.lang.Object riuEU0zW4() {
        return this.AARZUJiTa;
    }

    @Override // defpackage.b6
    public final void xiZrDbcSW0(int i, java.lang.Object obj) {
        defpackage.wk0 wk0Var = this.adDC3e2L;
        wk0Var.IHQe1A4L2xu(6);
        wk0Var.IHQe1A4L2xu(i);
        this.xiZrDbcSW0.IHQe1A4L2xu(obj);
    }
}
