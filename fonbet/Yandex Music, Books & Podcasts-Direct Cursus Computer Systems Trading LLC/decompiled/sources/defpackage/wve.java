package defpackage;

/* loaded from: classes4.dex */
public final class wve implements xve {
    public final long a;

    public wve(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wve) && this.a == ((wve) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "Timeout(timeout=", ")");
    }
}
