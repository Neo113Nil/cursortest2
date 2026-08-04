package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w1 {
    public static final ThreadLocal a = new ThreadLocal();

    public static u0 a() {
        ThreadLocal threadLocal = a;
        u0 u0Var = (u0) threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        d dVar = new d(Thread.currentThread());
        threadLocal.set(dVar);
        return dVar;
    }
}
