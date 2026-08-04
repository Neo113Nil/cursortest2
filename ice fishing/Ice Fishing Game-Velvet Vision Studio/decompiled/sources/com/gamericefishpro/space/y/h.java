package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(z zVar, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.e = zVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.e, aVar, 0);
            default:
                return new h(this.e, aVar, 1);
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

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        com.gamericefishpro.space.th.a aVar = null;
        z zVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                if (zVar.S == null) {
                    com.gamericefishpro.space.b0.f fVar = new com.gamericefishpro.space.b0.f();
                    com.gamericefishpro.space.b0.i iVar = zVar.J;
                    if (iVar != null) {
                        com.gamericefishpro.space.pi.a0.u(zVar.o0(), null, new com.gamericefishpro.space.b0.o(iVar, fVar, aVar, 26), 3);
                    }
                    zVar.S = fVar;
                }
                break;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.b0.f fVar2 = zVar.S;
                if (fVar2 != null) {
                    com.gamericefishpro.space.b0.g gVar = new com.gamericefishpro.space.b0.g(fVar2);
                    com.gamericefishpro.space.b0.i iVar2 = zVar.J;
                    if (iVar2 != null) {
                        com.gamericefishpro.space.pi.a0.u(zVar.o0(), null, new com.gamericefishpro.space.b0.o(iVar2, gVar, aVar, 27), 3);
                    }
                    zVar.S = null;
                }
                break;
        }
        return Unit.a;
    }
}
