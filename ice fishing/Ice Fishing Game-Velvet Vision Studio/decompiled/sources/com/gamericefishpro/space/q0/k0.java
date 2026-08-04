package com.gamericefishpro.space.q0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.gamericefishpro.space.i2.b1;
import com.gamericefishpro.space.t0.l1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.h1.m d;
    public final /* synthetic */ com.gamericefishpro.space.o1.k0 e;
    public final /* synthetic */ long i;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;
    public final /* synthetic */ com.gamericefishpro.space.b1.h y;

    public k0(com.gamericefishpro.space.h1.m mVar, com.gamericefishpro.space.o1.k0 k0Var, long j, float f, float f2, com.gamericefishpro.space.b1.h hVar) {
        this.d = mVar;
        this.e = k0Var;
        this.i = j;
        this.v = f;
        this.w = f2;
        this.y = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.h1.m mVarN;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            a aVar = (a) rVar.j(b.a);
            boolean zBooleanValue = ((Boolean) rVar.j(b.b)).booleanValue();
            long jH = aVar.p;
            long j = this.i;
            if (com.gamericefishpro.space.o1.s.d(j, jH) && zBooleanValue) {
                float f = this.v;
                if (!com.gamericefishpro.space.c3.f.b(f, 0)) {
                    jH = com.gamericefishpro.space.o1.o.h(com.gamericefishpro.space.o1.s.c(aVar.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), jH);
                }
            } else {
                jH = j;
            }
            float fR = ((com.gamericefishpro.space.c3.c) rVar.j(b1.h)).r(this.w);
            com.gamericefishpro.space.h1.j jVar = com.gamericefishpro.space.h1.j.a;
            com.gamericefishpro.space.o1.k0 k0Var = this.e;
            if (fR > 0.0f) {
                long j2 = com.gamericefishpro.space.o1.n0.b;
                long j3 = com.gamericefishpro.space.o1.x.a;
                mVarN = com.gamericefishpro.space.o1.o.n(jVar, 1.0f, 1.0f, fR, j2, k0Var, false, j3, j3);
            } else {
                mVarN = jVar;
            }
            com.gamericefishpro.space.h1.m mVarB = com.gamericefishpro.space.l1.h.b(com.gamericefishpro.space.y.q.e(this.d.c(mVarN).c(jVar), jH, k0Var), k0Var);
            Object objP = rVar.P();
            com.gamericefishpro.space.t0.f fVar = com.gamericefishpro.space.t0.n.a;
            if (objP == fVar) {
                objP = new com.gamericefishpro.space.j7.c(27);
                rVar.k0(objP);
            }
            AtomicInteger atomicInteger = com.gamericefishpro.space.o2.m.a;
            com.gamericefishpro.space.h1.m mVarC = mVarB.c(new com.gamericefishpro.space.o2.b((Function1) objP, false));
            Unit unit = Unit.a;
            Object objP2 = rVar.P();
            if (objP2 == fVar) {
                objP2 = j0.a;
                rVar.k0(objP2);
            }
            com.gamericefishpro.space.b2.h hVar = com.gamericefishpro.space.b2.b0.a;
            com.gamericefishpro.space.h1.m mVarC2 = mVarC.c(new com.gamericefishpro.space.b2.a0(unit, null, (PointerInputEventHandler) objP2, 6));
            com.gamericefishpro.space.f2.l0 l0VarD = com.gamericefishpro.space.d0.r.d(com.gamericefishpro.space.h1.b.d, true);
            int iHashCode = Long.hashCode(rVar.T);
            l1 l1VarL = rVar.l();
            com.gamericefishpro.space.h1.m mVarF = com.gamericefishpro.space.d9.h.F(mVarC2, rVar);
            com.gamericefishpro.space.h2.g.a.getClass();
            com.gamericefishpro.space.h2.y yVar = com.gamericefishpro.space.h2.f.b;
            rVar.d0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.n0();
            }
            com.gamericefishpro.space.t0.i.B(rVar, l0VarD, com.gamericefishpro.space.h2.f.e);
            com.gamericefishpro.space.t0.i.B(rVar, l1VarL, com.gamericefishpro.space.h2.f.d);
            com.gamericefishpro.space.h2.e eVar = com.gamericefishpro.space.h2.f.f;
            if (rVar.S || !Intrinsics.a(rVar.P(), Integer.valueOf(iHashCode))) {
                rVar.k0(Integer.valueOf(iHashCode));
                rVar.b(Integer.valueOf(iHashCode), eVar);
            }
            com.gamericefishpro.space.t0.i.B(rVar, mVarF, com.gamericefishpro.space.h2.f.c);
            this.y.invoke(rVar, 0);
            rVar.p(true);
        } else {
            rVar.V();
        }
        return Unit.a;
    }
}
