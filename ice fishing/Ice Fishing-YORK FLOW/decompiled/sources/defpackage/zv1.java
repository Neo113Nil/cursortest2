package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class zv1 {
    public final android.graphics.Rect[][] JhCgjQRTAOCT;
    public final defpackage.mw1 ZpBGe2uQfcn8;
    public final android.graphics.Rect[][] fWTAfUmVKrZq;
    public defpackage.v80[] giKS3J6vZuNy;

    public zv1(defpackage.mw1 mw1Var) {
        this.fWTAfUmVKrZq = new android.graphics.Rect[10][];
        this.JhCgjQRTAOCT = new android.graphics.Rect[10][];
        this.ZpBGe2uQfcn8 = mw1Var;
        fWTAfUmVKrZq(mw1Var);
    }

    public void JhCgjQRTAOCT(int i, defpackage.v80 v80Var) {
        if (this.giKS3J6vZuNy == null) {
            this.giKS3J6vZuNy = new defpackage.v80[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.giKS3J6vZuNy[defpackage.q70.oCu53ZX2v4Ju(i2)] = v80Var;
            }
        }
    }

    public abstract void P05cfTpS5W5L(defpackage.v80 v80Var);

    public final void ZpBGe2uQfcn8() {
        defpackage.v80[] v80VarArr = this.giKS3J6vZuNy;
        if (v80VarArr != null) {
            defpackage.v80 v80Var = v80VarArr[0];
            defpackage.v80 v80Var2 = v80VarArr[1];
            defpackage.mw1 mw1Var = this.ZpBGe2uQfcn8;
            if (v80Var2 == null) {
                v80Var2 = mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(2);
            }
            if (v80Var == null) {
                v80Var = mw1Var.ZpBGe2uQfcn8.P05cfTpS5W5L(1);
            }
            P05cfTpS5W5L(defpackage.v80.ZpBGe2uQfcn8(v80Var, v80Var2));
            defpackage.v80 v80Var3 = this.giKS3J6vZuNy[defpackage.q70.oCu53ZX2v4Ju(16)];
            if (v80Var3 != null) {
                QiMR8OkAhezm(v80Var3);
            }
            defpackage.v80 v80Var4 = this.giKS3J6vZuNy[defpackage.q70.oCu53ZX2v4Ju(32)];
            if (v80Var4 != null) {
                WDYagTQQm9ns(v80Var4);
            }
            defpackage.v80 v80Var5 = this.giKS3J6vZuNy[defpackage.q70.oCu53ZX2v4Ju(64)];
            if (v80Var5 != null) {
                e6mdH7fiFuta(v80Var5);
            }
        }
    }

    public void fWTAfUmVKrZq(defpackage.mw1 mw1Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            java.util.List<android.graphics.Rect> WDYagTQQm9ns = mw1Var.ZpBGe2uQfcn8.WDYagTQQm9ns(i);
            int oCu53ZX2v4Ju = defpackage.q70.oCu53ZX2v4Ju(i);
            this.fWTAfUmVKrZq[oCu53ZX2v4Ju] = (android.graphics.Rect[]) WDYagTQQm9ns.toArray(new android.graphics.Rect[WDYagTQQm9ns.size()]);
            if (i != 8) {
                java.util.List<android.graphics.Rect> oh71FJcDz6S2 = mw1Var.ZpBGe2uQfcn8.oh71FJcDz6S2(i);
                this.JhCgjQRTAOCT[oCu53ZX2v4Ju] = (android.graphics.Rect[]) oh71FJcDz6S2.toArray(new android.graphics.Rect[oh71FJcDz6S2.size()]);
            }
        }
    }

    public abstract defpackage.mw1 giKS3J6vZuNy();

    public abstract void oh71FJcDz6S2(defpackage.v80 v80Var);

    public zv1() {
        this(new defpackage.mw1());
    }

    public void QiMR8OkAhezm(defpackage.v80 v80Var) {
    }

    public void WDYagTQQm9ns(defpackage.v80 v80Var) {
    }

    public void e6mdH7fiFuta(defpackage.v80 v80Var) {
    }
}
