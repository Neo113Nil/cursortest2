package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x1v implements f2v, e2v {
    public final String a;
    public final n3q b;
    public final i3q c;

    public x1v(String str, n3q n3qVar, i3q i3qVar) {
        str.getClass();
        i3qVar.getClass();
        this.a = str;
        this.b = n3qVar;
        this.c = i3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1v)) {
            return false;
        }
        x1v x1vVar = (x1v) obj;
        return Intrinsics.d(this.a, x1vVar.a) && this.b.equals(x1vVar.b) && this.c == x1vVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "Album(albumId=" + this.a + ", description=" + this.b + ", subtypeSource=" + this.c + ")";
    }
}
