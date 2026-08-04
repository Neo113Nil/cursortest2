package com.gamericefishpro.space.c3;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {
    public final float d;
    public final float e;
    public final com.gamericefishpro.space.d3.a i;

    public e(float f, float f2, com.gamericefishpro.space.d3.a aVar) {
        this.d = f;
        this.e = f2;
        this.i = aVar;
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float D(long j) {
        if (o.a(n.b(j), 4294967296L)) {
            return this.i.b(n.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.d, eVar.d) == 0 && Float.compare(this.e, eVar.e) == 0 && Intrinsics.a(this.i, eVar.i);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final float g() {
        return this.e;
    }

    public final int hashCode() {
        return this.i.hashCode() + y0.a(this.e, Float.hashCode(this.d) * 31, 31);
    }

    @Override // com.gamericefishpro.space.c3.c
    public final long q(float f) {
        return com.gamericefishpro.space.hj.c.G(4294967296L, this.i.a(f));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.d + ", fontScale=" + this.e + ", converter=" + this.i + ')';
    }
}
