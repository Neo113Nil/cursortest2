package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ews {
    public final String a;
    public final be6 b;
    public final pq4 c;

    public ews(String str, be6 be6Var, pq4 pq4Var) {
        this.a = str;
        this.b = be6Var;
        this.c = pq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ews)) {
            return false;
        }
        ews ewsVar = (ews) obj;
        return Intrinsics.d(this.a, ewsVar.a) && this.b == ewsVar.b && Intrinsics.d(this.c, ewsVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        be6 be6Var = this.b;
        int hashCode2 = (hashCode + (be6Var == null ? 0 : be6Var.hashCode())) * 31;
        pq4 pq4Var = this.c;
        return hashCode2 + (pq4Var != null ? pq4Var.hashCode() : 0);
    }

    public final String toString() {
        return "TrackInfo(trackId=" + this.a + ", contentType=" + this.b + ", codecBitrate=" + this.c + ")";
    }
}
