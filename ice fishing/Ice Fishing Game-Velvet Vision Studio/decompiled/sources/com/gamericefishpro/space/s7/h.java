package com.gamericefishpro.space.s7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.c7.n;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pi.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ i i;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, boolean z, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.i = iVar;
        this.v = z;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new h(this.i, this.v, aVar, 0);
            case 1:
                return new h(this.i, this.v, aVar, 1);
            default:
                return new h(this.i, this.v, aVar, 2);
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
        return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object obj2 = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                if (i == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar = this.i.d;
                    boolean z = !this.v;
                    this.e = 1;
                    Object objU = y3.u(n.a(cVar.c.a), new com.gamericefishpro.space.c7.g(z, null, 0), this);
                    if (objU != obj2) {
                        objU = Unit.a;
                    }
                    if (objU != obj2) {
                        objU = Unit.a;
                    }
                    if (objU == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            case 1:
                Object obj3 = com.gamericefishpro.space.uh.a.d;
                int i2 = this.e;
                if (i2 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar2 = this.i.d;
                    boolean z2 = !this.v;
                    this.e = 1;
                    Object objU2 = y3.u(n.a(cVar2.c.a), new com.gamericefishpro.space.c7.g(z2, null, 1), this);
                    if (objU2 != obj3) {
                        objU2 = Unit.a;
                    }
                    if (objU2 != obj3) {
                        objU2 = Unit.a;
                    }
                    if (objU2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            default:
                Object obj4 = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    com.gamericefishpro.space.f7.c cVar3 = this.i.d;
                    boolean z3 = !this.v;
                    this.e = 1;
                    Object objU3 = y3.u(n.a(cVar3.c.a), new com.gamericefishpro.space.c7.g(z3, null, 2), this);
                    if (objU3 != obj4) {
                        objU3 = Unit.a;
                    }
                    if (objU3 != obj4) {
                        objU3 = Unit.a;
                    }
                    if (objU3 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
        }
    }
}
