package defpackage;

import android.view.View;
import androidx.compose.foundation.i;
import androidx.compose.ui.semantics.g;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ls200;", "Lj530;", "Landroidx/compose/foundation/i;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s200 extends j530 {
    public final wfz B;
    public final tls a;
    public final tls b;
    public final float c = Float.NaN;
    public final boolean w = true;
    public final long x = 9205357640488583168L;
    public final float y = Float.NaN;
    public final float z = Float.NaN;
    public final boolean A = true;

    public s200(tls tlsVar, tls tlsVar2, wfz wfzVar) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.B = wfzVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        return new i(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s200) {
            s200 s200Var = (s200) obj;
            if (this.a == s200Var.a && this.c == s200Var.c && this.w == s200Var.w && this.x == s200Var.x && y7m.b(this.y, s200Var.y) && y7m.b(this.z, s200Var.z) && this.A == s200Var.A && this.b == s200Var.b && jl40.l(this.B, s200Var.B)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        i iVar = (i) e530Var;
        float f = iVar.c;
        long j = iVar.x;
        float f2 = iVar.y;
        boolean z = iVar.w;
        float f3 = iVar.z;
        boolean z2 = iVar.A;
        wfz wfzVar = iVar.B;
        View view = iVar.C;
        fwi fwiVar = iVar.D;
        iVar.a = this.a;
        float f4 = this.c;
        iVar.c = f4;
        boolean z3 = this.w;
        iVar.w = z3;
        long j2 = this.x;
        iVar.x = j2;
        float f5 = this.y;
        iVar.y = f5;
        float f6 = this.z;
        iVar.z = f6;
        boolean z4 = this.A;
        iVar.A = z4;
        iVar.b = this.b;
        wfz wfzVar2 = this.B;
        iVar.B = wfzVar2;
        View V = tje.V(iVar);
        fwi fwiVar2 = qje.P(iVar).R;
        if (iVar.E != null) {
            g gVar = u200.a;
            if ((!Float.isNaN(f4) || !Float.isNaN(f)) && f4 != f) {
                wfzVar2.getClass();
            }
            if (j2 != j || !y7m.b(f5, f2) || !y7m.b(f6, f3) || z3 != z || z4 != z2 || !jl40.l(wfzVar2, wfzVar) || !V.equals(view) || !jl40.l(fwiVar2, fwiVar)) {
                iVar.F0();
            }
        }
        iVar.G0();
    }

    public final int hashCode() {
        int e = unr0.e(g8e.c(this.z, g8e.c(this.y, qv10.c(unr0.e(g8e.c(this.c, this.a.hashCode() * 961, 31), 31, this.w), 31, this.x), 31), 31), 31, this.A);
        tls tlsVar = this.b;
        return this.B.hashCode() + ((e + (tlsVar != null ? tlsVar.hashCode() : 0)) * 31);
    }
}
