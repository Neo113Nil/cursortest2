package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q91 {
    public final String a;
    public final String b;
    public final boolean c;

    public q91(String str, String str2, boolean z) {
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
        if (!(obj instanceof q91)) {
            return false;
        }
        q91 q91Var = (q91) obj;
        return Intrinsics.d(this.a, q91Var.a) && Intrinsics.d(this.b, q91Var.b) && this.c == q91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ouj.r(f1d.m("ArtistGridItemUiData(title=", this.a, ", imageUrl=", this.b, ", hasTrailer="), this.c, ")");
    }
}
