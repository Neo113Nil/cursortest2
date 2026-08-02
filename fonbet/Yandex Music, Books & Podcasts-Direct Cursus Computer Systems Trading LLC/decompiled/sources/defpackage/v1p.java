package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v1p extends z1p {
    public final c01 a;

    public v1p(c01 c01Var) {
        c01Var.getClass();
        this.a = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1p) && Intrinsics.d(this.a, ((v1p) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Artist(artist=" + this.a + ")";
    }
}
