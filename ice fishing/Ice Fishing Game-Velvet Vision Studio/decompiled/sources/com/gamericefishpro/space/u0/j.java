package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.t0.h2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends j0 {
    public static final j c = new j(0, 2, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        int i;
        com.gamericefishpro.space.b1.i iVar = (com.gamericefishpro.space.b1.i) zVar.d(0);
        int iC = h2Var.c((com.gamericefishpro.space.t0.a) zVar.d(1));
        if (h2Var.t >= iC) {
            com.gamericefishpro.space.t0.s.a("Check failed");
        }
        a4.I(h2Var, cVar, iC);
        int i2 = h2Var.t;
        int iE = h2Var.v;
        while (iE >= 0 && !h2Var.y(iE)) {
            iE = h2Var.E(h2Var.b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (h2Var.v(i2, iU)) {
                if (h2Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += h2Var.y(iU) ? 1 : h2Var.b[(h2Var.r(iU) * 5) + 1] & 67108863;
                iU += h2Var.u(iU);
            }
        }
        while (true) {
            i = h2Var.t;
            if (i >= iC) {
                break;
            }
            if (h2Var.v(iC, i)) {
                int i3 = h2Var.t;
                if (i3 < h2Var.u && (h2Var.b[(h2Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    cVar.d(h2Var.D(h2Var.t));
                    iL = 0;
                }
                h2Var.P();
            } else {
                iL += h2Var.L();
            }
        }
        if (i != iC) {
            com.gamericefishpro.space.t0.s.a("Check failed");
        }
        iVar.a = iL;
    }
}
