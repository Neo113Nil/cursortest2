package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n31 implements defpackage.e7 {
    public final java.lang.Object QiMR8OkAhezm;
    public final defpackage.fn0 WDYagTQQm9ns = new defpackage.fn0();
    public final defpackage.sn0 oh71FJcDz6S2 = new defpackage.sn0();

    public n31(java.lang.Object obj) {
        this.QiMR8OkAhezm = obj;
    }

    @Override // defpackage.e7
    public final void GE9mJIPrb8gP(int i, int i2) {
        defpackage.fn0 fn0Var = this.WDYagTQQm9ns;
        fn0Var.ZpBGe2uQfcn8(2);
        fn0Var.ZpBGe2uQfcn8(i);
        fn0Var.ZpBGe2uQfcn8(i2);
    }

    @Override // defpackage.e7
    public final void JhCgjQRTAOCT(java.lang.Object obj) {
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(1);
        this.oh71FJcDz6S2.ZpBGe2uQfcn8(obj);
    }

    @Override // defpackage.e7
    public final void P05cfTpS5W5L(int i, int i2, int i3) {
        defpackage.fn0 fn0Var = this.WDYagTQQm9ns;
        fn0Var.ZpBGe2uQfcn8(3);
        fn0Var.ZpBGe2uQfcn8(i);
        fn0Var.ZpBGe2uQfcn8(i2);
        fn0Var.ZpBGe2uQfcn8(i3);
    }

    @Override // defpackage.e7
    public final void WDYagTQQm9ns() {
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(8);
    }

    @Override // defpackage.e7
    public final void WmetiUbpKU9I() {
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(0);
    }

    public final void ZpBGe2uQfcn8(defpackage.bs1 bs1Var, defpackage.i41 i41Var) {
        java.lang.Exception exc;
        defpackage.fn0 fn0Var = this.WDYagTQQm9ns;
        int i = fn0Var.giKS3J6vZuNy;
        defpackage.sn0 sn0Var = new defpackage.sn0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            defpackage.sn0 sn0Var2 = this.oh71FJcDz6S2;
            if (i2 >= i) {
                if (i3 != sn0Var2.giKS3J6vZuNy) {
                    defpackage.ej.ZpBGe2uQfcn8("Applier operation size mismatch");
                }
                sn0Var2.JhCgjQRTAOCT();
                fn0Var.giKS3J6vZuNy = 0;
                bs1Var.QiMR8OkAhezm();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (fn0Var.giKS3J6vZuNy(i2)) {
                        case 0:
                            bs1Var.WmetiUbpKU9I();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            bs1Var.JhCgjQRTAOCT(sn0Var2.oh71FJcDz6S2(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            bs1Var.GE9mJIPrb8gP(fn0Var.giKS3J6vZuNy(i4), fn0Var.giKS3J6vZuNy(i6));
                        case 3:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    bs1Var.P05cfTpS5W5L(fn0Var.giKS3J6vZuNy(i4), fn0Var.giKS3J6vZuNy(i7), fn0Var.giKS3J6vZuNy(i8));
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
                        case 4:
                            bs1Var.ZpBGe2uQfcn8();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            bs1Var.fWTAfUmVKrZq(fn0Var.giKS3J6vZuNy(i4), sn0Var2.oh71FJcDz6S2(i3));
                            i3 = i9;
                        case 6:
                            i2 += 2;
                            try {
                                fn0Var.giKS3J6vZuNy(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (java.lang.Exception e3) {
                                exc = e3;
                                break;
                            }
                        case 7:
                            int i11 = i3 + 1;
                            java.lang.Object oh71FJcDz6S2 = sn0Var2.oh71FJcDz6S2(i3);
                            oh71FJcDz6S2.getClass();
                            defpackage.nq1.IJ0hOnjhPOri(2, oh71FJcDz6S2);
                            i3 += 2;
                            bs1Var.h3m55N1URyyK((defpackage.c20) oh71FJcDz6S2, sn0Var2.oh71FJcDz6S2(i11));
                            i2 = i4;
                        case 8:
                            java.lang.Object obj = bs1Var.QiMR8OkAhezm;
                            if (obj instanceof defpackage.ii) {
                                defpackage.ii iiVar = (defpackage.ii) obj;
                                if (i41Var.oh71FJcDz6S2.GE9mJIPrb8gP(iiVar)) {
                                    iiVar.giKS3J6vZuNy();
                                }
                            }
                            sn0Var.ZpBGe2uQfcn8(obj);
                            bs1Var.WDYagTQQm9ns();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (java.lang.Throwable th) {
                    bs1Var.QiMR8OkAhezm();
                    throw th;
                }
            } catch (java.lang.Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new defpackage.ki(sn0Var2, sn0Var, fn0Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.e7
    public final java.lang.Object e6mdH7fiFuta() {
        return this.QiMR8OkAhezm;
    }

    @Override // defpackage.e7
    public final void fWTAfUmVKrZq(int i, java.lang.Object obj) {
        defpackage.fn0 fn0Var = this.WDYagTQQm9ns;
        fn0Var.ZpBGe2uQfcn8(5);
        fn0Var.ZpBGe2uQfcn8(i);
        this.oh71FJcDz6S2.ZpBGe2uQfcn8(obj);
    }

    @Override // defpackage.e7
    public final void h3m55N1URyyK(defpackage.c20 c20Var, java.lang.Object obj) {
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(7);
        defpackage.sn0 sn0Var = this.oh71FJcDz6S2;
        sn0Var.ZpBGe2uQfcn8(c20Var);
        sn0Var.ZpBGe2uQfcn8(obj);
    }

    @Override // defpackage.e7
    public final void oh71FJcDz6S2(int i, java.lang.Object obj) {
        defpackage.fn0 fn0Var = this.WDYagTQQm9ns;
        fn0Var.ZpBGe2uQfcn8(6);
        fn0Var.ZpBGe2uQfcn8(i);
        this.oh71FJcDz6S2.ZpBGe2uQfcn8(obj);
    }
}
