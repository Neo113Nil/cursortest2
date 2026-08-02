package defpackage;

/* loaded from: classes2.dex */
public final class vpc0 {
    public final String a;
    public final upc0 b;
    public final tpc0 c;
    public final spc0 d;

    public vpc0(String str, upc0 upc0Var, tpc0 tpc0Var, spc0 spc0Var) {
        this.a = str;
        this.b = upc0Var;
        this.c = tpc0Var;
        this.d = spc0Var;
    }

    public final spc0 a() {
        return this.d;
    }

    public final tpc0 b() {
        return this.c;
    }

    public final upc0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpc0)) {
            return false;
        }
        vpc0 vpc0Var = (vpc0) obj;
        return jl40.l(this.a, vpc0Var.a) && jl40.l(this.b, vpc0Var.b) && jl40.l(this.c, vpc0Var.c) && jl40.l(this.d, vpc0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        upc0 upc0Var = this.b;
        int hashCode2 = (hashCode + (upc0Var == null ? 0 : upc0Var.hashCode())) * 31;
        tpc0 tpc0Var = this.c;
        int hashCode3 = (hashCode2 + (tpc0Var == null ? 0 : tpc0Var.hashCode())) * 31;
        spc0 spc0Var = this.d;
        return hashCode3 + (spc0Var != null ? spc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaqueProperty(__typename=" + this.a + ", onTaxiATTextProperty=" + this.b + ", onTaxiATLinkProperty=" + this.c + ", onTaxiATImageProperty=" + this.d + ')';
    }
}
