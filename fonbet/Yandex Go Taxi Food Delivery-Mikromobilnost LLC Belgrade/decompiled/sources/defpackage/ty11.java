package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lty11;", "Lj530;", "Luy11;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class ty11 extends j530 {
    public final p651 a;
    public final tls b;

    public ty11(p651 p651Var, tls tlsVar) {
        this.a = p651Var;
        this.b = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        uy11 uy11Var = new uy11();
        uy11Var.c = this.a;
        return uy11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ty11) {
            return jl40.l(((ty11) obj).a, this.a);
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        uy11 uy11Var = (uy11) e530Var;
        p651 p651Var = uy11Var.c;
        p651 p651Var2 = this.a;
        if (jl40.l(p651Var2, p651Var)) {
            return;
        }
        uy11Var.c = p651Var2;
        uy11Var.F0();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
