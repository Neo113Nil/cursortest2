package G0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1029a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f3) {
        switch (this.f1029a) {
            case 0:
                float f9 = f3 - 1.0f;
                return (f9 * f9 * f9 * f9 * f9) + 1.0f;
            case 1:
                float f10 = f3 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f3 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
