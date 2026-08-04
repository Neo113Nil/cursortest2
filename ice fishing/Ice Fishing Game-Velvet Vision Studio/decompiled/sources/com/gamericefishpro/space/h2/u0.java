package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ v0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(v0 v0Var, int i) {
        super(0);
        this.d = i;
        this.e = v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.gamericefishpro.space.f2.t0 placementScope;
        int i = this.d;
        v0 v0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = v0Var.y;
                j0Var.i = 0;
                com.gamericefishpro.space.v0.e eVarZ = j0Var.a.z();
                Object[] objArr = eVarZ.d;
                int i2 = eVarZ.i;
                for (int i3 = 0; i3 < i2; i3++) {
                    v0 v0Var2 = ((f0) objArr[i3]).a0.p;
                    v0Var2.A = v0Var2.B;
                    v0Var2.B = Integer.MAX_VALUE;
                    v0Var2.L = false;
                    if (v0Var2.E == d0.e) {
                        v0Var2.E = d0.i;
                    }
                }
                f0 f0Var = j0Var.a;
                f0 f0Var2 = j0Var.a;
                com.gamericefishpro.space.v0.e eVarZ2 = f0Var.z();
                Object[] objArr2 = eVarZ2.d;
                int i4 = eVarZ2.i;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((f0) objArr2[i5]).a0.p.P.getClass();
                    Unit unit = Unit.a;
                }
                if (v0Var.v().D) {
                    com.gamericefishpro.space.v0.b bVar = (com.gamericefishpro.space.v0.b) f0Var2.n();
                    int i6 = bVar.d.i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((f0) bVar.get(i7)).Z.d.D = true;
                    }
                }
                v0Var.v().s0().b();
                if (v0Var.v().D) {
                    com.gamericefishpro.space.v0.b bVar2 = (com.gamericefishpro.space.v0.b) f0Var2.n();
                    int i8 = bVar2.d.i;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((f0) bVar2.get(i9)).Z.d.D = false;
                    }
                }
                com.gamericefishpro.space.v0.e eVarZ3 = f0Var2.z();
                Object[] objArr3 = eVarZ3.d;
                int i10 = eVarZ3.i;
                for (int i11 = 0; i11 < i10; i11++) {
                    f0 f0Var3 = (f0) objArr3[i11];
                    j0 j0Var2 = f0Var3.a0;
                    if (j0Var2.p.A != f0Var3.w()) {
                        f0Var2.O();
                        f0Var2.C();
                        if (f0Var3.w() == Integer.MAX_VALUE) {
                            if (j0Var2.c || k.o(f0Var3)) {
                                r0 r0Var = j0Var2.q;
                                Intrinsics.b(r0Var);
                                r0Var.f0(false);
                            }
                            j0Var2.p.h0();
                        }
                    }
                }
                com.gamericefishpro.space.v0.e eVarZ4 = f0Var2.z();
                Object[] objArr4 = eVarZ4.d;
                int i12 = eVarZ4.i;
                for (int i13 = 0; i13 < i12; i13++) {
                    g0 g0Var = ((f0) objArr4[i13]).a0.p.P;
                    g0Var.getClass();
                    g0Var.c = false;
                    Unit unit2 = Unit.a;
                }
                break;
            case 1:
                v0Var.y.a().e(v0Var.T);
                break;
            default:
                j0 j0Var3 = v0Var.y;
                f1 f1Var = j0Var3.a().J;
                if (f1Var == null || (placementScope = f1Var.E) == null) {
                    placementScope = ((com.gamericefishpro.space.i2.t) i0.a(j0Var3.a)).getPlacementScope();
                }
                Function1 function1 = v0Var.Y;
                if (function1 == null) {
                    f1 f1VarA = j0Var3.a();
                    long j = v0Var.Z;
                    float f = v0Var.a0;
                    placementScope.getClass();
                    com.gamericefishpro.space.f2.t0.a(placementScope, f1VarA);
                    f1VarA.a0(com.gamericefishpro.space.c3.i.c(j, f1VarA.w), f, null);
                } else {
                    f1 f1VarA2 = j0Var3.a();
                    long j2 = v0Var.Z;
                    float f2 = v0Var.a0;
                    placementScope.getClass();
                    com.gamericefishpro.space.f2.t0.a(placementScope, f1VarA2);
                    f1VarA2.a0(com.gamericefishpro.space.c3.i.c(j2, f1VarA2.w), f2, function1);
                }
                break;
        }
        return Unit.a;
    }
}
