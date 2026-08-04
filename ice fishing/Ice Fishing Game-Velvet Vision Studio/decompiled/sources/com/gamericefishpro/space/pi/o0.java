package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements z0 {
    public final boolean d;

    public o0(boolean z) {
        this.d = z;
    }

    @Override // com.gamericefishpro.space.pi.z0
    public final boolean b() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.pi.z0
    public final n1 d() {
        return null;
    }

    public final String toString() {
        return com.gamericefishpro.space.t0.y0.i(new StringBuilder("Empty{"), this.d ? "Active" : "New", '}');
    }
}
