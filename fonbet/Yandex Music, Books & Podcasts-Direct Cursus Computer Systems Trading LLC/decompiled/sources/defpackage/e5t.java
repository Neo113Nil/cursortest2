package defpackage;

/* loaded from: classes3.dex */
public final class e5t {
    public final l5t a;
    public final String b;
    public final kxi c;

    public e5t(kxi kxiVar, l5t l5tVar, String str) {
        this.a = l5tVar;
        this.b = str;
        this.c = kxiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5t)) {
            return false;
        }
        e5t e5tVar = (e5t) obj;
        return this.a == e5tVar.a && this.b.equals(e5tVar.b) && this.c.equals(e5tVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Args(entityType=" + this.a + ", entityId=" + this.b + ", navigationData=" + this.c + ")";
    }
}
