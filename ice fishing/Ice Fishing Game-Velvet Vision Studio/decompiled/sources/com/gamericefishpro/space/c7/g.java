package com.gamericefishpro.space.c7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(boolean z, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = z;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g gVar = new g(this.i, aVar, 0);
                gVar.e = obj;
                return gVar;
            case 1:
                g gVar2 = new g(this.i, aVar, 1);
                gVar2.e = obj;
                return gVar2;
            default:
                g gVar3 = new g(this.i, aVar, 2);
                gVar3.e = obj;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return ((g) create(bVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        boolean z = this.i;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.p4.b bVar = (com.gamericefishpro.space.p4.b) this.e;
                com.gamericefishpro.space.p4.d dVar = a.a;
                bVar.e(a.a, Boolean.valueOf(z));
                break;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.p4.b bVar2 = (com.gamericefishpro.space.p4.b) this.e;
                com.gamericefishpro.space.p4.d dVar2 = a.a;
                bVar2.e(a.b, Boolean.valueOf(z));
                break;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.p4.b bVar3 = (com.gamericefishpro.space.p4.b) this.e;
                com.gamericefishpro.space.p4.d dVar3 = a.a;
                bVar3.e(a.c, Boolean.valueOf(z));
                break;
        }
        return Unit.a;
    }
}
