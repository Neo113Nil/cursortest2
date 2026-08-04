package com.gamericefishpro.space.h2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends com.gamericefishpro.space.ei.l implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ r0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i) {
        super(0);
        this.d = i;
        this.e = r0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        o0 o0VarI0;
        int i = this.d;
        r0 r0Var = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = r0Var.y;
                j0Var.h = 0;
                com.gamericefishpro.space.v0.e eVarZ = j0Var.a.z();
                Object[] objArr = eVarZ.d;
                int i2 = eVarZ.i;
                for (int i3 = 0; i3 < i2; i3++) {
                    r0 r0Var2 = ((f0) objArr[i3]).a0.q;
                    Intrinsics.b(r0Var2);
                    r0Var2.A = r0Var2.B;
                    r0Var2.B = Integer.MAX_VALUE;
                    if (r0Var2.C == d0.e) {
                        r0Var2.C = d0.i;
                    }
                }
                f0 f0Var = j0Var.a;
                f0 f0Var2 = j0Var.a;
                com.gamericefishpro.space.v0.e eVarZ2 = f0Var.z();
                Object[] objArr2 = eVarZ2.d;
                int i4 = eVarZ2.i;
                for (int i5 = 0; i5 < i4; i5++) {
                    r0 r0Var3 = ((f0) objArr2[i5]).a0.q;
                    Intrinsics.b(r0Var3);
                    r0Var3.J.getClass();
                    Unit unit = Unit.a;
                }
                p pVar = r0Var.v().k0;
                if (pVar != null) {
                    boolean z = pVar.D;
                    com.gamericefishpro.space.v0.b bVar = (com.gamericefishpro.space.v0.b) f0Var2.n();
                    int i6 = bVar.d.i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        o0 o0VarI1 = ((f0) bVar.get(i7)).Z.d.I0();
                        if (o0VarI1 != null) {
                            o0VarI1.D = z;
                        }
                    }
                }
                p pVar2 = r0Var.v().k0;
                Intrinsics.b(pVar2);
                pVar2.s0().b();
                if (r0Var.v().k0 != null) {
                    com.gamericefishpro.space.v0.b bVar2 = (com.gamericefishpro.space.v0.b) f0Var2.n();
                    int i8 = bVar2.d.i;
                    for (int i9 = 0; i9 < i8; i9++) {
                        o0 o0VarI2 = ((f0) bVar2.get(i9)).Z.d.I0();
                        if (o0VarI2 != null) {
                            o0VarI2.D = false;
                        }
                    }
                }
                com.gamericefishpro.space.v0.e eVarZ3 = f0Var2.z();
                Object[] objArr3 = eVarZ3.d;
                int i10 = eVarZ3.i;
                for (int i11 = 0; i11 < i10; i11++) {
                    r0 r0Var4 = ((f0) objArr3[i11]).a0.q;
                    Intrinsics.b(r0Var4);
                    int i12 = r0Var4.A;
                    int i13 = r0Var4.B;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        r0Var4.f0(true);
                    }
                }
                com.gamericefishpro.space.v0.e eVarZ4 = f0Var2.z();
                Object[] objArr4 = eVarZ4.d;
                int i14 = eVarZ4.i;
                for (int i15 = 0; i15 < i14; i15++) {
                    r0 r0Var5 = ((f0) objArr4[i15]).a0.q;
                    Intrinsics.b(r0Var5);
                    g0 g0Var = r0Var5.J;
                    g0Var.getClass();
                    g0Var.c = false;
                    Unit unit2 = Unit.a;
                }
                break;
            case 1:
                j0 j0Var2 = r0Var.y;
                com.gamericefishpro.space.f2.t0 placementScope = null;
                if (k.o(j0Var2.a) || j0Var2.c) {
                    f1 f1Var = j0Var2.a().J;
                    if (f1Var != null) {
                        placementScope = f1Var.E;
                    }
                } else {
                    f1 f1Var2 = j0Var2.a().J;
                    if (f1Var2 != null && (o0VarI0 = f1Var2.I0()) != null) {
                        placementScope = o0VarI0.E;
                    }
                }
                if (placementScope == null) {
                    placementScope = ((com.gamericefishpro.space.i2.t) i0.a(j0Var2.a)).getPlacementScope();
                }
                o0 o0VarI3 = j0Var2.a().I0();
                Intrinsics.b(o0VarI3);
                com.gamericefishpro.space.f2.t0.k(placementScope, o0VarI3, r0Var.G);
                break;
            default:
                o0 o0VarI4 = r0Var.y.a().I0();
                Intrinsics.b(o0VarI4);
                o0VarI4.e(r0Var.Q);
                break;
        }
        return Unit.a;
    }
}
