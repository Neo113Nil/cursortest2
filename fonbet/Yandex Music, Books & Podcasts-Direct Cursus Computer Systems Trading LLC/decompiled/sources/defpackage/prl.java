package defpackage;

/* loaded from: classes4.dex */
public final class prl {
    public final long a;
    public final long b;

    public prl(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof prl)) {
            return false;
        }
        prl prlVar = (prl) obj;
        return this.a == prlVar.a && this.b == prlVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.m(this.b, ")", tlm.l(this.a, "PlayingInfo(currentPosition=", ", duration="));
    }
}
