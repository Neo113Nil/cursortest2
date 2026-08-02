package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k7c implements s7c {
    public final Date a;
    public final rr5 b;
    public final long c;

    public k7c(Date date, rr5 rr5Var, long j) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7c)) {
            return false;
        }
        k7c k7cVar = (k7c) obj;
        return Intrinsics.d(this.a, k7cVar.a) && this.b.equals(k7cVar.b) && this.c == k7cVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dislike(timestamp=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", totalPlayedMs=");
        return hrg.m(this.c, ")", sb);
    }
}
