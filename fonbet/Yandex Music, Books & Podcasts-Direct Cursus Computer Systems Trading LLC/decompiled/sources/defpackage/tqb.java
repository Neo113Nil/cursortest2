package defpackage;

/* loaded from: classes6.dex */
public final class tqb {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;

    public tqb(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqb)) {
            return false;
        }
        tqb tqbVar = (tqb) obj;
        return this.a == tqbVar.a && this.b == tqbVar.b && this.c == tqbVar.c && this.d == tqbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExoThreadData(position=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", bufferSize=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        return dfi.j(sb, this.d, ')');
    }
}
