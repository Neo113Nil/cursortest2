package T1;

import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f3075a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f3076b;

    public a(PathInterpolator pathInterpolator, float... fArr) {
        this.f3075a = pathInterpolator;
        this.f3076b = fArr;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        int length = this.f3076b.length;
        PathInterpolator pathInterpolator = this.f3075a;
        if (length > 1) {
            int i = 0;
            while (true) {
                float[] fArr = this.f3076b;
                if (i >= fArr.length - 1) {
                    break;
                }
                float f9 = fArr[i];
                i++;
                float f10 = fArr[i];
                float f11 = f10 - f9;
                if (f3 >= f9 && f3 <= f10) {
                    return (pathInterpolator.getInterpolation((f3 - f9) / f11) * f11) + f9;
                }
            }
        }
        return pathInterpolator.getInterpolation(f3);
    }
}
