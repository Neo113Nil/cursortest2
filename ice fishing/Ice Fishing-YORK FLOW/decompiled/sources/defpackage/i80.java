package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class i80 {
    public static final long ZpBGe2uQfcn8 = ZpBGe2uQfcn8(Float.NaN, Float.NaN);
    public static final /* synthetic */ int giKS3J6vZuNy = 0;

    public static long ZpBGe2uQfcn8(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static java.lang.String giKS3J6vZuNy(long j) {
        return "InlineDensity(density=" + java.lang.Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }
}
