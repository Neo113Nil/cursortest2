package y;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class J extends O {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f8549h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f8550i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f8551j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f8552k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f8553l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f8554c;

    /* renamed from: d, reason: collision with root package name */
    public r.c[] f8555d;

    /* renamed from: e, reason: collision with root package name */
    public r.c f8556e;

    /* renamed from: f, reason: collision with root package name */
    public Q f8557f;

    /* renamed from: g, reason: collision with root package name */
    public r.c f8558g;

    public J(Q q2, WindowInsets windowInsets) {
        super(q2);
        this.f8556e = null;
        this.f8554c = windowInsets;
    }

    private r.c r() {
        Q q2 = this.f8557f;
        return q2 != null ? q2.f8566a.g() : r.c.f8447e;
    }

    private r.c s(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f8549h) {
            u();
        }
        Method method = f8550i;
        if (method != null && f8551j != null && f8552k != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f8552k.get(f8553l.get(invoke));
                if (rect != null) {
                    return r.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void u() {
        try {
            f8550i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f8551j = cls;
            f8552k = cls.getDeclaredField("mVisibleInsets");
            f8553l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f8552k.setAccessible(true);
            f8553l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f8549h = true;
    }

    @Override // y.O
    public void d(View view) {
        r.c s2 = s(view);
        if (s2 == null) {
            s2 = r.c.f8447e;
        }
        v(s2);
    }

    @Override // y.O
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f8558g, ((J) obj).f8558g);
        }
        return false;
    }

    @Override // y.O
    public final r.c i() {
        if (this.f8556e == null) {
            WindowInsets windowInsets = this.f8554c;
            this.f8556e = r.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f8556e;
    }

    @Override // y.O
    public boolean l() {
        return this.f8554c.isRound();
    }

    @Override // y.O
    @SuppressLint({"WrongConstant"})
    public boolean m(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0 && !t(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // y.O
    public void n(r.c[] cVarArr) {
        this.f8555d = cVarArr;
    }

    @Override // y.O
    public void o(Q q2) {
        this.f8557f = q2;
    }

    public r.c q(int i2, boolean z2) {
        r.c g2;
        int i3;
        if (i2 == 1) {
            return z2 ? r.c.a(0, Math.max(r().f8449b, i().f8449b), 0, 0) : r.c.a(0, i().f8449b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                r.c r2 = r();
                r.c g3 = g();
                return r.c.a(Math.max(r2.f8448a, g3.f8448a), 0, Math.max(r2.f8450c, g3.f8450c), Math.max(r2.f8451d, g3.f8451d));
            }
            r.c i4 = i();
            Q q2 = this.f8557f;
            g2 = q2 != null ? q2.f8566a.g() : null;
            int i5 = i4.f8451d;
            if (g2 != null) {
                i5 = Math.min(i5, g2.f8451d);
            }
            return r.c.a(i4.f8448a, 0, i4.f8450c, i5);
        }
        r.c cVar = r.c.f8447e;
        if (i2 == 8) {
            r.c[] cVarArr = this.f8555d;
            g2 = cVarArr != null ? cVarArr[3] : null;
            if (g2 != null) {
                return g2;
            }
            r.c i6 = i();
            r.c r3 = r();
            int i7 = i6.f8451d;
            if (i7 > r3.f8451d) {
                return r.c.a(0, 0, 0, i7);
            }
            r.c cVar2 = this.f8558g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f8558g.f8451d) <= r3.f8451d) ? cVar : r.c.a(0, 0, 0, i3);
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
            return cVar;
        }
        Q q3 = this.f8557f;
        C1072e e2 = q3 != null ? q3.f8566a.e() : e();
        if (e2 == null) {
            return cVar;
        }
        int i8 = Build.VERSION.SDK_INT;
        return r.c.a(i8 >= 28 ? AbstractC1071d.d(e2.f8582a) : 0, i8 >= 28 ? AbstractC1071d.f(e2.f8582a) : 0, i8 >= 28 ? AbstractC1071d.e(e2.f8582a) : 0, i8 >= 28 ? AbstractC1071d.c(e2.f8582a) : 0);
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
        return !q(i2, false).equals(r.c.f8447e);
    }

    public void v(r.c cVar) {
        this.f8558g = cVar;
    }
}
