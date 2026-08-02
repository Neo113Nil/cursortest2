package defpackage;

/* loaded from: classes4.dex */
public final class t63 {
    public final String a;
    public final int b;
    public final boolean c;

    public t63(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63Var = (t63) obj;
        return this.a.equals(t63Var.a) && this.b == t63Var.b && this.c == t63Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return ouj.r(f1d.l(this.b, "BlockNodeTab(id=", this.a, ", position=", ", default="), this.c, ")");
    }
}
