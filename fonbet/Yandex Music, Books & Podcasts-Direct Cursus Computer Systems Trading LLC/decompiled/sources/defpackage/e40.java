package defpackage;

/* loaded from: classes.dex */
public final class e40 {
    public final int a;

    public /* synthetic */ e40(int i) {
        this.a = i;
    }

    public static final /* synthetic */ e40 a(int i) {
        return new e40(i);
    }

    public static String b(int i) {
        return hrg.o("Vertical(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e40) {
            return this.a == ((e40) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
