package defpackage;

import com.appsflyer.internal.k;

/* loaded from: classes3.dex */
public final class nmg implements omg {
    public final String a;
    public final long b;

    public nmg(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmg)) {
            return false;
        }
        nmg nmgVar = (nmg) obj;
        return this.a.equals(nmgVar.a) && this.b == nmgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Success(source=", this.b, this.a, ", timeDiff=");
        q.append(")");
        return q.toString();
    }
}
