package com.gamericefishpro.space.f7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d7.m;
import com.gamericefishpro.space.d7.n;
import com.gamericefishpro.space.d7.o;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.r2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, boolean z, com.gamericefishpro.space.th.a aVar, int i) {
        super(2, aVar);
        this.d = i;
        this.v = obj;
        this.i = z;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new i((j) this.v, this.i, aVar, 0);
            default:
                return new i((com.gamericefishpro.space.v7.i) this.v, this.i, aVar, 1);
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
        return ((i) create(xVar, aVar)).invokeSuspend(Unit.a);
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        boolean z = this.i;
        Object obj2 = this.v;
        int i2 = 0;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) obj2;
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        com.gamericefishpro.space.wa.b.P(obj);
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return Unit.a;
                }
                com.gamericefishpro.space.wa.b.P(obj);
                n nVar = jVar.b;
                this.e = 1;
                obj = nVar.a(this);
                if (obj == aVar) {
                    return aVar;
                }
                o oVar = (o) obj;
                if (oVar == null) {
                    return Unit.a;
                }
                int i4 = oVar.i + 1;
                boolean z2 = z || i4 >= 2;
                n nVar2 = jVar.b;
                this.e = 2;
                Object objH = com.gamericefishpro.space.hj.c.H(nVar2.a, this, new m(i4, 0, z2), false, true);
                if (objH != aVar) {
                    objH = Unit.a;
                }
                if (objH == aVar) {
                    return aVar;
                }
                return Unit.a;
            default:
                com.gamericefishpro.space.v7.i iVar = (com.gamericefishpro.space.v7.i) obj2;
                Object obj3 = com.gamericefishpro.space.uh.a.d;
                int i5 = this.e;
                if (i5 == 0) {
                    com.gamericefishpro.space.wa.b.P(obj);
                    j jVar2 = iVar.d;
                    this.e = 1;
                    jVar2.getClass();
                    com.gamericefishpro.space.wi.e eVar = k0.a;
                    Object objD = a0.D(com.gamericefishpro.space.wi.d.i, new i(jVar2, z, null, i2), this);
                    if (objD != obj3) {
                        objD = Unit.a;
                    }
                    if (objD == obj3) {
                        return obj3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                iVar.e(new z(8));
                return Unit.a;
        }
    }
}
