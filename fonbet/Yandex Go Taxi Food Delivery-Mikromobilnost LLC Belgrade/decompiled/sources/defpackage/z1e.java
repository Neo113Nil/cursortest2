package defpackage;

/* loaded from: classes2.dex */
public final class z1e {
    public final String a;
    public final bfc b;

    public z1e(String str, bfc bfcVar) {
        this.a = str;
        this.b = bfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1e)) {
            return false;
        }
        z1e z1eVar = (z1e) obj;
        return this.a.equals(z1eVar.a) && this.b.equals(z1eVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundColors(__typename=" + this.a + ", colorFragment=" + this.b + ')';
    }
}
