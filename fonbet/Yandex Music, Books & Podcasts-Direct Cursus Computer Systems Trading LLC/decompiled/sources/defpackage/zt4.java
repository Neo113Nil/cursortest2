package defpackage;

/* loaded from: classes4.dex */
public final class zt4 extends p9 {
    public final long b;
    public final long c;

    public zt4(long j, long j2) {
        super(lm0.g);
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt4)) {
            return false;
        }
        zt4 zt4Var = (zt4) obj;
        return d85.c(this.b, zt4Var.b) && d85.c(this.c, zt4Var.c);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return hrg.s("Static(bgTrackColor=", d85.i(this.b), ", activeTrackColor=", d85.i(this.c), ")");
    }
}
