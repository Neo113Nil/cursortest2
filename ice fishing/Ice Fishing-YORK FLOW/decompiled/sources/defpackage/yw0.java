package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yw0 implements defpackage.zj {
    public final defpackage.ti1 P05cfTpS5W5L = new defpackage.ti1(new defpackage.l3(21, this));
    public final defpackage.c20 QiMR8OkAhezm;
    public final defpackage.z61 WDYagTQQm9ns;
    public final java.lang.String oh71FJcDz6S2;

    public yw0(defpackage.z61 z61Var, java.lang.String str, defpackage.c20 c20Var) {
        this.WDYagTQQm9ns = z61Var;
        this.oh71FJcDz6S2 = str;
        this.QiMR8OkAhezm = c20Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.ti1 ti1Var = this.P05cfTpS5W5L;
        if (ti1Var.oh71FJcDz6S2 != defpackage.pa1.WmetiUbpKU9I) {
            ((defpackage.y61) ti1Var.getValue()).close();
        }
    }

    @Override // defpackage.zj
    public final java.lang.Object h3m55N1URyyK(boolean z, defpackage.c20 c20Var, defpackage.ll llVar) {
        defpackage.xw0 xw0Var = (defpackage.xw0) llVar.oh71FJcDz6S2().XntWc4eZSQ8j(defpackage.xw0.oh71FJcDz6S2);
        defpackage.kl klVar = null;
        defpackage.ww0 ww0Var = xw0Var != null ? xw0Var.WDYagTQQm9ns : null;
        if (ww0Var != null) {
            return c20Var.QiMR8OkAhezm(ww0Var, llVar);
        }
        defpackage.ww0 ww0Var2 = new defpackage.ww0(this.QiMR8OkAhezm, (defpackage.y61) this.P05cfTpS5W5L.getValue());
        return defpackage.ok0.fhbmYuu9J3cT(new defpackage.xw0(ww0Var2), new defpackage.JhCgjQRTAOCT(c20Var, ww0Var2, klVar, 20), llVar);
    }
}
