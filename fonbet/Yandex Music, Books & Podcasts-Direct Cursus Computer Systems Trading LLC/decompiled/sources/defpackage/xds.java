package defpackage;

/* loaded from: classes.dex */
public final class xds {
    public final long a;
    public final long b;

    public xds(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xds)) {
            return false;
        }
        xds xdsVar = (xds) obj;
        return d85.c(this.a, xdsVar.a) && d85.c(this.b, xdsVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        dfi.q(this.a, ", selectionBackgroundColor=", sb);
        sb.append((Object) d85.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
