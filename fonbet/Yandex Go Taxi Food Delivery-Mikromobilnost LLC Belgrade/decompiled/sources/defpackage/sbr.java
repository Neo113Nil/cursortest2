package defpackage;

/* loaded from: classes15.dex */
public final class sbr implements tsr, ca20 {
    public ea20 a;
    public final ike b;

    public sbr() {
        sjh sjhVar = uyj.a;
        this.b = g8e.f(o400.a.x);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        ea20 ea20Var = new ea20(ssrVar.c, "tanker_fintech_sdk");
        ea20Var.b(this);
        this.a = ea20Var;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        bvf0.j(this.b, null);
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        ((ba20) da20Var).error("no_delegate", "No FintechSdk registered. Register an implementation via FintechSdkHolder.setDelegate(...).", null);
    }
}
