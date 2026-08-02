package defpackage;

/* loaded from: classes4.dex */
public final class y4q implements e5q, d5q, a5q {
    public final wnu a;
    public final c5q b;

    public y4q(wnu wnuVar, c5q c5qVar) {
        this.a = wnuVar;
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
        if (!(obj instanceof y4q)) {
            return false;
        }
        y4q y4qVar = (y4q) obj;
        return this.a.equals(y4qVar.a) && this.b.equals(y4qVar.b);
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WithSeedsOnly(id=" + this.a + ", analyticsOptions=" + this.b + ")";
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final vnu getId() {
        return this.a;
    }

    @Override // defpackage.e5q, defpackage.u3q
    public final aou getId() {
        return this.a;
    }
}
