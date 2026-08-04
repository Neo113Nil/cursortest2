package com.gamericefishpro.space.d0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements u0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public w0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            com.gamericefishpro.space.e0.a.a("Padding must be non-negative");
        }
    }

    @Override // com.gamericefishpro.space.d0.u0
    public final float a() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.d0.u0
    public final float b() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.d0.u0
    public final float c(com.gamericefishpro.space.c3.l lVar) {
        return lVar == com.gamericefishpro.space.c3.l.d ? this.c : this.a;
    }

    @Override // com.gamericefishpro.space.d0.u0
    public final float d(com.gamericefishpro.space.c3.l lVar) {
        return lVar == com.gamericefishpro.space.c3.l.d ? this.a : this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return com.gamericefishpro.space.c3.f.b(this.a, w0Var.a) && com.gamericefishpro.space.c3.f.b(this.b, w0Var.b) && com.gamericefishpro.space.c3.f.b(this.c, w0Var.c) && com.gamericefishpro.space.c3.f.b(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + com.gamericefishpro.space.t0.y0.a(this.c, com.gamericefishpro.space.t0.y0.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) com.gamericefishpro.space.c3.f.c(this.a)) + ", top=" + ((Object) com.gamericefishpro.space.c3.f.c(this.b)) + ", end=" + ((Object) com.gamericefishpro.space.c3.f.c(this.c)) + ", bottom=" + ((Object) com.gamericefishpro.space.c3.f.c(this.d)) + ')';
    }
}
