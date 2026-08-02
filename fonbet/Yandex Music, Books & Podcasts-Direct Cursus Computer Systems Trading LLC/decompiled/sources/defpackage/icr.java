package defpackage;

/* loaded from: classes3.dex */
public final class icr implements kcr {
    public final int a;

    public icr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icr) && this.a == ((icr) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return dfi.c(this.a, "Exact(position=", ", progressMs=0)");
    }
}
