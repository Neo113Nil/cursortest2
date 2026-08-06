package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ga0 {
    public static final float X1lG3V04pd;
    public static final float Yi7zF1RB1;
    public static final float xqGvceK5x;
    public final float GWasM1elztuh;

    static {
        GWasM1elztuh(0.0f);
        GWasM1elztuh(0.5f);
        Yi7zF1RB1 = 0.5f;
        GWasM1elztuh(-1.0f);
        X1lG3V04pd = -1.0f;
        GWasM1elztuh(1.0f);
        xqGvceK5x = 1.0f;
    }

    public static void GWasM1elztuh(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            u10.Yi7zF1RB1("topRatio should be in [0..1] range or -1");
        }
    }

    public static String Yi7zF1RB1(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == Yi7zF1RB1) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == X1lG3V04pd) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == xqGvceK5x) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ga0) {
            return Float.compare(this.GWasM1elztuh, ((ga0) obj).GWasM1elztuh) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.GWasM1elztuh);
    }

    public final String toString() {
        return Yi7zF1RB1(this.GWasM1elztuh);
    }
}
