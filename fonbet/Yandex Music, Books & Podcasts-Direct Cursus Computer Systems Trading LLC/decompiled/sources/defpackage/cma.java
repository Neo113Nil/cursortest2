package defpackage;

/* loaded from: classes.dex */
public final class cma implements Comparable {
    public final float a;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.a, ((cma) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cma) {
            return Float.compare(this.a, ((cma) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
