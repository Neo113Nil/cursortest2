package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u0s {
    public final String a;
    public final int b;
    public final boolean c;

    public u0s(String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0s)) {
            return false;
        }
        u0s u0sVar = (u0s) obj;
        return Intrinsics.d(this.a, u0sVar.a) && this.b == u0sVar.b && this.c == u0sVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ouj.r(f1d.l(this.b, "TabInfo(id=", this.a, ", position=", ", selectedByDefault="), this.c, ")");
    }
}
