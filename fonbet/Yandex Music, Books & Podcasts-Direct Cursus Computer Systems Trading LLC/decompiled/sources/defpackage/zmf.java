package defpackage;

/* loaded from: classes6.dex */
public final class zmf {
    public final Long a;
    public final Long b;

    public zmf(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmf)) {
            return false;
        }
        zmf zmfVar = (zmf) obj;
        return this.a.equals(zmfVar.a) && this.b.equals(zmfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatencyData(currentLatency=");
        sb.append(this.a);
        sb.append(", targetLatency=");
        return tlm.k(sb, this.b, ')');
    }
}
