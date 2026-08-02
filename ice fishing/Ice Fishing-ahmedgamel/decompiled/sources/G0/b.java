package G0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class b implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1055a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        switch (this.f1055a) {
            case 0:
                float f9 = f2 - 1.0f;
                return (f9 * f9 * f9 * f9 * f9) + 1.0f;
            case 1:
                float f10 = f2 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f2 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
