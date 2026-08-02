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
    public static boolean f2223h = false;
    public static Method i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f2224j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f2225k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2226l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2227c;

    /* renamed from: d, reason: collision with root package name */
    public G.e[] f2228d;

    /* renamed from: e, reason: collision with root package name */
    public G.e f2229e;

    /* renamed from: f, reason: collision with root package name */
    public A0 f2230f;

    /* renamed from: g, reason: collision with root package name */
    public G.e f2231g;

    public t0(A0 a02, WindowInsets windowInsets) {
        super(a02);
        this.f2229e = null;
        this.f2227c = windowInsets;
    }

    private G.e r(int i4, boolean z6) {
        G.e eVar = G.e.f1030e;
        for (int i6 = 1; i6 <= 256; i6 <<= 1) {
            if ((i4 & i6) != 0) {
                eVar = G.e.a(eVar, s(i6, z6));
            }
        }
        return eVar;
    }

    private G.e t() {
        A0 a02 = this.f2230f;
        return a02 != null ? a02.f2115a.h() : G.e.f1030e;
    }

    private G.e u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2223h) {
            v();
        }
        Method method = i;
        if (method != null && f2224j != null && f2225k != null) {
            try {
                Object invoke = method.invoke(view, new Object[0]);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2225k.get(f2226l.get(invoke));
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
            f2224j = cls;
            f2225k = cls.getDeclaredField("mVisibleInsets");
            f2226l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2225k.setAccessible(true);
            f2226l.setAccessible(true);
        } catch (ReflectiveOperationException e9) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e9.getMessage(), e9);
        }
        f2223h = true;
    }

    @Override // O.y0
    public void d(View view) {
        G.e u6 = u(view);
        if (u6 == null) {
            u6 = G.e.f1030e;
        }
        w(u6);
    }

    @Override // O.y0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f2231g, ((t0) obj).f2231g);
        }
        return false;
    }

    @Override // O.y0
    public G.e f(int i4) {
        return r(i4, false);
    }

    @Override // O.y0
    public final G.e j() {
        if (this.f2229e == null) {
            WindowInsets windowInsets = this.f2227c;
            this.f2229e = G.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2229e;
    }

    @Override // O.y0
    public A0 l(int i4, int i6, int i9, int i10) {
        A0 h3 = A0.h(null, this.f2227c);
        int i11 = Build.VERSION.SDK_INT;
        s0 r0Var = i11 >= 30 ? new r0(h3) : i11 >= 29 ? new q0(h3) : new p0(h3);
        r0Var.g(A0.e(j(), i4, i6, i9, i10));
        r0Var.e(A0.e(h(), i4, i6, i9, i10));
        return r0Var.b();
    }

    @Override // O.y0
    public boolean n() {
        return this.f2227c.isRound();
    }

    @Override // O.y0
    public void o(G.e[] eVarArr) {
        this.f2228d = eVarArr;
    }

    @Override // O.y0
    public void p(A0 a02) {
        this.f2230f = a02;
    }

    public G.e s(int i4, boolean z6) {
        G.e h3;
        int i6;
        if (i4 == 1) {
            return z6 ? G.e.b(0, Math.max(t().f1032b, j().f1032b), 0, 0) : G.e.b(0, j().f1032b, 0, 0);
        }
        if (i4 == 2) {
            if (z6) {
                G.e t6 = t();
                G.e h9 = h();
                return G.e.b(Math.max(t6.f1031a, h9.f1031a), 0, Math.max(t6.f1033c, h9.f1033c), Math.max(t6.f1034d, h9.f1034d));
            }
            G.e j6 = j();
            A0 a02 = this.f2230f;
            h3 = a02 != null ? a02.f2115a.h() : null;
            int i9 = j6.f1034d;
            if (h3 != null) {
                i9 = Math.min(i9, h3.f1034d);
            }
            return G.e.b(j6.f1031a, 0, j6.f1033c, i9);
        }
        G.e eVar = G.e.f1030e;
        if (i4 == 8) {
            G.e[] eVarArr = this.f2228d;
            h3 = eVarArr != null ? eVarArr[com.bumptech.glide.d.v(8)] : null;
            if (h3 != null) {
                return h3;
            }
            G.e j9 = j();
            G.e t9 = t();
            int i10 = j9.f1034d;
            if (i10 > t9.f1034d) {
                return G.e.b(0, 0, 0, i10);
            }
            G.e eVar2 = this.f2231g;
            return (eVar2 == null || eVar2.equals(eVar) || (i6 = this.f2231g.f1034d) <= t9.f1034d) ? eVar : G.e.b(0, 0, 0, i6);
        }
        if (i4 == 16) {
            return i();
        }
        if (i4 == 32) {
            return g();
        }
        if (i4 == 64) {
            return k();
        }
        if (i4 != 128) {
            return eVar;
        }
        A0 a03 = this.f2230f;
        C0339i e9 = a03 != null ? a03.f2115a.e() : e();
        if (e9 == null) {
            return eVar;
        }
        int i11 = Build.VERSION.SDK_INT;
        return G.e.b(i11 >= 28 ? AbstractC0338h.d(e9.f2176a) : 0, i11 >= 28 ? AbstractC0338h.f(e9.f2176a) : 0, i11 >= 28 ? AbstractC0338h.e(e9.f2176a) : 0, i11 >= 28 ? AbstractC0338h.c(e9.f2176a) : 0);
    }

    public void w(G.e eVar) {
        this.f2231g = eVar;
    }
}
