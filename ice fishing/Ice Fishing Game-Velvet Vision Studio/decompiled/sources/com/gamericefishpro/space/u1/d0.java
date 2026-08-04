package com.gamericefishpro.space.u1;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ e0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i) {
        super(1);
        this.d = i;
        this.e = e0Var;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [com.gamericefishpro.space.ei.l, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e0 e0Var = this.e;
                e0Var.d = true;
                e0Var.f.invoke();
                return Unit.a;
            default:
                com.gamericefishpro.space.q1.d dVar = (com.gamericefishpro.space.q1.d) obj;
                e0 e0Var2 = this.e;
                c cVar = e0Var2.b;
                float f = e0Var2.k;
                float f2 = e0Var2.l;
                com.gamericefishpro.space.a8.c cVarX = dVar.x();
                long jO = cVarX.o();
                cVarX.j().k();
                try {
                    ((com.gamericefishpro.space.m.d) cVarX.e).A(f, f2, 0L);
                    cVar.a(dVar);
                    return Unit.a;
                } finally {
                    cVarX.j().i();
                    cVarX.H(jO);
                }
        }
    }
}
