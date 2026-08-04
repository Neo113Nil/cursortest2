package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ v0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Function2 function2, v0 v0Var, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = function2;
        this.w = v0Var;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o2 o2Var = new o2(this.v, this.w, aVar, 0);
                o2Var.i = obj;
                return o2Var;
            default:
                o2 o2Var2 = new o2(this.v, this.w, aVar, 1);
                o2Var2.i = obj;
                return o2Var2;
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
        return ((o2) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    n1 n1Var = new n1(this.w, ((com.gamericefishpro.space.pi.x) this.i).l());
                    this.e = 1;
                    if (this.v.invoke(n1Var, this) == aVar) {
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
                    n1 n1Var2 = new n1(this.w, ((com.gamericefishpro.space.pi.x) this.i).l());
                    this.e = 1;
                    if (this.v.invoke(n1Var2, this) == aVar2) {
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
