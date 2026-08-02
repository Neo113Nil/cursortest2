package defpackage;

/* loaded from: classes6.dex */
public final class uhs {
    public final long a;

    public uhs(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhs) && nsa.e(this.a, ((uhs) obj).a);
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hrg.q("TimePickerInitSecondsHolder(duration=", nsa.t(this.a), ")");
    }
}
