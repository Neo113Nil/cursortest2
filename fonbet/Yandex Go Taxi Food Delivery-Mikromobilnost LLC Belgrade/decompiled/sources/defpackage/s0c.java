package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Ls0c;", "Lj530;", "Lmqe;", "Lenq0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s0c extends j530 implements enq0 {
    public final tls a;

    public s0c(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new mqe(this.a, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0c) {
            return this.a == ((s0c) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((mqe) e530Var).c = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.enq0
    public final cnq0 l() {
        cnq0 cnq0Var = new cnq0();
        cnq0Var.c = false;
        cnq0Var.w = true;
        this.a.invoke(cnq0Var);
        return cnq0Var;
    }
}
