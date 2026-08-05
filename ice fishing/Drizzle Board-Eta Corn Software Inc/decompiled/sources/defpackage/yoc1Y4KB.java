package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class yoc1Y4KB {
    public static final LinearInterpolator qoPGr6Ce = new LinearInterpolator();
    public static final qg NCTxEWno = new qg();

    static {
        new qg(qg.MdtA4re8);
        new qg(qg.VgvYg0wo);
        new DecelerateInterpolator();
    }

    public static float NCTxEWno(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : qoPGr6Ce(f, f2, (f5 - f3) / (f4 - f3));
    }

    public static float qoPGr6Ce(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
