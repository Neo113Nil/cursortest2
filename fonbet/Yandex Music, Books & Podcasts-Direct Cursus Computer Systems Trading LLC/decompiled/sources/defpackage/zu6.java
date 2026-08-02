package defpackage;

/* loaded from: classes4.dex */
public final class zu6 {
    public final long a;
    public final long b;

    public zu6(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu6)) {
            return false;
        }
        zu6 zu6Var = (zu6) obj;
        return nsa.e(this.a, zu6Var.a) && nsa.e(this.b, zu6Var.b);
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("ScheduledCrossfade(crossfadeTime=", nsa.t(this.a), ", waitTime=", nsa.t(this.b), ")");
    }
}
