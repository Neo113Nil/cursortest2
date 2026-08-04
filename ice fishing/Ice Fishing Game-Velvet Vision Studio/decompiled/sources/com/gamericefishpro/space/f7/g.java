package com.gamericefishpro.space.f7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.r9.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.vh.i implements Function2 {
    public final /* synthetic */ int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i2, com.gamericefishpro.space.th.a aVar) {
        super(i, aVar);
        this.d = i2;
    }

    @Override // com.gamericefishpro.space.vh.a
    public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new g(2, 0, aVar);
            default:
                g gVar = new g(2, 1, aVar);
                gVar.e = ((Number) obj).intValue();
                return gVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((g) create((x) obj, (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
            default:
                return ((g) create(Integer.valueOf(((Number) obj).intValue()), (com.gamericefishpro.space.th.a) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // com.gamericefishpro.space.vh.a
    public final Object invokeSuspend(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
                int i = this.e;
                try {
                    if (i == 0) {
                        com.gamericefishpro.space.wa.b.P(obj);
                        o oVarA = com.gamericefishpro.space.xa.a.a().a();
                        Intrinsics.checkNotNullExpressionValue(oVarA, "getAppInstanceId(...)");
                        this.e = 1;
                        obj = com.gamericefishpro.space.wa.b.d(oVarA, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.gamericefishpro.space.wa.b.P(obj);
                    }
                    return (String) obj;
                } catch (Exception unused) {
                    return "";
                }
            default:
                com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
                com.gamericefishpro.space.wa.b.P(obj);
                return Boolean.valueOf(this.e > 0);
        }
    }
}
