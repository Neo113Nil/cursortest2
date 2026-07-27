package O;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f2300a;

    public n0(int i, Interpolator interpolator, long j9) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2300a = new l0(AbstractC0363z.i(i, interpolator, j9));
        } else {
            this.f2300a = new j0(i, interpolator, j9);
        }
    }
}
