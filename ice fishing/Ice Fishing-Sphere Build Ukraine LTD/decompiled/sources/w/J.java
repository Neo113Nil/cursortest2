package w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p.C0225c;

/* loaded from: classes.dex */
public abstract class J extends P {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3027h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3028i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f3029j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f3030k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3031l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3032c;

    /* renamed from: d, reason: collision with root package name */
    public C0225c[] f3033d;

    /* renamed from: e, reason: collision with root package name */
    public C0225c f3034e;

    /* renamed from: f, reason: collision with root package name */
    public S f3035f;

    /* renamed from: g, reason: collision with root package name */
    public C0225c f3036g;

    public J(S s2, WindowInsets windowInsets) {
        super(s2);
        this.f3034e = null;
        this.f3032c = windowInsets;
    }

    private C0225c r() {
        S s2 = this.f3035f;
        return s2 != null ? s2.f3044a.g() : C0225c.f2800e;
    }

    private C0225c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3027h) {
            u();
        }
        Method method = f3028i;
        if (method != null && f3029j != null && f3030k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3030k.get(f3031l.get(invoke));
                if (rect != null) {
                    return C0225c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void u() {
        try {
            f3028i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3029j = cls;
            f3030k = cls.getDeclaredField("mVisibleInsets");
            f3031l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3030k.setAccessible(true);
            f3031l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3027h = true;
    }

    @Override // w.P
    public void d(View view) {
        C0225c s2 = s(view);
        if (s2 == null) {
            s2 = C0225c.f2800e;
        }
        v(s2);
    }

    @Override // w.P
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3036g, ((J) obj).f3036g);
        }
        return false;
    }

    @Override // w.P
    public final C0225c i() {
        if (this.f3034e == null) {
            WindowInsets windowInsets = this.f3032c;
            this.f3034e = C0225c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3034e;
    }

    @Override // w.P
    public boolean l() {
        return this.f3032c.isRound();
    }

    @Override // w.P
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // w.P
    public void n(C0225c[] c0225cArr) {
        this.f3033d = c0225cArr;
    }

    @Override // w.P
    public void o(S s2) {
        this.f3035f = s2;
    }

    public C0225c q(int i2, boolean z2) {
        C0225c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0225c.a(0, Math.max(r().f2802b, i().f2802b), 0, 0) : C0225c.a(0, i().f2802b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0225c r = r();
                C0225c g3 = g();
                return C0225c.a(Math.max(r.f2801a, g3.f2801a), 0, Math.max(r.f2803c, g3.f2803c), Math.max(r.f2804d, g3.f2804d));
            }
            C0225c i4 = i();
            S s2 = this.f3035f;
            g2 = s2 != null ? s2.f3044a.g() : null;
            int i5 = i4.f2804d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f2804d);
            }
            return C0225c.a(i4.f2801a, 0, i4.f2803c, i5);
        }
        C0225c c0225c = C0225c.f2800e;
        if (i2 == 8) {
            C0225c[] c0225cArr = this.f3033d;
            g2 = c0225cArr != null ? c0225cArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0225c i6 = i();
            C0225c r2 = r();
            int i7 = i6.f2804d;
            if (i7 > r2.f2804d) {
                return C0225c.a(0, 0, 0, i7);
            }
            C0225c c0225c2 = this.f3036g;
            return (c0225c2 == null || c0225c2.equals(c0225c) || (i3 = this.f3036g.f2804d) <= r2.f2804d) ? c0225c : C0225c.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return h();
        }
        if (i2 == 32) {
            return f();
        }
        if (i2 == 64) {
            return j();
        }
        if (i2 != 128) {
            return c0225c;
        }
        S s3 = this.f3035f;
        C0267e e2 = s3 != null ? s3.f3044a.e() : e();
        if (e2 == null) {
            return c0225c;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0225c.a(i8 >= 28 ? AbstractC0266d.d(e2.f3060a) : 0, i8 >= 28 ? AbstractC0266d.f(e2.f3060a) : 0, i8 >= 28 ? AbstractC0266d.e(e2.f3060a) : 0, i8 >= 28 ? AbstractC0266d.c(e2.f3060a) : 0);
    }

    public boolean t(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !q(i2, false).equals(C0225c.f2800e);
    }

    public void v(C0225c c0225c) {
        this.f3036g = c0225c;
    }
}
