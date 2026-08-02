package defpackage;

/* loaded from: classes2.dex */
public final class udg {
    public final String a;
    public final heg b;

    public udg(String str, heg hegVar) {
        this.a = str;
        this.b = hegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udg)) {
            return false;
        }
        udg udgVar = (udg) obj;
        return this.a.equals(udgVar.a) && this.b.equals(udgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Section(__typename=" + this.a + ", darkConfigurationSectionFragment=" + this.b + ')';
    }
}
