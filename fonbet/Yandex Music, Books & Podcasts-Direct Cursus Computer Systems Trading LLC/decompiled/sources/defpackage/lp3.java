package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class lp3 extends xci implements ekj, nj3, ipa {
    public final np3 o;
    public boolean p;
    public Function1 q;

    public lp3(np3 np3Var, Function1 function1) {
        this.o = np3Var;
        this.q = function1;
        np3Var.a = this;
    }

    @Override // defpackage.sv7
    public final void A() {
        S0();
    }

    @Override // defpackage.ekj
    public final void J() {
        S0();
    }

    public final void S0() {
        this.p = false;
        this.o.b = null;
        vq1.Z(this);
    }

    @Override // defpackage.sv7, defpackage.ofm
    public final void a() {
        S0();
    }

    @Override // defpackage.ipa
    public final void b0() {
        S0();
    }

    @Override // defpackage.nj3
    public final long e() {
        return nt0.Q(bcx.D(this, 128).c);
    }

    @Override // defpackage.nj3
    public final jx7 getDensity() {
        return bcx.F(this).y;
    }

    @Override // defpackage.nj3
    public final xof getLayoutDirection() {
        return bcx.F(this).z;
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        boolean z = this.p;
        np3 np3Var = this.o;
        if (!z) {
            np3Var.b = null;
            neg.y(this, new ha0(21, this, np3Var));
            if (np3Var.b == null) {
                throw ouj.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        ix6 ix6Var = np3Var.b;
        ix6Var.getClass();
        ((Function1) ix6Var.b).invoke(opfVar);
    }

    @Override // defpackage.xci
    public final void L0() {
    }
}
