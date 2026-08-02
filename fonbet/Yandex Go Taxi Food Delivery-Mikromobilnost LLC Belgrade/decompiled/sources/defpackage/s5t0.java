package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls5t0;", "Lj530;", "Lk8w;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class s5t0 extends j530 {
    public final tls a;

    public s5t0(tls tlsVar) {
        this.a = tlsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        k8w k8wVar = new k8w();
        k8wVar.a = this.a;
        return k8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5t0) && this.a == ((s5t0) obj).a;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        k8w k8wVar = (k8w) e530Var;
        k8wVar.getClass();
        k8wVar.a = this.a;
    }

    public final int hashCode() {
        tls tlsVar = this.a;
        if (tlsVar != null) {
            return tlsVar.hashCode();
        }
        return 0;
    }
}
