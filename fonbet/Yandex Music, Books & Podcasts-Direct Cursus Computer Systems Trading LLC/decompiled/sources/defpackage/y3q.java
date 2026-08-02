package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y3q implements u3q {
    public final w3d a;
    public final String b;
    public final gxc c;

    public y3q(w3d w3dVar, String str, gxc gxcVar) {
        str.getClass();
        gxcVar.getClass();
        this.a = w3dVar;
        this.b = str;
        this.c = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3q)) {
            return false;
        }
        y3q y3qVar = (y3q) obj;
        return this.a.equals(y3qVar.a) && Intrinsics.d(this.b, y3qVar.b) && Intrinsics.d(this.c, y3qVar.c);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SharedPlaybackGenerativeEntity(id=" + this.a + ", title=" + this.b + ", fromData=" + this.c + ")";
    }
}
