package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class opf implements jpa {
    public final ou3 a = new ou3();
    public ipa b;

    @Override // defpackage.jx7
    public final long B0(long j) {
        return this.a.B0(j);
    }

    @Override // defpackage.jpa
    public final void F0(ai3 ai3Var, long j, long j2, float f, kpa kpaVar, m85 m85Var, int i) {
        this.a.F0(ai3Var, j, j2, f, kpaVar, m85Var, i);
    }

    @Override // defpackage.jpa
    public final void H(long j, long j2, long j3, long j4, kpa kpaVar) {
        this.a.H(j, j2, j3, j4, kpaVar);
    }

    @Override // defpackage.jpa
    public final void I(ltp ltpVar, float f, long j, float f2, kpa kpaVar) {
        this.a.I(ltpVar, f, j, f2, kpaVar);
    }

    @Override // defpackage.jx7
    public final int L(float f) {
        return this.a.L(f);
    }

    @Override // defpackage.jx7
    public final float N(long j) {
        return this.a.N(j);
    }

    @Override // defpackage.jpa
    public final void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, kpa kpaVar) {
        this.a.V(j, f, f2, z, j2, j3, f3, kpaVar);
    }

    public final void a() {
        ou3 ou3Var = this.a;
        mu3 s = ou3Var.b.s();
        sv7 sv7Var = this.b;
        if (sv7Var == null) {
            throw ouj.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        xci xciVar = (xci) sv7Var;
        xci xciVar2 = xciVar.a.f;
        if (xciVar2 != null && (xciVar2.d & 4) != 0) {
            while (xciVar2 != null) {
                int i = xciVar2.c;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    xciVar2 = xciVar2.f;
                }
            }
        }
        xciVar2 = null;
        if (xciVar2 == null) {
            f8j D = bcx.D(sv7Var, 4);
            if (D.b1() == xciVar.a) {
                D = D.m;
                D.getClass();
            }
            D.q1(s, (xod) ou3Var.b.c);
            return;
        }
        eqi eqiVar = null;
        while (xciVar2 != null) {
            if (xciVar2 instanceof ipa) {
                ipa ipaVar = (ipa) xciVar2;
                xod xodVar = (xod) ou3Var.b.c;
                f8j D2 = bcx.D(ipaVar, 4);
                long Q = nt0.Q(D2.c);
                mpf mpfVar = D2.l;
                mpfVar.getClass();
                ppf.a(mpfVar).getSharedDrawScope().b(s, Q, D2, ipaVar, xodVar);
            } else if ((xciVar2.c & 4) != 0 && (xciVar2 instanceof cw7)) {
                int i2 = 0;
                for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                    if ((xciVar3.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            xciVar2 = xciVar3;
                        } else {
                            if (eqiVar == null) {
                                eqiVar = new eqi(new xci[16]);
                            }
                            if (xciVar2 != null) {
                                eqiVar.d(xciVar2);
                                xciVar2 = null;
                            }
                            eqiVar.d(xciVar3);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            xciVar2 = bcx.p(eqiVar);
        }
    }

    public final void b(mu3 mu3Var, long j, f8j f8jVar, ipa ipaVar, xod xodVar) {
        ipa ipaVar2 = this.b;
        this.b = ipaVar;
        xof xofVar = f8jVar.l.z;
        ou3 ou3Var = this.a;
        jx7 y = ou3Var.b.y();
        nsh nshVar = ou3Var.b;
        xof A = nshVar.A();
        mu3 s = nshVar.s();
        long B = nshVar.B();
        xod xodVar2 = (xod) nshVar.c;
        nshVar.O(f8jVar);
        nshVar.P(xofVar);
        nshVar.M(mu3Var);
        nshVar.R(j);
        nshVar.c = xodVar;
        mu3Var.r();
        try {
            ipaVar.t0(this);
            mu3Var.k();
            nshVar.O(y);
            nshVar.P(A);
            nshVar.M(s);
            nshVar.R(B);
            nshVar.c = xodVar2;
            this.b = ipaVar2;
        } catch (Throwable th) {
            mu3Var.k();
            nshVar.O(y);
            nshVar.P(A);
            nshVar.M(s);
            nshVar.R(B);
            nshVar.c = xodVar2;
            throw th;
        }
    }

    public final void c(long j, xod xodVar, Function1 function1) {
        xodVar.g(this, getLayoutDirection(), j, new lma(9, this, this.b, function1));
    }

    @Override // defpackage.jx7
    public final float c0(int i) {
        return this.a.c0(i);
    }

    @Override // defpackage.jx7
    public final float d0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.jpa
    public final long e() {
        return this.a.e();
    }

    @Override // defpackage.jpa
    public final void e0(eak eakVar, ai3 ai3Var, float f, kpa kpaVar, int i) {
        this.a.e0(eakVar, ai3Var, f, kpaVar, i);
    }

    @Override // defpackage.jpa
    public final void f(eak eakVar, long j, float f, kpa kpaVar) {
        this.a.f(eakVar, j, f, kpaVar);
    }

    @Override // defpackage.jpa
    public final void g0(long j, float f, long j2, float f2, kpa kpaVar, int i) {
        this.a.g0(j, f, j2, f2, kpaVar, i);
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.jpa
    public final xof getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.jpa
    public final void h0(yg0 yg0Var, long j, long j2, long j3, long j4, float f, m85 m85Var, int i) {
        this.a.h0(yg0Var, j, j2, j3, j4, f, m85Var, i);
    }

    @Override // defpackage.jx7
    public final float i0() {
        return this.a.i0();
    }

    @Override // defpackage.jpa
    public final void k0(o6g o6gVar, long j, long j2, kpa kpaVar) {
        this.a.k0(o6gVar, j, j2, kpaVar);
    }

    @Override // defpackage.jx7
    public final long l(float f) {
        return this.a.l(f);
    }

    @Override // defpackage.jpa
    public final void l0(ai3 ai3Var, long j, long j2, long j3, float f, kpa kpaVar) {
        this.a.l0(ai3Var, j, j2, j3, f, kpaVar);
    }

    @Override // defpackage.jx7
    public final long m(long j) {
        return this.a.m(j);
    }

    @Override // defpackage.jx7
    public final float n0(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.jx7
    public final float p(long j) {
        return this.a.p(j);
    }

    @Override // defpackage.jpa
    public final nsh q0() {
        return this.a.b;
    }

    @Override // defpackage.jpa
    public final void s(long j, long j2, long j3, float f, int i) {
        this.a.s(j, j2, j3, f, i);
    }

    @Override // defpackage.jx7
    public final int s0(long j) {
        return this.a.s0(j);
    }

    @Override // defpackage.jpa
    public final void u0(ArrayList arrayList, long j, float f) {
        this.a.u0(arrayList, j, f);
    }

    @Override // defpackage.jpa
    public final void v0(long j, long j2, long j3, float f, kpa kpaVar, m85 m85Var, int i) {
        this.a.v0(j, j2, j3, f, kpaVar, m85Var, i);
    }

    @Override // defpackage.jx7
    public final long w(float f) {
        return this.a.w(f);
    }

    @Override // defpackage.jpa
    public final long y0() {
        return this.a.y0();
    }
}
