package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class vpv {
    public upv a;

    public vpv(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new tpv(bb.b(i, interpolator, j));
        } else {
            this.a = new rpv(i, interpolator, j);
        }
    }
}
