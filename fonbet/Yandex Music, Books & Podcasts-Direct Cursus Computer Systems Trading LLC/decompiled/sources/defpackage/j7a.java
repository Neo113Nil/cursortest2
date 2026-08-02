package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j7a {
    public final String a;
    public final String b;
    public final upi c;

    public j7a(String str, String str2, upi upiVar) {
        str.getClass();
        str2.getClass();
        upiVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = upiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7a)) {
            return false;
        }
        j7a j7aVar = (j7a) obj;
        return Intrinsics.d(this.a, j7aVar.a) && Intrinsics.d(this.b, j7aVar.b) && Intrinsics.d(this.c, j7aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DomainExperiments(testIds=" + this.a + ", triggeredTestIds=" + this.b + ", flags=" + this.c + ')';
    }
}
