package O;

import a.AbstractC0078a;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c0 extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f789h = false;
    public static Method i;
    public static Class j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f790k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f791l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f792c;

    /* renamed from: d, reason: collision with root package name */
    public G.c[] f793d;
    public G.c e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f794f;

    /* renamed from: g, reason: collision with root package name */
    public G.c f795g;

    public c0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var);
        this.e = null;
        this.f792c = windowInsets;
    }

    private G.c r(int i2, boolean z2) {
        G.c cVar = G.c.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = G.c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private G.c t() {
        j0 j0Var = this.f794f;
        return j0Var != null ? j0Var.f819a.h() : G.c.e;
    }

    private G.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f789h) {
            v();
        }
        Method method = i;
        if (method != null && j != null && f790k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f790k.get(f791l.get(invoke));
                if (rect != null) {
                    return G.c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            f790k = cls.getDeclaredField("mVisibleInsets");
            f791l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f790k.setAccessible(true);
            f791l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f789h = true;
    }

    @Override // O.h0
    public void d(View view) {
        G.c u2 = u(view);
        if (u2 == null) {
            u2 = G.c.e;
        }
        w(u2);
    }

    @Override // O.h0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f795g, ((c0) obj).f795g);
        }
        return false;
    }

    @Override // O.h0
    public G.c f(int i2) {
        return r(i2, false);
    }

    @Override // O.h0
    public final G.c j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f792c;
            this.e = G.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // O.h0
    public j0 l(int i2, int i3, int i4, int i5) {
        j0 g2 = j0.g(null, this.f792c);
        int i6 = Build.VERSION.SDK_INT;
        b0 a0Var = i6 >= 30 ? new a0(g2) : i6 >= 29 ? new Z(g2) : new Y(g2);
        a0Var.g(j0.e(j(), i2, i3, i4, i5));
        a0Var.e(j0.e(h(), i2, i3, i4, i5));
        return a0Var.b();
    }

    @Override // O.h0
    public boolean n() {
        return this.f792c.isRound();
    }

    @Override // O.h0
    public void o(G.c[] cVarArr) {
        this.f793d = cVarArr;
    }

    @Override // O.h0
    public void p(j0 j0Var) {
        this.f794f = j0Var;
    }

    public G.c s(int i2, boolean z2) {
        G.c h2;
        int i3;
        if (i2 == 1) {
            return z2 ? G.c.b(0, Math.max(t().f262b, j().f262b), 0, 0) : G.c.b(0, j().f262b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                G.c t2 = t();
                G.c h3 = h();
                return G.c.b(Math.max(t2.f261a, h3.f261a), 0, Math.max(t2.f263c, h3.f263c), Math.max(t2.f264d, h3.f264d));
            }
            G.c j2 = j();
            j0 j0Var = this.f794f;
            h2 = j0Var != null ? j0Var.f819a.h() : null;
            int i4 = j2.f264d;
            if (h2 != null) {
                i4 = Math.min(i4, h2.f264d);
            }
            return G.c.b(j2.f261a, 0, j2.f263c, i4);
        }
        G.c cVar = G.c.e;
        if (i2 == 8) {
            G.c[] cVarArr = this.f793d;
            h2 = cVarArr != null ? cVarArr[AbstractC0078a.J(8)] : null;
            if (h2 != null) {
                return h2;
            }
            G.c j3 = j();
            G.c t3 = t();
            int i5 = j3.f264d;
            if (i5 > t3.f264d) {
                return G.c.b(0, 0, 0, i5);
            }
            G.c cVar2 = this.f795g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f795g.f264d) <= t3.f264d) ? cVar : G.c.b(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return cVar;
        }
        j0 j0Var2 = this.f794f;
        C0033i e = j0Var2 != null ? j0Var2.f819a.e() : e();
        if (e == null) {
            return cVar;
        }
        int i6 = Build.VERSION.SDK_INT;
        return G.c.b(i6 >= 28 ? E.a.e(e.f817a) : 0, i6 >= 28 ? E.a.g(e.f817a) : 0, i6 >= 28 ? E.a.f(e.f817a) : 0, i6 >= 28 ? E.a.d(e.f817a) : 0);
    }

    public void w(G.c cVar) {
        this.f795g = cVar;
    }
}
