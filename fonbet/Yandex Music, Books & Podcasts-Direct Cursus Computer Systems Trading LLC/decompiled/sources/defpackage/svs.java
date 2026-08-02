package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class svs implements r7c {
    public final Date a;
    public final String b;
    public final rr5 c;
    public final long d;
    public final long e;
    public final String f;

    public svs(Date date, String str, rr5 rr5Var, long j, long j2, String str2) {
        date.getClass();
        str.getClass();
        str2.getClass();
        this.a = date;
        this.b = str;
        this.c = rr5Var;
        this.d = j;
        this.e = j2;
        this.f = str2;
    }

    @Override // defpackage.r7c
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svs)) {
            return false;
        }
        svs svsVar = (svs) obj;
        return Intrinsics.d(this.a, svsVar.a) && Intrinsics.d(this.b, svsVar.b) && this.c.equals(svsVar.c) && this.d == svsVar.d && this.e == svsVar.e && Intrinsics.d(this.f, svsVar.f);
    }

    @Override // defpackage.r7c
    public final Date getTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + tlm.c(this.e, tlm.c(this.d, (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackFinishedFeedback(timestamp=");
        sb.append(this.a);
        sb.append(", from=");
        sb.append(this.b);
        sb.append(", trackId=");
        sb.append(this.c);
        sb.append(", totalPlayedMs=");
        sb.append(this.d);
        ouj.C(sb, ", trackDurationMs=", this.e, ", batchId=");
        return su4.o(sb, this.f, ")");
    }
}
