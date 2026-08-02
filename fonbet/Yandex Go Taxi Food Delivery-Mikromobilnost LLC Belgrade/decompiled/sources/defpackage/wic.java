package defpackage;

import androidx.compose.foundation.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lwic;", "Lj530;", "Landroidx/compose/foundation/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class wic extends j530 {
    public final sls A;
    public final sls B;
    public final boolean C = true;
    public final zx40 a;
    public final prv b;
    public final boolean c;
    public final boolean w;
    public final awk0 x;
    public final sls y;
    public final String z;

    public wic(zx40 zx40Var, prv prvVar, boolean z, boolean z2, awk0 awk0Var, sls slsVar, String str, sls slsVar2, sls slsVar3) {
        this.a = zx40Var;
        this.b = prvVar;
        this.c = z;
        this.w = z2;
        this.x = awk0Var;
        this.y = slsVar;
        this.z = str;
        this.A = slsVar2;
        this.B = slsVar3;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new d(this.y, this.z, this.A, this.B, this.C, this.a, this.b, this.c, this.w, this.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wic.class != obj.getClass()) {
            return false;
        }
        wic wicVar = (wic) obj;
        return jl40.l(this.a, wicVar.a) && jl40.l(this.b, wicVar.b) && this.c == wicVar.c && this.w == wicVar.w && jl40.l(this.x, wicVar.x) && this.y == wicVar.y && jl40.l(this.z, wicVar.z) && this.A == wicVar.A && this.B == wicVar.B && this.C == wicVar.C;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        boolean z;
        d dVar = (d) e530Var;
        dVar.T = this.C;
        String str = dVar.Q;
        String str2 = this.z;
        if (!jl40.l(str, str2)) {
            dVar.Q = str2;
            qje.P(dVar).D();
        }
        boolean z2 = dVar.R == null;
        sls slsVar = this.A;
        if (z2 != (slsVar == null)) {
            dVar.I0();
            qje.P(dVar).D();
            z = true;
        } else {
            z = false;
        }
        dVar.R = slsVar;
        boolean z3 = dVar.S == null;
        sls slsVar2 = this.B;
        if (z3 != (slsVar2 == null)) {
            z = true;
        }
        dVar.S = slsVar2;
        boolean z4 = dVar.A;
        boolean z5 = this.w;
        if (z4 != z5) {
            z = true;
        }
        dVar.S0(this.a, this.b, this.c, z5, null, this.x, this.y);
        if (z) {
            dVar.T0(false);
            dVar.T0(true);
        }
    }

    public final int hashCode() {
        zx40 zx40Var = this.a;
        int hashCode = (zx40Var != null ? zx40Var.hashCode() : 0) * 31;
        prv prvVar = this.b;
        int e = unr0.e(unr0.e((hashCode + (prvVar != null ? prvVar.hashCode() : 0)) * 31, 31, this.c), 961, this.w);
        awk0 awk0Var = this.x;
        int a = nnm.a((e + (awk0Var != null ? Integer.hashCode(awk0Var.a) : 0)) * 31, 31, this.y);
        String str = this.z;
        int hashCode2 = (a + (str != null ? str.hashCode() : 0)) * 31;
        sls slsVar = this.A;
        int hashCode3 = (hashCode2 + (slsVar != null ? slsVar.hashCode() : 0)) * 31;
        sls slsVar2 = this.B;
        return Boolean.hashCode(this.C) + ((hashCode3 + (slsVar2 != null ? slsVar2.hashCode() : 0)) * 31);
    }
}
