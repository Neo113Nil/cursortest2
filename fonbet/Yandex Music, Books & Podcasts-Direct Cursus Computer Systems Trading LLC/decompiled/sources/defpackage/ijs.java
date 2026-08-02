package defpackage;

/* loaded from: classes4.dex */
public final class ijs implements kjs {
    public final long a;
    public final long b;

    public ijs(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.kjs
    public final long a() {
        return this.b;
    }

    @Override // defpackage.kjs
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijs)) {
            return false;
        }
        ijs ijsVar = (ijs) obj;
        return nsa.e(this.a, ijsVar.a) && nsa.e(this.b, ijsVar.b);
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("EndOfEntity(timeLeft=", nsa.t(this.a), ", timeFull=", nsa.t(this.b), ")");
    }
}
