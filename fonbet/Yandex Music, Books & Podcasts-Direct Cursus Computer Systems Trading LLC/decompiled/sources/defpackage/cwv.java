package defpackage;

/* loaded from: classes4.dex */
public final class cwv {
    public final String a;
    public final String b;

    public cwv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwv)) {
            return false;
        }
        cwv cwvVar = (cwv) obj;
        return this.a.equals(cwvVar.a) && this.b.equals(cwvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WizardGenre(id=", this.a, ", title=", this.b, ")");
    }
}
