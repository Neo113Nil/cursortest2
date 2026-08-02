package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l1l {
    public final String a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;

    public l1l(String str, long j, boolean z, long j2, long j3) {
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
        if (!(obj instanceof l1l)) {
            return false;
        }
        l1l l1lVar = (l1l) obj;
        return Intrinsics.d(this.a, l1lVar.a) && this.b == l1lVar.b && this.c == l1lVar.c && this.d == l1lVar.d && this.e == l1lVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + tlm.c(this.d, k5r.e(tlm.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder q = k.q("PlaybackProgress(trackId=", this.b, this.a, ", progress=");
        q.append(", complete=");
        q.append(this.c);
        q.append(", updateTime=");
        q.append(this.d);
        q.append(", totalLength=");
        q.append(this.e);
        q.append(")");
        return q.toString();
    }
}
