package defpackage;

/* loaded from: classes3.dex */
public final class k4t {
    public final int a;
    public final long b;

    public k4t(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4t)) {
            return false;
        }
        k4t k4tVar = (k4t) obj;
        return this.a == k4tVar.a && this.b == k4tVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Summary(trackCount=" + this.a + ", totalDurationMs=" + this.b + ")";
    }
}
