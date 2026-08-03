package h3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f2790e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2791f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f2792g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2793h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f2794c;

    /* renamed from: d, reason: collision with root package name */
    public a3.b f2795d;

    public j0() {
        this.f2794c = i();
    }

    private static WindowInsets i() {
        if (!f2791f) {
            try {
                f2790e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
            }
            f2791f = true;
        }
        Field field = f2790e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
            }
        }
        if (!f2793h) {
            try {
                f2792g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
            }
            f2793h = true;
        }
        Constructor constructor = f2792g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e13) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
            }
        }
        return null;
    }

    @Override // h3.p0
    public a1 b() {
        a();
        a1 c3 = a1.c(null, this.f2794c);
        a3.b[] bVarArr = this.f2808b;
        x0 x0Var = c3.f2745a;
        x0Var.q(bVarArr);
        x0Var.s(this.f2795d);
        return c3;
    }

    @Override // h3.p0
    public void e(a3.b bVar) {
        this.f2795d = bVar;
    }

    @Override // h3.p0
    public void g(a3.b bVar) {
        WindowInsets windowInsets = this.f2794c;
        if (windowInsets != null) {
            this.f2794c = windowInsets.replaceSystemWindowInsets(bVar.f194a, bVar.f195b, bVar.f196c, bVar.f197d);
        }
    }

    public j0(a1 a1Var) {
        super(a1Var);
        this.f2794c = a1Var.b();
    }
}
