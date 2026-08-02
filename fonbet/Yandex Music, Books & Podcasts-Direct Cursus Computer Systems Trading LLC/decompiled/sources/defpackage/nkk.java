package defpackage;

/* loaded from: classes5.dex */
public final class nkk {
    public final long a;

    public nkk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == nkk.class) {
            if (this.a == ((nkk) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return hrg.m(this.a, " millis", new StringBuilder());
    }
}
