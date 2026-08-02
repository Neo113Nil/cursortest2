package h;

import O.A0;
import O.InterfaceC0350u;
import O.X;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.f1;
import m.g1;

/* loaded from: classes.dex */
public final class r implements InterfaceC0350u, l.x {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4537A f37940n;

    public /* synthetic */ r(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A) {
        this.f37940n = layoutInflaterFactory2C4537A;
    }

    @Override // l.x
    public void b(l.m mVar, boolean z6) {
        z zVar;
        l.m k9 = mVar.k();
        int i = 0;
        boolean z9 = k9 != mVar;
        if (z9) {
            mVar = k9;
        }
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37940n;
        z[] zVarArr = layoutInflaterFactory2C4537A.m0;
        int length = zVarArr != null ? zVarArr.length : 0;
        while (true) {
            if (i < length) {
                zVar = zVarArr[i];
                if (zVar != null && zVar.f37960h == mVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                zVar = null;
                break;
            }
        }
        if (zVar != null) {
            if (!z9) {
                layoutInflaterFactory2C4537A.t(zVar, z6);
            } else {
                layoutInflaterFactory2C4537A.r(zVar.f37953a, zVar, k9);
                layoutInflaterFactory2C4537A.t(zVar, true);
            }
        }
    }

    @Override // l.x
    public boolean e(l.m mVar) {
        Window.Callback callback;
        if (mVar != mVar.k()) {
            return true;
        }
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37940n;
        if (!layoutInflaterFactory2C4537A.Y || (callback = layoutInflaterFactory2C4537A.f37788E.getCallback()) == null || layoutInflaterFactory2C4537A.f37820r0) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // O.InterfaceC0350u
    public A0 p(View view, A0 a02) {
        boolean z6;
        boolean z9;
        int d9 = a02.d();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = this.f37940n;
        layoutInflaterFactory2C4537A.getClass();
        int d10 = a02.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C4537A.f37801O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z6 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C4537A.f37801O.getLayoutParams();
            if (layoutInflaterFactory2C4537A.f37801O.isShown()) {
                if (layoutInflaterFactory2C4537A.f37787D0 == null) {
                    layoutInflaterFactory2C4537A.f37787D0 = new Rect();
                    layoutInflaterFactory2C4537A.f37789E0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C4537A.f37787D0;
                Rect rect2 = layoutInflaterFactory2C4537A.f37789E0;
                rect.set(a02.b(), a02.d(), a02.c(), a02.a());
                ViewGroup viewGroup = layoutInflaterFactory2C4537A.f37806T;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z10 = g1.f39217a;
                    f1.a(viewGroup, rect, rect2);
                } else {
                    if (!g1.f39217a) {
                        g1.f39217a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g1.f39218b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g1.f39218b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g1.f39218b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e9) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                        }
                    }
                }
                int i = rect.top;
                int i4 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C4537A.f37806T;
                WeakHashMap weakHashMap = X.f2142a;
                A0 a9 = O.M.a(viewGroup2);
                int b9 = a9 == null ? 0 : a9.b();
                int c9 = a9 == null ? 0 : a9.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i6) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i6;
                    z9 = true;
                }
                Context context = layoutInflaterFactory2C4537A.f37786D;
                if (i <= 0 || layoutInflaterFactory2C4537A.f37808V != null) {
                    View view2 = layoutInflaterFactory2C4537A.f37808V;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i9 = marginLayoutParams2.height;
                        int i10 = marginLayoutParams.topMargin;
                        if (i9 != i10 || marginLayoutParams2.leftMargin != b9 || marginLayoutParams2.rightMargin != c9) {
                            marginLayoutParams2.height = i10;
                            marginLayoutParams2.leftMargin = b9;
                            marginLayoutParams2.rightMargin = c9;
                            layoutInflaterFactory2C4537A.f37808V.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C4537A.f37808V = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b9;
                    layoutParams.rightMargin = c9;
                    layoutInflaterFactory2C4537A.f37806T.addView(layoutInflaterFactory2C4537A.f37808V, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C4537A.f37808V;
                r8 = view4 != null;
                if (r8 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C4537A.f37808V;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? E.b.a(context, C5248R.color.abc_decor_view_status_guard_light) : E.b.a(context, C5248R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C4537A.f37812i0 && r8) {
                    d10 = 0;
                }
                z6 = r8;
                r8 = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z6 = false;
            } else {
                z6 = false;
                r8 = false;
            }
            if (r8) {
                layoutInflaterFactory2C4537A.f37801O.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C4537A.f37808V;
        if (view6 != null) {
            view6.setVisibility(z6 ? 0 : 8);
        }
        return X.j(view, d9 != d10 ? a02.f(a02.b(), d10, a02.c(), a02.a()) : a02);
    }
}
