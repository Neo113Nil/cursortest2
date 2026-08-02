package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls1c;", "Lj530;", "La2c;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class s1c extends j530 {
    public final zx40 a;
    public final prv b;
    public final boolean c;
    public final boolean w;
    public final String x;
    public final awk0 y;
    public final sls z;

    public s1c(zx40 zx40Var, prv prvVar, boolean z, boolean z2, String str, awk0 awk0Var, sls slsVar) {
        this.a = zx40Var;
        this.b = prvVar;
        this.c = z;
        this.w = z2;
        this.x = str;
        this.y = awk0Var;
        this.z = slsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new a2c(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1c.class != obj.getClass()) {
            return false;
        }
        s1c s1cVar = (s1c) obj;
        return jl40.l(this.a, s1cVar.a) && jl40.l(this.b, s1cVar.b) && this.c == s1cVar.c && this.w == s1cVar.w && jl40.l(this.x, s1cVar.x) && jl40.l(this.y, s1cVar.y) && this.z == s1cVar.z;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        ((a2c) e530Var).S0(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }

    public final int hashCode() {
        zx40 zx40Var = this.a;
        int hashCode = (zx40Var != null ? zx40Var.hashCode() : 0) * 31;
        prv prvVar = this.b;
        int e = unr0.e(unr0.e((hashCode + (prvVar != null ? prvVar.hashCode() : 0)) * 31, 31, this.c), 31, this.w);
        String str = this.x;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        awk0 awk0Var = this.y;
        return this.z.hashCode() + ((hashCode2 + (awk0Var != null ? Integer.hashCode(awk0Var.a) : 0)) * 31);
    }
}
