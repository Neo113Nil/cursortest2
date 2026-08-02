package defpackage;

/* loaded from: classes2.dex */
public final class ss60 {
    public final String a;
    public final ks60 b;

    public ss60(String str, ks60 ks60Var) {
        this.a = str;
        this.b = ks60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss60)) {
            return false;
        }
        ss60 ss60Var = (ss60) obj;
        return this.a.equals(ss60Var.a) && this.b.equals(ss60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnIntroPlan(__typename=" + this.a + ", offerIntroPlan=" + this.b + ')';
    }
}
