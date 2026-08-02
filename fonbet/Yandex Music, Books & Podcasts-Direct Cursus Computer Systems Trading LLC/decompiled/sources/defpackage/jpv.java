package defpackage;

/* loaded from: classes.dex */
public final class jpv {
    public static final jpv b = new jpv(0);
    public static final jpv c = new jpv(1);
    public static final jpv d = new jpv(2);
    public final int a;

    public jpv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && jpv.class == obj.getClass() && this.a == ((jpv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "WindowHeightSizeClass: ".concat(equals(b) ? "COMPACT" : equals(c) ? "MEDIUM" : equals(d) ? "EXPANDED" : "UNKNOWN");
    }
}
