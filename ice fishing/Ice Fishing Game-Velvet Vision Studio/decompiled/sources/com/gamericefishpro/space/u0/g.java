package com.gamericefishpro.space.u0;

import com.gamericefishpro.space.t0.h2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {
    public static final g c = new g(0, 2, 1);

    @Override // com.gamericefishpro.space.u0.j0
    public final void a(com.gamericefishpro.space.d4.z zVar, com.gamericefishpro.space.t0.c cVar, h2 h2Var, com.gamericefishpro.space.u6.q qVar, k0 k0Var) {
        int i = ((com.gamericefishpro.space.b1.i) zVar.d(0)).a;
        List list = (List) zVar.d(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            cVar.c(i3, obj);
            cVar.g(i3, obj);
        }
    }
}
