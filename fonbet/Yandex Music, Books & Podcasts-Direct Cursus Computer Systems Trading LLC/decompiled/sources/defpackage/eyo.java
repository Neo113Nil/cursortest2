package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eyo extends cw7 implements yr5, ekj {
    public sv7 A;
    public rg0 B;
    public qg0 C;
    public boolean D;
    public mxo q;
    public bxj r;
    public boolean s;
    public boolean t;
    public jic u;
    public uoi v;
    public sh3 w;
    public boolean x;
    public qg0 y;
    public lxo z;

    @Override // defpackage.sv7
    public final void A() {
        boolean W0 = W0();
        if (this.D != W0) {
            this.D = W0;
            mxo mxoVar = this.q;
            bxj bxjVar = this.r;
            boolean z = this.x;
            qg0 qg0Var = z ? this.C : this.y;
            X0(qg0Var, this.w, this.u, this.v, bxjVar, mxoVar, z, this.s, this.t);
        }
    }

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.ekj
    public final void J() {
        rg0 rg0Var = (rg0) men.t(this, lzj.a);
        if (Intrinsics.d(rg0Var, this.B)) {
            return;
        }
        this.B = rg0Var;
        this.C = null;
        sv7 sv7Var = this.A;
        if (sv7Var != null) {
            T0(sv7Var);
        }
        this.A = null;
        V0();
        lxo lxoVar = this.z;
        if (lxoVar != null) {
            mxo mxoVar = this.q;
            bxj bxjVar = this.r;
            qg0 qg0Var = this.x ? this.C : this.y;
            lxoVar.e1(qg0Var, this.w, this.u, this.v, bxjVar, mxoVar, this.s, this.D);
        }
    }

    @Override // defpackage.xci
    public final void K0() {
        this.D = W0();
        V0();
        if (this.z == null) {
            mxo mxoVar = this.q;
            qg0 qg0Var = this.x ? this.C : this.y;
            lxo lxoVar = new lxo(qg0Var, this.w, this.u, this.v, this.r, mxoVar, this.s, this.D);
            S0(lxoVar);
            this.z = lxoVar;
        }
    }

    @Override // defpackage.xci
    public final void L0() {
        sv7 sv7Var = this.A;
        if (sv7Var != null) {
            T0(sv7Var);
        }
    }

    public final void V0() {
        sv7 sv7Var = this.A;
        if (sv7Var != null) {
            if (((xci) sv7Var).a.n) {
                return;
            }
            S0(sv7Var);
            return;
        }
        if (this.x) {
            neg.y(this, new kgk(16, this));
        }
        qg0 qg0Var = this.x ? this.C : this.y;
        if (qg0Var != null) {
            cw7 cw7Var = qg0Var.i;
            if (cw7Var.a.n) {
                return;
            }
            S0(cw7Var);
            this.A = cw7Var;
        }
    }

    public final boolean W0() {
        xof xofVar = xof.a;
        if (this.n) {
            xofVar = bcx.F(this).z;
        }
        bxj bxjVar = this.r;
        boolean z = this.t;
        return (xofVar != xof.b || bxjVar == bxj.a) ? !z : z;
    }

    public final void X0(qg0 qg0Var, sh3 sh3Var, jic jicVar, uoi uoiVar, bxj bxjVar, mxo mxoVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        this.q = mxoVar;
        this.r = bxjVar;
        boolean z5 = true;
        if (this.x != z) {
            this.x = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (Intrinsics.d(this.y, qg0Var)) {
            z5 = false;
        } else {
            this.y = qg0Var;
        }
        if (z4 || (z5 && !z)) {
            sv7 sv7Var = this.A;
            if (sv7Var != null) {
                T0(sv7Var);
            }
            this.A = null;
            V0();
        }
        this.s = z2;
        this.t = z3;
        this.u = jicVar;
        this.v = uoiVar;
        this.w = sh3Var;
        boolean W0 = W0();
        this.D = W0;
        lxo lxoVar = this.z;
        if (lxoVar != null) {
            lxoVar.e1(this.x ? this.C : this.y, sh3Var, jicVar, uoiVar, bxjVar, mxoVar, z2, W0);
        }
    }
}
