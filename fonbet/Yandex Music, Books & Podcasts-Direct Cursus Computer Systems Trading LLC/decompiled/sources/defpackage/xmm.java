package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class xmm implements rnq, tfg, wmm {
    public rar a;
    public kzp b;
    public volatile boolean c;

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, m(), hrg.q("Block cancel[", a().a().a, "]"), null);
        rar rarVar = this.a;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.a = null;
    }

    @Override // defpackage.tfg
    public final Object d(Continuation continuation) {
        return o(false, (cg6) continuation);
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, m(), vz1.p("Block reset[", a().a().a, "]: ready=", n()), null);
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
            if (this.c || !n()) {
                String m = m();
                String str = a().a().a;
                boolean z = this.c;
                boolean n = n();
                StringBuilder h = v3w.h("Block load[", str, "]: force=", " ready=", z);
                h.append(n);
                Continuation continuation = null;
                ssg.a(3, m, h.toString(), null);
                rar rarVar2 = this.a;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                this.a = x97.y(mm6Var, dm6.b, null, new g2l(this, continuation, 19), 2);
            }
        }
    }

    public final String m() {
        return f1d.g("PrefetchableBlockViewModel:", a().a().b);
    }

    public abstract boolean n();

    public abstract Object o(boolean z, cg6 cg6Var);
}
