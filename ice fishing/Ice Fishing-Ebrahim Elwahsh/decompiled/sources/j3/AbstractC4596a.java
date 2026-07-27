package j3;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.ads.CL;
import g0.C4519a;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4596a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f38541a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C4519a f38542b = new C4519a(C4519a.f37844d);

    /* renamed from: c, reason: collision with root package name */
    public static final C4519a f38543c = new C4519a();

    /* renamed from: d, reason: collision with root package name */
    public static final C4519a f38544d = new C4519a(C4519a.f37845e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f6, float f9, float f10) {
        return CL.a(f9, f6, f10, f6);
    }

    public static float b(float f6, float f9, float f10, float f11, float f12) {
        return f12 <= f10 ? f6 : f12 >= f11 ? f9 : a(f6, f9, (f12 - f10) / (f11 - f10));
    }

    public static int c(int i, int i4, float f6) {
        return Math.round(f6 * (i4 - i)) + i;
    }
}
