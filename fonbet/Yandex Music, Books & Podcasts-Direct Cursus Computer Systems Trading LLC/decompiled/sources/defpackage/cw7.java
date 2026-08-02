package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class cw7 extends xci {
    public final int o = g8j.e(this);
    public xci p;

    @Override // defpackage.xci
    public final void I0() {
        super.I0();
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.R0(this.h);
            if (!xciVar.n) {
                xciVar.I0();
            }
        }
    }

    @Override // defpackage.xci
    public final void J0() {
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.J0();
        }
        super.J0();
    }

    @Override // defpackage.xci
    public final void N0() {
        super.N0();
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.N0();
        }
    }

    @Override // defpackage.xci
    public final void O0() {
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.O0();
        }
        super.O0();
    }

    @Override // defpackage.xci
    public final void P0() {
        super.P0();
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.P0();
        }
    }

    @Override // defpackage.xci
    public final void Q0(xci xciVar) {
        this.a = xciVar;
        for (xci xciVar2 = this.p; xciVar2 != null; xciVar2 = xciVar2.f) {
            xciVar2.Q0(xciVar);
        }
    }

    @Override // defpackage.xci
    public final void R0(f8j f8jVar) {
        this.h = f8jVar;
        for (xci xciVar = this.p; xciVar != null; xciVar = xciVar.f) {
            xciVar.R0(f8jVar);
        }
    }

    public final sv7 S0(sv7 sv7Var) {
        xci xciVar = ((xci) sv7Var).a;
        if (xciVar != sv7Var) {
            xci xciVar2 = sv7Var instanceof xci ? (xci) sv7Var : null;
            xci xciVar3 = xciVar2 != null ? xciVar2.e : null;
            if (xciVar != this.a || !Intrinsics.d(xciVar3, this)) {
                xq0.q("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (xciVar.n) {
                sme.b("Cannot delegate to an already attached node");
            }
            xciVar.Q0(this.a);
            int i = this.c;
            int f = g8j.f(xciVar);
            xciVar.c = f;
            int i2 = this.c;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof epf)) {
                sme.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + xciVar);
            }
            xciVar.f = this.p;
            this.p = xciVar;
            xciVar.e = this;
            U0(f | this.c, false);
            if (this.n) {
                if (i3 == 0 || (i & 2) != 0) {
                    R0(this.h);
                } else {
                    cr crVar = bcx.F(this).F;
                    this.a.R0(null);
                    crVar.q0();
                }
                xciVar.I0();
                xciVar.O0();
                if (!xciVar.n) {
                    sme.b("autoInvalidateInsertedNode called on unattached node");
                }
                g8j.a(xciVar, -1, 1);
            }
        }
        return sv7Var;
    }

    public final void T0(sv7 sv7Var) {
        xci xciVar = null;
        for (xci xciVar2 = this.p; xciVar2 != null; xciVar2 = xciVar2.f) {
            if (xciVar2 == sv7Var) {
                boolean z = xciVar2.n;
                if (z) {
                    cpi cpiVar = g8j.a;
                    if (!z) {
                        sme.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g8j.a(xciVar2, -1, 2);
                    xciVar2.P0();
                    xciVar2.J0();
                }
                xciVar2.Q0(xciVar2);
                xciVar2.d = 0;
                xci xciVar3 = xciVar2.f;
                if (xciVar == null) {
                    this.p = xciVar3;
                } else {
                    xciVar.f = xciVar3;
                }
                xciVar2.f = null;
                xciVar2.e = null;
                int i = this.c;
                int f = g8j.f(this);
                U0(f, true);
                if (this.n && (i & 2) != 0 && (f & 2) == 0) {
                    cr crVar = bcx.F(this).F;
                    this.a.R0(null);
                    crVar.q0();
                    return;
                }
                return;
            }
            xciVar = xciVar2;
        }
        b6e.l(sv7Var, "Could not find delegate: ");
    }

    public final void U0(int i, boolean z) {
        xci xciVar;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            xci xciVar2 = this.a;
            if (xciVar2 == this) {
                this.d = i;
            }
            if (this.n) {
                xci xciVar3 = this;
                while (xciVar3 != null) {
                    i |= xciVar3.c;
                    xciVar3.c = i;
                    if (xciVar3 == xciVar2) {
                        break;
                    } else {
                        xciVar3 = xciVar3.e;
                    }
                }
                if (z && xciVar3 == xciVar2) {
                    i = g8j.f(xciVar2);
                    xciVar2.c = i;
                }
                int i3 = i | ((xciVar3 == null || (xciVar = xciVar3.f) == null) ? 0 : xciVar.d);
                while (xciVar3 != null) {
                    i3 |= xciVar3.c;
                    xciVar3.d = i3;
                    xciVar3 = xciVar3.e;
                }
            }
        }
    }
}
