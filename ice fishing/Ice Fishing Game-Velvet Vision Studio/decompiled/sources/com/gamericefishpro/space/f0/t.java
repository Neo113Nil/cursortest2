package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ t(int i, int i2) {
        this.d = i2;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k0 k0Var = (k0) obj;
                com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
                com.gamericefishpro.space.f1.v.k(gVarE, com.gamericefishpro.space.f1.v.h(gVarE), gVarE != null ? gVarE.e() : null);
                int i = k0Var.a;
                if (i == -1) {
                    i = 2;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    k0Var.a(this.e + i2);
                }
                return Unit.a;
            case 1:
                return Integer.valueOf(((com.gamericefishpro.space.g0.p) obj).a - this.e);
            case 2:
                return new com.gamericefishpro.space.l7.d(this.e, ((com.gamericefishpro.space.l7.d) obj).b);
            case 3:
                return com.gamericefishpro.space.n7.g.a((com.gamericefishpro.space.n7.g) obj, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, this.e, null, null, null, 245759);
            case 4:
                return com.gamericefishpro.space.n7.g.a((com.gamericefishpro.space.n7.g) obj, null, 0, 0, 0, this.e, 0, null, false, 0, false, false, false, null, 0, 0, null, null, null, 262127);
            default:
                com.gamericefishpro.space.v7.g it = (com.gamericefishpro.space.v7.g) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return com.gamericefishpro.space.v7.g.a(it, this.e, false, 2);
        }
    }

    public /* synthetic */ t(w wVar, int i) {
        this.d = 0;
        this.e = i;
    }
}
