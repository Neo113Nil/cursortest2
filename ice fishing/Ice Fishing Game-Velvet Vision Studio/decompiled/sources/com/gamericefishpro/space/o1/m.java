package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v, x1 {
    public Function1 H;

    public m(Function1 function1) {
        this.H = function1;
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        u0 u0VarE = k0Var.e(j);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.b2.t(10, u0VarE, this));
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        boolean z;
        k0 k0Var;
        f1 f1VarQ = com.gamericefishpro.space.h2.k.q(this, 2);
        if (f1VarQ.Y) {
            k0 k0Var2 = f1VarQ.W;
            z = f1VarQ.X;
            k0Var = k0Var2;
        } else {
            h0 h0Var = o.a;
            if (h0Var == null) {
                o.a = new h0();
            } else {
                h0Var.a();
            }
            h0 h0Var2 = o.a;
            Intrinsics.b(h0Var2);
            h0Var2.F = f1VarQ.H.S;
            h0Var2.E = com.gamericefishpro.space.d9.h.Q(f1VarQ.i);
            com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
            Function1 function1E = gVarE != null ? gVarE.e() : null;
            com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
            try {
                this.H.invoke(h0Var2);
                Unit unit = Unit.a;
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                k0Var = h0Var2.C;
                z = h0Var2.D;
            } catch (Throwable th) {
                com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
                throw th;
            }
        }
        if (z) {
            com.gamericefishpro.space.o2.u.b(wVar, k0Var);
        }
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final boolean d() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.H + ')';
    }
}
