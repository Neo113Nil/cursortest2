package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m6u {
    public final String a;
    public final long b;
    public final long c;

    public m6u(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6u)) {
            return false;
        }
        m6u m6uVar = (m6u) obj;
        return Intrinsics.d(this.a, m6uVar.a) && this.b == m6uVar.b && this.c == m6uVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.c) + tlm.c(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder q = k.q("VideoClipProgressWithDuration(forClipId=", this.b, this.a, ", progress=");
        q.append(", duration=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
