package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r4g {
    public final rr5 a;
    public final Long b;

    public r4g(rr5 rr5Var, Long l) {
        this.a = rr5Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4g)) {
            return false;
        }
        r4g r4gVar = (r4g) obj;
        return this.a.equals(r4gVar.a) && Intrinsics.d(this.b, r4gVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TrackLikeData(trackId=" + this.a + ", timestamp=" + this.b + ")";
    }
}
