package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.w.o1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ h e;

    public /* synthetic */ g(h hVar, int i) {
        this.d = i;
        this.e = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        h hVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return u.a;
            default:
                if (((t) com.gamericefishpro.space.h2.k.h(hVar, v.a)) == null) {
                    com.gamericefishpro.space.p0.a aVar = hVar.N;
                    if (aVar != null) {
                        hVar.B0(aVar);
                    }
                    hVar.N = null;
                } else if (hVar.N == null) {
                    com.gamericefishpro.space.m.d dVar = new com.gamericefishpro.space.m.d(21, hVar);
                    g gVar = new g(hVar, 0);
                    com.gamericefishpro.space.b0.i iVar = hVar.J;
                    boolean z = hVar.K;
                    float f = hVar.L;
                    o1 o1Var = com.gamericefishpro.space.p0.f.a;
                    com.gamericefishpro.space.p0.a aVar2 = new com.gamericefishpro.space.p0.a(iVar, z, f, dVar, gVar);
                    hVar.A0(aVar2);
                    hVar.N = aVar2;
                }
                return Unit.a;
        }
    }
}
