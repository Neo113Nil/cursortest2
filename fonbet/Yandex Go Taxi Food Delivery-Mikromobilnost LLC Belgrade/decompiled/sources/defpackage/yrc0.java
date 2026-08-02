package defpackage;

/* loaded from: classes2.dex */
public final class yrc0 {
    public final String a;
    public final mrc0 b;

    public yrc0(String str, mrc0 mrc0Var) {
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
        if (!(obj instanceof yrc0)) {
            return false;
        }
        yrc0 yrc0Var = (yrc0) obj;
        return this.a.equals(yrc0Var.a) && this.b.equals(yrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATTextProperty(__typename=" + this.a + ", plaqueTextProperty=" + this.b + ')';
    }
}
