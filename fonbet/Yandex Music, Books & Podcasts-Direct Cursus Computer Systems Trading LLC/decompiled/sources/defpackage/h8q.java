package defpackage;

/* loaded from: classes4.dex */
public final class h8q {
    public final String a;
    public final String b;
    public final t1p c;

    public h8q(String str, String str2, t1p t1pVar) {
        this.a = str;
        this.b = str2;
        this.c = t1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8q)) {
            return false;
        }
        h8q h8qVar = (h8q) obj;
        return this.a.equals(h8qVar.a) && this.b.equals(h8qVar.b) && this.c == h8qVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("SharedSearchFilter(id=", this.a, ", displayName=", this.b, ", type=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
