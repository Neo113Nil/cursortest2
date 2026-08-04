package com.gamericefishpro.space.v6;

import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final com.gamericefishpro.space.m.d a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    static {
        com.gamericefishpro.space.l6.q.d("WorkTimer");
    }

    public t(com.gamericefishpro.space.m.d dVar) {
        this.a = dVar;
    }

    public final void a(com.gamericefishpro.space.u6.j jVar) {
        synchronized (this.d) {
            try {
                if (((s) this.b.remove(jVar)) != null) {
                    com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                    Objects.toString(jVar);
                    qVarC.getClass();
                    this.c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
