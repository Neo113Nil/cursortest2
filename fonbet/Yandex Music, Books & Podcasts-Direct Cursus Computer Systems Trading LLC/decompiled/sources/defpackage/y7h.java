package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class y7h extends qsc {
    public final nte a;
    public final mc4 b;
    public final Executor c;
    public final k3i d;
    public final we6 e;
    public ks3 f;
    public vn4 g;

    public y7h(nte nteVar, c8h c8hVar, Executor executor, k3i k3iVar, ks3 ks3Var) {
        this.a = nteVar;
        this.b = c8hVar;
        this.d = k3iVar;
        Executor executor2 = ks3Var.b;
        executor = executor2 != null ? executor2 : executor;
        this.c = executor;
        eps b = ks3.b(ks3Var);
        b.b = executor;
        this.f = new ks3(b);
        this.e = we6.z();
    }

    @Override // defpackage.qsc, defpackage.vn4
    public final void a(String str, Throwable th) {
        vn4 vn4Var = this.g;
        if (vn4Var != null) {
            vn4Var.a(str, th);
        }
    }

    @Override // defpackage.qsc, defpackage.vn4
    public final void f(bg3 bg3Var, s2i s2iVar) {
        ks3 ks3Var = this.f;
        k3i k3iVar = this.d;
        o2g.O(k3iVar, "method");
        o2g.O(ks3Var, "callOptions");
        jtc a = this.a.a();
        sgr sgrVar = (sgr) a.a;
        if (!sgrVar.g()) {
            this.c.execute(new iv7(this, bg3Var, xqd.h(sgrVar)));
            this.g = j8h.j0;
            return;
        }
        q8h q8hVar = (q8h) a.b;
        o8h o8hVar = (o8h) q8hVar.b.get(k3iVar.b);
        if (o8hVar == null) {
            o8hVar = (o8h) q8hVar.c.get(k3iVar.c);
        }
        if (o8hVar == null) {
            o8hVar = q8hVar.a;
        }
        if (o8hVar != null) {
            this.f = this.f.c(o8h.g, o8hVar);
        }
        vn4 g = this.b.g(k3iVar, this.f);
        this.g = g;
        g.f(bg3Var, s2iVar);
    }

    @Override // defpackage.qsc
    public final vn4 g() {
        return this.g;
    }
}
