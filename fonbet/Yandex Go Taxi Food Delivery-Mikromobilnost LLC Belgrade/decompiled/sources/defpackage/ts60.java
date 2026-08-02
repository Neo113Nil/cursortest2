package defpackage;

/* loaded from: classes2.dex */
public final class ts60 {
    public final String a;
    public final os60 b;

    public ts60(String str, os60 os60Var) {
        this.a = str;
        this.b = os60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts60)) {
            return false;
        }
        ts60 ts60Var = (ts60) obj;
        return this.a.equals(ts60Var.a) && this.b.equals(ts60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnIntroUntilPlan(__typename=" + this.a + ", offerIntroUntilPlan=" + this.b + ')';
    }
}
