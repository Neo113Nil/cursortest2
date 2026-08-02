package O;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class p0 extends s0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2207e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2208f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2209g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2210h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2211c;

    /* renamed from: d, reason: collision with root package name */
    public G.e f2212d;

    public p0() {
        this.f2211c = i();
    }

    private static WindowInsets i() {
        if (!f2208f) {
            try {
                f2207e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e9);
            }
            f2208f = true;
        }
        Field field = f2207e;
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
        if (!f2210h) {
            try {
                f2209g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f2210h = true;
        }
        Constructor constructor = f2209g;
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
        A0 h3 = A0.h(null, this.f2211c);
        G.e[] eVarArr = this.f2220b;
        y0 y0Var = h3.f2115a;
        y0Var.o(eVarArr);
        y0Var.q(this.f2212d);
        return h3;
    }

    @Override // O.s0
    public void e(G.e eVar) {
        this.f2212d = eVar;
    }

    @Override // O.s0
    public void g(G.e eVar) {
        WindowInsets windowInsets = this.f2211c;
        if (windowInsets != null) {
            this.f2211c = windowInsets.replaceSystemWindowInsets(eVar.f1031a, eVar.f1032b, eVar.f1033c, eVar.f1034d);
        }
    }

    public p0(A0 a02) {
        super(a02);
        this.f2211c = a02.g();
    }
}
