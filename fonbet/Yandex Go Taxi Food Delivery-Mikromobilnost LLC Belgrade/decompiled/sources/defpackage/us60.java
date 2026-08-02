package defpackage;

/* loaded from: classes2.dex */
public final class us60 {
    public final String a;
    public final ot60 b;

    public us60(String str, ot60 ot60Var) {
        this.a = str;
        this.b = ot60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us60)) {
            return false;
        }
        us60 us60Var = (us60) obj;
        return this.a.equals(us60Var.a) && this.b.equals(us60Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTrialPlan(__typename=" + this.a + ", offerTrialPlan=" + this.b + ')';
    }
}
