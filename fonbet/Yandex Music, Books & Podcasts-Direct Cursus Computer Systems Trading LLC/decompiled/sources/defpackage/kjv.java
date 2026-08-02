package defpackage;

/* loaded from: classes4.dex */
public final class kjv {
    public final long a;
    public final long b;

    public kjv(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjv)) {
            return false;
        }
        kjv kjvVar = (kjv) obj;
        return d85.c(this.a, kjvVar.a) && d85.c(this.b, kjvVar.b);
    }

    public final int hashCode() {
        int i = d85.o;
        met metVar = net.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("WheelItemUiComposeColors(baseColor=", d85.i(this.a), ", borderColor=", d85.i(this.b), ")");
    }
}
