package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vkt implements r7c {
    public final Date a;
    public final String b;
    public final rr5 c;
    public final String d;

    public vkt(Date date, String str, rr5 rr5Var, String str2) {
        date.getClass();
        str.getClass();
        str2.getClass();
        this.a = date;
        this.b = str;
        this.c = rr5Var;
        this.d = str2;
    }

    @Override // defpackage.r7c
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkt)) {
            return false;
        }
        vkt vktVar = (vkt) obj;
        return Intrinsics.d(this.a, vktVar.a) && Intrinsics.d(this.b, vktVar.b) && this.c.equals(vktVar.c) && Intrinsics.d(this.d, vktVar.d);
    }

    @Override // defpackage.r7c
    public final Date getTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "UnlikeFeedback(timestamp=" + this.a + ", from=" + this.b + ", trackId=" + this.c + ", batchId=" + this.d + ")";
    }
}
