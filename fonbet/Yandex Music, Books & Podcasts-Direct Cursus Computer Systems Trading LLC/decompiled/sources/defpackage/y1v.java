package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1v implements f2v, e2v {
    public final String a;
    public final n3q b;
    public final k3q c;

    public y1v(String str, n3q n3qVar, k3q k3qVar) {
        str.getClass();
        k3qVar.getClass();
        this.a = str;
        this.b = n3qVar;
        this.c = k3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1v)) {
            return false;
        }
        y1v y1vVar = (y1v) obj;
        return Intrinsics.d(this.a, y1vVar.a) && this.b.equals(y1vVar.b) && this.c == y1vVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Artist(artistId=" + this.a + ", description=" + this.b + ", subtypeSource=" + this.c + ")";
    }
}
