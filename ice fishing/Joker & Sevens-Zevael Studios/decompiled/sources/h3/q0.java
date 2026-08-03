package h3;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class q0 extends x0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f2809i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f2810j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f2811k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f2812l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f2813m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2814c;

    /* renamed from: d, reason: collision with root package name */
    public a3.b[] f2815d;

    /* renamed from: e, reason: collision with root package name */
    public a3.b f2816e;

    /* renamed from: f, reason: collision with root package name */
    public a1 f2817f;

    /* renamed from: g, reason: collision with root package name */
    public a3.b f2818g;

    /* renamed from: h, reason: collision with root package name */
    public int f2819h;

    public q0(a1 a1Var, WindowInsets windowInsets) {
        super(a1Var);
        this.f2816e = null;
        this.f2814c = windowInsets;
    }

    public static boolean B(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private a3.b u(int i10, boolean z10) {
        a3.b bVar = a3.b.f193e;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                bVar = a3.b.a(bVar, v(i11, z10));
            }
        }
        return bVar;
    }

    private a3.b w() {
        a1 a1Var = this.f2817f;
        return a1Var != null ? a1Var.f2745a.i() : a3.b.f193e;
    }

    private a3.b x(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f2809i) {
            z();
        }
        Method method = f2810j;
        if (method != null && f2811k != null && f2812l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f2812l.get(f2813m.get(invoke));
                if (rect != null) {
                    return a3.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    private static void z() {
        try {
            f2810j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2811k = cls;
            f2812l = cls.getDeclaredField("mVisibleInsets");
            f2813m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2812l.setAccessible(true);
            f2813m.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
        }
        f2809i = true;
    }

    public void A(a3.b bVar) {
        this.f2818g = bVar;
    }

    @Override // h3.x0
    public void d(View view) {
        a3.b x10 = x(view);
        if (x10 == null) {
            x10 = a3.b.f193e;
        }
        A(x10);
    }

    @Override // h3.x0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f2818g, q0Var.f2818g) && B(this.f2819h, q0Var.f2819h);
    }

    @Override // h3.x0
    public a3.b f(int i10) {
        return u(i10, false);
    }

    @Override // h3.x0
    public a3.b g(int i10) {
        return u(i10, true);
    }

    @Override // h3.x0
    public final a3.b k() {
        if (this.f2816e == null) {
            WindowInsets windowInsets = this.f2814c;
            this.f2816e = a3.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2816e;
    }

    @Override // h3.x0
    public a1 m(int i10, int i11, int i12, int i13) {
        a1 c3 = a1.c(null, this.f2814c);
        int i14 = Build.VERSION.SDK_INT;
        p0 o0Var = i14 >= 34 ? new o0(c3) : i14 >= 31 ? new n0(c3) : i14 >= 30 ? new m0(c3) : i14 >= 29 ? new l0(c3) : new j0(c3);
        o0Var.g(a1.a(k(), i10, i11, i12, i13));
        o0Var.e(a1.a(i(), i10, i11, i12, i13));
        return o0Var.b();
    }

    @Override // h3.x0
    public boolean o() {
        return this.f2814c.isRound();
    }

    @Override // h3.x0
    public boolean p(int i10) {
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && !y(i11)) {
                return false;
            }
        }
        return true;
    }

    @Override // h3.x0
    public void q(a3.b[] bVarArr) {
        this.f2815d = bVarArr;
    }

    @Override // h3.x0
    public void r(a1 a1Var) {
        this.f2817f = a1Var;
    }

    @Override // h3.x0
    public void t(int i10) {
        this.f2819h = i10;
    }

    public a3.b v(int i10, boolean z10) {
        a3.b i11;
        int i12;
        a3.b bVar = a3.b.f193e;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 8) {
                    a3.b[] bVarArr = this.f2815d;
                    i11 = bVarArr != null ? bVarArr[bc.a0.v(8)] : null;
                    if (i11 != null) {
                        return i11;
                    }
                    a3.b k3 = k();
                    a3.b w3 = w();
                    int i13 = k3.f197d;
                    if (i13 > w3.f197d) {
                        return a3.b.b(0, 0, 0, i13);
                    }
                    a3.b bVar2 = this.f2818g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i12 = this.f2818g.f197d) > w3.f197d) {
                        return a3.b.b(0, 0, 0, i12);
                    }
                } else {
                    if (i10 == 16) {
                        return j();
                    }
                    if (i10 == 32) {
                        return h();
                    }
                    if (i10 == 64) {
                        return l();
                    }
                    if (i10 == 128) {
                        a1 a1Var = this.f2817f;
                        d e10 = a1Var != null ? a1Var.f2745a.e() : e();
                        if (e10 != null) {
                            int i14 = Build.VERSION.SDK_INT;
                            return a3.b.b(i14 >= 28 ? b3.a.h(e10.f2767a) : 0, i14 >= 28 ? b3.a.j(e10.f2767a) : 0, i14 >= 28 ? b3.a.i(e10.f2767a) : 0, i14 >= 28 ? b3.a.g(e10.f2767a) : 0);
                        }
                    }
                }
            } else {
                if (z10) {
                    a3.b w10 = w();
                    a3.b i15 = i();
                    return a3.b.b(Math.max(w10.f194a, i15.f194a), 0, Math.max(w10.f196c, i15.f196c), Math.max(w10.f197d, i15.f197d));
                }
                if ((this.f2819h & 2) == 0) {
                    a3.b k10 = k();
                    a1 a1Var2 = this.f2817f;
                    i11 = a1Var2 != null ? a1Var2.f2745a.i() : null;
                    int i16 = k10.f197d;
                    if (i11 != null) {
                        i16 = Math.min(i16, i11.f197d);
                    }
                    return a3.b.b(k10.f194a, 0, k10.f196c, i16);
                }
            }
        } else {
            if (z10) {
                return a3.b.b(0, Math.max(w().f195b, k().f195b), 0, 0);
            }
            if ((this.f2819h & 4) == 0) {
                return a3.b.b(0, k().f195b, 0, 0);
            }
        }
        return bVar;
    }

    public boolean y(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 8 && i10 != 128) {
                return true;
            }
        }
        return !v(i10, false).equals(a3.b.f193e);
    }
}
