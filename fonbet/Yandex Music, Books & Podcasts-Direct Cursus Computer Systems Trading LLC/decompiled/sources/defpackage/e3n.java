package defpackage;

/* loaded from: classes3.dex */
public final class e3n implements i3n {
    public final m3n a;
    public final m b;

    public e3n(m3n m3nVar, m mVar) {
        this.a = m3nVar;
        this.b = mVar;
    }

    @Override // defpackage.i3n
    public final m3n a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3n)) {
            return false;
        }
        e3n e3nVar = (e3n) obj;
        return this.a.equals(e3nVar.a) && this.b.equals(e3nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Empty(texts=" + this.a + ", description=" + this.b + ")";
    }
}
