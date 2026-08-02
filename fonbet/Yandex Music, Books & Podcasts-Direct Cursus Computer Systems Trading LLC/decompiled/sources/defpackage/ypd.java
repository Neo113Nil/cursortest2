package defpackage;

/* loaded from: classes.dex */
public final class ypd {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ypd) {
            return this.a == ((ypd) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
