package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k0 {
    public final /* synthetic */ int d;
    public final k0 e;
    public final Enum i;
    public final Enum v;

    public /* synthetic */ i(k0 k0Var, Enum r2, Enum r3, int i) {
        this.d = i;
        this.e = k0Var;
        this.i = r2;
        this.v = r3;
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int L(int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e.L(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int R(int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e.R(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int U(int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e.U(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final u0 e(long j) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = (q) this.i;
                r rVar = (r) this.v;
                r rVar2 = r.d;
                k0 k0Var = this.e;
                if (rVar == rVar2) {
                    return new j(qVar == q.e ? k0Var.R(com.gamericefishpro.space.c3.a.g(j)) : k0Var.L(com.gamericefishpro.space.c3.a.g(j)), com.gamericefishpro.space.c3.a.c(j) ? com.gamericefishpro.space.c3.a.g(j) : 32767, 0);
                }
                return new j(com.gamericefishpro.space.c3.a.d(j) ? com.gamericefishpro.space.c3.a.h(j) : 32767, qVar == q.e ? k0Var.f(com.gamericefishpro.space.c3.a.h(j)) : k0Var.U(com.gamericefishpro.space.c3.a.h(j)), 0);
            default:
                com.gamericefishpro.space.h2.h1 h1Var = (com.gamericefishpro.space.h2.h1) this.i;
                com.gamericefishpro.space.h2.i1 i1Var = (com.gamericefishpro.space.h2.i1) this.v;
                com.gamericefishpro.space.h2.i1 i1Var2 = com.gamericefishpro.space.h2.i1.d;
                k0 k0Var2 = this.e;
                if (i1Var == i1Var2) {
                    return new j(h1Var == com.gamericefishpro.space.h2.h1.e ? k0Var2.R(com.gamericefishpro.space.c3.a.g(j)) : k0Var2.L(com.gamericefishpro.space.c3.a.g(j)), com.gamericefishpro.space.c3.a.c(j) ? com.gamericefishpro.space.c3.a.g(j) : 32767, 1);
                }
                return new j(com.gamericefishpro.space.c3.a.d(j) ? com.gamericefishpro.space.c3.a.h(j) : 32767, h1Var == com.gamericefishpro.space.h2.h1.e ? k0Var2.f(com.gamericefishpro.space.c3.a.h(j)) : k0Var2.U(com.gamericefishpro.space.c3.a.h(j)), 1);
        }
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final int f(int i) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e.f(i);
    }

    @Override // com.gamericefishpro.space.f2.k0
    public final Object i() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
        }
        return this.e.i();
    }
}
