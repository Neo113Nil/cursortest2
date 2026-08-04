package com.gamericefishpro.space.j1;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final int a;
    public final long b;
    public final f c;
    public final com.gamericefishpro.space.vb.c d;

    public e(int i, long j, f fVar, com.gamericefishpro.space.vb.c cVar) {
        this.a = i;
        this.b = j;
        this.c = fVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && Intrinsics.a(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + y0.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        com.gamericefishpro.space.vb.c cVar = this.d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
