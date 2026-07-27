package O;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2119e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2120f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2121g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2122h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2123c;

    /* renamed from: d, reason: collision with root package name */
    public G.e f2124d;

    public p0() {
        this.f2123c = i();
    }

    private static WindowInsets i() {
        if (!f2120f) {
            try {
                f2119e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f2120f = true;
        }
        Field field = f2119e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f2122h) {
            try {
                f2121g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f2122h = true;
        }
        Constructor constructor = f2121g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // O.s0
    public A0 b() {
        a();
        A0 h9 = A0.h(null, this.f2123c);
        G.e[] eVarArr = this.f2132b;
        y0 y0Var = h9.f2027a;
        y0Var.o(eVarArr);
        y0Var.q(this.f2124d);
        return h9;
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2124d = eVar;
    }

    @Override // O.s0
    public void g(G.e eVar) {
        WindowInsets windowInsets = this.f2123c;
        if (windowInsets != null) {
            this.f2123c = windowInsets.replaceSystemWindowInsets(eVar.f1005a, eVar.f1006b, eVar.f1007c, eVar.f1008d);
        }
    }

    public p0(A0 a02) {
        super(a02);
        this.f2123c = a02.g();
    }
}
