package com.gamericefishpro.space.c7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, int i2, com.gamericefishpro.space.th.a aVar) {
        super(2, aVar);
        this.d = i2;
        switch (i2) {
            case 1:
                super(i, aVar);
                break;
            default:
                this.e = i;
                break;
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = new b(this.e, 0, aVar);
                bVar.i = obj;
                return bVar;
            default:
                b bVar2 = new b(2, 1, aVar);
                bVar2.i = obj;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((b) create((com.gamericefishpro.space.p4.b) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((b) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        x xVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) this.i;
                com.gamericefishpro.space.p4.d dVar = a.a;
                com.gamericefishpro.space.p4.d dVar2 = a.d;
                Integer num = (Integer) bVar.c(dVar2);
                bVar.e(dVar2, new Integer((num != null ? num.intValue() : 0) + this.e));
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    xVar = (x) this.i;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    xVar = (x) this.i;
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                while (a0.s(xVar.l())) {
                    com.gamericefishpro.space.x7.e eVar = new com.gamericefishpro.space.x7.e(6);
                    this.i = xVar;
                    this.e = 1;
                    if (com.gamericefishpro.space.t0.i.s(getContext()).E(eVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.a;
        }
    }
}
