package com.gamericefishpro.space.f2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.w1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends t0 {
    public final /* synthetic */ int e;
    public final Object i;

    public /* synthetic */ i0(int i, Object obj) {
        this.e = i;
        this.i = obj;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.h2.n0) this.i).b();
            default:
                return ((com.gamericefishpro.space.i2.t) this.i).getDensity().b();
        }
    }

    @Override // com.gamericefishpro.space.f2.t0
    public float d(m mVar) {
        float fIntBitsToFloat;
        int iU;
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Function2 function2 = mVar.a;
                if (function2 != null) {
                    return ((Number) function2.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                com.gamericefishpro.space.h2.n0 n0Var = (com.gamericefishpro.space.h2.n0) this.i;
                if (n0Var.D) {
                    return Float.NaN;
                }
                com.gamericefishpro.space.h2.n0 n0Var2 = n0Var;
                while (true) {
                    w1 w1Var = n0Var2.F;
                    float f = (w1Var == null || (iU = com.gamericefishpro.space.ph.v.u((m[]) w1Var.b, mVar)) < 0) ? Float.NaN : ((float[]) w1Var.c)[iU];
                    if (!Float.isNaN(f)) {
                        n0Var2.e0(n0Var.r0(), mVar);
                        u uVarP0 = n0Var2.p0();
                        u uVarP1 = n0Var.p0();
                        switch (mVar.b) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (uVarP1.o(uVarP0, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (uVarP0.F() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (uVarP1.o(uVarP0, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(((int) (uVarP0.F() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    com.gamericefishpro.space.h2.n0 n0VarT0 = n0Var2.t0();
                    if (n0VarT0 == null) {
                        n0Var2.e0(n0Var.r0(), mVar);
                        return Float.NaN;
                    }
                    n0Var2 = n0VarT0;
                }
                break;
            default:
                return super.d(mVar);
        }
    }

    @Override // com.gamericefishpro.space.f2.t0
    public final com.gamericefishpro.space.c3.l e() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.h2.n0) this.i).getLayoutDirection();
            default:
                return ((com.gamericefishpro.space.i2.t) this.i).getLayoutDirection();
        }
    }

    @Override // com.gamericefishpro.space.f2.t0
    public final int f() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.h2.n0) this.i).Y();
            default:
                return ((com.gamericefishpro.space.i2.t) this.i).getRoot().a0.p.d;
        }
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((com.gamericefishpro.space.h2.n0) this.i).g();
            default:
                return ((com.gamericefishpro.space.i2.t) this.i).getDensity().g();
        }
    }
}
