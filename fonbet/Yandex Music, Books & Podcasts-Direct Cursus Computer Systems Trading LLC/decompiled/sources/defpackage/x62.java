package defpackage;

/* loaded from: classes4.dex */
public final class x62 {
    public final long a;

    public x62(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x62) && this.a == ((x62) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "CacheInfo(lastUseTimestamp=", ")");
    }
}
