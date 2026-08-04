package com.gamericefishpro.space.h2;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends n0 implements com.gamericefishpro.space.f2.k0 {
    public final f1 H;
    public LinkedHashMap J;
    public com.gamericefishpro.space.f2.m0 L;
    public final com.gamericefishpro.space.t.c0 M;
    public long I = 0;
    public final com.gamericefishpro.space.f2.j0 K = new com.gamericefishpro.space.f2.j0(this);

    public o0(f1 f1Var) {
        this.H = f1Var;
        com.gamericefishpro.space.t.c0 c0Var = com.gamericefishpro.space.t.m0.a;
        this.M = new com.gamericefishpro.space.t.c0();
    }

    public static final void z0(o0 o0Var, com.gamericefishpro.space.f2.m0 m0Var) {
        LinkedHashMap linkedHashMap;
        if (m0Var != null) {
            o0Var.c0((((long) m0Var.c()) & 4294967295L) | (((long) m0Var.e()) << 32));
        } else {
            o0Var.c0(0L);
        }
        if (!Intrinsics.a(o0Var.L, m0Var) && m0Var != null && ((((linkedHashMap = o0Var.J) != null && !linkedHashMap.isEmpty()) || !m0Var.a().isEmpty()) && !Intrinsics.a(m0Var.a(), o0Var.J))) {
            r0 r0Var = o0Var.H.H.a0.q;
            Intrinsics.b(r0Var);
            r0Var.J.f();
            LinkedHashMap linkedHashMap2 = o0Var.J;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o0Var.J = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(m0Var.a());
        }
        o0Var.L = m0Var;
    }

    public void A0() {
        s0().b();
    }

    public final void B0(long j) {
        if (!com.gamericefishpro.space.c3.i.a(this.I, j)) {
            this.I = j;
            f1 f1Var = this.H;
            r0 r0Var = f1Var.H.a0.q;
            if (r0Var != null) {
                r0Var.k0();
            }
            n0.w0(f1Var);
        }
        if (this.D) {
            return;
        }
        k0(s0());
    }

    public final long C0(o0 o0Var, boolean z) {
        long jC = 0;
        o0 o0VarI0 = this;
        while (!o0VarI0.equals(o0Var)) {
            if (!o0VarI0.B || !z) {
                jC = com.gamericefishpro.space.c3.i.c(jC, o0VarI0.I);
            }
            f1 f1Var = o0VarI0.H.J;
            Intrinsics.b(f1Var);
            o0VarI0 = f1Var.I0();
            Intrinsics.b(o0VarI0);
        }
        return jC;
    }

    @Override // com.gamericefishpro.space.f2.u0
    public final void a0(long j, float f, Function1 function1) {
        B0(j);
        if (this.C) {
            return;
        }
        A0();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.H.b();
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.H.g();
    }

    @Override // com.gamericefishpro.space.f2.p
    public final com.gamericefishpro.space.c3.l getLayoutDirection() {
        return this.H.H.T;
    }

    @Override // com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.f2.k0
    public final Object i() {
        return this.H.i();
    }

    @Override // com.gamericefishpro.space.h2.n0, com.gamericefishpro.space.f2.p
    public final boolean n() {
        return true;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final n0 o0() {
        f1 f1Var = this.H.I;
        if (f1Var != null) {
            return f1Var.I0();
        }
        return null;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final com.gamericefishpro.space.f2.u p0() {
        return this.K;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final boolean q0() {
        return this.L != null;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final f0 r0() {
        return this.H.H;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final com.gamericefishpro.space.f2.m0 s0() {
        com.gamericefishpro.space.f2.m0 m0Var = this.L;
        if (m0Var != null) {
            return m0Var;
        }
        throw com.gamericefishpro.space.m5.a.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final n0 t0() {
        f1 f1Var = this.H.J;
        if (f1Var != null) {
            return f1Var.I0();
        }
        return null;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final long u0() {
        return this.I;
    }

    @Override // com.gamericefishpro.space.h2.n0
    public final void y0() {
        a0(this.I, 0.0f, null);
    }
}
