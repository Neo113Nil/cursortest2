package defpackage;

/* loaded from: classes4.dex */
public final class b5q implements e5q, d5q {
    public final ynu a;
    public final c5q b;

    public b5q(ynu ynuVar, c5q c5qVar) {
        this.a = ynuVar;
        this.b = c5qVar;
    }

    @Override // defpackage.d5q
    public final c5q b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5q)) {
            return false;
        }
        b5q b5qVar = (b5q) obj;
        return this.a.equals(b5qVar.a) && this.b.equals(b5qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "WithoutSeeds(id=" + this.a + ", analyticsOptions=" + this.b + ")";
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final aou getId() {
        return this.a;
    }
}
