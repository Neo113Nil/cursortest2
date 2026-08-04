package com.gamericefishpro.space.w;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements e {
    public final com.gamericefishpro.space.tb.s a;
    public final com.gamericefishpro.space.u6.l b;
    public final Object c;
    public final o d;
    public final o e;
    public final o f;
    public final Object g;
    public final long h;

    public q(r rVar, com.gamericefishpro.space.u6.l lVar, Object obj, o oVar) {
        com.gamericefishpro.space.tb.u uVar = rVar.a;
        com.gamericefishpro.space.tb.s sVar = new com.gamericefishpro.space.tb.s();
        sVar.d = uVar;
        this.a = sVar;
        this.b = lVar;
        this.c = obj;
        o oVar2 = (o) ((Function1) lVar.d).invoke(obj);
        this.d = oVar2;
        this.e = c.h(oVar);
        Function1 function1 = (Function1) lVar.e;
        if (((o) sVar.v) == null) {
            sVar.v = oVar2.c();
        }
        o oVar3 = (o) sVar.v;
        if (oVar3 == null) {
            Intrinsics.h("targetVector");
            throw null;
        }
        int iB = oVar3.b();
        int i = 0;
        while (i < iB) {
            o oVar4 = (o) sVar.v;
            if (oVar4 == null) {
                Intrinsics.h("targetVector");
                throw null;
            }
            com.gamericefishpro.space.tb.u uVar2 = (com.gamericefishpro.space.tb.u) sVar.d;
            float fA = oVar2.a(i);
            float fA2 = oVar.a(i);
            com.gamericefishpro.space.r4.d dVar = (com.gamericefishpro.space.r4.d) uVar2.e;
            double dB = dVar.b(fA2);
            double d = com.gamericefishpro.space.v.n0.a;
            int i2 = i;
            oVar4.e(i2, (Math.signum(fA2) * ((float) (Math.exp((d / (d - 1.0d)) * dB) * ((double) (dVar.a * dVar.b))))) + fA);
            i = i2 + 1;
        }
        o oVar5 = (o) sVar.v;
        if (oVar5 == null) {
            Intrinsics.h("targetVector");
            throw null;
        }
        this.g = function1.invoke(oVar5);
        com.gamericefishpro.space.tb.s sVar2 = this.a;
        o oVar6 = this.d;
        if (((o) sVar2.i) == null) {
            sVar2.i = oVar6.c();
        }
        o oVar7 = (o) sVar2.i;
        if (oVar7 == null) {
            Intrinsics.h("velocityVector");
            throw null;
        }
        int iB2 = oVar7.b();
        long jMax = 0;
        for (int i3 = 0; i3 < iB2; i3++) {
            com.gamericefishpro.space.tb.u uVar3 = (com.gamericefishpro.space.tb.u) sVar2.d;
            oVar6.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((com.gamericefishpro.space.r4.d) uVar3.e).b(oVar.a(i3)) / (((double) com.gamericefishpro.space.v.n0.a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.h = jMax;
        o oVarH = c.h(this.a.g(jMax, this.d, oVar));
        this.f = oVarH;
        int iB3 = oVarH.b();
        for (int i4 = 0; i4 < iB3; i4++) {
            o oVar8 = this.f;
            float fA3 = oVar8.a(i4);
            this.a.getClass();
            this.a.getClass();
            oVar8.e(i4, com.gamericefishpro.space.ji.f.b(fA3, -0.0f, 0.0f));
        }
    }

    @Override // com.gamericefishpro.space.w.e
    public final boolean a() {
        return false;
    }

    @Override // com.gamericefishpro.space.w.e
    public final Object b(long j) {
        if (g(j)) {
            return this.g;
        }
        Function1 function1 = (Function1) this.b.e;
        com.gamericefishpro.space.tb.s sVar = this.a;
        o oVar = (o) sVar.e;
        o oVar2 = this.d;
        if (oVar == null) {
            sVar.e = oVar2.c();
        }
        o oVar3 = (o) sVar.e;
        if (oVar3 == null) {
            Intrinsics.h("valueVector");
            throw null;
        }
        int iB = oVar3.b();
        for (int i = 0; i < iB; i++) {
            o oVar4 = (o) sVar.e;
            if (oVar4 == null) {
                Intrinsics.h("valueVector");
                throw null;
            }
            com.gamericefishpro.space.tb.u uVar = (com.gamericefishpro.space.tb.u) sVar.d;
            float fA = oVar2.a(i);
            long j2 = j / 1000000;
            com.gamericefishpro.space.v.m0 m0VarA = ((com.gamericefishpro.space.r4.d) uVar.e).a(this.e.a(i));
            long j3 = m0VarA.c;
            oVar4.e(i, (Math.signum(m0VarA.a) * m0VarA.b * com.gamericefishpro.space.v.b.a(j3 > 0 ? j2 / j3 : 1.0f).a) + fA);
        }
        o oVar5 = (o) sVar.e;
        if (oVar5 != null) {
            return function1.invoke(oVar5);
        }
        Intrinsics.h("valueVector");
        throw null;
    }

    @Override // com.gamericefishpro.space.w.e
    public final long c() {
        return this.h;
    }

    @Override // com.gamericefishpro.space.w.e
    public final com.gamericefishpro.space.u6.l d() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.w.e
    public final Object e() {
        return this.g;
    }

    @Override // com.gamericefishpro.space.w.e
    public final o f(long j) {
        if (g(j)) {
            return this.f;
        }
        return this.a.g(j, this.d, this.e);
    }
}
