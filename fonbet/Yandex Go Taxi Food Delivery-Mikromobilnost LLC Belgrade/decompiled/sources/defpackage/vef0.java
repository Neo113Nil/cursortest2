package defpackage;

/* loaded from: classes8.dex */
public final class vef0 {
    public final kse a;
    public final x22 b;
    public uti0 c;
    public t9a0 d;

    public vef0(y120 y120Var, kse kseVar, x22 x22Var) {
        this.a = kseVar;
        this.b = x22Var;
    }

    public final void a() {
        kse.b(this.a);
        if (this.d != null) {
            uti0 uti0Var = this.c;
            if (uti0Var != null) {
                uti0Var.close();
            }
            this.c = null;
            t9a0 t9a0Var = this.d;
            if (t9a0Var != null) {
                t9a0Var.invoke();
            }
            this.d = null;
        }
    }
}
