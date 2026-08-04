package com.gamericefishpro.space.f2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface l0 {
    m0 a(n0 n0Var, List list, long j);

    default int c(p pVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i((k0) list.get(i2), q.e, r.d, 0));
        }
        return a(new t(pVar, pVar.getLayoutDirection()), arrayList, com.gamericefishpro.space.c3.b.b(0, i, 7)).e();
    }

    default int d(p pVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i((k0) list.get(i2), q.d, r.d, 0));
        }
        return a(new t(pVar, pVar.getLayoutDirection()), arrayList, com.gamericefishpro.space.c3.b.b(0, i, 7)).e();
    }

    default int e(p pVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i((k0) list.get(i2), q.d, r.e, 0));
        }
        return a(new t(pVar, pVar.getLayoutDirection()), arrayList, com.gamericefishpro.space.c3.b.b(i, 0, 13)).c();
    }

    default int i(p pVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new i((k0) list.get(i2), q.e, r.e, 0));
        }
        return a(new t(pVar, pVar.getLayoutDirection()), arrayList, com.gamericefishpro.space.c3.b.b(i, 0, 13)).c();
    }
}
