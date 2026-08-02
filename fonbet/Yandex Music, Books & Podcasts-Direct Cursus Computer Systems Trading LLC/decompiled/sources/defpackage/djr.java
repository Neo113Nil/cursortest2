package defpackage;

/* loaded from: classes3.dex */
public final class djr implements ejr {
    public final int a;

    public djr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djr) && this.a == ((djr) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Fixed(bitrate=", ")");
    }
}
