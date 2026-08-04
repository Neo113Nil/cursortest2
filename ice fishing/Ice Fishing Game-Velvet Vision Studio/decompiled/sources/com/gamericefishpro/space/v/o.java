package com.gamericefishpro.space.v;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.w.g1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ p e;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, long j, int i) {
        super(1);
        this.d = i;
        this.e = pVar;
        this.i = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        com.gamericefishpro.space.w.u uVar;
        long j2;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g1 g1Var = (g1) obj;
                Object objA = g1Var.a();
                p pVar = this.e;
                if (Intrinsics.a(objA, pVar.J.a())) {
                    j = com.gamericefishpro.space.c3.k.a(pVar.K, h.a) ? this.i : pVar.K;
                } else {
                    s2 s2Var = (s2) pVar.J.d.g(g1Var.a());
                    j = s2Var != null ? ((com.gamericefishpro.space.c3.k) s2Var.getValue()).a : 0L;
                }
                s2 s2Var2 = (s2) pVar.J.d.g(g1Var.c());
                long j3 = s2Var2 != null ? ((com.gamericefishpro.space.c3.k) s2Var2.getValue()).a : 0L;
                p0 p0Var = (p0) pVar.I.getValue();
                return (p0Var == null || (uVar = (com.gamericefishpro.space.w.u) p0Var.a.invoke(new com.gamericefishpro.space.c3.k(j), new com.gamericefishpro.space.c3.k(j3))) == null) ? com.gamericefishpro.space.w.c.n(0.0f, 400.0f, null, 5) : uVar;
            default:
                p pVar2 = this.e;
                if (Intrinsics.a(obj, pVar2.J.a())) {
                    j2 = com.gamericefishpro.space.c3.k.a(pVar2.K, h.a) ? this.i : pVar2.K;
                } else {
                    s2 s2Var3 = (s2) pVar2.J.d.g(obj);
                    j2 = s2Var3 != null ? ((com.gamericefishpro.space.c3.k) s2Var3.getValue()).a : 0L;
                }
                return new com.gamericefishpro.space.c3.k(j2);
        }
    }
}
