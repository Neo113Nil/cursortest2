package defpackage;

/* loaded from: classes6.dex */
public final class tyd {
    public final Enum a;
    public final long b;
    public long c;

    /* JADX WARN: Multi-variable type inference failed */
    public tyd(jyd jydVar, long j) {
        this.a = (Enum) jydVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyd)) {
            return false;
        }
        tyd tydVar = (tyd) obj;
        return this.a.equals(tydVar.a) && this.b == tydVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HistogramInterval(histogram=" + this.a + ", startingTimestamp=" + this.b + ")";
    }
}
