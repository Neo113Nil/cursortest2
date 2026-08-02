package n3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.ads.Wv;
import g0.C4529a;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4770a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f39641a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C4529a f39642b = new C4529a(C4529a.f37576d);

    /* renamed from: c, reason: collision with root package name */
    public static final C4529a f39643c = new C4529a();

    /* renamed from: d, reason: collision with root package name */
    public static final C4529a f39644d = new C4529a(C4529a.f37577e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f9, float f10) {
        return Wv.a(f9, f2, f10, f2);
    }

    public static float b(float f2, float f9, float f10, float f11, float f12) {
        return f12 <= f10 ? f2 : f12 >= f11 ? f9 : a(f2, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i, int i4, float f2) {
        return Math.round(f2 * (i4 - i)) + i;
    }
}
