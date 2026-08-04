package com.gamericefishpro.space.k0;

import com.gamericefishpro.space.c3.f;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public final float a;

    public b(float f) {
        this.a = f;
    }

    @Override // com.gamericefishpro.space.k0.a
    public final float a(long j, com.gamericefishpro.space.c3.c cVar) {
        return cVar.r(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && f.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
