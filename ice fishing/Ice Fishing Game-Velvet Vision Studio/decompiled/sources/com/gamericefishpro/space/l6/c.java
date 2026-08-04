package com.gamericefishpro.space.l6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final ExecutorService a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new b(false));
    public final ExecutorService b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new b(true));
    public final a0 c;
    public final com.gamericefishpro.space.ka.f d;
    public final com.gamericefishpro.space.m.d e;
    public final int f;
    public final int g;
    public final int h;

    public c(com.gamericefishpro.space.v8.l lVar) {
        String str = b0.a;
        this.c = new a0();
        this.d = new com.gamericefishpro.space.ka.f(8);
        this.e = new com.gamericefishpro.space.m.d(2);
        this.f = 4;
        this.g = Integer.MAX_VALUE;
        this.h = 20;
    }
}
