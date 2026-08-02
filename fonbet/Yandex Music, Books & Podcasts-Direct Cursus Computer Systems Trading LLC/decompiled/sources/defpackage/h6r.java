package defpackage;

/* loaded from: classes4.dex */
public final class h6r {
    public final int a;

    public static String a(int i) {
        return dfi.c(i, "SpeedKbps(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h6r) {
            return this.a == ((h6r) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
