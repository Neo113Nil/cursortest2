package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ke {
    public java.lang.Object JhCgjQRTAOCT;
    public java.lang.Object WDYagTQQm9ns;
    public boolean ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public java.lang.Object giKS3J6vZuNy;

    /* JADX WARN: Multi-variable type inference failed */
    public int ZpBGe2uQfcn8(defpackage.n80 n80Var, defpackage.u uVar, boolean z) {
        java.lang.Object[] objArr;
        int i;
        int i2;
        defpackage.h50 h50Var = (defpackage.h50) this.fWTAfUmVKrZq;
        defpackage.k50 k50Var = (defpackage.k50) this.WDYagTQQm9ns;
        if (this.ZpBGe2uQfcn8) {
            return 0;
        }
        try {
            this.ZpBGe2uQfcn8 = true;
            defpackage.n80 BHfvd2J71qpO = ((defpackage.k0) this.JhCgjQRTAOCT).BHfvd2J71qpO(n80Var, uVar);
            defpackage.gj0 gj0Var = (defpackage.gj0) BHfvd2J71qpO.oh71FJcDz6S2;
            int JhCgjQRTAOCT = gj0Var.JhCgjQRTAOCT();
            for (int i3 = 0; i3 < JhCgjQRTAOCT; i3++) {
                defpackage.c01 c01Var = (defpackage.c01) gj0Var.WDYagTQQm9ns(i3);
                if (!c01Var.JhCgjQRTAOCT && !c01Var.P05cfTpS5W5L) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int JhCgjQRTAOCT2 = gj0Var.JhCgjQRTAOCT();
            for (int i4 = 0; i4 < JhCgjQRTAOCT2; i4++) {
                defpackage.c01 c01Var2 = (defpackage.c01) gj0Var.WDYagTQQm9ns(i4);
                if (objArr != false || defpackage.j80.GE9mJIPrb8gP(c01Var2)) {
                    ((defpackage.jd0) this.giKS3J6vZuNy).dG7RjM6DqYVL(c01Var2.fWTAfUmVKrZq, (defpackage.k50) this.WDYagTQQm9ns, c01Var2.e6mdH7fiFuta, true);
                    if (!k50Var.WDYagTQQm9ns.P05cfTpS5W5L()) {
                        h50Var.ZpBGe2uQfcn8(c01Var2.ZpBGe2uQfcn8, k50Var, defpackage.j80.GE9mJIPrb8gP(c01Var2));
                        k50Var.clear();
                    }
                }
            }
            boolean giKS3J6vZuNy = h50Var.giKS3J6vZuNy(BHfvd2J71qpO, z);
            int JhCgjQRTAOCT3 = gj0Var.JhCgjQRTAOCT();
            int i5 = 0;
            while (true) {
                if (i5 >= JhCgjQRTAOCT3) {
                    i = 0;
                    break;
                }
                defpackage.c01 c01Var3 = (defpackage.c01) gj0Var.WDYagTQQm9ns(i5);
                if (!defpackage.ws0.giKS3J6vZuNy(defpackage.j80.Mearx7yMn90V(c01Var3, true), 0L) && c01Var3.giKS3J6vZuNy()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int JhCgjQRTAOCT4 = gj0Var.JhCgjQRTAOCT();
            int i6 = 0;
            while (true) {
                if (i6 >= JhCgjQRTAOCT4) {
                    i2 = 0;
                    break;
                }
                if (((defpackage.c01) gj0Var.WDYagTQQm9ns(i6)).giKS3J6vZuNy()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (giKS3J6vZuNy ? 1 : 0) | (i << 1) | (i2 << 2);
            this.ZpBGe2uQfcn8 = false;
            return i7;
        } catch (java.lang.Throwable th) {
            this.ZpBGe2uQfcn8 = false;
            throw th;
        }
    }

    public void giKS3J6vZuNy(int i, int i2) {
        if (i < 0.0f) {
            defpackage.h80.ZpBGe2uQfcn8("Index should be non-negative (" + i + ')');
        }
        ((defpackage.mw0) this.giKS3J6vZuNy).e6mdH7fiFuta(i);
        defpackage.se0 se0Var = (defpackage.se0) this.WDYagTQQm9ns;
        if (i != se0Var.oh71FJcDz6S2) {
            se0Var.oh71FJcDz6S2 = i;
            int i3 = (i / 30) * 30;
            se0Var.WDYagTQQm9ns.setValue(defpackage.j80.OVwOqzUGHcCU(java.lang.Math.max(i3 - 100, 0), i3 + 130));
        }
        ((defpackage.mw0) this.fWTAfUmVKrZq).e6mdH7fiFuta(i2);
    }
}
