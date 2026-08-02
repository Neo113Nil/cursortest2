package defpackage;

/* loaded from: classes6.dex */
public final class u7b {
    public final paw a;
    public final rgl b;

    public u7b(paw pawVar, rgl rglVar) {
        this.a = pawVar;
        this.b = rglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7b)) {
            return false;
        }
        u7b u7bVar = (u7b) obj;
        return this.a.equals(u7bVar.a) && this.b.equals(u7bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EngineHolder(engine=" + this.a + ", observer=" + this.b + ')';
    }
}
