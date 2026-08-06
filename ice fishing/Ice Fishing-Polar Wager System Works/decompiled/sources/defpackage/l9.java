package defpackage;

/* loaded from: classes.dex */
public interface l9 {
    public static final defpackage.k9 IHQe1A4L2xu = defpackage.k9.IHQe1A4L2xu;

    default float IHQe1A4L2xu(float f, float f2, float f3) {
        IHQe1A4L2xu.getClass();
        float f4 = f2 + f;
        if ((f >= 0.0f && f4 <= f3) || (f < 0.0f && f4 > f3)) {
            return 0.0f;
        }
        float f5 = f4 - f3;
        return java.lang.Math.abs(f) < java.lang.Math.abs(f5) ? f : f5;
    }
}
