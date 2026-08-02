package defpackage;

/* loaded from: classes.dex */
public final class lf6 extends mf6 {
    public final long a;

    public lf6(long j) {
        this.a = j;
        if ((j & 9223372034707292159L) != 9205357640488583168L) {
            return;
        }
        vme.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lf6)) {
            return false;
        }
        return enj.c(this.a, ((lf6) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) enj.j(this.a)) + ')';
    }
}
