package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g4 extends c4 {
    public boolean i;

    public g4(m4 m4Var) {
        super(m4Var);
        this.e.K++;
    }

    public final void s() {
        if (!this.i) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.i) {
            throw new IllegalStateException("Can't initialize twice");
        }
        u();
        this.e.L++;
        this.i = true;
    }

    public abstract void u();
}
