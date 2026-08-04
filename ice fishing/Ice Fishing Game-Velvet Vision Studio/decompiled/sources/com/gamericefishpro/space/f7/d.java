package com.gamericefishpro.space.f7;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.p;
import com.gamericefishpro.space.d7.n;
import com.gamericefishpro.space.d7.o;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ j i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = jVar;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new d(this.i, aVar, 0);
            case 1:
                return new d(this.i, aVar, 1);
            default:
                return new d(this.i, aVar, 2);
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
        return ((d) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    n nVar = this.i.b;
                    this.e = 1;
                    obj = nVar.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                o oVar = (o) obj;
                return Boolean.valueOf(oVar != null ? oVar.g : false);
            case 1:
                Object obj2 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    n nVar2 = this.i.b;
                    this.e = 1;
                    Object objH = com.gamericefishpro.space.hj.c.H(nVar2.a, this, new p(16), false, true);
                    if (objH != obj2) {
                        objH = Unit.a;
                    }
                    if (objH == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                j jVar = this.i;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    if (Build.VERSION.SDK_INT < 33) {
                        return Boolean.FALSE;
                    }
                    n nVar3 = jVar.b;
                    this.e = 1;
                    obj = nVar3.a(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                o oVar2 = (o) obj;
                if (oVar2 != null && oVar2.h) {
                    return Boolean.FALSE;
                }
                if ((oVar2 != null ? oVar2.i : 0) >= 2) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!(com.gamericefishpro.space.s3.a.a(jVar.a, "android.permission.POST_NOTIFICATIONS") == 0));
        }
    }
}
