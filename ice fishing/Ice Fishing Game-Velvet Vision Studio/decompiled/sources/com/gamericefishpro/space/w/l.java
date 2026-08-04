package com.gamericefishpro.space.w;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o {
    public float a;
    public float b;

    public l(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // com.gamericefishpro.space.w.o
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // com.gamericefishpro.space.w.o
    public final int b() {
        return 2;
    }

    @Override // com.gamericefishpro.space.w.o
    public final o c() {
        return new l(0.0f, 0.0f);
    }

    @Override // com.gamericefishpro.space.w.o
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // com.gamericefishpro.space.w.o
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.a == this.a && lVar.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
