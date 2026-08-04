package com.gamericefishpro.space.i9;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface j {
    static n d(j jVar, q qVar, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        String str = qVar.d;
        if (jVar.i(str)) {
            n nVarF = jVar.f(str);
            if (nVarF instanceof h) {
                return ((h) nVarF).a(nVar, arrayList);
            }
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.h(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.u("Object has no function ", str));
        }
        a4.K("hasOwnProperty", arrayList, 1);
        return jVar.i(((t) nVar.e).c(nVar, (n) arrayList.get(0)).m()) ? n.o : n.p;
    }

    n f(String str);

    boolean i(String str);

    void n(String str, n nVar);
}
