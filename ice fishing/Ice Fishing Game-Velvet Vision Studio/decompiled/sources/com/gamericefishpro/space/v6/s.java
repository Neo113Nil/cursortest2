package com.gamericefishpro.space.v6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {
    public final t d;
    public final com.gamericefishpro.space.u6.j e;

    public s(t tVar, com.gamericefishpro.space.u6.j jVar) {
        this.d = tVar;
        this.e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.d.d) {
            try {
                if (((s) this.d.b.remove(this.e)) != null) {
                    r rVar = (r) this.d.c.remove(this.e);
                    if (rVar != null) {
                        com.gamericefishpro.space.u6.j jVar = this.e;
                        com.gamericefishpro.space.o6.g gVar = (com.gamericefishpro.space.o6.g) rVar;
                        com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                        Objects.toString(jVar);
                        qVarC.getClass();
                        gVar.A.execute(new com.gamericefishpro.space.o6.f(gVar, 0));
                    }
                } else {
                    com.gamericefishpro.space.l6.q qVarC2 = com.gamericefishpro.space.l6.q.c();
                    this.e.toString();
                    qVarC2.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
