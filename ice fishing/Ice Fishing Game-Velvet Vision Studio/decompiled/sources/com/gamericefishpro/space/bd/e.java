package com.gamericefishpro.space.bd;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        fVar.enqueue(gVar, z);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z, com.gamericefishpro.space.th.a aVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return fVar.enqueueAndWait(gVar, z, aVar);
    }
}
