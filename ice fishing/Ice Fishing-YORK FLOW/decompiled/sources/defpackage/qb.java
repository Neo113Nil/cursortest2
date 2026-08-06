package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public interface qb {
    public static final defpackage.pb ZpBGe2uQfcn8 = defpackage.pb.ZpBGe2uQfcn8;

    default float ZpBGe2uQfcn8(float f, float f2, float f3) {
        ZpBGe2uQfcn8.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return java.lang.Math.abs(f) < java.lang.Math.abs(f5) ? f : f5;
    }
}
