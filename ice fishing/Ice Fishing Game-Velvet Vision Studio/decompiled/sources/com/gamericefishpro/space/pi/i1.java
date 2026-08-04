package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends h {
    public final l1 B;

    public i1(com.gamericefishpro.space.th.a aVar, l1 l1Var) {
        super(1, aVar);
        this.B = l1Var;
    }

    @Override // com.gamericefishpro.space.pi.h
    public final Throwable q(l1 l1Var) {
        Throwable thC;
        l1 l1Var2 = this.B;
        l1Var2.getClass();
        Object obj = l1.d.get(l1Var2);
        if (!(obj instanceof k1) || (thC = ((k1) obj).c()) == null) {
            return obj instanceof q ? ((q) obj).a : l1Var.t();
        }
        return thC;
    }

    @Override // com.gamericefishpro.space.pi.h
    public final String z() {
        return "AwaitContinuation";
    }
}
