package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface p1 {
    boolean a();

    long b(o oVar, o oVar2, o oVar3);

    o f(long j, o oVar, o oVar2, o oVar3);

    default o k(o oVar, o oVar2, o oVar3) {
        return f(b(oVar, oVar2, oVar3), oVar, oVar2, oVar3);
    }

    o r(long j, o oVar, o oVar2, o oVar3);
}
