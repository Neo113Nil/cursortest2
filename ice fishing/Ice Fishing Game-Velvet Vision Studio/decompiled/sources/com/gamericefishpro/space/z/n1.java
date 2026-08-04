package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ long A;
    public q1 d;
    public com.gamericefishpro.space.ei.z e;
    public long i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ q1 y;
    public final /* synthetic */ com.gamericefishpro.space.ei.z z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(q1 q1Var, com.gamericefishpro.space.ei.z zVar, long j, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.y = q1Var;
        this.z = zVar;
        this.A = j;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        n1 n1Var = new n1(this.y, this.z, this.A, aVar);
        n1Var.w = obj;
        return n1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n1) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        q1 q1Var;
        com.gamericefishpro.space.ei.z zVar;
        long j;
        q1 q1Var2;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.v;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            o1 o1Var = (o1) this.w;
            q1Var = this.y;
            m1 m1Var = new m1(q1Var, o1Var);
            k kVar = q1Var.c;
            zVar = this.z;
            long j2 = zVar.d;
            v0 v0Var = q1Var.d;
            v0 v0Var2 = v0.e;
            long j3 = this.A;
            float fD = q1Var.d(v0Var == v0Var2 ? com.gamericefishpro.space.c3.p.b(j3) : com.gamericefishpro.space.c3.p.c(j3));
            this.w = q1Var;
            this.d = q1Var;
            this.e = zVar;
            this.i = j2;
            this.v = 1;
            kVar.getClass();
            obj = com.gamericefishpro.space.pi.a0.D(kVar.b, new j(fD, kVar, m1Var, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j = j2;
            q1Var2 = q1Var;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.i;
            zVar = this.e;
            q1Var = this.d;
            q1Var2 = (q1) this.w;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        float fD2 = q1Var2.d(((Number) obj).floatValue());
        zVar.d = q1Var.d == v0.e ? com.gamericefishpro.space.c3.p.a(j, fD2, 0.0f, 2) : com.gamericefishpro.space.c3.p.a(j, 0.0f, fD2, 1);
        return Unit.a;
    }
}
