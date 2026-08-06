package defpackage;

/* loaded from: classes.dex */
public abstract class b60 {
    public static final long IHQe1A4L2xu = IHQe1A4L2xu(Float.NaN, Float.NaN);
    public static final /* synthetic */ int oh6vYeIP = 0;

    public static long IHQe1A4L2xu(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static java.lang.String oh6vYeIP(long j) {
        return "InlineDensity(density=" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
