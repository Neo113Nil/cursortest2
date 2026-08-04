package com.gamericefishpro.space.c7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.l4.n0;
import com.gamericefishpro.space.l4.u0;
import com.gamericefishpro.space.si.g0;
import com.gamericefishpro.space.t0.r1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, int i2, com.gamericefishpro.space.th.a aVar) {
        super(i, aVar);
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                f fVar = new f(2, 0, aVar);
                fVar.e = obj;
                return fVar;
            case 1:
                f fVar2 = new f(2, 1, aVar);
                fVar2.e = obj;
                return fVar2;
            case 2:
                f fVar3 = new f(2, 2, aVar);
                fVar3.e = obj;
                return fVar3;
            default:
                f fVar4 = new f(2, 3, aVar);
                fVar4.e = obj;
                return fVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((f) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((f) create((u0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((f) create((g0) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((f) create((r1) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) this.e;
                com.gamericefishpro.space.p4.d dVar = a.a;
                bVar.e(a.d, new Integer(0));
                return Unit.a;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                return Boolean.valueOf(!(((u0) this.e) instanceof n0));
            case 2:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                return Boolean.valueOf(((g0) this.e) != g0.d);
            default:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                return Boolean.valueOf(((r1) this.e) == r1.d);
        }
    }
}
