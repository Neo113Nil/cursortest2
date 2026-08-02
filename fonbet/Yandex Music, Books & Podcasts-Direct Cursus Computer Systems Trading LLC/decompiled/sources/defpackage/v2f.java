package defpackage;

/* loaded from: classes3.dex */
public final class v2f {
    public final int a;

    public v2f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2f) && this.a == ((v2f) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "JobId(id=", ")");
    }
}
