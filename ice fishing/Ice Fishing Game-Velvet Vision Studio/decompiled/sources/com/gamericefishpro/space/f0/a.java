package com.gamericefishpro.space.f0;

import com.gamericefishpro.space.z.v0;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public boolean b;
    public int c;
    public float d;
    public Object e;

    public static int a(com.gamericefishpro.space.g0.l lVar, boolean z) {
        return z ? ((com.gamericefishpro.space.g0.m) CollectionsKt.B(lVar.m)).a + 1 : ((com.gamericefishpro.space.g0.m) CollectionsKt.w(lVar.m)).a - 1;
    }

    public static int b(q qVar, boolean z) {
        return z ? ((r) CollectionsKt.B(qVar.k)).a + 1 : ((r) CollectionsKt.w(qVar.k)).a - 1;
    }

    public static int c(com.gamericefishpro.space.g0.l lVar, boolean z) {
        if (z) {
            com.gamericefishpro.space.g0.m mVar = (com.gamericefishpro.space.g0.m) CollectionsKt.B(lVar.m);
            return (lVar.q == v0.d ? mVar.p : mVar.q) + 1;
        }
        com.gamericefishpro.space.g0.m mVar2 = (com.gamericefishpro.space.g0.m) CollectionsKt.w(lVar.m);
        return (lVar.q == v0.d ? mVar2.p : mVar2.q) - 1;
    }
}
