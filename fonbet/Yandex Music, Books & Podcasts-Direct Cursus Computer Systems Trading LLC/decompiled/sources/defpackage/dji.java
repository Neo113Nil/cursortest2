package defpackage;

/* loaded from: classes3.dex */
public final class dji implements gji {
    public final long a;
    public final long b;

    public dji(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dji)) {
            return false;
        }
        dji djiVar = (dji) obj;
        return this.a == djiVar.a && this.b == djiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.m(this.b, ")", tlm.l(this.a, "Playlist(uid=", ", kind="));
    }
}
