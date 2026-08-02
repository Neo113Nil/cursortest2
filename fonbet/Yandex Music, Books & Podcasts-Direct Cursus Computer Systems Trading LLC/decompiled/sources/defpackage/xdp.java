package defpackage;

/* loaded from: classes.dex */
public final class xdp {
    public final i2o a;
    public final int b;
    public final long c;

    public xdp(i2o i2oVar, int i, long j) {
        this.a = i2oVar;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdp)) {
            return false;
        }
        xdp xdpVar = (xdp) obj;
        return this.a == xdpVar.a && this.b == xdpVar.b && this.c == xdpVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", selectableId=");
        return eta.g(sb, this.c, ')');
    }
}
