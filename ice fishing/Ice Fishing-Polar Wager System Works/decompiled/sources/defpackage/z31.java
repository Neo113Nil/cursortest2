package defpackage;

/* loaded from: classes.dex */
public final class z31 implements defpackage.sd0, java.lang.AutoCloseable {
    public boolean AARZUJiTa;
    public final java.lang.String adDC3e2L;
    public final defpackage.y31 xiZrDbcSW0;

    public z31(java.lang.String str, defpackage.y31 y31Var) {
        this.adDC3e2L = str;
        this.xiZrDbcSW0 = y31Var;
    }

    public final void ez2rX8ReCYw(defpackage.F7NU4MC0GW f7nu4mc0gw, defpackage.xd0 xd0Var) {
        f7nu4mc0gw.getClass();
        xd0Var.getClass();
        if (this.AARZUJiTa) {
            defpackage.db.AARZUJiTa("Already attached to lifecycleOwner");
            return;
        }
        this.AARZUJiTa = true;
        xd0Var.IHQe1A4L2xu(this);
        f7nu4mc0gw.NHJTzaLwkd(this.adDC3e2L, (defpackage.gf) this.xiZrDbcSW0.oh6vYeIP.adDC3e2L);
    }

    @Override // defpackage.sd0
    public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
        if (md0Var == defpackage.md0.ON_DESTROY) {
            this.AARZUJiTa = false;
            ud0Var.EXtogiMhuM().xiZrDbcSW0(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
