package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q7c implements s7c {
    public final Date a;
    public final rr5 b;

    public q7c(rr5 rr5Var, Date date) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7c)) {
            return false;
        }
        q7c q7cVar = (q7c) obj;
        return Intrinsics.d(this.a, q7cVar.a) && this.b.equals(q7cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unlike(timestamp=" + this.a + ", trackId=" + this.b + ")";
    }
}
