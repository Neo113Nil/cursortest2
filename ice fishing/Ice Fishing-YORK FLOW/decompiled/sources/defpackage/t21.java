package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class t21 {
    public final defpackage.zf0 ZpBGe2uQfcn8;

    public t21(defpackage.n10 n10Var) {
        this.ZpBGe2uQfcn8 = new defpackage.zf0(n10Var);
    }

    public abstract defpackage.v21 ZpBGe2uQfcn8(java.lang.Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.vs1 fWTAfUmVKrZq(defpackage.v21 v21Var, defpackage.vs1 vs1Var) {
        defpackage.nt ntVar = null;
        if (vs1Var instanceof defpackage.nt) {
            if (v21Var.JhCgjQRTAOCT) {
                ntVar = (defpackage.nt) vs1Var;
                ntVar.ZpBGe2uQfcn8.setValue(v21Var.ZpBGe2uQfcn8());
            }
        } else if (vs1Var instanceof defpackage.og1) {
            if ((v21Var.giKS3J6vZuNy || v21Var.WDYagTQQm9ns != null) && !v21Var.JhCgjQRTAOCT) {
                defpackage.og1 og1Var = (defpackage.og1) vs1Var;
                if (defpackage.ma0.QiMR8OkAhezm(v21Var.ZpBGe2uQfcn8(), og1Var.ZpBGe2uQfcn8)) {
                    ntVar = og1Var;
                }
            }
        } else if (vs1Var instanceof defpackage.tj) {
            v21Var.getClass();
        }
        if (ntVar != null) {
            return ntVar;
        }
        if (!v21Var.JhCgjQRTAOCT) {
            return new defpackage.og1(v21Var.ZpBGe2uQfcn8());
        }
        java.lang.Object obj = v21Var.WDYagTQQm9ns;
        defpackage.ze1 ze1Var = v21Var.fWTAfUmVKrZq;
        if (ze1Var == null) {
            ze1Var = defpackage.pa1.Ns0WNyEWdPsk;
        }
        return new defpackage.nt(new defpackage.pw0(obj, ze1Var));
    }

    public defpackage.vs1 giKS3J6vZuNy() {
        return this.ZpBGe2uQfcn8;
    }
}
