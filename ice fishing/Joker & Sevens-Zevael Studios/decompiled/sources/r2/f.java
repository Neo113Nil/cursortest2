package r2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final float f6020b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6021c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6022d;

    /* renamed from: a, reason: collision with root package name */
    public final float f6023a;

    static {
        a(0.0f);
        a(0.5f);
        f6020b = 0.5f;
        a(-1.0f);
        f6021c = -1.0f;
        a(1.0f);
        f6022d = 1.0f;
    }

    public static void a(float f10) {
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            m2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f10) {
        if (f10 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f10 == f6020b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f10 == f6021c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f10 == f6022d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f6023a, ((f) obj).f6023a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f6023a);
    }

    public final String toString() {
        return b(this.f6023a);
    }
}
