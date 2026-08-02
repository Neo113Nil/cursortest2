package defpackage;

/* loaded from: classes3.dex */
public final class j3q implements r3q {
    public final xc5 a;
    public final n3q b;
    public final i3q c;

    public j3q(xc5 xc5Var, n3q n3qVar, i3q i3qVar) {
        i3qVar.getClass();
        this.a = xc5Var;
        this.b = n3qVar;
        this.c = i3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3q)) {
            return false;
        }
        j3q j3qVar = (j3q) obj;
        return this.a.equals(j3qVar.a) && this.b.equals(j3qVar.b) && this.c == j3qVar.c;
    }

    @Override // defpackage.r3q
    public final q3q g() {
        return this.c;
    }

    @Override // defpackage.r3q, defpackage.u3q
    public final dd5 getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "AlbumEntity(id=" + this.a + ", description=" + this.b + ", subtype=" + this.c + ")";
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }
}
