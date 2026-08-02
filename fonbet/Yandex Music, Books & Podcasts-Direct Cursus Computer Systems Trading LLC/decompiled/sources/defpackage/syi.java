package defpackage;

/* loaded from: classes6.dex */
public final class syi {
    public final long a;
    public final long b;

    public syi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syi)) {
            return false;
        }
        syi syiVar = (syi) obj;
        return this.a == syiVar.a && this.b == syiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(currentTimeMillis=");
        sb.append(this.a);
        sb.append(", uptimeMillis=");
        return eta.g(sb, this.b, ')');
    }
}
