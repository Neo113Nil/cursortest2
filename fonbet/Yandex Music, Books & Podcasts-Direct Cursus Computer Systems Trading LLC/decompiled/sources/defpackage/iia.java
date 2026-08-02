package defpackage;

/* loaded from: classes3.dex */
public final class iia {
    public final long a;
    public final int b;

    public iia(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iia)) {
            return false;
        }
        iia iiaVar = (iia) obj;
        return this.a == iiaVar.a && this.b == iiaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DownloadedSectionsBlockDataItemMetrics(durationMs=" + this.a + ", count=" + this.b + ")";
    }
}
