package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m7c implements s7c {
    public final Date a;
    public final rr5 b;
    public final long c;

    public m7c(Date date, rr5 rr5Var, long j) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7c)) {
            return false;
        }
        m7c m7cVar = (m7c) obj;
        return Intrinsics.d(this.a, m7cVar.a) && this.b.equals(m7cVar.b) && this.c == m7cVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Skip(timestamp=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", totalPlayedMs=");
        return hrg.m(this.c, ")", sb);
    }
}
