package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xzf implements r7c {
    public final Date a;
    public final String b;
    public final rr5 c;
    public final String d;

    public xzf(Date date, String str, rr5 rr5Var, String str2) {
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
        if (!(obj instanceof xzf)) {
            return false;
        }
        xzf xzfVar = (xzf) obj;
        return Intrinsics.d(this.a, xzfVar.a) && Intrinsics.d(this.b, xzfVar.b) && this.c.equals(xzfVar.c) && Intrinsics.d(this.d, xzfVar.d);
    }

    @Override // defpackage.r7c
    public final Date getTimestamp() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "LikeFeedback(timestamp=" + this.a + ", from=" + this.b + ", trackId=" + this.c + ", batchId=" + this.d + ")";
    }
}
