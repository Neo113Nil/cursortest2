package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cn implements Comparable {
    public final float OOA6hdeuvCS;

    public static int GWasM1elztuh(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String X1lG3V04pd(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean Yi7zF1RB1(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return GWasM1elztuh(this.OOA6hdeuvCS, ((cn) obj).OOA6hdeuvCS);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cn) {
            return Float.compare(this.OOA6hdeuvCS, ((cn) obj).OOA6hdeuvCS) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.OOA6hdeuvCS);
    }

    public final String toString() {
        return X1lG3V04pd(this.OOA6hdeuvCS);
    }
}
