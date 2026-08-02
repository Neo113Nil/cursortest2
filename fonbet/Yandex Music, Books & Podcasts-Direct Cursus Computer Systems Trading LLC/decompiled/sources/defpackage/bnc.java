package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class bnc implements rnq, ufg, wmm {
    public volatile boolean a;
    public rar b;
    public kzp c;

    @Override // defpackage.wmm
    public final void cancel() {
        ssg.a(3, m(), hrg.q("Block cancel[", a().a().a, "]"), null);
        rar rarVar = this.b;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.b = null;
    }

    @Override // defpackage.wmm
    public final void h() {
        ssg.a(3, m(), hrg.q("Block reset[", a().a().a, "]: alreadyLoaded=false"), null);
        cancel();
        this.a = true;
    }

    @Override // defpackage.wmm
    public final void k(kzp kzpVar) {
        this.c = kzpVar;
    }

    @Override // defpackage.wmm
    public final void l(mm6 mm6Var) {
        rar rarVar = this.b;
        if (rarVar == null || !rarVar.b()) {
            Continuation continuation = null;
            ssg.a(3, m(), v3w.e("Block load[", a().a().a, "]: force=", " alreadyLoaded=false", this.a), null);
            rar rarVar2 = this.b;
            if (rarVar2 != null) {
                rarVar2.g(null);
            }
            this.b = x97.y(mm6Var, dm6.b, null, new fzb(this, continuation, 12), 2);
        }
    }

    public final String m() {
        return f1d.g("FlowLoadableBlockViewModel:", a().a().b);
    }
}
