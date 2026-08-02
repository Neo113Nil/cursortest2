package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yhi extends bii {
    public final String a;
    public final int b;
    public final String c;

    public yhi(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhi)) {
            return false;
        }
        yhi yhiVar = (yhi) obj;
        return Intrinsics.d(this.a, yhiVar.a) && this.b == yhiVar.b && Intrinsics.d(this.c, yhiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return su4.o(f1d.l(this.b, "HttpError(url=", this.a, ", code=", ", errorMessage="), this.c, ")");
    }
}
