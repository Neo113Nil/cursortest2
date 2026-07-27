package w;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p.C0225c;

/* renamed from: w.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262F extends I {

    /* renamed from: c, reason: collision with root package name */
    public static Field f3020c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f3021d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f3022e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3023f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f3024a = e();

    /* renamed from: b, reason: collision with root package name */
    public C0225c f3025b;

    private static WindowInsets e() {
        if (!f3021d) {
            try {
                f3020c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f3021d = true;
        }
        Field field = f3020c;
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
        if (!f3023f) {
            try {
                f3022e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f3023f = true;
        }
        Constructor constructor = f3022e;
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
        S a2 = S.a(this.f3024a, null);
        P p2 = a2.f3044a;
        p2.n(null);
        p2.p(this.f3025b);
        return a2;
    }

    @Override // w.I
    public void c(C0225c c0225c) {
        this.f3025b = c0225c;
    }

    @Override // w.I
    public void d(C0225c c0225c) {
        WindowInsets windowInsets = this.f3024a;
        if (windowInsets != null) {
            this.f3024a = windowInsets.replaceSystemWindowInsets(c0225c.f2801a, c0225c.f2802b, c0225c.f2803c, c0225c.f2804d);
        }
    }
}
