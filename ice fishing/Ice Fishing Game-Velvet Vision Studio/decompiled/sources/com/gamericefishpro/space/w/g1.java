package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface g1 {
    Object a();

    default boolean b(com.gamericefishpro.space.v.y yVar, com.gamericefishpro.space.v.y yVar2) {
        return yVar.equals(a()) && yVar2.equals(c());
    }

    Object c();
}
