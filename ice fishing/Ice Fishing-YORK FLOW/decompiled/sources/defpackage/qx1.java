package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qx1 implements defpackage.fj, defpackage.ug0 {
    public defpackage.zg0 P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final defpackage.u WDYagTQQm9ns;
    public defpackage.c20 e6mdH7fiFuta = defpackage.zh.ZpBGe2uQfcn8;
    public final defpackage.lj oh71FJcDz6S2;

    public qx1(defpackage.u uVar, defpackage.lj ljVar) {
        this.WDYagTQQm9ns = uVar;
        this.oh71FJcDz6S2 = ljVar;
    }

    public final void ZpBGe2uQfcn8() {
        if (!this.QiMR8OkAhezm) {
            this.QiMR8OkAhezm = true;
            this.WDYagTQQm9ns.getView().setTag(com.ice.fishing.wolberta.R.id.wrapped_composition_tag, null);
            defpackage.zg0 zg0Var = this.P05cfTpS5W5L;
            if (zg0Var != null) {
                zg0Var.oh71FJcDz6S2(this);
            }
            this.P05cfTpS5W5L = null;
        }
        this.oh71FJcDz6S2.h3m55N1URyyK();
    }

    @Override // defpackage.ug0
    public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
        if (og0Var == defpackage.og0.ON_DESTROY) {
            ZpBGe2uQfcn8();
        } else {
            if (og0Var != defpackage.og0.ON_CREATE || this.QiMR8OkAhezm) {
                return;
            }
            fWTAfUmVKrZq(this.e6mdH7fiFuta);
        }
    }

    public final void fWTAfUmVKrZq(defpackage.c20 c20Var) {
        this.WDYagTQQm9ns.setOnReadyForComposition(new defpackage.x2(8, this, c20Var));
    }
}
