package O;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f2114a;

    public n0(int i, Interpolator interpolator, long j6) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2114a = new l0(AbstractC0350z.i(i, interpolator, j6));
        } else {
            this.f2114a = new j0(i, interpolator, j6);
        }
    }
}
