package defpackage;

/* loaded from: classes3.dex */
public final class ran {
    public final int a;

    public static String a(int i) {
        return dfi.c(i, "QueuePosition(position=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ran) {
            return this.a == ((ran) obj).a;
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
