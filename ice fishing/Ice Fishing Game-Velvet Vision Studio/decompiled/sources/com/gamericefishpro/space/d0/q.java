package com.gamericefishpro.space.d0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements com.gamericefishpro.space.f2.l0 {
    public static final q b = new q(0);
    public static final q c = new q(1);
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(com.gamericefishpro.space.f2.n0 n0Var, List list, long j) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return n0Var.y(com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.ph.m0.c(), new p(0));
            default:
                return n0Var.y(com.gamericefishpro.space.c3.a.f(j) ? com.gamericefishpro.space.c3.a.h(j) : 0, com.gamericefishpro.space.c3.a.e(j) ? com.gamericefishpro.space.c3.a.g(j) : 0, com.gamericefishpro.space.ph.m0.c(), new p(7));
        }
    }
}
