package defpackage;

/* loaded from: classes3.dex */
public final class gxj {
    public final int a;

    public /* synthetic */ gxj(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return dfi.c(i, "OriginalPosition(position=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gxj) {
            return this.a == ((gxj) obj).a;
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
