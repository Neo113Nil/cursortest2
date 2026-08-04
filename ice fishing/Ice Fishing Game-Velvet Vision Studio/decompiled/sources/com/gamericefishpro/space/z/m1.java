package com.gamericefishpro.space.z;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 implements x0 {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ o1 b;

    public m1(q1 q1Var, o1 o1Var) {
        this.a = q1Var;
        this.b = o1Var;
    }

    @Override // com.gamericefishpro.space.z.x0
    public final float a(float f) {
        float fAbs = Math.abs(f);
        q1 q1Var = this.a;
        if (fAbs != 0.0f && !((Boolean) q1Var.h.invoke()).booleanValue()) {
            throw new com.gamericefishpro.space.y.s0("The fling animation was cancelled", 1);
        }
        return q1Var.d(q1Var.g(this.b.a(2, q1Var.e(q1Var.h(f)))));
    }
}
