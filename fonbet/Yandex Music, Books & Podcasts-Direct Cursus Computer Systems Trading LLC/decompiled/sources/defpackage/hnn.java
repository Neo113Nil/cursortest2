package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class hnn extends gnn {
    public final long a;
    public final long b;
    public final long c;
    public final String d;

    public hnn(String str, long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
    }

    @Override // defpackage.inn
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnn)) {
            return false;
        }
        hnn hnnVar = (hnn) obj;
        return this.a == hnnVar.a && this.b == hnnVar.b && this.c == hnnVar.c && Intrinsics.d(this.d, hnnVar.d);
    }

    public final int hashCode() {
        int c = tlm.c(this.c, tlm.c(this.b, tlm.c(this.a, 1722108116, 31), 31), 31);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanLog(region=prepareSynchronouslyInternal, startMs=");
        sb.append(this.a);
        sb.append(", endMs=");
        sb.append(this.b);
        sb.append(", durationMs=");
        sb.append(this.c);
        sb.append(", interruptionReason=");
        return dfi.i(sb, this.d, ')');
    }
}
