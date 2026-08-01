package h;

import O.AbstractC0049z;
import O.InterfaceC0039o;
import O.Y;
import O.Z;
import O.a0;
import O.b0;
import O.j0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.MenuC0229m;
import m.InterfaceC0259i0;
import m.g1;
import m.h1;

/* loaded from: classes.dex */
public final class r implements InterfaceC0039o, InterfaceC0259i0, l.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0159B f3233b;

    public /* synthetic */ r(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, int i) {
        this.f3232a = i;
        this.f3233b = layoutInflaterFactory2C0159B;
    }

    @Override // l.x
    public void b(MenuC0229m menuC0229m, boolean z2) {
        C0158A c0158a;
        switch (this.f3232a) {
            case 2:
                this.f3233b.o(menuC0229m);
                break;
            default:
                MenuC0229m k2 = menuC0229m.k();
                int i = 0;
                boolean z3 = k2 != menuC0229m;
                if (z3) {
                    menuC0229m = k2;
                }
                LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.f3233b;
                C0158A[] c0158aArr = layoutInflaterFactory2C0159B.f3091L;
                int length = c0158aArr != null ? c0158aArr.length : 0;
                while (true) {
                    if (i >= length) {
                        c0158a = null;
                    } else {
                        c0158a = c0158aArr[i];
                        if (c0158a == null || c0158a.f3071h != menuC0229m) {
                            i++;
                        }
                    }
                }
                if (c0158a != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0159B.q(c0158a, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0159B.n(c0158a.f3065a, c0158a, k2);
                        layoutInflaterFactory2C0159B.q(c0158a, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // l.x
    public boolean j(MenuC0229m menuC0229m) {
        Window.Callback callback;
        switch (this.f3232a) {
            case 2:
                Window.Callback callback2 = this.f3233b.f3114l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, menuC0229m);
                    break;
                }
                break;
            default:
                if (menuC0229m == menuC0229m.k()) {
                    LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.f3233b;
                    if (layoutInflaterFactory2C0159B.f3086F && (callback = layoutInflaterFactory2C0159B.f3114l.getCallback()) != null && !layoutInflaterFactory2C0159B.f3096Q) {
                        callback.onMenuOpened(108, menuC0229m);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // O.InterfaceC0039o
    public j0 s(View view, j0 j0Var) {
        int i;
        boolean z2;
        j0 j0Var2;
        boolean z3;
        int d2 = j0Var.d();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = this.f3233b;
        layoutInflaterFactory2C0159B.getClass();
        int d3 = j0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0159B.f3124v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0159B.f3124v.getLayoutParams();
            if (layoutInflaterFactory2C0159B.f3124v.isShown()) {
                if (layoutInflaterFactory2C0159B.f3108c0 == null) {
                    layoutInflaterFactory2C0159B.f3108c0 = new Rect();
                    layoutInflaterFactory2C0159B.f3109d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0159B.f3108c0;
                Rect rect2 = layoutInflaterFactory2C0159B.f3109d0;
                rect.set(j0Var.b(), j0Var.d(), j0Var.c(), j0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0159B.f3081A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = h1.f3952a;
                    g1.a(viewGroup, rect, rect2);
                } else {
                    if (!h1.f3952a) {
                        h1.f3952a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            h1.f3953b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                h1.f3953b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = h1.f3953b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0159B.f3081A;
                WeakHashMap weakHashMap = O.K.f747a;
                j0 a2 = O.C.a(viewGroup2);
                int b2 = a2 == null ? 0 : a2.b();
                int c2 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z3 = true;
                }
                Context context = layoutInflaterFactory2C0159B.f3113k;
                if (i2 <= 0 || layoutInflaterFactory2C0159B.f3083C != null) {
                    View view2 = layoutInflaterFactory2C0159B.f3083C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            layoutInflaterFactory2C0159B.f3083C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0159B.f3083C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    layoutInflaterFactory2C0159B.f3081A.addView(layoutInflaterFactory2C0159B.f3083C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0159B.f3083C;
                r11 = view4 != null;
                if (r11 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0159B.f3083C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0159B.f3088H && r11) {
                    d3 = 0;
                }
                z2 = r11;
                r11 = z3;
                i = 0;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    r11 = false;
                }
            }
            if (r11) {
                layoutInflaterFactory2C0159B.f3124v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0159B.f3083C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i : 8);
        }
        if (d2 != d3) {
            int b3 = j0Var.b();
            int c3 = j0Var.c();
            int a3 = j0Var.a();
            int i7 = Build.VERSION.SDK_INT;
            b0 a0Var = i7 >= 30 ? new a0(j0Var) : i7 >= 29 ? new Z(j0Var) : new Y(j0Var);
            a0Var.g(G.c.b(b3, d3, c3, a3));
            j0Var2 = a0Var.b();
        } else {
            j0Var2 = j0Var;
        }
        WeakHashMap weakHashMap2 = O.K.f747a;
        WindowInsets f2 = j0Var2.f();
        if (f2 == null) {
            return j0Var2;
        }
        WindowInsets b4 = AbstractC0049z.b(view, f2);
        return !b4.equals(f2) ? j0.g(view, b4) : j0Var2;
    }
}
