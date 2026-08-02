package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.x;
import androidx.compose.ui.node.u;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class ujp0 extends lqh implements fud, dr60 {
    public vk6 A;
    public boolean B;
    public c C;
    public x D;
    public lqh E;
    public i92 F;
    public c G;
    public boolean H;
    public wkp0 c;
    public Orientation w;
    public boolean x;
    public snr y;
    public zx40 z;

    public final void H0() {
        cqh cqhVar = this.E;
        if (cqhVar != null) {
            if (cqhVar.getNode().isAttached()) {
                return;
            }
            E0(cqhVar);
            return;
        }
        if (this.B) {
            u.e(this, new b7p0(2, this));
        }
        c cVar = this.B ? this.G : this.C;
        if (cVar != null) {
            lqh lqhVar = cVar.i;
            if (lqhVar.getNode().isAttached()) {
                return;
            }
            E0(lqhVar);
            this.E = lqhVar;
        }
    }

    public final boolean I0() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        if (isAttached()) {
            layoutDirection = qje.P(this).S;
        }
        return layoutDirection != LayoutDirection.Rtl || this.w == Orientation.Vertical;
    }

    public final void J0(vk6 vk6Var, snr snrVar, zx40 zx40Var, wkp0 wkp0Var, c cVar, Orientation orientation, boolean z, boolean z2) {
        boolean z3;
        this.c = wkp0Var;
        this.w = orientation;
        boolean z4 = true;
        if (this.B != z) {
            this.B = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (jl40.l(this.C, cVar)) {
            z4 = false;
        } else {
            this.C = cVar;
        }
        if (z3 || (z4 && !z)) {
            lqh lqhVar = this.E;
            if (lqhVar != null) {
                F0(lqhVar);
            }
            this.E = null;
            H0();
        }
        this.x = z2;
        this.y = snrVar;
        this.z = zx40Var;
        this.A = vk6Var;
        boolean I0 = I0();
        this.H = I0;
        x xVar = this.D;
        if (xVar != null) {
            xVar.Z0(vk6Var, snrVar, zx40Var, wkp0Var, this.B ? this.G : this.C, orientation, z2, I0);
        }
    }

    @Override // defpackage.dr60
    public final void e0() {
        i92 i92Var = (i92) npb1.c(this, m290.a);
        if (jl40.l(i92Var, this.F)) {
            return;
        }
        this.F = i92Var;
        this.G = null;
        lqh lqhVar = this.E;
        if (lqhVar != null) {
            F0(lqhVar);
        }
        this.E = null;
        H0();
        x xVar = this.D;
        if (xVar != null) {
            wkp0 wkp0Var = this.c;
            Orientation orientation = this.w;
            c cVar = this.B ? this.G : this.C;
            xVar.Z0(this.A, this.y, this.z, wkp0Var, cVar, orientation, this.x, this.H);
        }
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.H = I0();
        H0();
        if (this.D == null) {
            wkp0 wkp0Var = this.c;
            c cVar = this.B ? this.G : this.C;
            x xVar = new x(this.A, this.y, this.z, wkp0Var, cVar, this.w, this.x, this.H);
            E0(xVar);
            this.D = xVar;
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        lqh lqhVar = this.E;
        if (lqhVar != null) {
            F0(lqhVar);
        }
    }

    @Override // defpackage.cqh
    public final void onLayoutDirectionChange() {
        boolean I0 = I0();
        if (this.H != I0) {
            this.H = I0;
            wkp0 wkp0Var = this.c;
            Orientation orientation = this.w;
            boolean z = this.B;
            c cVar = z ? this.G : this.C;
            J0(this.A, this.y, this.z, wkp0Var, cVar, orientation, z, this.x);
        }
    }
}
