package defpackage;

import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxd11;", "Lj530;", "Lyd11;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class xd11 extends j530 {
    public final ToggleableState a;
    public final zx40 b;
    public final boolean c;
    public final sls w;

    public xd11(ToggleableState toggleableState, zx40 zx40Var, boolean z, sls slsVar) {
        this.a = toggleableState;
        this.b = zx40Var;
        this.c = z;
        this.w = slsVar;
    }

    @Override // defpackage.j530
    public final e530 a() {
        yd11 yd11Var = new yd11(this.b, null, false, this.c, null, null, this.w);
        yd11Var.S = this.a;
        return yd11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xd11.class != obj.getClass()) {
            return false;
        }
        xd11 xd11Var = (xd11) obj;
        return this.a == xd11Var.a && jl40.l(this.b, xd11Var.b) && this.c == xd11Var.c && this.w == xd11Var.w;
    }

    @Override // defpackage.j530
    public final void f(e530 e530Var) {
        yd11 yd11Var = (yd11) e530Var;
        ToggleableState toggleableState = yd11Var.S;
        ToggleableState toggleableState2 = this.a;
        if (toggleableState != toggleableState2) {
            yd11Var.S = toggleableState2;
            qje.P(yd11Var).D();
        }
        yd11Var.S0(this.b, null, false, this.c, null, null, this.w);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zx40 zx40Var = this.b;
        return this.w.hashCode() + unr0.e(unr0.e((hashCode + (zx40Var != null ? zx40Var.hashCode() : 0)) * 961, 31, false), 961, this.c);
    }
}
