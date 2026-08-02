package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lx4y;", "Lj530;", "Ly4y;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class x4y extends j530 {
    public final qar a;
    public final twt0 b;
    public final qar c;

    public x4y(qar qarVar, twt0 twt0Var, qar qarVar2) {
        this.a = qarVar;
        this.b = twt0Var;
        this.c = qarVar2;
    }

    @Override // defpackage.j530
    public final e530 a() {
        y4y y4yVar = new y4y();
        y4yVar.a = this.a;
        y4yVar.b = this.b;
        y4yVar.c = this.c;
        return y4yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4y)) {
            return false;
        }
        x4y x4yVar = (x4y) obj;
        return jl40.l(this.a, x4yVar.a) && jl40.l(this.b, x4yVar.b) && jl40.l(this.c, x4yVar.c);
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        y4y y4yVar = (y4y) e530Var;
        y4yVar.a = this.a;
        y4yVar.b = this.b;
        y4yVar.c = this.c;
    }

    public final int hashCode() {
        qar qarVar = this.a;
        int hashCode = (qarVar == null ? 0 : qarVar.hashCode()) * 31;
        twt0 twt0Var = this.b;
        int hashCode2 = (hashCode + (twt0Var == null ? 0 : twt0Var.hashCode())) * 31;
        qar qarVar2 = this.c;
        return hashCode2 + (qarVar2 != null ? qarVar2.hashCode() : 0);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ')';
    }
}
