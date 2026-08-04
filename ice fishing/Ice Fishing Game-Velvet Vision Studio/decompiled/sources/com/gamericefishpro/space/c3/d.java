package com.gamericefishpro.space.c3;

import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {
    public final float d;
    public final float e;

    public d(float f, float f2) {
        this.d = f;
        this.e = f2;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.d, dVar.d) == 0 && Float.compare(this.e, dVar.e) == 0;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.e;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.d);
        sb.append(", fontScale=");
        return y0.h(sb, this.e, ')');
    }
}
