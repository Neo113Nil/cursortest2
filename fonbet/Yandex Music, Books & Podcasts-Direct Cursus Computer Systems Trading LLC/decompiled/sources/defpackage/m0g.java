package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0g {
    public final q0g a;
    public final String b;

    public m0g(q0g q0gVar, String str) {
        str.getClass();
        this.a = q0gVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0g)) {
            return false;
        }
        m0g m0gVar = (m0g) obj;
        return this.a == m0gVar.a && Intrinsics.d(this.b, m0gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlbumLikeOperation(type=" + this.a + ", albumId=" + this.b + ")";
    }
}
