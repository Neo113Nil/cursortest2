package defpackage;

/* loaded from: classes4.dex */
public final class ffb {
    public final long a;

    public ffb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffb) && this.a == ((ffb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return dfi.e(this.a, "ErrorDelay(delayMs=", ")");
    }
}
