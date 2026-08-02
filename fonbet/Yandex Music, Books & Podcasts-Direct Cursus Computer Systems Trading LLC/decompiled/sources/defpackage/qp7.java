package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class qp7 implements rnq, wmm {
    public rar a;
    public kzp b;
    public volatile boolean c;

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, n(), hrg.q("Block cancel[", a().a().a, "]"), null);
        rar rarVar = this.a;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.a = null;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, n(), vz1.p("Block reset[", a().a().a, "]: ready=", m()), null);
        cancel();
        this.c = true;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.b = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        rar rarVar = this.a;
        if (rarVar == null || !rarVar.b()) {
            if (this.c || !m()) {
                String n = n();
                String str = a().a().a;
                boolean z = this.c;
                boolean m = m();
                StringBuilder h = v3w.h("Block load[", str, "]: force=", " ready=", z);
                h.append(m);
                Continuation continuation = null;
                ssg.a(3, n, h.toString(), null);
                rar rarVar2 = this.a;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                this.a = x97.y(mm6Var, dm6.b, null, new ja4(this, continuation, 26), 2);
            }
        }
    }

    public abstract boolean m();

    public abstract String n();

    public abstract Object o(boolean z, cg6 cg6Var);
}
