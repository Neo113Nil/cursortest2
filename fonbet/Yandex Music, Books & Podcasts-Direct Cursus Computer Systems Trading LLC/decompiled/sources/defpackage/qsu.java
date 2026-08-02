package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qsu implements xsu {
    public final rr5 a;
    public final Long b;

    public qsu(rr5 rr5Var, Long l) {
        rr5Var.getClass();
        this.a = rr5Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsu)) {
            return false;
        }
        qsu qsuVar = (qsu) obj;
        return Intrinsics.d(this.a, qsuVar.a) && Intrinsics.d(this.b, qsuVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "StartFromExactRecommendedTrack(trackId=" + this.a + ", progress=" + this.b + ")";
    }
}
