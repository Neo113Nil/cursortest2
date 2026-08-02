package defpackage;

/* loaded from: classes4.dex */
public final class n8v {
    public final boolean a;
    public final long b;

    public n8v(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8v)) {
            return false;
        }
        n8v n8vVar = (n8v) obj;
        return this.a == n8vVar.a && this.b == n8vVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WaveWordsSlowNetworkConfig(enabled=" + this.a + ", timeoutMs=" + this.b + ")";
    }
}
