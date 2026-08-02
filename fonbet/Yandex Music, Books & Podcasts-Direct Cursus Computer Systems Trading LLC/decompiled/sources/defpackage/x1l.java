package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x1l {
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;

    public x1l(String str, long j, boolean z, long j2, long j3) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1l)) {
            return false;
        }
        x1l x1lVar = (x1l) obj;
        return Intrinsics.d(this.a, x1lVar.a) && this.b == x1lVar.b && this.c == x1lVar.c && this.d == x1lVar.d && this.e == x1lVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + tlm.c(this.d, k5r.e(tlm.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder q = k.q("PlaybackProgressDbRow(trackId=", this.b, this.a, ", progress=");
        q.append(", complete=");
        q.append(this.c);
        q.append(", updateTimeMills=");
        q.append(this.d);
        q.append(", totalLength=");
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
