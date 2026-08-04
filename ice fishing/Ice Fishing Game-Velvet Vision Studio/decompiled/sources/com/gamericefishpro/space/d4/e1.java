package com.gamericefishpro.space.d4;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class e1 extends l1 {
    public static boolean i = false;
    public static Method j;
    public static Class k;
    public static Field l;
    public static Field m;
    public final WindowInsets c;
    public com.gamericefishpro.space.u3.b[] d;
    public com.gamericefishpro.space.u3.b e;
    public o1 f;
    public com.gamericefishpro.space.u3.b g;
    public int h;

    public e1(o1 o1Var, WindowInsets windowInsets) {
        super(o1Var);
        this.e = null;
        this.c = windowInsets;
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

    private com.gamericefishpro.space.u3.b w(int i2, boolean z) {
        com.gamericefishpro.space.u3.b bVarA = com.gamericefishpro.space.u3.b.e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                bVarA = com.gamericefishpro.space.u3.b.a(bVarA, x(i3, z));
            }
        }
        return bVarA;
    }

    private com.gamericefishpro.space.u3.b y() {
        o1 o1Var = this.f;
        return o1Var != null ? o1Var.a.j() : com.gamericefishpro.space.u3.b.e;
    }

    private com.gamericefishpro.space.u3.b z(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!i) {
            B();
        }
        Method method = j;
        if (method != null && k != null && l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) l.get(m.get(objInvoke));
                if (rect != null) {
                    return com.gamericefishpro.space.u3.b.b(rect.left, rect.top, rect.right, rect.bottom);
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
        return !x(i2, false).equals(com.gamericefishpro.space.u3.b.e);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void d(View view) {
        com.gamericefishpro.space.u3.b bVarZ = z(view);
        if (bVarZ == null) {
            bVarZ = com.gamericefishpro.space.u3.b.e;
        }
        s(bVarZ);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void e(o1 o1Var) {
        o1Var.a.t(this.f);
        com.gamericefishpro.space.u3.b bVar = this.g;
        l1 l1Var = o1Var.a;
        l1Var.s(bVar);
        l1Var.v(this.h);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Objects.equals(this.g, e1Var.g) && C(this.h, e1Var.h);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b g(int i2) {
        return w(i2, false);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public com.gamericefishpro.space.u3.b h(int i2) {
        return w(i2, true);
    }

    @Override // com.gamericefishpro.space.d4.l1
    public final com.gamericefishpro.space.u3.b l() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = com.gamericefishpro.space.u3.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public o1 n(int i2, int i3, int i4, int i5) {
        d1 z0Var;
        o1 o1VarD = o1.d(null, this.c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            z0Var = new c1(o1VarD);
        } else if (i6 >= 31) {
            z0Var = new b1(o1VarD);
        } else if (i6 >= 30) {
            z0Var = new a1(o1VarD);
        } else {
            z0Var = i6 >= 29 ? new z0(o1VarD) : new y0(o1VarD);
        }
        z0Var.g(o1.b(l(), i2, i3, i4, i5));
        z0Var.e(o1.b(j(), i2, i3, i4, i5));
        return z0Var.b();
    }

    @Override // com.gamericefishpro.space.d4.l1
    public boolean p() {
        return this.c.isRound();
    }

    @Override // com.gamericefishpro.space.d4.l1
    public boolean q(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !A(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void r(com.gamericefishpro.space.u3.b[] bVarArr) {
        this.d = bVarArr;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void s(com.gamericefishpro.space.u3.b bVar) {
        this.g = bVar;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void t(o1 o1Var) {
        this.f = o1Var;
    }

    @Override // com.gamericefishpro.space.d4.l1
    public void v(int i2) {
        this.h = i2;
    }

    public com.gamericefishpro.space.u3.b x(int i2, boolean z) {
        com.gamericefishpro.space.u3.b bVarJ;
        int i3;
        com.gamericefishpro.space.u3.b bVar = com.gamericefishpro.space.u3.b.e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    com.gamericefishpro.space.u3.b[] bVarArr = this.d;
                    bVarJ = bVarArr != null ? bVarArr[com.gamericefishpro.space.a.a.s(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    com.gamericefishpro.space.u3.b bVarL = l();
                    com.gamericefishpro.space.u3.b bVarY = y();
                    int i4 = bVarL.d;
                    if (i4 > bVarY.d) {
                        return com.gamericefishpro.space.u3.b.b(0, 0, 0, i4);
                    }
                    com.gamericefishpro.space.u3.b bVar2 = this.g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i3 = this.g.d) > bVarY.d) {
                        return com.gamericefishpro.space.u3.b.b(0, 0, 0, i3);
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
                        o1 o1Var = this.f;
                        k kVarF = o1Var != null ? o1Var.a.f() : f();
                        if (kVarF != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return com.gamericefishpro.space.u3.b.b(i5 >= 28 ? h.i(kVarF.a) : 0, i5 >= 28 ? h.k(kVarF.a) : 0, i5 >= 28 ? h.j(kVarF.a) : 0, i5 >= 28 ? h.h(kVarF.a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    com.gamericefishpro.space.u3.b bVarY2 = y();
                    com.gamericefishpro.space.u3.b bVarJ2 = j();
                    return com.gamericefishpro.space.u3.b.b(Math.max(bVarY2.a, bVarJ2.a), 0, Math.max(bVarY2.c, bVarJ2.c), Math.max(bVarY2.d, bVarJ2.d));
                }
                if ((this.h & 2) == 0) {
                    com.gamericefishpro.space.u3.b bVarL2 = l();
                    o1 o1Var2 = this.f;
                    bVarJ = o1Var2 != null ? o1Var2.a.j() : null;
                    int iMin = bVarL2.d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.d);
                    }
                    return com.gamericefishpro.space.u3.b.b(bVarL2.a, 0, bVarL2.c, iMin);
                }
            }
        } else {
            if (z) {
                return com.gamericefishpro.space.u3.b.b(0, Math.max(y().b, l().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return com.gamericefishpro.space.u3.b.b(0, l().b, 0, 0);
            }
        }
        return bVar;
    }

    public e1(o1 o1Var, e1 e1Var) {
        this(o1Var, new WindowInsets(e1Var.c));
    }
}
