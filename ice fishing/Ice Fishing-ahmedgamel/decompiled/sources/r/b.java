package r;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f40106a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f9, boolean z6) {
        if (!z6) {
            return f2;
        }
        return (float) (((1.0d - f40106a) * f9) + f2);
    }

    public static float b(float f2, float f9, boolean z6) {
        if (!z6) {
            return f2 * 1.5f;
        }
        return (float) (((1.0d - f40106a) * f9) + (f2 * 1.5f));
    }
}
