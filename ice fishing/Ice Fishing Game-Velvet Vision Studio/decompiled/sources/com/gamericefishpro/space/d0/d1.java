package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.i9.d5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements com.gamericefishpro.space.f2.l0, z0 {
    public final d a;
    public final com.gamericefishpro.space.h1.d b;

    public d1(d dVar, com.gamericefishpro.space.h1.d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(com.gamericefishpro.space.f2.n0 n0Var, List list, long j) {
        return j.h(this, com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.c3.a.h(j), com.gamericefishpro.space.c3.a.g(j), n0Var.J(this.a.a()), n0Var, list, new com.gamericefishpro.space.f2.u0[list.size()], list.size());
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final int b(com.gamericefishpro.space.f2.u0 u0Var) {
        return u0Var.e;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int c(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iJ = pVar.J(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i3);
            float f2 = j.f(j.e(k0Var));
            int iR = k0Var.R(i);
            if (f2 == 0.0f) {
                i2 += iR;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iR / f2));
            }
        }
        return ((list.size() - 1) * iJ) + Math.round(iMax * f) + i2;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int d(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iJ = pVar.J(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i3);
            float f2 = j.f(j.e(k0Var));
            int iL = k0Var.L(i);
            if (f2 == 0.0f) {
                i2 += iL;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iL / f2));
            }
        }
        return ((list.size() - 1) * iJ) + Math.round(iMax * f) + i2;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int e(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iJ = pVar.J(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iJ, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i2);
            float f2 = j.f(j.e(k0Var));
            if (f2 == 0.0f) {
                int iMin2 = Math.min(k0Var.R(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k0Var.U(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            com.gamericefishpro.space.f2.k0 k0Var2 = (com.gamericefishpro.space.f2.k0) list.get(i3);
            float f3 = j.f(j.e(k0Var2));
            if (f3 > 0.0f) {
                iMax = Math.max(iMax, k0Var2.U(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.a(this.a, d1Var.a) && this.b.equals(d1Var.b);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final long f(int i, int i2, int i3, boolean z) {
        return !z ? com.gamericefishpro.space.c3.b.a(i, i2, 0, i3) : d5.y(i, i2, 0, i3);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final void g(int i, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int[] iArr2) {
        this.a.c(n0Var, i, iArr, n0Var.getLayoutDirection(), iArr2);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final com.gamericefishpro.space.f2.m0 h(com.gamericefishpro.space.f2.u0[] u0VarArr, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int i, int i2) {
        return n0Var.y(i, i2, com.gamericefishpro.space.ph.m0.c(), new c1(u0VarArr, this, i2, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int i(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        int iJ = pVar.J(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iJ, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i2);
            float f2 = j.f(j.e(k0Var));
            if (f2 == 0.0f) {
                int iMin2 = Math.min(k0Var.R(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k0Var.f(iMin2));
            } else if (f2 > 0.0f) {
                f += f2;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            com.gamericefishpro.space.f2.k0 k0Var2 = (com.gamericefishpro.space.f2.k0) list.get(i3);
            float f3 = j.f(j.e(k0Var2));
            if (f3 > 0.0f) {
                iMax = Math.max(iMax, k0Var2.f(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final int j(com.gamericefishpro.space.f2.u0 u0Var) {
        return u0Var.d;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
