package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class bqv extends hqv {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public zne[] d;
    public zne e;
    public kqv f;
    public zne g;
    public int h;

    public bqv(kqv kqvVar, bqv bqvVar) {
        this(kqvVar, new WindowInsets(bqvVar.c));
    }

    private static void B() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            k = cls;
            l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        i = true;
    }

    public static boolean C(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private zne w(int i2, boolean z) {
        zne zneVar = zne.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                zneVar = zne.a(zneVar, x(i3, z));
            }
        }
        return zneVar;
    }

    private zne y() {
        kqv kqvVar = this.f;
        return kqvVar != null ? kqvVar.a.j() : zne.e;
    }

    private zne z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            qq6.d("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!i) {
            B();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(invoke));
                if (rect != null) {
                    return zne.c(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    public boolean A(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !x(i2, false).equals(zne.e);
    }

    @Override // defpackage.hqv
    public void d(View view) {
        zne z = z(view);
        if (z == null) {
            z = zne.e;
        }
        s(z);
    }

    @Override // defpackage.hqv
    public void e(kqv kqvVar) {
        kqvVar.a.t(this.f);
        zne zneVar = this.g;
        hqv hqvVar = kqvVar.a;
        hqvVar.s(zneVar);
        hqvVar.v(this.h);
    }

    @Override // defpackage.hqv
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        bqv bqvVar = (bqv) obj;
        return Objects.equals(this.g, bqvVar.g) && C(this.h, bqvVar.h);
    }

    @Override // defpackage.hqv
    public zne g(int i2) {
        return w(i2, false);
    }

    @Override // defpackage.hqv
    public zne h(int i2) {
        return w(i2, true);
    }

    @Override // defpackage.hqv
    public final zne l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = zne.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.hqv
    public kqv n(int i2, int i3, int i4, int i5) {
        kqv h = kqv.h(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        aqv zpvVar = i6 >= 34 ? new zpv(h) : i6 >= 30 ? new ypv(h) : i6 >= 29 ? new xpv(h) : new wpv(h);
        zpvVar.g(kqv.e(l(), i2, i3, i4, i5));
        zpvVar.e(kqv.e(j(), i2, i3, i4, i5));
        return zpvVar.b();
    }

    @Override // defpackage.hqv
    public boolean p() {
        return this.c.isRound();
    }

    @Override // defpackage.hqv
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !A(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.hqv
    public void r(zne[] zneVarArr) {
        this.d = zneVarArr;
    }

    @Override // defpackage.hqv
    public void s(zne zneVar) {
        this.g = zneVar;
    }

    @Override // defpackage.hqv
    public void t(kqv kqvVar) {
        this.f = kqvVar;
    }

    @Override // defpackage.hqv
    public void v(int i2) {
        this.h = i2;
    }

    public zne x(int i2, boolean z) {
        zne j2;
        int i3;
        zne zneVar = zne.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    zne[] zneVarArr = this.d;
                    j2 = zneVarArr != null ? zneVarArr[v5g.F(8)] : null;
                    if (j2 != null) {
                        return j2;
                    }
                    zne l2 = l();
                    zne y = y();
                    int i4 = l2.d;
                    if (i4 > y.d) {
                        return zne.c(0, 0, 0, i4);
                    }
                    zne zneVar2 = this.g;
                    if (zneVar2 != null && !zneVar2.equals(zneVar) && (i3 = this.g.d) > y.d) {
                        return zne.c(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return k();
                    }
                    if (i2 == 32) {
                        return i();
                    }
                    if (i2 == 64) {
                        return m();
                    }
                    if (i2 == 128) {
                        kqv kqvVar = this.f;
                        ea8 f = kqvVar != null ? kqvVar.a.f() : f();
                        if (f != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return zne.c(i5 >= 28 ? jo0.t(f.a) : 0, i5 >= 28 ? jo0.v(f.a) : 0, i5 >= 28 ? jo0.u(f.a) : 0, i5 >= 28 ? jo0.s(f.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    zne y2 = y();
                    zne j3 = j();
                    return zne.c(Math.max(y2.a, j3.a), 0, Math.max(y2.c, j3.c), Math.max(y2.d, j3.d));
                }
                if ((this.h & 2) == 0) {
                    zne l3 = l();
                    kqv kqvVar2 = this.f;
                    j2 = kqvVar2 != null ? kqvVar2.a.j() : null;
                    int i6 = l3.d;
                    if (j2 != null) {
                        i6 = Math.min(i6, j2.d);
                    }
                    return zne.c(l3.a, 0, l3.c, i6);
                }
            }
        } else {
            if (z) {
                return zne.c(0, Math.max(y().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return zne.c(0, l().b, 0, 0);
            }
        }
        return zneVar;
    }

    public bqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar);
        this.e = null;
        this.c = windowInsets;
    }
}
