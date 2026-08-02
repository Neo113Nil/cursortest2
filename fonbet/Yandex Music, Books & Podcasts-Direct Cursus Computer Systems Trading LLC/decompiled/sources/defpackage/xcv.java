package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xcv {
    public final String a;
    public final boolean b;
    public final String c;

    public xcv(String str, String str2, boolean z) {
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
        if (!(obj instanceof xcv)) {
            return false;
        }
        xcv xcvVar = (xcv) obj;
        return Intrinsics.d(this.a, xcvVar.a) && this.b == xcvVar.b && Intrinsics.d(this.c, xcvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return su4.o(v3w.h("WebUrl(url=", this.a, ", isAuthUrl=", ", acceptLanguage=", this.b), this.c, ")");
    }

    public /* synthetic */ xcv(String str, String str2, int i) {
        this(str, (i & 4) != 0 ? "ru" : str2, false);
    }
}
