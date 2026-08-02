package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p6n implements q5a {
    public final t5a a;
    public final q2a b;
    public final List c;

    public p6n(t5a t5aVar, q2a q2aVar, List list) {
        this.a = t5aVar;
        this.b = q2aVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6n)) {
            return false;
        }
        p6n p6nVar = (p6n) obj;
        return Intrinsics.d(this.a, p6nVar.a) && Intrinsics.d(this.b, p6nVar.b) && Intrinsics.d(this.c, p6nVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2a q2aVar = this.b;
        return this.c.hashCode() + k5r.e((hashCode + (q2aVar == null ? 0 : q2aVar.hashCode())) * 31, 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueriedDocumentOrigin(query=");
        sb.append(this.a);
        sb.append(", preview=");
        sb.append(this.b);
        sb.append(", isForce=false, patchParams=");
        return vz1.u(sb, this.c, ")");
    }
}
