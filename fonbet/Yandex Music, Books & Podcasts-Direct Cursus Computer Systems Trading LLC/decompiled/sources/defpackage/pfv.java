package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pfv implements qfv {
    public final String a;
    public final boolean b;
    public final String c;

    public pfv(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfv)) {
            return false;
        }
        pfv pfvVar = (pfv) obj;
        return Intrinsics.d(this.a, pfvVar.a) && this.b == pfvVar.b && Intrinsics.d(this.c, pfvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(v3w.h("WebPage(url=", this.a, ", isAuthUrl=", ", language=", this.b), this.c, ")");
    }
}
