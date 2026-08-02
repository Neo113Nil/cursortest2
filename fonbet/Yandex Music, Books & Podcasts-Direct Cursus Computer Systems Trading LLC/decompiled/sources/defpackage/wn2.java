package defpackage;

/* loaded from: classes3.dex */
public final class wn2 {
    public final long a;
    public final long b;

    public wn2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn2)) {
            return false;
        }
        wn2 wn2Var = (wn2) obj;
        return d85.c(this.a, wn2Var.a) && d85.c(this.b, wn2Var.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("BarAboveTextColors(primary=", d85.i(this.a), ", accent=", d85.i(this.b), ")");
    }
}
