package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    public float a;
    public float b;
    public float c;

    public m(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // com.gamericefishpro.space.w.o
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // com.gamericefishpro.space.w.o
    public final int b() {
        return 3;
    }

    @Override // com.gamericefishpro.space.w.o
    public final o c() {
        return new m(0.0f, 0.0f, 0.0f);
    }

    @Override // com.gamericefishpro.space.w.o
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // com.gamericefishpro.space.w.o
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.a == this.a && mVar.b == this.b && mVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + com.gamericefishpro.space.t0.y0.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
