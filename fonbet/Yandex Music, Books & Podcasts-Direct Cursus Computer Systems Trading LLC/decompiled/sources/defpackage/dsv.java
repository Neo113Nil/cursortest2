package defpackage;

/* loaded from: classes4.dex */
public final class dsv {
    public final ges a;
    public final ges b;

    public dsv(ges gesVar, ges gesVar2) {
        this.a = gesVar;
        this.b = gesVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsv)) {
            return false;
        }
        dsv dsvVar = (dsv) obj;
        return this.a.equals(dsvVar.a) && this.b.equals(dsvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardArtistBlockDefaultTypography(name=" + this.a + ", oneToOneHint=" + this.b + ")";
    }
}
