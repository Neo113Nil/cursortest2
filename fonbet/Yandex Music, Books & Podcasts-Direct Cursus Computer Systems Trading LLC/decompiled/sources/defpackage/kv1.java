package defpackage;

/* loaded from: classes3.dex */
public final class kv1 implements lv1 {
    public final int a;

    public kv1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv1) && this.a == ((kv1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return dfi.c(this.a, "Fixed(bitrate=", ")");
    }
}
