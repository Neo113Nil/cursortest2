package defpackage;

import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class hdr implements mbq {
    public final long a;
    public final long b;

    public hdr(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j < 0) {
            xq0.o(dfi.e(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        xq0.o(dfi.e(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // defpackage.mbq
    public final pjc a(wor worVar) {
        return zsd.b0(new clc(zsd.M0(worVar, new gdr(this, null)), new z0i(2, 26, null), 3));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hdr)) {
            return false;
        }
        hdr hdrVar = (hdr) obj;
        return this.a == hdrVar.a && this.b == hdrVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        n8g n8gVar = new n8g(2);
        long j = this.a;
        if (j > 0) {
            n8gVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            n8gVar.add("replayExpiration=" + j2 + "ms");
        }
        return dfi.i(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.X(t75.a(n8gVar), null, null, null, null, 63), ')');
    }
}
