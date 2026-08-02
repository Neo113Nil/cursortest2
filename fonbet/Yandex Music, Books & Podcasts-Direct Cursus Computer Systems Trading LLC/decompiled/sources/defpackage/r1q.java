package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r1q implements z3q, d2q {
    public final cvl a;
    public final qhd b;
    public final s1q c;
    public final String d;

    public r1q(cvl cvlVar, qhd qhdVar) {
        qhdVar.getClass();
        this.a = cvlVar;
        this.b = qhdVar;
        this.c = new s1q(cvlVar.g());
        this.d = cvlVar.b;
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1q)) {
            return false;
        }
        r1q r1qVar = (r1q) obj;
        return this.a.equals(r1qVar.a) && Intrinsics.d(this.b, r1qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolPlaylistEntity(playlistHeader=" + this.a + ", preview=" + this.b + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.c;
    }
}
