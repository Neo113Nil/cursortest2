package l3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.icefishing.icefishinglive2.AbstractC4404f;
import g0.C4519a;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4661a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f38903a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C4519a f38904b = new C4519a(C4519a.f37614d);

    /* renamed from: c, reason: collision with root package name */
    public static final C4519a f38905c = new C4519a();

    /* renamed from: d, reason: collision with root package name */
    public static final C4519a f38906d = new C4519a(C4519a.f37615e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f3, float f9, float f10) {
        return AbstractC4404f.a(f9, f3, f10, f3);
    }

    public static float b(float f3, float f9, float f10, float f11, float f12) {
        return f12 <= f10 ? f3 : f12 >= f11 ? f9 : a(f3, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i, int i6, float f3) {
        return Math.round(f3 * (i6 - i)) + i;
    }
}
