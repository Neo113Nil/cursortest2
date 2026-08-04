package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends com.gamericefishpro.space.ui.p implements Runnable {
    public final long w;

    public z1(long j, com.gamericefishpro.space.vh.c cVar) {
        super(cVar, cVar.getContext());
        this.w = j;
    }

    @Override // com.gamericefishpro.space.pi.l1
    public final String Y() {
        return super.Y() + "(timeMillis=" + this.w + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.l(this.i);
        s(new y1("Timed out waiting for " + this.w + " ms", this));
    }
}
