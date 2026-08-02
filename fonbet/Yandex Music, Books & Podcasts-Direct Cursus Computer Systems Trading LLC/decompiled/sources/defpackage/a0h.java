package defpackage;

/* loaded from: classes.dex */
public final class a0h implements sgm {
    public final b0h a;
    public int b;
    public Class c;

    public a0h(b0h b0hVar) {
        this.a = b0hVar;
    }

    @Override // defpackage.sgm
    public final void a() {
        this.a.x(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0h) {
            a0h a0hVar = (a0h) obj;
            if (this.b == a0hVar.b && this.c == a0hVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
