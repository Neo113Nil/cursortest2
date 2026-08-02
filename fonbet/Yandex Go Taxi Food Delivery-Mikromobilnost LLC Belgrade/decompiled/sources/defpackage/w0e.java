package defpackage;

/* loaded from: classes2.dex */
public final class w0e {
    public final String a;
    public final r1e b;

    public w0e(String str, r1e r1eVar) {
        this.a = str;
        this.b = r1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0e)) {
            return false;
        }
        w0e w0eVar = (w0e) obj;
        return this.a.equals(w0eVar.a) && this.b.equals(w0eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Section(__typename=" + this.a + ", configurationSectionFragment=" + this.b + ')';
    }
}
