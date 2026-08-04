package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.z.o1;
import com.gamericefishpro.space.z.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ long i;
    public Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, long j, Object obj2, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.w = obj;
        this.i = j;
        this.y = obj2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d((com.gamericefishpro.space.pi.d1) this.w, this.i, (com.gamericefishpro.space.b0.i) this.y, aVar, 0);
            default:
                d dVar = new d((q1) this.w, this.i, (com.gamericefishpro.space.ei.x) this.y, aVar, 1);
                dVar.v = obj;
                return dVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((d) create((com.gamericefishpro.space.pi.x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((d) create((o1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        com.gamericefishpro.space.b0.l lVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.b0.i iVar = (com.gamericefishpro.space.b0.i) this.y;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i != 0) {
                    if (i == 1) {
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else if (i == 2) {
                        lVar = (com.gamericefishpro.space.b0.l) this.v;
                        com.gamericefishpro.space.wa.b.P(obj);
                        this.v = null;
                        this.e = 3;
                        if (iVar.a(lVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.pi.d1 d1Var = (com.gamericefishpro.space.pi.d1) this.w;
                this.e = 1;
                if (d1Var.y(this) == aVar) {
                    return aVar;
                }
                com.gamericefishpro.space.b0.k kVar = new com.gamericefishpro.space.b0.k(this.i);
                lVar = new com.gamericefishpro.space.b0.l(kVar);
                this.v = lVar;
                this.e = 2;
                if (iVar.a(kVar, this) == aVar) {
                    return aVar;
                }
                this.v = null;
                this.e = 3;
                if (iVar.a(lVar, this) == aVar) {
                    return aVar;
                }
                return Unit.a;
            default:
                q1 q1Var = (q1) this.w;
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    o1 o1Var = (o1) this.v;
                    float fG = q1Var.g(this.i);
                    com.gamericefishpro.space.d0.x xVar = new com.gamericefishpro.space.d0.x((com.gamericefishpro.space.ei.x) this.y, q1Var, o1Var, 5);
                    this.e = 1;
                    if (com.gamericefishpro.space.w.c.d(0.0f, fG, null, xVar, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }
}
