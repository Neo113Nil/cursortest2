package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0g {
    public final q0g a;
    public final nvl b;

    public o0g(q0g q0gVar, nvl nvlVar) {
        nvlVar.getClass();
        this.a = q0gVar;
        this.b = nvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0g)) {
            return false;
        }
        o0g o0gVar = (o0g) obj;
        return this.a == o0gVar.a && Intrinsics.d(this.b, o0gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaylistLikeOperation(type=" + this.a + ", playlistId=" + this.b + ")";
    }
}
