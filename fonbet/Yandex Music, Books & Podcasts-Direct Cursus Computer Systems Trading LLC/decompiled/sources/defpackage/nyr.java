package defpackage;

import com.appsflyer.internal.k;

/* loaded from: classes4.dex */
public final class nyr {
    public final String a;
    public final long b;
    public final long c;

    public nyr(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyr)) {
            return false;
        }
        nyr nyrVar = (nyr) obj;
        return this.a.equals(nyrVar.a) && this.b == nyrVar.b && this.c == nyrVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder q = k.q("SyntheticRequestId(url=", this.b, this.a, ", sentRequestAtMillis=");
        q.append(", receivedResponseAtMillis=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
