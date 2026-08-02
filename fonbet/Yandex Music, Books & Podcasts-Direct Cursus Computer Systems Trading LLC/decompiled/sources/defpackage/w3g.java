package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w3g {
    public final String a;
    public final String b;
    public final boolean c;

    public w3g(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3g)) {
            return false;
        }
        w3g w3gVar = (w3g) obj;
        return Intrinsics.d(this.a, w3gVar.a) && Intrinsics.d(this.b, w3gVar.b) && this.c == w3gVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("LikesCountUiData(text=", this.a, ", contentDescription=", this.b, ", isLiked="), this.c, ")");
    }
}
