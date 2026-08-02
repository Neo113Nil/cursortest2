package defpackage;

/* loaded from: classes4.dex */
public final class hwv {
    public final String a;
    public final String b;

    public hwv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwv)) {
            return false;
        }
        hwv hwvVar = (hwv) obj;
        return this.a.equals(hwvVar.a) && this.b.equals(hwvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("WizardGenreUiData(id=", this.a, ", title=", this.b, ")");
    }
}
