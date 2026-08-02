package defpackage;

import kotlin.collections.a;
import kotlin.sequences.b;

/* loaded from: classes9.dex */
public final class ypy extends dai0 {
    public final g0c d;
    public final Object e;
    public final dai0 f;

    public ypy(g0c g0cVar, Object obj, dai0 dai0Var) {
        this.d = g0cVar;
        this.e = obj;
        this.f = dai0Var;
    }

    @Override // defpackage.dai0
    public final dai0 E(g0c g0cVar, Object obj) {
        g0c g0cVar2 = this.d;
        boolean equals = g0cVar.equals(g0cVar2);
        dai0 dai0Var = this.f;
        if (!equals) {
            dai0 E = dai0Var.E(g0cVar, null);
            if (E != dai0Var) {
                this = new ypy(g0cVar2, this.e, E);
            }
            dai0Var = this;
        }
        return obj != null ? new ypy(g0cVar, obj, dai0Var) : dai0Var;
    }

    @Override // defpackage.dai0
    public final Object o(g0c g0cVar) {
        return g0cVar.equals(this.d) ? g0cVar.a().cast(this.e) : this.f.o(g0cVar);
    }

    public final String toString() {
        return a.X(a.q0(b.s(kotlin.sequences.a.d(new mtw(29), this))), null, "{", "}", new xpy(0), 25);
    }
}
