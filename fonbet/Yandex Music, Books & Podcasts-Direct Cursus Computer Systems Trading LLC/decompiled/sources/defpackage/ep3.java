package defpackage;

/* loaded from: classes4.dex */
public final class ep3 {
    public final long a;

    public ep3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep3) && nsa.e(this.a, ((ep3) obj).a);
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("LowerBound(bound=", nsa.t(this.a), ")");
    }
}
