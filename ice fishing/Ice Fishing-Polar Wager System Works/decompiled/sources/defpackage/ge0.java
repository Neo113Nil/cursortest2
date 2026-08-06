package defpackage;

/* loaded from: classes.dex */
public final class ge0 {
    public static final float F7NU4MC0GW;
    public static final float oh6vYeIP;
    public static final float r1MBDhnF;
    public final float IHQe1A4L2xu;

    static {
        IHQe1A4L2xu(0.0f);
        IHQe1A4L2xu(0.5f);
        oh6vYeIP = 0.5f;
        IHQe1A4L2xu(-1.0f);
        r1MBDhnF = -1.0f;
        IHQe1A4L2xu(1.0f);
        F7NU4MC0GW = 1.0f;
    }

    public static void IHQe1A4L2xu(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            defpackage.y50.oh6vYeIP("topRatio should be in [0..1] range or -1");
        }
    }

    public static java.lang.String oh6vYeIP(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == oh6vYeIP) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == r1MBDhnF) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == F7NU4MC0GW) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ge0) {
            return java.lang.Float.compare(this.IHQe1A4L2xu, ((defpackage.ge0) obj).IHQe1A4L2xu) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.IHQe1A4L2xu);
    }

    public final java.lang.String toString() {
        return oh6vYeIP(this.IHQe1A4L2xu);
    }
}
