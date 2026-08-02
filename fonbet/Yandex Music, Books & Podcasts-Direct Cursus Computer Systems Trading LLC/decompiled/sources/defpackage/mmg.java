package defpackage;

/* loaded from: classes3.dex */
public final class mmg implements omg {
    public final long a;

    public mmg(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmg) && this.a == ((mmg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "Started(startTime=", ")");
    }
}
