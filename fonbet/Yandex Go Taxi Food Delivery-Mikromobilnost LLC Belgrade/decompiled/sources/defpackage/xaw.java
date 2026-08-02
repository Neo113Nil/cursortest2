package defpackage;

/* loaded from: classes14.dex */
public final class xaw {
    public final waw a;
    public final hz40 b;

    public xaw(waw wawVar, hz40 hz40Var) {
        this.a = wawVar;
        this.b = hz40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaw)) {
            return false;
        }
        xaw xawVar = (xaw) obj;
        return this.a.equals(xawVar.a) && this.b.equals(xawVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
