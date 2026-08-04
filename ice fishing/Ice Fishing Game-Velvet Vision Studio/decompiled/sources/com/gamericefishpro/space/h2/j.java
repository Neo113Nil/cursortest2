package com.gamericefishpro.space.h2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends com.gamericefishpro.space.h1.l {
    public final int H = g1.e(this);
    public com.gamericefishpro.space.h1.l I;

    public final i A0(i iVar) {
        com.gamericefishpro.space.h1.l lVar = ((com.gamericefishpro.space.h1.l) iVar).d;
        if (lVar != iVar) {
            com.gamericefishpro.space.h1.l lVar2 = iVar instanceof com.gamericefishpro.space.h1.l ? (com.gamericefishpro.space.h1.l) iVar : null;
            com.gamericefishpro.space.h1.l lVar3 = lVar2 != null ? lVar2.w : null;
            if (lVar != this.d || !Intrinsics.a(lVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (lVar.G) {
                com.gamericefishpro.space.e2.a.b("Cannot delegate to an already attached node");
            }
            lVar.y0(this.d);
            int i = this.i;
            int iF = g1.f(lVar);
            lVar.i = iF;
            int i2 = this.i;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof v)) {
                com.gamericefishpro.space.e2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + lVar);
            }
            lVar.y = this.I;
            this.I = lVar;
            lVar.w = this;
            C0(iF | this.i, false);
            if (this.G) {
                if (i3 == 0 || (i & 2) != 0) {
                    z0(this.A);
                } else {
                    a1 a1Var = k.s(this).Z;
                    this.d.z0(null);
                    a1Var.g();
                }
                lVar.q0();
                lVar.w0();
                if (!lVar.G) {
                    com.gamericefishpro.space.e2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                g1.a(lVar, -1, 1);
            }
        }
        return iVar;
    }

    public final void B0(i iVar) {
        com.gamericefishpro.space.h1.l lVar = null;
        for (com.gamericefishpro.space.h1.l lVar2 = this.I; lVar2 != null; lVar2 = lVar2.y) {
            if (lVar2 == iVar) {
                boolean z = lVar2.G;
                if (z) {
                    com.gamericefishpro.space.t.c0 c0Var = g1.a;
                    if (!z) {
                        com.gamericefishpro.space.e2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g1.a(lVar2, -1, 2);
                    lVar2.x0();
                    lVar2.r0();
                }
                lVar2.y0(lVar2);
                lVar2.v = 0;
                if (lVar == null) {
                    this.I = lVar2.y;
                } else {
                    lVar.y = lVar2.y;
                }
                lVar2.y = null;
                lVar2.w = null;
                int i = this.i;
                int iF = g1.f(this);
                C0(iF, true);
                if (this.G && (i & 2) != 0 && (iF & 2) == 0) {
                    a1 a1Var = k.s(this).Z;
                    this.d.z0(null);
                    a1Var.g();
                    return;
                }
                return;
            }
            lVar = lVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + iVar).toString());
    }

    public final void C0(int i, boolean z) {
        com.gamericefishpro.space.h1.l lVar;
        int i2 = this.i;
        this.i = i;
        if (i2 != i) {
            com.gamericefishpro.space.h1.l lVar2 = this.d;
            if (lVar2 == this) {
                this.v = i;
            }
            if (this.G) {
                com.gamericefishpro.space.h1.l lVar3 = this;
                while (lVar3 != null) {
                    i |= lVar3.i;
                    lVar3.i = i;
                    if (lVar3 == lVar2) {
                        break;
                    } else {
                        lVar3 = lVar3.w;
                    }
                }
                if (z && lVar3 == lVar2) {
                    i = g1.f(lVar2);
                    lVar2.i = i;
                }
                int i3 = i | ((lVar3 == null || (lVar = lVar3.y) == null) ? 0 : lVar.v);
                while (lVar3 != null) {
                    i3 |= lVar3.i;
                    lVar3.v = i3;
                    lVar3 = lVar3.w;
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void q0() {
        super.q0();
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.z0(this.A);
            if (!lVar.G) {
                lVar.q0();
            }
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void r0() {
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.r0();
        }
        super.r0();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void v0() {
        super.v0();
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.v0();
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void w0() {
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.w0();
        }
        super.w0();
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void x0() {
        super.x0();
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.x0();
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void y0(com.gamericefishpro.space.h1.l lVar) {
        this.d = lVar;
        for (com.gamericefishpro.space.h1.l lVar2 = this.I; lVar2 != null; lVar2 = lVar2.y) {
            lVar2.y0(lVar);
        }
    }

    @Override // com.gamericefishpro.space.h1.l
    public final void z0(f1 f1Var) {
        this.A = f1Var;
        for (com.gamericefishpro.space.h1.l lVar = this.I; lVar != null; lVar = lVar.y) {
            lVar.z0(f1Var);
        }
    }
}
