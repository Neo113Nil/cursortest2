package defpackage;

/* loaded from: classes3.dex */
public final class ok6 {
    public final int a;

    public ok6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok6) && this.a == ((ok6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "CoordinateMatrixPrefetchConfig(prefetchRingInterval=", ")");
    }
}
