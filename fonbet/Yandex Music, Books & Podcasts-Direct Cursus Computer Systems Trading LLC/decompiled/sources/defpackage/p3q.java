package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p3q implements r3q {
    public final bd5 a;
    public final o3q b;
    public final n3q c;

    public p3q(bd5 bd5Var, o3q o3qVar, n3q n3qVar) {
        bd5Var.getClass();
        o3qVar.getClass();
        this.a = bd5Var;
        this.b = o3qVar;
        this.c = n3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3q)) {
            return false;
        }
        p3q p3qVar = (p3q) obj;
        return Intrinsics.d(this.a, p3qVar.a) && this.b == p3qVar.b && this.c.equals(p3qVar.c);
    }

    @Override // defpackage.r3q
    public final q3q g() {
        return this.b;
    }

    @Override // defpackage.r3q, defpackage.u3q
    public final dd5 getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlaylistEntity(id=" + this.a + ", subtype=" + this.b + ", description=" + this.c + ")";
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }
}
