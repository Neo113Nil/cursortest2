package com.gamericefishpro.space.t;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends com.gamericefishpro.space.ph.j0 {
    public int d;
    public final /* synthetic */ s0 e;

    public t0(s0 s0Var) {
        this.e = s0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.e.f();
    }

    @Override // com.gamericefishpro.space.ph.j0
    public final int nextInt() {
        int i = this.d;
        this.d = i + 1;
        return this.e.d(i);
    }
}
