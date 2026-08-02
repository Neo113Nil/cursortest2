package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class crq implements r7c {
    public final Date a;
    public final String b;
    public final rr5 c;
    public final long d;
    public final String e;

    public crq(Date date, String str, rr5 rr5Var, long j, String str2) {
        date.getClass();
        str.getClass();
        str2.getClass();
        this.a = date;
        this.b = str;
        this.c = rr5Var;
        this.d = j;
        this.e = str2;
    }

    @Override // defpackage.r7c
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crq)) {
            return false;
        }
        crq crqVar = (crq) obj;
        return Intrinsics.d(this.a, crqVar.a) && Intrinsics.d(this.b, crqVar.b) && this.c.equals(crqVar.c) && this.d == crqVar.d && Intrinsics.d(this.e, crqVar.e);
    }

    @Override // defpackage.r7c
    public final Date getTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        return this.e.hashCode() + tlm.c(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipFeedback(timestamp=");
        sb.append(this.a);
        sb.append(", from=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", totalPlayedMs=");
        sb.append(this.d);
        return vz1.s(sb, ", batchId=", this.e, ")");
    }
}
