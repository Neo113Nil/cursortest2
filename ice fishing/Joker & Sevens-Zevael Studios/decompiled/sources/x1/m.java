package x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class m extends y0.m {

    /* renamed from: u, reason: collision with root package name */
    public final int f8109u = g1.e(this);

    /* renamed from: v, reason: collision with root package name */
    public y0.m f8110v;

    @Override // y0.m
    public final void h0() {
        super.h0();
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.q0(this.f8450n);
            if (!mVar.f8456t) {
                mVar.h0();
            }
        }
    }

    @Override // y0.m
    public final void i0() {
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.i0();
        }
        super.i0();
    }

    @Override // y0.m
    public final void m0() {
        super.m0();
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.m0();
        }
    }

    @Override // y0.m
    public final void n0() {
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.n0();
        }
        super.n0();
    }

    @Override // y0.m
    public final void o0() {
        super.o0();
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.o0();
        }
    }

    @Override // y0.m
    public final void p0(y0.m mVar) {
        this.f8443g = mVar;
        for (y0.m mVar2 = this.f8110v; mVar2 != null; mVar2 = mVar2.f8448l) {
            mVar2.p0(mVar);
        }
    }

    @Override // y0.m
    public final void q0(f1 f1Var) {
        this.f8450n = f1Var;
        for (y0.m mVar = this.f8110v; mVar != null; mVar = mVar.f8448l) {
            mVar.q0(f1Var);
        }
    }

    public final void r0(l lVar) {
        y0.m mVar = ((y0.m) lVar).f8443g;
        if (mVar != lVar) {
            y0.m mVar2 = lVar instanceof y0.m ? (y0.m) lVar : null;
            y0.m mVar3 = mVar2 != null ? mVar2.f8447k : null;
            if (mVar != this.f8443g || !pc.j.a(mVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (mVar.f8456t) {
            u1.a.b("Cannot delegate to an already attached node");
        }
        mVar.p0(this.f8443g);
        int i10 = this.f8445i;
        int f10 = g1.f(mVar);
        mVar.f8445i = f10;
        int i11 = this.f8445i;
        int i12 = f10 & 2;
        if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof w)) {
            u1.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + mVar);
        }
        mVar.f8448l = this.f8110v;
        this.f8110v = mVar;
        mVar.f8447k = this;
        t0(f10 | this.f8445i, false);
        if (this.f8456t) {
            if (i12 == 0 || (i10 & 2) != 0) {
                q0(this.f8450n);
            } else {
                c1 c1Var = f.v(this).I;
                this.f8443g.q0(null);
                c1Var.g();
            }
            mVar.h0();
            mVar.n0();
            if (!mVar.f8456t) {
                u1.a.b("autoInvalidateInsertedNode called on unattached node");
            }
            g1.a(mVar, -1, 1);
        }
    }

    public final void s0(l lVar) {
        y0.m mVar = null;
        for (y0.m mVar2 = this.f8110v; mVar2 != null; mVar2 = mVar2.f8448l) {
            if (mVar2 == lVar) {
                boolean z10 = mVar2.f8456t;
                if (z10) {
                    s.z zVar = g1.f8061a;
                    if (!z10) {
                        u1.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g1.a(mVar2, -1, 2);
                    mVar2.o0();
                    mVar2.i0();
                }
                mVar2.p0(mVar2);
                mVar2.f8446j = 0;
                if (mVar == null) {
                    this.f8110v = mVar2.f8448l;
                } else {
                    mVar.f8448l = mVar2.f8448l;
                }
                mVar2.f8448l = null;
                mVar2.f8447k = null;
                int i10 = this.f8445i;
                int f10 = g1.f(this);
                t0(f10, true);
                if (this.f8456t && (i10 & 2) != 0 && (f10 & 2) == 0) {
                    c1 c1Var = f.v(this).I;
                    this.f8443g.q0(null);
                    c1Var.g();
                    return;
                }
                return;
            }
            mVar = mVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + lVar).toString());
    }

    public final void t0(int i10, boolean z10) {
        y0.m mVar;
        int i11 = this.f8445i;
        this.f8445i = i10;
        if (i11 != i10) {
            y0.m mVar2 = this.f8443g;
            if (mVar2 == this) {
                this.f8446j = i10;
            }
            if (this.f8456t) {
                y0.m mVar3 = this;
                while (mVar3 != null) {
                    i10 |= mVar3.f8445i;
                    mVar3.f8445i = i10;
                    if (mVar3 == mVar2) {
                        break;
                    } else {
                        mVar3 = mVar3.f8447k;
                    }
                }
                if (z10 && mVar3 == mVar2) {
                    i10 = g1.f(mVar2);
                    mVar2.f8445i = i10;
                }
                int i12 = i10 | ((mVar3 == null || (mVar = mVar3.f8448l) == null) ? 0 : mVar.f8446j);
                while (mVar3 != null) {
                    i12 |= mVar3.f8445i;
                    mVar3.f8446j = i12;
                    mVar3 = mVar3.f8447k;
                }
            }
        }
    }
}
