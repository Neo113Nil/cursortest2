package defpackage;

/* loaded from: classes2.dex */
public final class ws60 {
    public final String a;
    public final ss60 b;
    public final ts60 c;
    public final us60 d;
    public final vs60 e;

    public ws60(String str, ss60 ss60Var, ts60 ts60Var, us60 us60Var, vs60 vs60Var) {
        this.a = str;
        this.b = ss60Var;
        this.c = ts60Var;
        this.d = us60Var;
        this.e = vs60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws60)) {
            return false;
        }
        ws60 ws60Var = (ws60) obj;
        return jl40.l(this.a, ws60Var.a) && jl40.l(this.b, ws60Var.b) && jl40.l(this.c, ws60Var.c) && jl40.l(this.d, ws60Var.d) && jl40.l(this.e, ws60Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ss60 ss60Var = this.b;
        int hashCode2 = (hashCode + (ss60Var == null ? 0 : ss60Var.hashCode())) * 31;
        ts60 ts60Var = this.c;
        int hashCode3 = (hashCode2 + (ts60Var == null ? 0 : ts60Var.hashCode())) * 31;
        us60 us60Var = this.d;
        int hashCode4 = (hashCode3 + (us60Var == null ? 0 : us60Var.hashCode())) * 31;
        vs60 vs60Var = this.e;
        return hashCode4 + (vs60Var != null ? vs60Var.hashCode() : 0);
    }

    public final String toString() {
        return "OfferPlan(__typename=" + this.a + ", onIntroPlan=" + this.b + ", onIntroUntilPlan=" + this.c + ", onTrialPlan=" + this.d + ", onTrialUntilPlan=" + this.e + ')';
    }
}
