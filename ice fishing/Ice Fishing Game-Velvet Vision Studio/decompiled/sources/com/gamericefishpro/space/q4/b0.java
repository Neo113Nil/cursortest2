package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 implements i0 {
    public i0[] a;

    @Override // com.gamericefishpro.space.q4.i0
    public final s0 a(Class cls) {
        for (i0 i0Var : this.a) {
            if (i0Var.b(cls)) {
                return i0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.gamericefishpro.space.q4.i0
    public final boolean b(Class cls) {
        for (i0 i0Var : this.a) {
            if (i0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
