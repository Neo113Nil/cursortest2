package defpackage;

/* loaded from: classes.dex */
public final class zfi implements n2i {
    public final long a;
    public final long b;
    public final long c;

    public zfi(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfi)) {
            return false;
        }
        zfi zfiVar = (zfi) obj;
        return this.a == zfiVar.a && this.b == zfiVar.b && this.c == zfiVar.c;
    }

    public final int hashCode() {
        return cb0.A(this.c) + ((cb0.A(this.b) + ((cb0.A(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
