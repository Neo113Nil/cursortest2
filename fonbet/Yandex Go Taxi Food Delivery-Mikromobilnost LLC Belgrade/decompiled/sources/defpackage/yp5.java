package defpackage;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes11.dex */
public final /* synthetic */ class yp5 implements rbn {
    public final /* synthetic */ int a;

    public /* synthetic */ yp5(int i) {
        this.a = i;
    }

    @Override // defpackage.rbn
    public final float a(float f) {
        float f2;
        float f3;
        switch (this.a) {
            case 0:
                return y6i0.c((f - 0.8f) / 0.19999999f, 0.0f, 1.0f);
            case 1:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            case 2:
                if (f < 0.5f) {
                    return ubn.a.a(f / 0.5f) * 1.02f;
                }
                if (f >= 0.8f) {
                    return 1.0f;
                }
                return 1.02f - (ubn.a.a((f - 0.5f) / 0.3f) * 0.02f);
            case 3:
                return new AccelerateInterpolator().getInterpolation(f);
            case 4:
                return new DecelerateInterpolator().getInterpolation(f);
            default:
                return (float) (1.0d - (Math.cos(f * 10.0d) * Math.pow(2.718281828459045d, (-f) / 0.1d)));
        }
    }
}
