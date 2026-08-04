package com.gamericefishpro.space.z;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ Object i;
    public /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = 2;
        this.i = j1Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h1((j1) this.i, this.v, aVar, 0);
            case 1:
                return new h1((j1) this.i, this.v, aVar, 1);
            case 2:
                h1 h1Var = new h1((j1) this.i, aVar);
                h1Var.v = ((com.gamericefishpro.space.n1.b) obj).a;
                return h1Var;
            default:
                return new h1((com.gamericefishpro.space.f3.j) this.i, this.v, aVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((h1) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((h1) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                long j = ((com.gamericefishpro.space.n1.b) obj).a;
                h1 h1Var = new h1((j1) this.i, (com.gamericefishpro.space.th.a) obj2);
                h1Var.v = j;
                return h1Var.invokeSuspend(Unit.a);
            default:
                return ((h1) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    q1 q1Var = ((j1) this.i).g0;
                    com.gamericefishpro.space.y.r0 r0Var = com.gamericefishpro.space.y.r0.e;
                    g1 g1Var = new g1(this.v, null);
                    this.e = 1;
                    if (q1Var.f(r0Var, g1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    q1 q1Var2 = ((j1) this.i).g0;
                    long j = this.v;
                    this.e = 1;
                    if (q1Var2.b(j, true, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 2:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                long j2 = this.v;
                q1 q1Var3 = ((j1) this.i).g0;
                this.e = 1;
                Object objA = d1.a(q1Var3, j2, this);
                return objA == aVar3 ? aVar3 : objA;
            default:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i4 = this.e;
                if (i4 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.a2.e eVar = ((com.gamericefishpro.space.f3.j) this.i).d;
                    long j3 = this.v;
                    this.e = 1;
                    if (eVar.b(j3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, long j, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = obj;
        this.v = j;
    }
}
