package com.gamericefishpro.space.z;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends com.gamericefishpro.space.vh.i implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, int i2, com.gamericefishpro.space.th.a aVar) {
        super(i, aVar);
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                long j = ((com.gamericefishpro.space.n1.b) obj2).a;
                return new c0(3, 0, (com.gamericefishpro.space.th.a) obj3).invokeSuspend(Unit.a);
            case 1:
                ((Number) obj2).floatValue();
                return new c0(3, 1, (com.gamericefishpro.space.th.a) obj3).invokeSuspend(Unit.a);
            default:
                long j2 = ((com.gamericefishpro.space.n1.b) obj2).a;
                return new c0(3, 2, (com.gamericefishpro.space.th.a) obj3).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                break;
            case 1:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                break;
            default:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                break;
        }
        return Unit.a;
    }
}
