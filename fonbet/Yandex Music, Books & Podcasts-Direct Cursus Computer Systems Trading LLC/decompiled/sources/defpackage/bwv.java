package defpackage;

/* loaded from: classes4.dex */
public final class bwv {
    public final ges a;
    public final ges b;
    public final ges c;

    public bwv(ges gesVar, ges gesVar2, ges gesVar3) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = gesVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwv)) {
            return false;
        }
        bwv bwvVar = (bwv) obj;
        return this.a.equals(bwvVar.a) && this.b.equals(bwvVar.b) && this.c.equals(bwvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WizardFooterTypography(countOfLikedArtists=" + this.a + ", buttonText=" + this.b + ", progressText=" + this.c + ")";
    }
}
