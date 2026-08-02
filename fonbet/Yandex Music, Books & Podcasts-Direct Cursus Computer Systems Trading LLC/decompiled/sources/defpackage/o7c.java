package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o7c implements s7c {
    public final Date a;
    public final rr5 b;

    public o7c(rr5 rr5Var, Date date) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7c)) {
            return false;
        }
        o7c o7cVar = (o7c) obj;
        return Intrinsics.d(this.a, o7cVar.a) && this.b.equals(o7cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackStarted(timestamp=" + this.a + ", trackId=" + this.b + ")";
    }
}
