package defpackage;

/* loaded from: classes6.dex */
public final class tk2 implements z5g {
    public final long a;
    public final long b;

    public tk2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk2)) {
            return false;
        }
        tk2 tk2Var = (tk2) obj;
        return this.a == tk2Var.a && this.b == tk2Var.b;
    }

    @Override // defpackage.z5g
    public final long getTimestamp() {
        return this.a;
    }

    @Override // defpackage.z5g
    public final long getValue() {
        return this.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BandwidthEstimation(timestamp=");
        sb.append(this.a);
        sb.append(", value=");
        return eta.g(sb, this.b, ')');
    }
}
