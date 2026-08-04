package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.o1;
import com.gamericefishpro.space.i2.b1;
import com.gamericefishpro.space.i2.o0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.gamericefishpro.space.ei.l implements Function2 {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o1 o1Var, o0 o0Var, Function2 function2, int i) {
        super(2);
        this.e = o1Var;
        this.i = o0Var;
        this.v = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Number) obj2).intValue();
                k.b((Function1) this.e, (com.gamericefishpro.space.h1.m) this.v, (Function1) this.i, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(49));
                break;
            case 1:
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b1.a((com.gamericefishpro.space.i2.t) this.e, (o0) this.i, (Function2) this.v, rVar, 0);
                } else {
                    rVar.V();
                }
                break;
            default:
                ((Number) obj2).intValue();
                b1.a((o1) this.e, (o0) this.i, (Function2) this.v, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.gamericefishpro.space.i2.t tVar, o0 o0Var, Function2 function2) {
        super(2);
        this.e = tVar;
        this.i = o0Var;
        this.v = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function1 function1, com.gamericefishpro.space.h1.m mVar, Function1 function2, int i) {
        super(2);
        this.e = function1;
        this.v = mVar;
        this.i = function2;
    }
}
