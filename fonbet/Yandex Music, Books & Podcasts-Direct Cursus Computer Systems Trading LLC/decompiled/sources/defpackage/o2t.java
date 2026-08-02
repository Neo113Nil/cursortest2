package defpackage;

/* loaded from: classes6.dex */
public final class o2t {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public o2t(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2t)) {
            return false;
        }
        o2t o2tVar = (o2t) obj;
        return this.a == o2tVar.a && this.b == o2tVar.b && this.c == o2tVar.c && this.d == o2tVar.d && this.e == o2tVar.e;
    }

    public final int hashCode() {
        return tlm.c(this.e, tlm.c(this.d, tlm.c(this.c, tlm.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiplexParams(playbackDurationMs=");
        sb.append(this.a);
        sb.append(", bufferingDurationMs=");
        sb.append(this.b);
        sb.append(", firstBufferingDurationMs=");
        sb.append(this.c);
        sb.append(", bufferingCount=");
        sb.append(this.d);
        sb.append(", preparingStreamDurationMs=");
        return hrg.m(this.e, ", adPosition=null)", sb);
    }
}
