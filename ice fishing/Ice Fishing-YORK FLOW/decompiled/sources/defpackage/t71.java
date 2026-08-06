package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class t71 implements defpackage.ug0, java.lang.AutoCloseable {
    public boolean QiMR8OkAhezm;
    public final java.lang.String WDYagTQQm9ns;
    public final defpackage.s71 oh71FJcDz6S2;

    public t71(java.lang.String str, defpackage.s71 s71Var) {
        this.WDYagTQQm9ns = str;
        this.oh71FJcDz6S2 = s71Var;
    }

    public final void Ns0WNyEWdPsk(defpackage.n80 n80Var, defpackage.zg0 zg0Var) {
        n80Var.getClass();
        zg0Var.getClass();
        if (this.QiMR8OkAhezm) {
            defpackage.h7.P05cfTpS5W5L("Already attached to lifecycleOwner");
            return;
        }
        this.QiMR8OkAhezm = true;
        zg0Var.ZpBGe2uQfcn8(this);
        n80Var.blKFvluuDQOf(this.WDYagTQQm9ns, (defpackage.ah) this.oh71FJcDz6S2.giKS3J6vZuNy.WDYagTQQm9ns);
    }

    @Override // defpackage.ug0
    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
        if (og0Var == defpackage.og0.ON_DESTROY) {
            this.QiMR8OkAhezm = false;
            wg0Var.QiMR8OkAhezm().oh71FJcDz6S2(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
