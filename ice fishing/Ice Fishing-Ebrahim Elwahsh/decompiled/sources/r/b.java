package r;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f40197a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f6, float f9, boolean z8) {
        if (!z8) {
            return f6;
        }
        return (float) (((1.0d - f40197a) * f9) + f6);
    }

    public static float b(float f6, float f9, boolean z8) {
        if (!z8) {
            return f6 * 1.5f;
        }
        return (float) (((1.0d - f40197a) * f9) + (f6 * 1.5f));
    }
}
