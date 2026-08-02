package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jd1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final w3g d;

    public jd1(String str, String str2, boolean z, w3g w3gVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = w3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd1)) {
            return false;
        }
        jd1 jd1Var = (jd1) obj;
        return Intrinsics.d(this.a, jd1Var.a) && Intrinsics.d(this.b, jd1Var.b) && this.c == jd1Var.c && Intrinsics.d(this.d, jd1Var.d);
    }

    public final int hashCode() {
        int e = k5r.e(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        w3g w3gVar = this.d;
        return e + (w3gVar == null ? 0 : w3gVar.hashCode());
    }

    public final String toString() {
        StringBuilder m = f1d.m("ArtistListItemUiData(coverUrl=", this.a, ", title=", this.b, ", isLiked=");
        m.append(this.c);
        m.append(", likes=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
