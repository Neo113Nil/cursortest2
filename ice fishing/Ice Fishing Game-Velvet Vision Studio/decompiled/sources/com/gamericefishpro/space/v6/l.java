package com.gamericefishpro.space.v6;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public final com.gamericefishpro.space.m6.o d;
    public final com.gamericefishpro.space.m6.j e;
    public final boolean i;

    static {
        com.gamericefishpro.space.l6.q.d("StopWorkRunnable");
    }

    public l(com.gamericefishpro.space.m6.o oVar, com.gamericefishpro.space.m6.j jVar, boolean z) {
        this.d = oVar;
        this.e = jVar;
        this.i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.gamericefishpro.space.m6.p pVar;
        if (this.i) {
            com.gamericefishpro.space.m6.f fVar = this.d.f;
            com.gamericefishpro.space.m6.j jVar = this.e;
            fVar.getClass();
            String str = jVar.a.a;
            synchronized (fVar.E) {
                try {
                    com.gamericefishpro.space.l6.q.c().getClass();
                    pVar = (com.gamericefishpro.space.m6.p) fVar.y.remove(str);
                    if (pVar != null) {
                        fVar.A.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.gamericefishpro.space.m6.f.b(pVar);
        } else {
            com.gamericefishpro.space.m6.f fVar2 = this.d.f;
            com.gamericefishpro.space.m6.j jVar2 = this.e;
            fVar2.getClass();
            String str2 = jVar2.a.a;
            synchronized (fVar2.E) {
                try {
                    com.gamericefishpro.space.m6.p pVar2 = (com.gamericefishpro.space.m6.p) fVar2.z.remove(str2);
                    if (pVar2 == null) {
                        com.gamericefishpro.space.l6.q.c().getClass();
                    } else {
                        Set set = (Set) fVar2.A.get(str2);
                        if (set != null && set.contains(jVar2)) {
                            com.gamericefishpro.space.l6.q.c().getClass();
                            fVar2.A.remove(str2);
                            com.gamericefishpro.space.m6.f.b(pVar2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
        com.gamericefishpro.space.u6.j jVar3 = this.e.a;
        qVarC.getClass();
    }
}
