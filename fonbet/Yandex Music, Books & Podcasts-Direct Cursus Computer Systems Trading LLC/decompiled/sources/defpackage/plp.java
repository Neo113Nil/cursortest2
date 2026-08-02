package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class plp {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public plp(int i, String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plp)) {
            return false;
        }
        plp plpVar = (plp) obj;
        return Intrinsics.d(this.a, plpVar.a) && Intrinsics.d(this.b, plpVar.b) && this.c == plpVar.c && this.d == plpVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return eta.g(sb, this.d, ')');
    }
}
