package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class rq0 {
    public defpackage.v70 ZpBGe2uQfcn8;
    public defpackage.s81 fWTAfUmVKrZq;
    public boolean giKS3J6vZuNy;

    public abstract void JhCgjQRTAOCT(defpackage.pq0 pq0Var);

    public final void WDYagTQQm9ns() {
        defpackage.s81 s81Var = this.fWTAfUmVKrZq;
        if (s81Var == null || !((java.util.LinkedHashSet) s81Var.QiMR8OkAhezm).remove(this)) {
            return;
        }
        defpackage.uq0 uq0Var = (defpackage.uq0) s81Var.oh71FJcDz6S2;
        uq0Var.getClass();
        if (equals(uq0Var.oh71FJcDz6S2)) {
            if (uq0Var.QiMR8OkAhezm == -1) {
                ZpBGe2uQfcn8();
            }
            uq0Var.oh71FJcDz6S2 = null;
            uq0Var.QiMR8OkAhezm = 0;
            uq0Var.P05cfTpS5W5L = null;
        }
        uq0Var.JhCgjQRTAOCT.remove(this);
        uq0Var.WDYagTQQm9ns.remove(this);
        this.fWTAfUmVKrZq = null;
        uq0Var.giKS3J6vZuNy();
    }

    public abstract void ZpBGe2uQfcn8();

    public abstract void fWTAfUmVKrZq(defpackage.pq0 pq0Var);

    public abstract void giKS3J6vZuNy();

    public final void oh71FJcDz6S2(boolean z) {
        defpackage.uq0 uq0Var;
        if (this.giKS3J6vZuNy == z) {
            return;
        }
        this.giKS3J6vZuNy = z;
        defpackage.s81 s81Var = this.fWTAfUmVKrZq;
        if (s81Var == null || (uq0Var = (defpackage.uq0) s81Var.oh71FJcDz6S2) == null) {
            return;
        }
        uq0Var.giKS3J6vZuNy();
    }
}
