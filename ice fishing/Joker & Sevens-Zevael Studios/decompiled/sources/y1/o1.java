package y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface o1 {
    default float a() {
        return Float.MAX_VALUE;
    }

    float b();

    default long c() {
        float f10 = 48;
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }
}
