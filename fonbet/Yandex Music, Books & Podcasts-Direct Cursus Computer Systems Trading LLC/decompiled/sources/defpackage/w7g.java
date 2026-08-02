package defpackage;

/* loaded from: classes3.dex */
public final class w7g {
    public final a8g a;
    public final r7g b;

    public w7g(a8g a8gVar, r7g r7gVar) {
        this.a = a8gVar;
        this.b = r7gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7g)) {
            return false;
        }
        w7g w7gVar = (w7g) obj;
        return this.a.equals(w7gVar.a) && this.b.equals(w7gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LinkItemModel(uiData=" + this.a + ", link=" + this.b + ")";
    }
}
