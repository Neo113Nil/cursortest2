package com.gamericefishpro.space.z4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {
    public final /* synthetic */ b0 d;

    public z(b0 b0Var) {
        this.d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.d.a) {
            obj = this.d.d;
            this.d.d = b0.i;
        }
        this.d.b(obj);
    }
}
