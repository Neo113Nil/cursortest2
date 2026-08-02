package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e1q implements z3q, d2q {
    public final c01 a;
    public final qhd b;
    public final f1q c;
    public final String d;

    public e1q(c01 c01Var, qhd qhdVar) {
        qhdVar.getClass();
        this.a = c01Var;
        this.b = qhdVar;
        this.c = new f1q(c01Var.a);
        this.d = c01Var.b;
    }

    @Override // defpackage.z3q
    public final qhd e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1q)) {
            return false;
        }
        e1q e1qVar = (e1q) obj;
        return this.a.equals(e1qVar.a) && Intrinsics.d(this.b, e1qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedGlagolArtistEntity(artist=" + this.a + ", preview=" + this.b + ")";
    }

    @Override // defpackage.z3q, defpackage.u3q
    public final g1q getId() {
        return this.c;
    }
}
