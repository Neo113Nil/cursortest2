package com.gamericefishpro.space.bd;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface f {
    Object awaitInitialized(com.gamericefishpro.space.th.a aVar);

    <T extends g> boolean containsInstanceOf(com.gamericefishpro.space.ki.b bVar);

    void enqueue(g gVar, boolean z);

    Object enqueueAndWait(g gVar, boolean z, com.gamericefishpro.space.th.a aVar);

    void forceExecuteOperations();
}
