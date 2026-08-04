package com.gamericefishpro.space.v;

import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.f2.y0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.gamericefishpro.space.f2.l0 {
    public final v a;
    public boolean b;

    public r(v vVar) {
        this.a = vVar;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final com.gamericefishpro.space.f2.m0 a(com.gamericefishpro.space.f2.n0 n0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            u0 u0VarE = ((com.gamericefishpro.space.f2.k0) list.get(i)).e(j);
            iMax = Math.max(iMax, u0VarE.d);
            iMax2 = Math.max(iMax2, u0VarE.e);
            arrayList.add(u0VarE);
        }
        boolean zN = n0Var.n();
        v vVar = this.a;
        if (zN) {
            this.b = true;
            vVar.a.setValue(new com.gamericefishpro.space.c3.k((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.b) {
            vVar.a.setValue(new com.gamericefishpro.space.c3.k((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return n0Var.y(iMax, iMax2, com.gamericefishpro.space.ph.m0.c(), new y0(2, arrayList));
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int c(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iR = ((com.gamericefishpro.space.f2.k0) list.get(0)).R(i);
        int iE = com.gamericefishpro.space.ph.x.e(list);
        int i2 = 1;
        if (1 <= iE) {
            while (true) {
                int iR2 = ((com.gamericefishpro.space.f2.k0) list.get(i2)).R(i);
                if (iR2 > iR) {
                    iR = iR2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iR;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int d(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL = ((com.gamericefishpro.space.f2.k0) list.get(0)).L(i);
        int iE = com.gamericefishpro.space.ph.x.e(list);
        int i2 = 1;
        if (1 <= iE) {
            while (true) {
                int iL2 = ((com.gamericefishpro.space.f2.k0) list.get(i2)).L(i);
                if (iL2 > iL) {
                    iL = iL2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iL;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int e(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iU = ((com.gamericefishpro.space.f2.k0) list.get(0)).U(i);
        int iE = com.gamericefishpro.space.ph.x.e(list);
        int i2 = 1;
        if (1 <= iE) {
            while (true) {
                int iU2 = ((com.gamericefishpro.space.f2.k0) list.get(i2)).U(i);
                if (iU2 > iU) {
                    iU = iU2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iU;
    }

    @Override // com.gamericefishpro.space.f2.l0
    public final int i(com.gamericefishpro.space.f2.p pVar, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        int iF = ((com.gamericefishpro.space.f2.k0) list.get(0)).f(i);
        int iE = com.gamericefishpro.space.ph.x.e(list);
        int i2 = 1;
        if (1 <= iE) {
            while (true) {
                int iF2 = ((com.gamericefishpro.space.f2.k0) list.get(i2)).f(i);
                if (iF2 > iF) {
                    iF = iF2;
                }
                if (i2 == iE) {
                    break;
                }
                i2++;
            }
        }
        return iF;
    }
}
