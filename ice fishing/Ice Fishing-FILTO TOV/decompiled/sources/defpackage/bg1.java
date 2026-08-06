package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class bg1 {
    public ag1 GWasM1elztuh;

    public bg1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.GWasM1elztuh = new zf1(JFXS9W1rB5s4.mOu10nynGul(i, interpolator, j));
        } else {
            this.GWasM1elztuh = new xf1(i, interpolator, j);
        }
    }
}
