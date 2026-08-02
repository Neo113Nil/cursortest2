package defpackage;

/* loaded from: classes4.dex */
public final class r2w {
    public final ges a;
    public final ges b;
    public final ges c;

    public r2w(ges gesVar, ges gesVar2, ges gesVar3) {
        this.a = gesVar;
        this.b = gesVar2;
        this.c = gesVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2w)) {
            return false;
        }
        r2w r2wVar = (r2w) obj;
        return this.a.equals(r2wVar.a) && this.b.equals(r2wVar.b) && this.c.equals(r2wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "WizardSkipDialogTypography(title=" + this.a + ", subtitle=" + this.b + ", buttonText=" + this.c + ")";
    }
}
