package com.gamericefishpro.space.f2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends com.gamericefishpro.space.h2.c0 {
    public static final z0 b = new z0("Undefined intrinsics block and it is required");

    @Override // com.gamericefishpro.space.f2.l0
    public final m0 a(n0 n0Var, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return n0Var.y(com.gamericefishpro.space.c3.a.j(j), com.gamericefishpro.space.c3.a.i(j), com.gamericefishpro.space.ph.m0.c(), v0.i);
        }
        if (size == 1) {
            u0 u0VarE = ((k0) list.get(0)).e(j);
            return n0Var.y(com.gamericefishpro.space.c3.b.f(u0VarE.d, j), com.gamericefishpro.space.c3.b.e(u0VarE.e, j), com.gamericefishpro.space.ph.m0.c(), new x0(u0VarE, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            u0 u0VarE2 = ((k0) list.get(i)).e(j);
            iMax = Math.max(u0VarE2.d, iMax);
            iMax2 = Math.max(u0VarE2.e, iMax2);
            arrayList.add(u0VarE2);
        }
        return n0Var.y(com.gamericefishpro.space.c3.b.f(iMax, j), com.gamericefishpro.space.c3.b.e(iMax2, j), com.gamericefishpro.space.ph.m0.c(), new y0(0, arrayList));
    }
}
