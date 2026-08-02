package defpackage;

/* loaded from: classes4.dex */
public final class dtv {
    public final ges a;
    public final ges b;

    public dtv(ges gesVar, ges gesVar2) {
        this.a = gesVar;
        this.b = gesVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtv)) {
            return false;
        }
        dtv dtvVar = (dtv) obj;
        return this.a.equals(dtvVar.a) && this.b.equals(dtvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardArtistListItemTypography(title=" + this.a + ", likesCount=" + this.b + ")";
    }
}
