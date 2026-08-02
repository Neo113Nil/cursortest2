package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ymj implements cnj {
    public final Date a;
    public final rr5 b;
    public final long c;

    public ymj(Date date, rr5 rr5Var, long j) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymj)) {
            return false;
        }
        ymj ymjVar = (ymj) obj;
        return Intrinsics.d(this.a, ymjVar.a) && this.b.equals(ymjVar.b) && this.c == ymjVar.c;
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
