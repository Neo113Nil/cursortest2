package T1;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f3091a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f3092b;

    public a(PathInterpolator pathInterpolator, float... fArr) {
        this.f3091a = pathInterpolator;
        this.f3092b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        int length = this.f3092b.length;
        PathInterpolator pathInterpolator = this.f3091a;
        if (length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.f3092b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f9 = fArr[i];
                i++;
                float f10 = fArr[i];
                float f11 = f10 - f9;
                if (f6 >= f9 && f6 <= f10) {
                    return (pathInterpolator.getInterpolation((f6 - f9) / f11) * f11) + f9;
                }
            }
        }
        return pathInterpolator.getInterpolation(f6);
    }
}
