package defpackage;

/* loaded from: classes5.dex */
public abstract class j5c {
    public static final /* synthetic */ int a = 0;

    static {
        StrictMath.log(Double.MAX_VALUE);
    }

    public static double a(double d) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d) & Long.MAX_VALUE);
    }
}
