package defpackage;

/* loaded from: classes6.dex */
public final class r0j {
    public final int a;

    public r0j(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0j) && this.a == ((r0j) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "MetricsExperiment(httpsErrorsQuota=", ")");
    }
}
