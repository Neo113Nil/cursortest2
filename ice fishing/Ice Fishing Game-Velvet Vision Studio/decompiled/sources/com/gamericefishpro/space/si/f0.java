package com.gamericefishpro.space.si;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.gamericefishpro.space.ti.d {
    public long a;
    public com.gamericefishpro.space.pi.h b;

    @Override // com.gamericefishpro.space.ti.d
    public final boolean a(com.gamericefishpro.space.ti.b bVar) {
        d0 d0Var = (d0) bVar;
        if (this.a >= 0) {
            return false;
        }
        long j = d0Var.B;
        if (j < d0Var.C) {
            d0Var.C = j;
        }
        this.a = j;
        return true;
    }

    @Override // com.gamericefishpro.space.ti.d
    public final com.gamericefishpro.space.th.a[] b(com.gamericefishpro.space.ti.b bVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((d0) bVar).v(j);
    }
}
