package com.gamericefishpro.space.f7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ j i;
    public final /* synthetic */ Context v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, Context context, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = jVar;
        this.v = context;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new f(this.i, this.v, aVar, 0);
            case 1:
                return new f(this.i, this.v, aVar, 1);
            default:
                return new f(this.i, this.v, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) obj;
        com.gamericefishpro.space.th.a aVar = (com.gamericefishpro.space.th.a) obj2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return ((f) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.d;
        com.gamericefishpro.space.th.a aVar = null;
        Context context = this.v;
        j jVar = this.i;
        int i2 = 1;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.e7.b bVar = jVar.f;
                this.e = 1;
                bVar.getClass();
                com.gamericefishpro.space.wi.e eVar = k0.a;
                Object objD = a0.D(com.gamericefishpro.space.wi.d.i, new com.gamericefishpro.space.e7.a(context, aVar, 0), this);
                return objD == aVar2 ? aVar2 : objD;
            case 1:
                com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
                int i4 = this.e;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.e7.e eVar2 = jVar.d;
                this.e = 1;
                Object objA = eVar2.a(context, this);
                return objA == aVar3 ? aVar3 : objA;
            default:
                com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
                int i5 = this.e;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                    return obj;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.e7.h hVar = jVar.c;
                this.e = 1;
                hVar.getClass();
                com.gamericefishpro.space.wi.e eVar3 = k0.a;
                Object objD2 = a0.D(com.gamericefishpro.space.wi.d.i, new com.gamericefishpro.space.e7.a(context, aVar, i2), this);
                return objD2 == aVar4 ? aVar4 : objD2;
        }
    }
}
