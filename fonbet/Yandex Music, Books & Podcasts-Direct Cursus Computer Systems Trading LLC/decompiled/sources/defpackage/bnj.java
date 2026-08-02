package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bnj implements cnj {
    public final Date a;
    public final rr5 b;

    public bnj(rr5 rr5Var, Date date) {
        date.getClass();
        this.a = date;
        this.b = rr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnj)) {
            return false;
        }
        bnj bnjVar = (bnj) obj;
        return Intrinsics.d(this.a, bnjVar.a) && this.b.equals(bnjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unlike(timestamp=" + this.a + ", trackId=" + this.b + ")";
    }
}
