package defpackage;

/* loaded from: classes3.dex */
public final class n1p {
    public final String a;
    public final bfg b;
    public final t1p c;

    public n1p(String str, bfg bfgVar, t1p t1pVar) {
        this.a = str;
        this.b = bfgVar;
        this.c = t1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1p)) {
            return false;
        }
        n1p n1pVar = (n1p) obj;
        return this.a.equals(n1pVar.a) && this.b.equals(n1pVar.b) && this.c == n1pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchFilter(id=" + this.a + ", displayName=" + this.b + ", type=" + this.c + ")";
    }
}
