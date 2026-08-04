package com.gamericefishpro.space.sa;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p implements Runnable {
    public final com.gamericefishpro.space.r9.h d;

    public p() {
        this.d = null;
    }

    public void a(Exception exc) {
        com.gamericefishpro.space.r9.h hVar = this.d;
        if (hVar != null) {
            hVar.b(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public p(com.gamericefishpro.space.r9.h hVar) {
        this.d = hVar;
    }
}
