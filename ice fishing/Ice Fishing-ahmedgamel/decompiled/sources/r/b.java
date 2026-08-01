package r;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f40295a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f3, float f9, boolean z3) {
        if (!z3) {
            return f3;
        }
        return (float) (((1.0d - f40295a) * f9) + f3);
    }

    public static float b(float f3, float f9, boolean z3) {
        if (!z3) {
            return f3 * 1.5f;
        }
        return (float) (((1.0d - f40295a) * f9) + (f3 * 1.5f));
    }
}
