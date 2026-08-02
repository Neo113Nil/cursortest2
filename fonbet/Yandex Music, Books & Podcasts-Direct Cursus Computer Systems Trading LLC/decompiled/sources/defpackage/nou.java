package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class nou {
    public final long a;
    public final String b;
    public final String c;
    public final s9p d;
    public final Date e;
    public final String f;
    public final Long g;
    public final Long h;
    public final String i;
    public final String j;

    public nou(long j, String str, String str2, s9p s9pVar, Date date, String str3, Long l, Long l2, String str4, String str5) {
        str.getClass();
        str2.getClass();
        s9pVar.getClass();
        date.getClass();
        str4.getClass();
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = s9pVar;
        this.e = date;
        this.f = str3;
        this.g = l;
        this.h = l2;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nou)) {
            return false;
        }
        nou nouVar = (nou) obj;
        return this.a == nouVar.a && Intrinsics.d(this.b, nouVar.b) && Intrinsics.d(this.c, nouVar.c) && Intrinsics.d(this.d, nouVar.d) && Intrinsics.d(this.e, nouVar.e) && Intrinsics.d(this.f, nouVar.f) && Intrinsics.d(this.g, nouVar.g) && Intrinsics.d(this.h, nouVar.h) && Intrinsics.d(this.i, nouVar.i) && Intrinsics.d(this.j, nouVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + k5r.d(k5r.c(k5r.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d.a)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.g;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.h;
        int c = k5r.c((hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.i);
        String str2 = this.j;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedbackDenormalizedEntity(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", rotorSessionId=");
        sb.append(this.c);
        sb.append(", seeds=");
        sb.append(this.d);
        sb.append(", timestamp=");
        sb.append(this.e);
        sb.append(", trackId=");
        sb.append(this.f);
        sb.append(", totalPlayedMs=");
        sb.append(this.g);
        sb.append(", trackDurationMs=");
        sb.append(this.h);
        su4.v(sb, ", from=", this.i, ", batchId=", this.j);
        sb.append(")");
        return sb.toString();
    }
}
