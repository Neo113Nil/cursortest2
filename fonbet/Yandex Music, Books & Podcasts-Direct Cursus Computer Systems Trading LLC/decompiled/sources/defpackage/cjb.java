package defpackage;

/* loaded from: classes6.dex */
public final class cjb {
    public final long a;
    public final int b;

    public cjb(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjb)) {
            return false;
        }
        cjb cjbVar = (cjb) obj;
        return this.a == cjbVar.a && this.b == cjbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventOrderAnalyticsHelper(clientTimestamp=");
        sb.append(this.a);
        sb.append(", eventIndex=");
        return vz1.r(sb, this.b, ')');
    }
}
