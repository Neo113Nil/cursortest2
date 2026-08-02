package defpackage;

/* loaded from: classes2.dex */
public final class whc0 {
    public final String a;
    public final psu0 b;

    public whc0(String str, psu0 psu0Var) {
        this.a = str;
        this.b = psu0Var;
    }

    public final psu0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whc0)) {
            return false;
        }
        whc0 whc0Var = (whc0) obj;
        return this.a.equals(whc0Var.a) && this.b.equals(whc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StrictAction(__typename=" + this.a + ", strictPlaqueAction=" + this.b + ')';
    }
}
