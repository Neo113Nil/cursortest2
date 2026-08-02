package defpackage;

/* loaded from: classes2.dex */
public final class u5f {
    public final String a;
    public final lxw b;

    public u5f(String str, lxw lxwVar) {
        this.a = str;
        this.b = lxwVar;
    }

    public final lxw a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5f)) {
            return false;
        }
        u5f u5fVar = (u5f) obj;
        return this.a.equals(u5fVar.a) && this.b.equals(u5fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExternalCreate(__typename=" + this.a + ", invoice=" + this.b + ')';
    }
}
