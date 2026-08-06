package y;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class F extends I {

    /* renamed from: c, reason: collision with root package name */
    public static Field f8542c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f8543d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f8544e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f8545f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f8546a = e();

    /* renamed from: b, reason: collision with root package name */
    public r.c f8547b;

    private static WindowInsets e() {
        if (!f8543d) {
            try {
                f8542c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f8543d = true;
        }
        Field field = f8542c;
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
        if (!f8545f) {
            try {
                f8544e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f8545f = true;
        }
        Constructor constructor = f8544e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // y.I
    public Q b() {
        a();
        Q a2 = Q.a(this.f8546a, null);
        O o2 = a2.f8566a;
        o2.n(null);
        o2.p(this.f8547b);
        return a2;
    }

    @Override // y.I
    public void c(r.c cVar) {
        this.f8547b = cVar;
    }

    @Override // y.I
    public void d(r.c cVar) {
        WindowInsets windowInsets = this.f8546a;
        if (windowInsets != null) {
            this.f8546a = windowInsets.replaceSystemWindowInsets(cVar.f8448a, cVar.f8449b, cVar.f8450c, cVar.f8451d);
        }
    }
}
