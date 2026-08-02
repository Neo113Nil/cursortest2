package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r7h {
    public final int a;
    public final String b;
    public final String c;

    public r7h(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7h)) {
            return false;
        }
        r7h r7hVar = (r7h) obj;
        return this.a == r7hVar.a && Intrinsics.d(this.b, r7hVar.b) && this.c.equals(r7hVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return su4.o(k5r.r(this.a, "Major(id=", ", name=", this.b, ", techName="), this.c, ")");
    }
}
