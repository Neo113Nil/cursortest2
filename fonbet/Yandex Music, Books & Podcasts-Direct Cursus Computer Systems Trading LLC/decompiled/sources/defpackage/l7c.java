package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l7c implements s7c {
    public final Date a;
    public final rr5 b;

    public l7c(rr5 rr5Var, Date date) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7c)) {
            return false;
        }
        l7c l7cVar = (l7c) obj;
        return Intrinsics.d(this.a, l7cVar.a) && this.b.equals(l7cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Like(timestamp=" + this.a + ", trackId=" + this.b + ")";
    }
}
