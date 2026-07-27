package w;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p.C0224c;

/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268F extends I {

    /* renamed from: c, reason: collision with root package name */
    public static Field f3015c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3016d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3017e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3018f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f3019a = e();

    /* renamed from: b, reason: collision with root package name */
    public C0224c f3020b;

    private static WindowInsets e() {
        if (!f3016d) {
            try {
                f3015c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3016d = true;
        }
        Field field = f3015c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f3018f) {
            try {
                f3017e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3018f = true;
        }
        Constructor constructor = f3017e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // w.I
    public S b() {
        a();
        S a2 = S.a(this.f3019a, null);
        P p2 = a2.f3039a;
        p2.n(null);
        p2.p(this.f3020b);
        return a2;
    }

    @Override // w.I
    public void c(C0224c c0224c) {
        this.f3020b = c0224c;
    }

    @Override // w.I
    public void d(C0224c c0224c) {
        WindowInsets windowInsets = this.f3019a;
        if (windowInsets != null) {
            this.f3019a = windowInsets.replaceSystemWindowInsets(c0224c.f2793a, c0224c.f2794b, c0224c.f2795c, c0224c.f2796d);
        }
    }
}
