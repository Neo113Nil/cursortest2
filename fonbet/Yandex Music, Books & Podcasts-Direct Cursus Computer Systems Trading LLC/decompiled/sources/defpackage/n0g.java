package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0g {
    public final q0g a;
    public final String b;

    public n0g(q0g q0gVar, String str) {
        str.getClass();
        this.a = q0gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0g)) {
            return false;
        }
        n0g n0gVar = (n0g) obj;
        return this.a == n0gVar.a && Intrinsics.d(this.b, n0gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtistLikeOperation(type=" + this.a + ", artistId=" + this.b + ")";
    }
}
