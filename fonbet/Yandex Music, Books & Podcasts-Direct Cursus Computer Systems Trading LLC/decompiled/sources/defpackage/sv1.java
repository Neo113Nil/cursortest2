package defpackage;

/* loaded from: classes4.dex */
public final class sv1 implements tv1 {
    public final int a;

    public sv1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv1) && this.a == ((sv1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Fixed(bitrate=", ")");
    }
}
