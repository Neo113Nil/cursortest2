package com.gamericefishpro.space.h1;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final float a;

    public c(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, com.gamericefishpro.space.c3.l lVar) {
        float f = (i2 - i) / 2.0f;
        com.gamericefishpro.space.c3.l lVar2 = com.gamericefishpro.space.c3.l.d;
        float f2 = this.a;
        if (lVar != lVar2) {
            f2 *= -1;
        }
        return Math.round((1 + f2) * f);
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
        return y0.h(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
