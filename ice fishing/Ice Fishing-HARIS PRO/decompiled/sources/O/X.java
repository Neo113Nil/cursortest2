package O;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public W f776a;

    public X(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f776a = new V(J0.b.j(i, interpolator, j));
        } else {
            this.f776a = new T(i, interpolator, j);
        }
    }
}
