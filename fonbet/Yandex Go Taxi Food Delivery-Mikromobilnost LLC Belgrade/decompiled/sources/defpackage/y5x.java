package defpackage;

/* loaded from: classes13.dex */
public final class y5x {
    public final Throwable a;

    public y5x(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5x) && this.a.equals(((y5x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failure(error="), this.a, ')');
    }
}
