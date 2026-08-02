package defpackage;

/* loaded from: classes8.dex */
public final class uf60 extends yk3 {
    public no6 c;

    @Override // defpackage.yk3
    public final void b() {
        tje.e();
        if (this.c == null) {
            this.c = new no6(this.b, this);
        }
    }

    @Override // defpackage.yk3
    public final void e(wl3 wl3Var) {
        tje.e();
        if (wl3Var == null) {
            return;
        }
        no6 no6Var = this.c;
        if (no6Var != null) {
            no6Var.b();
            this.c = null;
        }
        xqi0 xqi0Var = this.b;
        xqi0Var.a(this, new k370(xqi0Var, wl3Var));
    }
}
