package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w7c {
    public final String a;
    public final long b;

    public w7c(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7c)) {
            return false;
        }
        w7c w7cVar = (w7c) obj;
        return Intrinsics.d(this.a, w7cVar.a) && this.b == w7cVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q = k.q("FeedbackInvocationInfo(feedback=", this.b, this.a, ", elapsedTimeMs=");
        q.append(")");
        return q.toString();
    }
}
