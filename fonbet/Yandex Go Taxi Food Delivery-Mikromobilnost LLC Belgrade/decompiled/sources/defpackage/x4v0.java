package defpackage;

/* loaded from: classes8.dex */
public final class x4v0 implements c1m0 {
    public final dfw0 a;
    public final gfw0 b;
    public final c1m0 c;

    public x4v0(dfw0 dfw0Var, gfw0 gfw0Var, c1m0 c1m0Var) {
        this.a = dfw0Var;
        this.b = gfw0Var;
        this.c = c1m0Var;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        boolean z = neoVar instanceof e1m;
        gfw0 gfw0Var = this.b;
        if (z) {
            gfw0Var.a = ((e1m) neoVar).b;
            gfw0Var.c = true;
            this.a.c.clear();
        } else if (neoVar instanceof y0m) {
            gfw0Var.c = false;
        }
        this.c.a(neoVar, l1oVar);
    }

    @Override // defpackage.szl
    public final void b(t9 t9Var) {
        this.c.b(t9Var);
    }

    @Override // defpackage.jff
    public final ywl c() {
        return this.c.c();
    }

    @Override // defpackage.c1m0
    public final void d(tls tlsVar) {
        this.c.d(tlsVar);
    }

    @Override // defpackage.szl
    public final void dispose() {
        this.c.dispose();
    }
}
