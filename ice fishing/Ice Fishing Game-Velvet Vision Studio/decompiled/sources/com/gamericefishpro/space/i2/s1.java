package com.gamericefishpro.space.i2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public final com.gamericefishpro.space.o2.l a;
    public final com.gamericefishpro.space.t.x b;

    public s1(com.gamericefishpro.space.o2.o oVar, com.gamericefishpro.space.t.l lVar) {
        this.a = oVar.d;
        this.b = new com.gamericefishpro.space.t.x(com.gamericefishpro.space.o2.o.j(4, oVar).size());
        List listJ = com.gamericefishpro.space.o2.o.j(4, oVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            com.gamericefishpro.space.o2.o oVar2 = (com.gamericefishpro.space.o2.o) listJ.get(i);
            if (lVar.a(oVar2.g)) {
                this.b.a(oVar2.g);
            }
        }
    }
}
