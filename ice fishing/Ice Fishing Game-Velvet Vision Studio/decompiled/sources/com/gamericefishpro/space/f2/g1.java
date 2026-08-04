package com.gamericefishpro.space.f2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public final j1 a;
    public h0 b;
    public final f1 c = new f1(this, 2);
    public final f1 d = new f1(this, 0);
    public final f1 e = new f1(this, 1);

    public g1(j1 j1Var) {
        this.a = j1Var;
    }

    public final h0 a() {
        h0 h0Var = this.b;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
