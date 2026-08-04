package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d = 1;
    public int e;
    public final /* synthetic */ com.gamericefishpro.space.b0.i i;
    public final /* synthetic */ com.gamericefishpro.space.b0.k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.b0.k kVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.i = iVar;
        this.v = kVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new e(this.v, this.i, aVar);
            default:
                return new e(this.i, this.v, aVar);
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
        return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.b0.l lVar = new com.gamericefishpro.space.b0.l(this.v);
                    this.e = 1;
                    if (this.i.a(lVar, this) == aVar) {
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
                    this.e = 1;
                    if (this.i.a(this.v, this) == aVar2) {
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
    public e(com.gamericefishpro.space.b0.k kVar, com.gamericefishpro.space.b0.i iVar, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.v = kVar;
        this.i = iVar;
    }
}
