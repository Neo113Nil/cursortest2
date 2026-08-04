package com.gamericefishpro.space.w6;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final j d;
    public final com.gamericefishpro.space.va.b e;

    public e(j jVar, com.gamericefishpro.space.va.b bVar) {
        this.d = jVar;
        this.e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.d != this) {
            return;
        }
        if (h.y.n(this.d, this, h.f(this.e))) {
            h.c(this.d);
        }
    }
}
