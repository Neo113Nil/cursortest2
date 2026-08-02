package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import androidx.core.view.f;

/* loaded from: classes.dex */
public final class u651 {
    public t651 a;

    public u651(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new s651(r651.g(i, interpolator, j));
        } else {
            this.a = new f(i, interpolator, j);
        }
    }
}
