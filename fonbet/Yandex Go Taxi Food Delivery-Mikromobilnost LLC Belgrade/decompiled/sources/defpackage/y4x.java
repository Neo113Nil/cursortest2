package defpackage;

/* loaded from: classes13.dex */
public final class y4x {
    public final Throwable a;

    public y4x(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4x) && this.a.equals(((y4x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.s(new StringBuilder("Failure(error="), this.a, ')');
    }
}
