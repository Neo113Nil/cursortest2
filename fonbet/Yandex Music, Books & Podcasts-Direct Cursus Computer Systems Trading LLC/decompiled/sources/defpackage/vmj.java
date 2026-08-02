package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vmj implements cnj {
    public final Date a;
    public final rr5 b;
    public final long c;

    public vmj(Date date, rr5 rr5Var, long j) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vmj)) {
            return false;
        }
        vmj vmjVar = (vmj) obj;
        return Intrinsics.d(this.a, vmjVar.a) && this.b.equals(vmjVar.b) && this.c == vmjVar.c;
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
