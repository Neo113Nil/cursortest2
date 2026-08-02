package defpackage;

/* loaded from: classes8.dex */
public final class reo implements pl5 {
    public final String a;

    public reo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof reo) && this.a.equals(((reo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("EventBenchmarkParams(histogramPrefix="), this.a, ')');
    }
}
