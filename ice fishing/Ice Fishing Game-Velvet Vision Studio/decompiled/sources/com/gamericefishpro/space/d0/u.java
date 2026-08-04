package com.gamericefishpro.space.d0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements com.gamericefishpro.space.f2.l0 {
    public final com.gamericefishpro.space.h1.e a;
    public final boolean b;

    public u(com.gamericefishpro.space.h1.e eVar, boolean z) {
        this.a = eVar;
        this.b = z;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(final com.gamericefishpro.space.f2.n0 n0Var, final List list, long j) {
        if (list.isEmpty()) {
            return n0Var.y(com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.ph.m0.c(), new p(1));
        }
        long j2 = this.b ? j : (-8589934589L) & j;
        if (list.size() == 1) {
            final com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(0);
            k0Var.i();
            final com.gamericefishpro.space.f2.u0 u0VarE = k0Var.e(j2);
            final int iMax = Math.max(com.gamericefishpro.space.c3.a.j(j), u0VarE.d);
            final int iMax2 = Math.max(com.gamericefishpro.space.c3.a.i(j), u0VarE.e);
            return n0Var.y(iMax, iMax2, com.gamericefishpro.space.ph.m0.c(), new Function1() { // from class: com.gamericefishpro.space.d0.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    r.b((com.gamericefishpro.space.f2.t0) obj, u0VarE, k0Var, n0Var.getLayoutDirection(), iMax, iMax2, this.a);
                    return Unit.a;
                }
            });
        }
        final com.gamericefishpro.space.f2.u0[] u0VarArr = new com.gamericefishpro.space.f2.u0[list.size()];
        final com.gamericefishpro.space.ei.y yVar = new com.gamericefishpro.space.ei.y();
        yVar.d = com.gamericefishpro.space.c3.a.j(j);
        final com.gamericefishpro.space.ei.y yVar2 = new com.gamericefishpro.space.ei.y();
        yVar2.d = com.gamericefishpro.space.c3.a.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.f2.k0 k0Var2 = (com.gamericefishpro.space.f2.k0) list.get(i);
            k0Var2.i();
            com.gamericefishpro.space.f2.u0 u0VarE2 = k0Var2.e(j2);
            u0VarArr[i] = u0VarE2;
            yVar.d = Math.max(yVar.d, u0VarE2.d);
            yVar2.d = Math.max(yVar2.d, u0VarE2.e);
        }
        return n0Var.y(yVar.d, yVar2.d, com.gamericefishpro.space.ph.m0.c(), new Function1() { // from class: com.gamericefishpro.space.d0.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
                com.gamericefishpro.space.f2.u0[] u0VarArr2 = u0VarArr;
                int length = u0VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    com.gamericefishpro.space.f2.u0 u0Var = u0VarArr2[i3];
                    Intrinsics.c(u0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    r.b(t0Var, u0Var, (com.gamericefishpro.space.f2.k0) list.get(i4), n0Var.getLayoutDirection(), yVar.d, yVar2.d, this.a);
                    i3++;
                    i2 = i4 + 1;
                }
                return Unit.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && this.b == uVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
