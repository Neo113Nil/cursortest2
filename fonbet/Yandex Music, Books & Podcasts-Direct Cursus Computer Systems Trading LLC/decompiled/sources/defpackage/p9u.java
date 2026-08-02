package defpackage;

/* loaded from: classes4.dex */
public final class p9u implements q9u {
    public final int a;

    public p9u(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p9u) && this.a == ((p9u) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "ByIndex(index=", ")");
    }
}
