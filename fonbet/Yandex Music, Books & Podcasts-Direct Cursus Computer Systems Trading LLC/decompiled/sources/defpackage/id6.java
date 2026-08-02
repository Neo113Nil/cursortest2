package defpackage;

/* loaded from: classes.dex */
public final class id6 {
    public final int a;

    public /* synthetic */ id6(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return hrg.o("ContentScale(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof id6) {
            return this.a == ((id6) obj).a;
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
