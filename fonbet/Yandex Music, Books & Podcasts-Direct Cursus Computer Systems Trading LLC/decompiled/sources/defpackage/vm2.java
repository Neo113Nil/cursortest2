package defpackage;

/* loaded from: classes3.dex */
public final class vm2 {
    public final long a;

    public vm2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm2) && d85.c(this.a, ((vm2) obj).a);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("BarAboveBgColors(primary=", d85.i(this.a), ")");
    }
}
