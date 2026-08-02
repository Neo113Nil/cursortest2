package defpackage;

/* loaded from: classes4.dex */
public final class a4c extends ff7 {
    public final long p;

    public a4c(long j) {
        this.p = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4c) && this.p == ((a4c) obj).p;
    }

    public final int hashCode() {
        return Long.hashCode(this.p);
    }

    public final String toString() {
        return dfi.e(this.p, "In(fadeInDuration=", ")");
    }
}
