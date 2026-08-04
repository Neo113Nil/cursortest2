package com.gamericefishpro.space.bb;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements com.gamericefishpro.space.kb.c, com.gamericefishpro.space.kb.b {
    public final HashMap a;
    public ArrayDeque b;
    public final com.gamericefishpro.space.cb.k c;

    public o() {
        com.gamericefishpro.space.cb.k kVar = com.gamericefishpro.space.cb.k.d;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = kVar;
    }

    public final synchronized void a(Executor executor, com.gamericefishpro.space.kb.a aVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(com.gamericefishpro.space.wa.b.class)) {
                this.a.put(com.gamericefishpro.space.wa.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(com.gamericefishpro.space.wa.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
