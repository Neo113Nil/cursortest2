package defpackage;

/* loaded from: classes2.dex */
public final class upc0 {
    public final String a;
    public final mrc0 b;

    public upc0(String str, mrc0 mrc0Var) {
        this.a = str;
        this.b = mrc0Var;
    }

    public final mrc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upc0)) {
            return false;
        }
        upc0 upc0Var = (upc0) obj;
        return this.a.equals(upc0Var.a) && this.b.equals(upc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATTextProperty(__typename=" + this.a + ", plaqueTextProperty=" + this.b + ')';
    }
}
