package defpackage;

/* loaded from: classes.dex */
public final class m9 implements defpackage.l9 {
    @Override // defpackage.l9
    public final float IHQe1A4L2xu(float f, float f2, float f3) {
        float abs = java.lang.Math.abs((f2 + f) - f);
        float f4 = (0.3f * f3) - (0.0f * abs);
        float f5 = f3 - f4;
        if ((abs <= f3) && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
