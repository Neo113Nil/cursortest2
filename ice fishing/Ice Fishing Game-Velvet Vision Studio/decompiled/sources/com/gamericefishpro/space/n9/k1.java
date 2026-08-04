package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k1(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.i9.h4(((l1) this.e).D);
            case 1:
                y1 y1Var = (y1) this.e;
                y1Var.d.B();
                z0 z0Var = y1Var.d.A;
                m4.T(z0Var);
                z0Var.r();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                com.gamericefishpro.space.i9.j1 j1Var = ((FirebaseAnalytics) this.e).a;
                j1Var.getClass();
                com.gamericefishpro.space.i9.g0 g0Var = new com.gamericefishpro.space.i9.g0();
                j1Var.a(new com.gamericefishpro.space.i9.c1(j1Var, g0Var));
                return g0Var.F(120000L);
        }
    }

    public k1(y1 y1Var, u uVar, String str) {
        this.d = 1;
        this.e = y1Var;
    }
}
