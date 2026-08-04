package com.gamericefishpro.space.z4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final LinkedHashMap a;
    public final com.gamericefishpro.space.b1.d b;

    public j0(com.gamericefishpro.space.qh.i initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.a = new LinkedHashMap();
        this.b = new com.gamericefishpro.space.b1.d(initialState);
    }

    public j0() {
        this.a = new LinkedHashMap();
        this.b = new com.gamericefishpro.space.b1.d(com.gamericefishpro.space.ph.m0.c());
    }
}
