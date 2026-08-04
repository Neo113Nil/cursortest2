package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends b0 {
    public boolean e;

    public g0(r1 r1Var) {
        super(r1Var);
        ((r1) this.d).T++;
    }

    public final void s() {
        if (!this.e) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.e) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (u()) {
            return;
        }
        ((r1) this.d).V.incrementAndGet();
        this.e = true;
    }

    public abstract boolean u();
}
