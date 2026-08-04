package com.gamericefishpro.space.k0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {
    public final float a;

    public c(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            com.gamericefishpro.space.c0.a.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // com.gamericefishpro.space.k0.a
    public final float a(long j, com.gamericefishpro.space.c3.c cVar) {
        return (this.a / 100.0f) * com.gamericefishpro.space.n1.e.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.compare(this.a, ((c) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
