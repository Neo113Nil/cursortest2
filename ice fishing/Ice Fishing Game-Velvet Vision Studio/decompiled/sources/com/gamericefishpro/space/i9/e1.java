package com.gamericefishpro.space.i9;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends g1 {
    public final /* synthetic */ g0 A;
    public final /* synthetic */ j1 B;
    public final /* synthetic */ String w;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j1 j1Var, String str, String str2, boolean z, g0 g0Var) {
        super(j1Var, true);
        this.w = str;
        this.y = str2;
        this.z = z;
        this.A = g0Var;
        this.B = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        j0 j0Var = this.B.e;
        com.gamericefishpro.space.v8.c0.g(j0Var);
        j0Var.getUserProperties(this.w, this.y, this.z, this.A);
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void b() {
        this.A.h(null);
    }
}
