package defpackage;

/* loaded from: classes.dex */
public final class jrv {
    public static final jrv b = new jrv(0);
    public static final jrv c = new jrv(1);
    public static final jrv d = new jrv(2);
    public final int a;

    public jrv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jrv.class == obj.getClass() && this.a == ((jrv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "WindowWidthSizeClass: ".concat(equals(b) ? "COMPACT" : equals(c) ? "MEDIUM" : equals(d) ? "EXPANDED" : "UNKNOWN");
    }
}
