package defpackage;

/* loaded from: classes3.dex */
public final class l3q implements r3q {
    public final yc5 a;
    public final n3q b;
    public final k3q c;

    public l3q(yc5 yc5Var, n3q n3qVar, k3q k3qVar) {
        k3qVar.getClass();
        this.a = yc5Var;
        this.b = n3qVar;
        this.c = k3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3q)) {
            return false;
        }
        l3q l3qVar = (l3q) obj;
        return this.a.equals(l3qVar.a) && this.b.equals(l3qVar.b) && this.c == l3qVar.c;
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
        return "ArtistEntity(id=" + this.a + ", description=" + this.b + ", subtype=" + this.c + ")";
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }
}
