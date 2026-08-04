package com.gamericefishpro.space.n9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements Runnable {
    public final /* synthetic */ b3 d;
    public final /* synthetic */ b3 e;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ e3 w;

    public c3(e3 e3Var, b3 b3Var, b3 b3Var2, long j, boolean z) {
        this.d = b3Var;
        this.e = b3Var2;
        this.i = j;
        this.v = z;
        this.w = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.B(this.d, this.e, this.i, this.v, null);
    }
}
