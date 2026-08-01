package O;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class Y extends b0 {
    public static Field e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f777f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f778g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f779h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f780c;

    /* renamed from: d, reason: collision with root package name */
    public G.c f781d;

    public Y() {
        this.f780c = i();
    }

    private static WindowInsets i() {
        if (!f777f) {
            try {
                e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f777f = true;
        }
        Field field = e;
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
        if (!f779h) {
            try {
                f778g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f779h = true;
        }
        Constructor constructor = f778g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // O.b0
    public j0 b() {
        a();
        j0 g2 = j0.g(null, this.f780c);
        G.c[] cVarArr = this.f788b;
        h0 h0Var = g2.f819a;
        h0Var.o(cVarArr);
        h0Var.q(this.f781d);
        return g2;
    }

    @Override // O.b0
    public void e(G.c cVar) {
        this.f781d = cVar;
    }

    @Override // O.b0
    public void g(G.c cVar) {
        WindowInsets windowInsets = this.f780c;
        if (windowInsets != null) {
            this.f780c = windowInsets.replaceSystemWindowInsets(cVar.f261a, cVar.f262b, cVar.f263c, cVar.f264d);
        }
    }

    public Y(j0 j0Var) {
        super(j0Var);
        this.f780c = j0Var.f();
    }
}
