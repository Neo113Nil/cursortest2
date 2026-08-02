package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrj0;", "Lj530;", "Lsj0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class rj0 extends j530 {
    public final wls a;

    public rj0(wls wlsVar) {
        this.a = wlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        sj0 sj0Var = new sj0();
        sj0Var.c = this.a;
        y4 y4Var = new y4(16, sj0Var);
        qj0 qj0Var = new qj0();
        qj0Var.a = y4Var;
        sj0Var.E0(qj0Var);
        return sj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rj0) {
            return this.a == ((rj0) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((sj0) e530Var).c = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
