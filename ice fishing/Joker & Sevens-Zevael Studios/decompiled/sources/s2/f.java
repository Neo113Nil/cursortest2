package s2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: g, reason: collision with root package name */
    public final float f6387g;

    public static final boolean a(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f6387g, ((f) obj).f6387g);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6387g, ((f) obj).f6387g) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6387g);
    }

    public final String toString() {
        return b(this.f6387g);
    }
}
