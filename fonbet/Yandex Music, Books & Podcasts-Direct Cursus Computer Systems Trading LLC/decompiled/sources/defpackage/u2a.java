package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u2a extends cxb {
    public final t5a t;
    public final q2a u;

    public u2a(q2a q2aVar, t5a t5aVar) {
        this.t = t5aVar;
        this.u = q2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2a)) {
            return false;
        }
        u2a u2aVar = (u2a) obj;
        return Intrinsics.d(this.t, u2aVar.t) && Intrinsics.d(this.u, u2aVar.u);
    }

    public final int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        q2a q2aVar = this.u;
        return hashCode + (q2aVar != null ? q2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "LoadDocument(query=" + this.t + ", preview=" + this.u + ")";
    }
}
