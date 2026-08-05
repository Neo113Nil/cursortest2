package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class a40 extends Drawable {
    public static final double qoPGr6Ce = Math.cos(Math.toRadians(45.0d));

    public static float NCTxEWno(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - qoPGr6Ce) * f2) + (f * 1.5f));
    }

    public static float qoPGr6Ce(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - qoPGr6Ce) * f2) + f);
    }
}
