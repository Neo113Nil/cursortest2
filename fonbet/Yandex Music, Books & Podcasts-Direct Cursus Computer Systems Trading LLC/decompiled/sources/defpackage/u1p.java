package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u1p extends z1p {
    public final oq a;
    public final List b;

    public u1p(oq oqVar, List list) {
        oqVar.getClass();
        this.a = oqVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1p)) {
            return false;
        }
        u1p u1pVar = (u1p) obj;
        return Intrinsics.d(this.a, u1pVar.a) && this.b.equals(u1pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", albumTracks=" + this.b + ")";
    }
}
