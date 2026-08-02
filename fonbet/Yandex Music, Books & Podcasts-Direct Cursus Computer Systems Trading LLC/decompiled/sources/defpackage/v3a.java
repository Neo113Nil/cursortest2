package defpackage;

/* loaded from: classes5.dex */
public final class v3a {
    public final int a;

    public static String a(int i) {
        return dfi.c(i, "DocumentEpoch(epoch=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v3a) {
            return this.a == ((v3a) obj).a;
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
