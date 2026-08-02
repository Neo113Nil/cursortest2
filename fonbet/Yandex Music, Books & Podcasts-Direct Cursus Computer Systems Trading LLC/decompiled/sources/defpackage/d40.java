package defpackage;

/* loaded from: classes.dex */
public final class d40 {
    public final int a;

    public /* synthetic */ d40(int i) {
        this.a = i;
    }

    public static final /* synthetic */ d40 a(int i) {
        return new d40(i);
    }

    public static String b(int i) {
        return hrg.o("Horizontal(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d40) {
            return this.a == ((d40) obj).a;
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
