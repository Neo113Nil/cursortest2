package g0;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.ads.Wv;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC4530b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f37578a;

    /* renamed from: b, reason: collision with root package name */
    public final float f37579b;

    public AbstractInterpolatorC4530b(float[] fArr) {
        this.f37578a = fArr;
        this.f37579b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f37578a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f9 = this.f37579b;
        float f10 = (f2 - (min * f9)) / f9;
        float f11 = fArr[min];
        return Wv.a(fArr[min + 1], f11, f10, f11);
    }
}
