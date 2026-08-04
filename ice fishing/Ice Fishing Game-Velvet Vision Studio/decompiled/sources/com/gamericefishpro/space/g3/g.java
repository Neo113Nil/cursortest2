package com.gamericefishpro.space.g3;

import com.gamericefishpro.space.f2.k0;
import com.gamericefishpro.space.f2.l0;
import com.gamericefishpro.space.f2.m0;
import com.gamericefishpro.space.f2.n0;
import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.f2.y0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements l0 {
    public static final g a = new g();

    @Override // com.gamericefishpro.space.f2.l0
    public final m0 a(n0 n0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            u0 u0VarE = ((k0) list.get(i2)).e(j);
            iJ = Math.max(iJ, u0VarE.d);
            i = Math.max(i, u0VarE.e);
            arrayList.add(u0VarE);
        }
        if (list.isEmpty()) {
            iJ = com.gamericefishpro.space.c3.a.j(j);
            i = com.gamericefishpro.space.c3.a.i(j);
        }
        return n0Var.y(iJ, i, com.gamericefishpro.space.ph.m0.c(), new y0(1, arrayList));
    }
}
