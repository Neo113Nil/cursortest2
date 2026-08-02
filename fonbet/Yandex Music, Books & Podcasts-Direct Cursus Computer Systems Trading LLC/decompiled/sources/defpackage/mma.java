package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mma extends xci implements w9t, qof {
    public mma o;
    public mma p;
    public long q;

    @Override // defpackage.xci
    public final void L0() {
        this.p = null;
        this.o = null;
    }

    public final boolean S0() {
        mma mmaVar = this.o;
        if (mmaVar != null) {
            return mmaVar.S0();
        }
        mma mmaVar2 = this.p;
        if (mmaVar2 != null) {
            return mmaVar2.S0();
        }
        return false;
    }

    public final void T0() {
        mma mmaVar = this.p;
        if (mmaVar != null) {
            mmaVar.T0();
            return;
        }
        mma mmaVar2 = this.o;
        if (mmaVar2 != null) {
            mmaVar2.T0();
        }
    }

    public final void U0() {
        mma mmaVar = this.p;
        if (mmaVar != null) {
            mmaVar.U0();
        }
        mma mmaVar2 = this.o;
        if (mmaVar2 != null) {
            mmaVar2.U0();
        }
        this.o = null;
    }

    public final void V0(efo efoVar) {
        w9t w9tVar;
        mma mmaVar;
        mma mmaVar2 = this.o;
        if (mmaVar2 == null || !jf0.t(mmaVar2, nt0.E(efoVar))) {
            if (this.a.n) {
                xqn xqnVar = new xqn();
                q7g.V(this, new lma(0, xqnVar, this, efoVar));
                w9tVar = (w9t) xqnVar.a;
            } else {
                w9tVar = null;
            }
            mmaVar = (mma) w9tVar;
        } else {
            mmaVar = mmaVar2;
        }
        if (mmaVar != null && mmaVar2 == null) {
            mmaVar.T0();
            mmaVar.V0(efoVar);
            mma mmaVar3 = this.p;
            if (mmaVar3 != null) {
                mmaVar3.U0();
            }
        } else if (mmaVar == null && mmaVar2 != null) {
            mma mmaVar4 = this.p;
            if (mmaVar4 != null) {
                mmaVar4.T0();
                mmaVar4.V0(efoVar);
            }
            mmaVar2.U0();
        } else if (!Intrinsics.d(mmaVar, mmaVar2)) {
            if (mmaVar != null) {
                mmaVar.T0();
                mmaVar.V0(efoVar);
            }
            if (mmaVar2 != null) {
                mmaVar2.U0();
            }
        } else if (mmaVar != null) {
            mmaVar.V0(efoVar);
        } else {
            mma mmaVar5 = this.p;
            if (mmaVar5 != null) {
                mmaVar5.V0(efoVar);
            }
        }
        this.o = mmaVar;
    }

    public final void W0() {
        mma mmaVar = this.p;
        if (mmaVar != null) {
            mmaVar.W0();
            return;
        }
        mma mmaVar2 = this.o;
        if (mmaVar2 != null) {
            mmaVar2.W0();
        }
    }

    @Override // defpackage.w9t
    public final Object h() {
        return aaw.b;
    }

    @Override // defpackage.qof
    public final void j(long j) {
        this.q = j;
    }
}
