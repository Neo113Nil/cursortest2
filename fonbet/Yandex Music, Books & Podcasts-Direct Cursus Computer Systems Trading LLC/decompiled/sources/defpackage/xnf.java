package defpackage;

/* loaded from: classes4.dex */
public final class xnf {
    public final long a;
    public final long b;
    public final long c;

    public xnf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xnf)) {
            return false;
        }
        xnf xnfVar = (xnf) obj;
        return this.a == xnfVar.a && this.b == xnfVar.b && this.c == xnfVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + tlm.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder l = tlm.l(this.a, "LaunchTrackMetricsAnalytic(trackUrlReceivedTime=", ", firstDataReceivedTime=");
        l.append(this.b);
        l.append(", initialDataEnqueuedTime=");
        l.append(this.c);
        l.append(")");
        return l.toString();
    }
}
