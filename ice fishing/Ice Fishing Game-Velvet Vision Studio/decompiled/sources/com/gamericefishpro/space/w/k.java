package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    public float a;

    public k(float f) {
        this.a = f;
    }

    @Override // com.gamericefishpro.space.w.o
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // com.gamericefishpro.space.w.o
    public final int b() {
        return 1;
    }

    @Override // com.gamericefishpro.space.w.o
    public final o c() {
        return new k(0.0f);
    }

    @Override // com.gamericefishpro.space.w.o
    public final void d() {
        this.a = 0.0f;
    }

    @Override // com.gamericefishpro.space.w.o
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
