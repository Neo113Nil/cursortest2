package defpackage;

/* loaded from: classes.dex */
public final class y7m implements Comparable {
    public final float a;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.a, ((y7m) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y7m) {
            return Float.compare(this.a, ((y7m) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
