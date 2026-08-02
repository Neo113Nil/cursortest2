package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t2q extends v2q {
    public final String a;
    public final long b;
    public final long c;

    public t2q(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j * 1000;
    }

    @Override // defpackage.v2q
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2q)) {
            return false;
        }
        t2q t2qVar = (t2q) obj;
        return Intrinsics.d(this.a, t2qVar.a) && this.b == t2qVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Silence(id=", this.b, this.a, ", durationMs=");
        q.append(")");
        return q.toString();
    }
}
