package com.gamericefishpro.space.v7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f7.j;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = iVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.i, aVar, 0);
            default:
                return new h(this.i, aVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        com.gamericefishpro.space.th.a aVar = null;
        i iVar = this.i;
        int i2 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                int i4 = 2;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    j jVar = iVar.d;
                    this.e = 1;
                    jVar.getClass();
                    com.gamericefishpro.space.wi.e eVar = k0.a;
                    obj = a0.D(com.gamericefishpro.space.wi.d.i, new com.gamericefishpro.space.f7.d(jVar, aVar, i4), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                iVar.e(new com.gamericefishpro.space.l7.g(2, ((Boolean) obj).booleanValue()));
                return Unit.a;
            default:
                Object obj2 = com.gamericefishpro.space.uh.a.d;
                int i5 = this.e;
                if (i5 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    j jVar2 = iVar.d;
                    this.e = 1;
                    jVar2.getClass();
                    com.gamericefishpro.space.wi.e eVar2 = k0.a;
                    Object objD = a0.D(com.gamericefishpro.space.wi.d.i, new com.gamericefishpro.space.f7.d(jVar2, aVar, i2), this);
                    if (objD != obj2) {
                        objD = Unit.a;
                    }
                    if (objD == obj2) {
                        return obj2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }
}
