package defpackage;

/* loaded from: classes3.dex */
public final class b0d implements d0d {
    public final int a;

    public b0d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0d) && this.a == ((b0d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Exact(page=", ")");
    }
}
