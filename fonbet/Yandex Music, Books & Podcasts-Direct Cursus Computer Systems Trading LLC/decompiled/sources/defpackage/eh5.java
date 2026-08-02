package defpackage;

/* loaded from: classes3.dex */
public final class eh5 {
    public final String a;
    public final String b;

    public eh5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh5)) {
            return false;
        }
        eh5 eh5Var = (eh5) obj;
        return this.a.equals(eh5Var.a) && this.b.equals(eh5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return hrg.s("Action(uri=", this.a, ", id=", this.b, ")");
    }
}
