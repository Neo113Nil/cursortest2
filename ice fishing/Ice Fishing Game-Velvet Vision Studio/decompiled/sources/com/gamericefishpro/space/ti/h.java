package com.gamericefishpro.space.ti;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.s5.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d = 1;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ j v;
    public final /* synthetic */ com.gamericefishpro.space.si.f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = jVar;
        this.w = fVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.v, this.w, this.i, aVar);
            default:
                h hVar = new h(this.v, this.w, aVar);
                hVar.i = obj;
                return hVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.gamericefishpro.space.di.c, com.gamericefishpro.space.vh.i] */
    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    ?? r8 = this.v.w;
                    Object obj2 = this.i;
                    this.e = 1;
                    if (r8.a(this.w, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.pi.x xVar = (com.gamericefishpro.space.pi.x) this.i;
                    a0 a0Var = new a0();
                    j jVar = this.v;
                    com.gamericefishpro.space.si.e eVar = jVar.v;
                    d0 d0Var = new d0(a0Var, xVar, jVar, this.w);
                    this.e = 1;
                    if (eVar.a(d0Var, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, com.gamericefishpro.space.si.f fVar, Object obj, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = jVar;
        this.w = fVar;
        this.i = obj;
    }
}
