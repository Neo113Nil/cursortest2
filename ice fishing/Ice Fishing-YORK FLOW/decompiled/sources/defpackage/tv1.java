package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class tv1 extends defpackage.zv1 {
    public final android.view.WindowInsets.Builder WDYagTQQm9ns;

    public tv1(defpackage.mw1 mw1Var) {
        super(mw1Var);
        android.view.WindowInsets giKS3J6vZuNy = mw1Var.giKS3J6vZuNy();
        this.WDYagTQQm9ns = giKS3J6vZuNy != null ? defpackage.sv1.fWTAfUmVKrZq(giKS3J6vZuNy) : defpackage.sv1.giKS3J6vZuNy();
    }

    @Override // defpackage.zv1
    public void P05cfTpS5W5L(defpackage.v80 v80Var) {
        this.WDYagTQQm9ns.setSystemWindowInsets(v80Var.JhCgjQRTAOCT());
    }

    @Override // defpackage.zv1
    public void QiMR8OkAhezm(defpackage.v80 v80Var) {
        this.WDYagTQQm9ns.setSystemGestureInsets(v80Var.JhCgjQRTAOCT());
    }

    @Override // defpackage.zv1
    public void WDYagTQQm9ns(defpackage.v80 v80Var) {
        this.WDYagTQQm9ns.setMandatorySystemGestureInsets(v80Var.JhCgjQRTAOCT());
    }

    @Override // defpackage.zv1
    public void e6mdH7fiFuta(defpackage.v80 v80Var) {
        this.WDYagTQQm9ns.setTappableElementInsets(v80Var.JhCgjQRTAOCT());
    }

    @Override // defpackage.zv1
    public defpackage.mw1 giKS3J6vZuNy() {
        android.view.WindowInsets build;
        ZpBGe2uQfcn8();
        build = this.WDYagTQQm9ns.build();
        defpackage.mw1 fWTAfUmVKrZq = defpackage.mw1.fWTAfUmVKrZq(build, null);
        defpackage.v80[] v80VarArr = this.giKS3J6vZuNy;
        defpackage.jw1 jw1Var = fWTAfUmVKrZq.ZpBGe2uQfcn8;
        jw1Var.maCixPsq4ml2(v80VarArr);
        jw1Var.w7APNrr0aGRc(null);
        jw1Var.dG7RjM6DqYVL(this.fWTAfUmVKrZq);
        jw1Var.OcTWLQzke1i2(this.JhCgjQRTAOCT);
        return fWTAfUmVKrZq;
    }

    @Override // defpackage.zv1
    public void oh71FJcDz6S2(defpackage.v80 v80Var) {
        this.WDYagTQQm9ns.setStableInsets(v80Var.JhCgjQRTAOCT());
    }

    public tv1() {
        this.WDYagTQQm9ns = defpackage.sv1.giKS3J6vZuNy();
    }
}
