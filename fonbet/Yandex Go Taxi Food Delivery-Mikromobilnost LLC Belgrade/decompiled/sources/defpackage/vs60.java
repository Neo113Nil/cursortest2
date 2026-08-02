package defpackage;

/* loaded from: classes2.dex */
public final class vs60 {
    public final String a;
    public final qt60 b;

    public vs60(String str, qt60 qt60Var) {
        this.a = str;
        this.b = qt60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs60)) {
            return false;
        }
        vs60 vs60Var = (vs60) obj;
        return this.a.equals(vs60Var.a) && this.b.equals(vs60Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTrialUntilPlan(__typename=" + this.a + ", offerTrialUntilPlan=" + this.b + ')';
    }
}
