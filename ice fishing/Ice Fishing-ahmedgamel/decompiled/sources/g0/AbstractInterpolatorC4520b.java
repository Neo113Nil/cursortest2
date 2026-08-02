package g0;

import android.view.animation.Interpolator;
import com.icefishingapp.icefishing.AbstractC4404f;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC4520b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37616a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37617b;

    public AbstractInterpolatorC4520b(float[] fArr) {
        this.f37616a = fArr;
        this.f37617b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f37616a;
        int min = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f9 = this.f37617b;
        float f10 = (f3 - (min * f9)) / f9;
        float f11 = fArr[min];
        return AbstractC4404f.a(fArr[min + 1], f11, f10, f11);
    }
}
