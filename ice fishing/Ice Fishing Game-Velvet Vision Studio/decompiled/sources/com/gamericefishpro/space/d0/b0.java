package com.gamericefishpro.space.d0;

import com.gamericefishpro.space.i9.d5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements com.gamericefishpro.space.f2.l0, z0 {
    public final g a;
    public final com.gamericefishpro.space.h1.c b;

    public b0(g gVar, com.gamericefishpro.space.h1.c cVar) {
        this.a = gVar;
        this.b = cVar;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(com.gamericefishpro.space.f2.n0 n0Var, List list, long j) {
        return j.h(this, com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.g(j), com.gamericefishpro.space.c3.a.h(j), n0Var.J(this.a.a()), n0Var, list, new com.gamericefishpro.space.f2.u0[list.size()], list.size());
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final int b(com.gamericefishpro.space.f2.u0 u0Var) {
        return u0Var.d;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int c(com.gamericefishpro.space.f2.p pVar, List list, int i) {
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
                int iMin2 = Math.min(k0Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k0Var.R(iMin2));
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
                iMax = Math.max(iMax, k0Var2.R(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int d(com.gamericefishpro.space.f2.p pVar, List list, int i) {
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
                int iMin2 = Math.min(k0Var.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, k0Var.L(iMin2));
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
                iMax = Math.max(iMax, k0Var2.L(iRound != Integer.MAX_VALUE ? Math.round(iRound * f3) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int e(com.gamericefishpro.space.f2.p pVar, List list, int i) {
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
            int iU = k0Var.U(i);
            if (f2 == 0.0f) {
                i2 += iU;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iU / f2));
            }
        }
        return ((list.size() - 1) * iJ) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.a(this.a, b0Var.a) && this.b.equals(b0Var.b);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final long f(int i, int i2, int i3, boolean z) {
        return !z ? com.gamericefishpro.space.c3.b.a(0, i3, i, i2) : d5.x(0, i3, i, i2);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final void g(int i, com.gamericefishpro.space.f2.n0 n0Var, int[] iArr, int[] iArr2) {
        this.a.b(i, n0Var, iArr, iArr2);
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final com.gamericefishpro.space.f2.m0 h(final com.gamericefishpro.space.f2.u0[] u0VarArr, final com.gamericefishpro.space.f2.n0 n0Var, final int[] iArr, int i, final int i2) {
        return n0Var.y(i2, i, com.gamericefishpro.space.ph.m0.c(), new Function1() { // from class: com.gamericefishpro.space.d0.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
                com.gamericefishpro.space.f2.u0[] u0VarArr2 = u0VarArr;
                int length = u0VarArr2.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    com.gamericefishpro.space.f2.u0 u0Var = u0VarArr2[i3];
                    Intrinsics.b(u0Var);
                    u0Var.i();
                    t0Var.h(u0Var, this.b.a(u0Var.d, i2, n0Var.getLayoutDirection()), iArr[i4], 0.0f);
                    i3++;
                    i4++;
                }
                return Unit.a;
            }
        });
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
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            com.gamericefishpro.space.f2.k0 k0Var = (com.gamericefishpro.space.f2.k0) list.get(i3);
            float f2 = j.f(j.e(k0Var));
            int iF = k0Var.f(i);
            if (f2 == 0.0f) {
                i2 += iF;
            } else if (f2 > 0.0f) {
                f += f2;
                iMax = Math.max(iMax, Math.round(iF / f2));
            }
        }
        return ((list.size() - 1) * iJ) + Math.round(iMax * f) + i2;
    }

    @Override // com.gamericefishpro.space.d0.z0
    public final int j(com.gamericefishpro.space.f2.u0 u0Var) {
        return u0Var.e;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}
