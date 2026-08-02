package defpackage;

/* loaded from: classes9.dex */
public final class yq11 implements Comparable {
    public final long a;

    public /* synthetic */ yq11(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jl40.r(this.a ^ Long.MIN_VALUE, ((yq11) obj).a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yq11) {
            return this.a == ((yq11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return y5e.P(10, this.a);
    }
}
