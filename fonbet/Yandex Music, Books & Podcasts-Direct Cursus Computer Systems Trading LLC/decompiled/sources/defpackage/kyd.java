package defpackage;

import com.appsflyer.internal.k;

/* loaded from: classes4.dex */
public final class kyd {
    public final String a;
    public final long b;
    public final int c;

    public kyd(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyd)) {
            return false;
        }
        kyd kydVar = (kyd) obj;
        return this.a.equals(kydVar.a) && this.b == kydVar.b && this.c == kydVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + tlm.c(this.b, tlm.c(1000L, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Histogram(name=", this.b, this.a, ", minValueMills=1000, maxValueMills=");
        q.append(", numOfBuckets=");
        q.append(this.c);
        q.append(")");
        return q.toString();
    }
}
