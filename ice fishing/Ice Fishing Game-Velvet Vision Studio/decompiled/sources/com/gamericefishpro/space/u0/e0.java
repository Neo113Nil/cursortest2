package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.h2;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.y1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {
    public static final e0 c = new e0(1, 0, 2);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        int iC = zVar.c(0);
        int i = h2Var.v;
        int iN = h2Var.N(h2Var.b, h2Var.r(i));
        int iG = h2Var.g(h2Var.b, h2Var.r(i + 1));
        for (int iMax = Math.max(iN, iG - iC); iMax < iG; iMax++) {
            Object obj = h2Var.c[h2Var.h(iMax)];
            if (obj instanceof y1) {
                qVar.e((y1) obj);
            } else if (obj instanceof p1) {
                ((p1) obj).d();
            }
        }
        if (iC <= 0) {
            com.gamericefishpro.space.t0.s.a("Check failed");
        }
        int i2 = h2Var.v;
        int iN2 = h2Var.N(h2Var.b, h2Var.r(i2));
        int iG2 = h2Var.g(h2Var.b, h2Var.r(i2 + 1)) - iC;
        if (iG2 < iN2) {
            com.gamericefishpro.space.t0.s.a("Check failed");
        }
        h2Var.J(iG2, iC, i2);
        int i3 = h2Var.i;
        if (i3 >= iN2) {
            h2Var.i = i3 - iC;
        }
    }
}
