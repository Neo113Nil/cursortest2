package com.gamericefishpro.space.b3;

import com.gamericefishpro.space.o1.i0;
import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {
    public final i0 a;
    public final float b;

    public b(i0 i0Var, float f) {
        this.a = i0Var;
        this.b = f;
    }

    @Override // com.gamericefishpro.space.b3.o
    public final float a() {
        return this.b;
    }

    @Override // com.gamericefishpro.space.b3.o
    public final long b() {
        int i = com.gamericefishpro.space.o1.s.h;
        return com.gamericefishpro.space.o1.s.g;
    }

    @Override // com.gamericefishpro.space.b3.o
    public final com.gamericefishpro.space.o1.o c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.a(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return y0.h(sb, this.b, ')');
    }
}
