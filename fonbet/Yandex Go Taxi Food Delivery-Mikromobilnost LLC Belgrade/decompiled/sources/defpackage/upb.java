package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lupb;", "Lj530;", "Ltpb;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class upb extends j530 {
    public final teb a;

    public upb(teb tebVar) {
        this.a = tebVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        tpb tpbVar = new tpb();
        tpbVar.a = this.a;
        return tpbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof upb) {
            return this.a == ((upb) obj).a;
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        tpb tpbVar = (tpb) e530Var;
        tpbVar.a = this.a;
        qje.P(tpbVar).D();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
