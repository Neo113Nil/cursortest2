package defpackage;

/* loaded from: classes2.dex */
public final class spc0 {
    public final String a;
    public final zmc0 b;

    public spc0(String str, zmc0 zmc0Var) {
        this.a = str;
        this.b = zmc0Var;
    }

    public final zmc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spc0)) {
            return false;
        }
        spc0 spc0Var = (spc0) obj;
        return this.a.equals(spc0Var.a) && this.b.equals(spc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATImageProperty(__typename=" + this.a + ", plaqueImageProperty=" + this.b + ')';
    }
}
