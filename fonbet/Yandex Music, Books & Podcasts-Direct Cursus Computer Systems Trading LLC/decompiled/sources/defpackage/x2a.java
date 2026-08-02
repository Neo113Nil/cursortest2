package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x2a extends cxb {
    public final q2a t;
    public final r2a u;

    public x2a(q2a q2aVar, r2a r2aVar) {
        this.t = q2aVar;
        this.u = r2aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2a)) {
            return false;
        }
        x2a x2aVar = (x2a) obj;
        return Intrinsics.d(this.t, x2aVar.t) && Intrinsics.d(this.u, x2aVar.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (this.t.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateDocument(document=" + this.t + ", previousDocumentActionsCallbacksConfig=" + this.u + ")";
    }
}
