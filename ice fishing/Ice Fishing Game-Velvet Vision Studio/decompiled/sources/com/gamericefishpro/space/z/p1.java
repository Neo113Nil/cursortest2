package com.gamericefishpro.space.z;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends com.gamericefishpro.space.vh.i implements Function2 {
    public long d;
    public int e;
    public /* synthetic */ long i;
    public final /* synthetic */ q1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = q1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        p1 p1Var = new p1(this.v, aVar);
        p1Var.i = ((com.gamericefishpro.space.c3.p) obj).a;
        return p1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((com.gamericefishpro.space.c3.p) obj).a;
        p1 p1Var = new p1(this.v, (com.gamericefishpro.space.th.a) obj2);
        p1Var.i = j;
        return p1Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i = this.e;
        q1 q1Var = this.v;
        if (i == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            j = this.i;
            com.gamericefishpro.space.a2.e eVar = q1Var.f;
            this.i = j;
            this.e = 1;
            obj = eVar.b(j, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i == 1) {
            j = this.i;
            com.gamericefishpro.space.wa.b.P(obj);
        } else {
            if (i == 2) {
                j2 = this.d;
                j = this.i;
                com.gamericefishpro.space.wa.b.P(obj);
                j3 = ((com.gamericefishpro.space.c3.p) obj).a;
                com.gamericefishpro.space.a2.e eVar2 = q1Var.f;
                long jD = com.gamericefishpro.space.c3.p.d(j2, j3);
                this.i = j;
                this.d = j3;
                this.e = 3;
                obj = eVar2.a(jD, j3, this);
                if (obj != aVar) {
                    j4 = j;
                    j5 = j3;
                }
                return aVar;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.d;
            j4 = this.i;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return new com.gamericefishpro.space.c3.p(com.gamericefishpro.space.c3.p.d(j4, com.gamericefishpro.space.c3.p.d(j5, ((com.gamericefishpro.space.c3.p) obj).a)));
        long jD2 = com.gamericefishpro.space.c3.p.d(j, ((com.gamericefishpro.space.c3.p) obj).a);
        this.i = j;
        this.d = jD2;
        this.e = 2;
        obj = q1Var.a(jD2, this);
        if (obj != aVar) {
            j2 = jD2;
            j3 = ((com.gamericefishpro.space.c3.p) obj).a;
            com.gamericefishpro.space.a2.e eVar3 = q1Var.f;
            long jD3 = com.gamericefishpro.space.c3.p.d(j2, j3);
            this.i = j;
            this.d = j3;
            this.e = 3;
            obj = eVar3.a(jD3, j3, this);
            if (obj != aVar) {
                j4 = j;
                j5 = j3;
                return new com.gamericefishpro.space.c3.p(com.gamericefishpro.space.c3.p.d(j4, com.gamericefishpro.space.c3.p.d(j5, ((com.gamericefishpro.space.c3.p) obj).a)));
            }
        }
        return aVar;
    }
}
