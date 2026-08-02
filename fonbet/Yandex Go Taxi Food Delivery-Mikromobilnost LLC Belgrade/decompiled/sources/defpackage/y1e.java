package defpackage;

/* loaded from: classes2.dex */
public final class y1e {
    public final String a;
    public final a2e b;

    public y1e(String str, a2e a2eVar) {
        this.a = str;
        this.b = a2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1e)) {
            return false;
        }
        y1e y1eVar = (y1e) obj;
        return this.a.equals(y1eVar.a) && this.b.equals(y1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Background(color=" + this.a + ", colors=" + this.b + ')';
    }
}
