package defpackage;

/* loaded from: classes14.dex */
public final class xkv implements skv {
    public final /* synthetic */ int a;
    public final /* synthetic */ h55 b;

    public /* synthetic */ xkv(h55 h55Var, int i) {
        this.a = i;
        this.b = h55Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                ((pw1) h55Var).r(new qu(9));
                break;
            default:
                ((rwo0) h55Var).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.skv
    public final void u0() {
        int i = this.a;
        h55 h55Var = this.b;
        switch (i) {
            case 0:
                pw1 pw1Var = (pw1) h55Var;
                pw1Var.r(new qu(9));
                ((hh31) pw1Var.F).invoke();
                break;
            default:
                rwo0 rwo0Var = (rwo0) h55Var;
                rwo0Var.r(new qu(9));
                ((lu5) rwo0Var.F).invoke();
                break;
        }
    }
}
