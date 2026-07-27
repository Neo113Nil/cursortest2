package O;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t0 extends y0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2135h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f2136j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f2137k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2138l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2139c;

    /* renamed from: d, reason: collision with root package name */
    public G.e[] f2140d;

    /* renamed from: e, reason: collision with root package name */
    public G.e f2141e;

    /* renamed from: f, reason: collision with root package name */
    public A0 f2142f;

    /* renamed from: g, reason: collision with root package name */
    public G.e f2143g;

    public t0(A0 a02, WindowInsets windowInsets) {
        super(a02);
        this.f2141e = null;
        this.f2139c = windowInsets;
    }

    private G.e r(int i6, boolean z3) {
        G.e eVar = G.e.f1004e;
        for (int i9 = 1; i9 <= 256; i9 <<= 1) {
            if ((i6 & i9) != 0) {
                eVar = G.e.a(eVar, s(i9, z3));
            }
        }
        return eVar;
    }

    private G.e t() {
        A0 a02 = this.f2142f;
        return a02 != null ? a02.f2027a.h() : G.e.f1004e;
    }

    private G.e u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2135h) {
            v();
        }
        Method method = i;
        if (method != null && f2136j != null && f2137k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2137k.get(f2138l.get(invoke));
                if (rect != null) {
                    return G.e.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e9) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
            }
        }
        return null;
    }

    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2136j = cls;
            f2137k = cls.getDeclaredField("mVisibleInsets");
            f2138l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2137k.setAccessible(true);
            f2138l.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        f2135h = true;
    }

    @Override // O.y0
    public void d(View view) {
        G.e u3 = u(view);
        if (u3 == null) {
            u3 = G.e.f1004e;
        }
        w(u3);
    }

    @Override // O.y0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2143g, ((t0) obj).f2143g);
        }
        return false;
    }

    @Override // O.y0
    public G.e f(int i6) {
        return r(i6, false);
    }

    @Override // O.y0
    public final G.e j() {
        if (this.f2141e == null) {
            WindowInsets windowInsets = this.f2139c;
            this.f2141e = G.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2141e;
    }

    @Override // O.y0
    public A0 l(int i6, int i9, int i10, int i11) {
        A0 h9 = A0.h(null, this.f2139c);
        int i12 = Build.VERSION.SDK_INT;
        s0 r0Var = i12 >= 30 ? new r0(h9) : i12 >= 29 ? new q0(h9) : new p0(h9);
        r0Var.g(A0.e(j(), i6, i9, i10, i11));
        r0Var.e(A0.e(h(), i6, i9, i10, i11));
        return r0Var.b();
    }

    @Override // O.y0
    public boolean n() {
        return this.f2139c.isRound();
    }

    @Override // O.y0
    public void o(G.e[] eVarArr) {
        this.f2140d = eVarArr;
    }

    @Override // O.y0
    public void p(A0 a02) {
        this.f2142f = a02;
    }

    public G.e s(int i6, boolean z3) {
        G.e h9;
        int i9;
        if (i6 == 1) {
            return z3 ? G.e.b(0, Math.max(t().f1006b, j().f1006b), 0, 0) : G.e.b(0, j().f1006b, 0, 0);
        }
        if (i6 == 2) {
            if (z3) {
                G.e t6 = t();
                G.e h10 = h();
                return G.e.b(Math.max(t6.f1005a, h10.f1005a), 0, Math.max(t6.f1007c, h10.f1007c), Math.max(t6.f1008d, h10.f1008d));
            }
            G.e j6 = j();
            A0 a02 = this.f2142f;
            h9 = a02 != null ? a02.f2027a.h() : null;
            int i10 = j6.f1008d;
            if (h9 != null) {
                i10 = Math.min(i10, h9.f1008d);
            }
            return G.e.b(j6.f1005a, 0, j6.f1007c, i10);
        }
        G.e eVar = G.e.f1004e;
        if (i6 == 8) {
            G.e[] eVarArr = this.f2140d;
            h9 = eVarArr != null ? eVarArr[com.bumptech.glide.e.g(8)] : null;
            if (h9 != null) {
                return h9;
            }
            G.e j9 = j();
            G.e t9 = t();
            int i11 = j9.f1008d;
            if (i11 > t9.f1008d) {
                return G.e.b(0, 0, 0, i11);
            }
            G.e eVar2 = this.f2143g;
            return (eVar2 == null || eVar2.equals(eVar) || (i9 = this.f2143g.f1008d) <= t9.f1008d) ? eVar : G.e.b(0, 0, 0, i9);
        }
        if (i6 == 16) {
            return i();
        }
        if (i6 == 32) {
            return g();
        }
        if (i6 == 64) {
            return k();
        }
        if (i6 != 128) {
            return eVar;
        }
        A0 a03 = this.f2142f;
        C0334i e9 = a03 != null ? a03.f2027a.e() : e();
        if (e9 == null) {
            return eVar;
        }
        int i12 = Build.VERSION.SDK_INT;
        return G.e.b(i12 >= 28 ? AbstractC0333h.d(e9.f2088a) : 0, i12 >= 28 ? AbstractC0333h.f(e9.f2088a) : 0, i12 >= 28 ? AbstractC0333h.e(e9.f2088a) : 0, i12 >= 28 ? AbstractC0333h.c(e9.f2088a) : 0);
    }

    public void w(G.e eVar) {
        this.f2143g = eVar;
    }
}
