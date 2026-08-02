package defpackage;

/* loaded from: classes4.dex */
public final class qwv {
    public final ges a;
    public final ges b;

    public qwv(ges gesVar, ges gesVar2) {
        this.a = gesVar;
        this.b = gesVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwv)) {
            return false;
        }
        qwv qwvVar = (qwv) obj;
        return this.a.equals(qwvVar.a) && this.b.equals(qwvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WizardHeaderTypography(headerTitle=" + this.a + ", genreTitle=" + this.b + ")";
    }
}
