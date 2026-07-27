package w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p.C0224c;

/* loaded from: classes.dex */
public abstract class J extends P {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f3022h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f3023i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f3024j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f3025k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f3026l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f3027c;

    /* renamed from: d, reason: collision with root package name */
    public C0224c[] f3028d;

    /* renamed from: e, reason: collision with root package name */
    public C0224c f3029e;

    /* renamed from: f, reason: collision with root package name */
    public S f3030f;

    /* renamed from: g, reason: collision with root package name */
    public C0224c f3031g;

    public J(S s2, WindowInsets windowInsets) {
        super(s2);
        this.f3029e = null;
        this.f3027c = windowInsets;
    }

    private C0224c r() {
        S s2 = this.f3030f;
        return s2 != null ? s2.f3039a.g() : C0224c.f2792e;
    }

    private C0224c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f3022h) {
            u();
        }
        Method method = f3023i;
        if (method != null && f3024j != null && f3025k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f3025k.get(f3026l.get(invoke));
                if (rect != null) {
                    return C0224c.a(rect.left, rect.top, rect.right, rect.bottom);
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
            f3023i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3024j = cls;
            f3025k = cls.getDeclaredField("mVisibleInsets");
            f3026l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3025k.setAccessible(true);
            f3026l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f3022h = true;
    }

    @Override // w.P
    public void d(View view) {
        C0224c s2 = s(view);
        if (s2 == null) {
            s2 = C0224c.f2792e;
        }
        v(s2);
    }

    @Override // w.P
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f3031g, ((J) obj).f3031g);
        }
        return false;
    }

    @Override // w.P
    public final C0224c i() {
        if (this.f3029e == null) {
            WindowInsets windowInsets = this.f3027c;
            this.f3029e = C0224c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3029e;
    }

    @Override // w.P
    public boolean l() {
        return this.f3027c.isRound();
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
    public void n(C0224c[] c0224cArr) {
        this.f3028d = c0224cArr;
    }

    @Override // w.P
    public void o(S s2) {
        this.f3030f = s2;
    }

    public C0224c q(int i2, boolean z2) {
        C0224c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? C0224c.a(0, Math.max(r().f2794b, i().f2794b), 0, 0) : C0224c.a(0, i().f2794b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                C0224c r = r();
                C0224c g3 = g();
                return C0224c.a(Math.max(r.f2793a, g3.f2793a), 0, Math.max(r.f2795c, g3.f2795c), Math.max(r.f2796d, g3.f2796d));
            }
            C0224c i4 = i();
            S s2 = this.f3030f;
            g2 = s2 != null ? s2.f3039a.g() : null;
            int i5 = i4.f2796d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f2796d);
            }
            return C0224c.a(i4.f2793a, 0, i4.f2795c, i5);
        }
        C0224c c0224c = C0224c.f2792e;
        if (i2 == 8) {
            C0224c[] c0224cArr = this.f3028d;
            g2 = c0224cArr != null ? c0224cArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            C0224c i6 = i();
            C0224c r2 = r();
            int i7 = i6.f2796d;
            if (i7 > r2.f2796d) {
                return C0224c.a(0, 0, 0, i7);
            }
            C0224c c0224c2 = this.f3031g;
            return (c0224c2 == null || c0224c2.equals(c0224c) || (i3 = this.f3031g.f2796d) <= r2.f2796d) ? c0224c : C0224c.a(0, 0, 0, i3);
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
            return c0224c;
        }
        S s3 = this.f3030f;
        C0273e e2 = s3 != null ? s3.f3039a.e() : e();
        if (e2 == null) {
            return c0224c;
        }
        int i8 = Build.VERSION.SDK_INT;
        return C0224c.a(i8 >= 28 ? AbstractC0272d.d(e2.f3055a) : 0, i8 >= 28 ? AbstractC0272d.f(e2.f3055a) : 0, i8 >= 28 ? AbstractC0272d.e(e2.f3055a) : 0, i8 >= 28 ? AbstractC0272d.c(e2.f3055a) : 0);
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
        return !q(i2, false).equals(C0224c.f2792e);
    }

    public void v(C0224c c0224c) {
        this.f3031g = c0224c;
    }
}
