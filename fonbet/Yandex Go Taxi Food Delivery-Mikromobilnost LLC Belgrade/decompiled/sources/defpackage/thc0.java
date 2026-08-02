package defpackage;

/* loaded from: classes2.dex */
public final class thc0 {
    public final String a;
    public final eoc0 b;

    public thc0(String str, eoc0 eoc0Var) {
        this.a = str;
        this.b = eoc0Var;
    }

    public final eoc0 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thc0)) {
            return false;
        }
        thc0 thc0Var = (thc0) obj;
        return this.a.equals(thc0Var.a) && this.b.equals(thc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MetricContext(__typename=" + this.a + ", plaqueMetric=" + this.b + ')';
    }
}
