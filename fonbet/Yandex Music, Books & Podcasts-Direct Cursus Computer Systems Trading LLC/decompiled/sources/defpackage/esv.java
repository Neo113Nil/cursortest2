package defpackage;

/* loaded from: classes4.dex */
public final class esv {
    public final ges a;
    public final ges b;

    public esv(ges gesVar, ges gesVar2) {
        this.a = gesVar;
        this.b = gesVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esv)) {
            return false;
        }
        esv esvVar = (esv) obj;
        return this.a.equals(esvVar.a) && this.b.equals(esvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardArtistBlockDetailsTypography(trackTitle=" + this.a + ", name=" + this.b + ")";
    }
}
