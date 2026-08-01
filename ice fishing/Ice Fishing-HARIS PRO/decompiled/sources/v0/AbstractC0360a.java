package v0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b0.C0117a;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4480a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0117a f4481b = new C0117a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C0117a f4482c = new C0117a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0117a f4483d = new C0117a(C0117a.e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
