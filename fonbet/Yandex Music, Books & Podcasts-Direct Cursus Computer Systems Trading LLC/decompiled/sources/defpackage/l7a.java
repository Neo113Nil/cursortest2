package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l7a {
    public final String a;
    public final String b;
    public final k7a c;

    public l7a(String str, String str2, k7a k7aVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = k7aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7a)) {
            return false;
        }
        l7a l7aVar = (l7a) obj;
        return Intrinsics.d(this.a, l7aVar.a) && Intrinsics.d(this.b, l7aVar.b) && this.c == l7aVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "DomainPlusState(balance=" + this.a + ", currency=" + this.b + ", status=" + this.c + ')';
    }
}
