package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class du5 {
    public final String a;
    public final String b;

    public du5(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du5)) {
            return false;
        }
        du5 du5Var = (du5) obj;
        return Intrinsics.d(this.a, du5Var.a) && Intrinsics.d(this.b, du5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("ConcertCatalogUrlSchemeParams(type=", this.a, ", id=", this.b, ")");
    }
}
