package defpackage;

/* loaded from: classes2.dex */
public final class x1e {
    public final String a;
    public final c2e b;

    public x1e(String str, c2e c2eVar) {
        this.a = str;
        this.b = c2eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1e)) {
            return false;
        }
        x1e x1eVar = (x1e) obj;
        return this.a.equals(x1eVar.a) && this.b.equals(x1eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Action(__typename=" + this.a + ", onAction=" + this.b + ')';
    }
}
