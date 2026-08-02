package defpackage;

/* loaded from: classes4.dex */
public final class f4i {
    public final int a;

    public f4i(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4i) && this.a == ((f4i) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "MetricsExperiment(httpErrorsQuota=", ")");
    }
}
