package com.gamericefishpro.space.p1;

import com.gamericefishpro.space.t.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final w a;

    static {
        q qVar = d.e;
        int i = qVar.c;
        e eVar = new e(qVar, qVar, 1);
        int i2 = qVar.c;
        l lVar = d.x;
        int i3 = (lVar.c << 6) | i2;
        g gVar = new g(qVar, lVar, 0);
        int i4 = (i2 << 6) | lVar.c;
        g gVar2 = new g(lVar, qVar, 0);
        w wVar = com.gamericefishpro.space.t.m.a;
        w wVar2 = new w();
        wVar2.h(i | (i << 6), eVar);
        wVar2.h(i3, gVar);
        wVar2.h(i4, gVar2);
        a = wVar2;
    }
}
