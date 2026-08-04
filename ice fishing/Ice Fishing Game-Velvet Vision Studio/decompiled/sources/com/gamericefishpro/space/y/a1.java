package com.gamericefishpro.space.y;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.x1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v, x1 {
    public c1 H;
    public boolean I;

    @Override // com.gamericefishpro.space.h2.v
    public final int C(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        if (!this.I) {
            i = Integer.MAX_VALUE;
        }
        return k0Var.f(i);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        q.h(j, this.I ? com.gamericefishpro.space.z.v0.d : com.gamericefishpro.space.z.v0.e);
        com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(com.gamericefishpro.space.c3.a.a(j, 0, this.I ? com.gamericefishpro.space.c3.a.h(j) : Integer.MAX_VALUE, 0, this.I ? Integer.MAX_VALUE : com.gamericefishpro.space.c3.a.g(j), 5));
        int i = u0VarE.d;
        int iH = com.gamericefishpro.space.c3.a.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = u0VarE.e;
        int iG = com.gamericefishpro.space.c3.a.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = u0VarE.e - i2;
        int i4 = u0VarE.d - i;
        if (!this.I) {
            i3 = i4;
        }
        c1 c1Var = this.H;
        com.gamericefishpro.space.t0.c1 c1Var2 = c1Var.e;
        com.gamericefishpro.space.t0.c1 c1Var3 = c1Var.a;
        c1Var2.h(i3);
        com.gamericefishpro.space.f1.g gVarE = com.gamericefishpro.space.f1.v.e();
        Function1 function1E = gVarE != null ? gVarE.e() : null;
        com.gamericefishpro.space.f1.g gVarH = com.gamericefishpro.space.f1.v.h(gVarE);
        try {
            if (c1Var3.g() > i3) {
                c1Var3.h(i3);
            }
            Unit unit = Unit.a;
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            this.H.b.h(this.I ? i2 : i);
            this.H.c.h(this.I ? u0VarE.e : u0VarE.d);
            return n0Var.y(i, i2, com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.n7.p(i3, 2, this, u0VarE));
        } catch (Throwable th) {
            com.gamericefishpro.space.f1.v.k(gVarE, gVarH, function1E);
            throw th;
        }
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
        com.gamericefishpro.space.o2.v vVar = com.gamericefishpro.space.o2.s.m;
        com.gamericefishpro.space.ki.d[] dVarArr2 = com.gamericefishpro.space.o2.u.a;
        com.gamericefishpro.space.ki.d dVar = dVarArr2[6];
        wVar.b(vVar, Boolean.TRUE);
        final int i = 0;
        final int i2 = 1;
        com.gamericefishpro.space.o2.i iVar = new com.gamericefishpro.space.o2.i(new Function0(this) { // from class: com.gamericefishpro.space.y.z0
            public final /* synthetic */ a1 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iG;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        iG = this.e.H.a.g();
                        break;
                    default:
                        iG = this.e.H.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new Function0(this) { // from class: com.gamericefishpro.space.y.z0
            public final /* synthetic */ a1 e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iG;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        iG = this.e.H.a.g();
                        break;
                    default:
                        iG = this.e.H.e.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.I) {
            com.gamericefishpro.space.o2.v vVar2 = com.gamericefishpro.space.o2.s.v;
            com.gamericefishpro.space.ki.d dVar2 = dVarArr2[13];
            wVar.b(vVar2, iVar);
        } else {
            com.gamericefishpro.space.o2.v vVar3 = com.gamericefishpro.space.o2.s.u;
            com.gamericefishpro.space.ki.d dVar3 = dVarArr2[12];
            wVar.b(vVar3, iVar);
        }
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int N(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        if (this.I) {
            i = Integer.MAX_VALUE;
        }
        return k0Var.L(i);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int Z(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        if (!this.I) {
            i = Integer.MAX_VALUE;
        }
        return k0Var.U(i);
    }

    @Override // com.gamericefishpro.space.h2.v
    public final int k0(com.gamericefishpro.space.h2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, int i) {
        if (this.I) {
            i = Integer.MAX_VALUE;
        }
        return k0Var.R(i);
    }
}
