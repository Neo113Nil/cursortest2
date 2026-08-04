package com.gamericefishpro.space.g0;

import com.gamericefishpro.space.h0.z;
import com.gamericefishpro.space.t0.p1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements z {
    public final v a;
    public final g b;
    public final com.gamericefishpro.space.f1.z c;

    public h(v vVar, g gVar, com.gamericefishpro.space.f1.z zVar) {
        this.a = vVar;
        this.b = gVar;
        this.c = zVar;
    }

    @Override // com.gamericefishpro.space.h0.z
    public final int a() {
        return this.b.k().a;
    }

    @Override // com.gamericefishpro.space.h0.z
    public final Object b(int i) {
        com.gamericefishpro.space.f1.z zVar = this.c;
        Object[] objArr = (Object[]) zVar.c;
        int i2 = i - zVar.a;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.l(i) : obj;
    }

    @Override // com.gamericefishpro.space.h0.z
    public final Object c(int i) {
        return this.b.j(i);
    }

    @Override // com.gamericefishpro.space.h0.z
    public final int d(Object obj) {
        return this.c.e(obj);
    }

    @Override // com.gamericefishpro.space.h0.z
    public final void e(int i, Object obj, com.gamericefishpro.space.t0.r rVar, int i2) {
        rVar.b0(1493551140);
        int i3 = (rVar.d(i) ? 4 : 2) | i2 | (rVar.h(obj) ? 32 : 16) | (rVar.f(this) ? 256 : 128);
        if (rVar.S(i3 & 1, (i3 & 147) != 146)) {
            com.gamericefishpro.space.h0.n.b(obj, i, this.a.q, com.gamericefishpro.space.b1.n.c(726189336, new com.gamericefishpro.space.f0.i(i, 1, this), rVar), rVar, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            rVar.V();
        }
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.b1.f(this, i, obj, i2, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return Intrinsics.a(this.b, ((h) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
