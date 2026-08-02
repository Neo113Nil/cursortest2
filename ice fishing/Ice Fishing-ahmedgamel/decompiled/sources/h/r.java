package h;

import O.A0;
import O.InterfaceC0345u;
import O.M;
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
import com.icefishingapp.icefishing.C5275R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.e1;
import m.f1;

/* loaded from: classes.dex */
public final class r implements InterfaceC0345u, l.x {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4533A f37914n;

    public /* synthetic */ r(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A) {
        this.f37914n = layoutInflaterFactory2C4533A;
    }

    @Override // l.x
    public void b(l.m mVar, boolean z3) {
        z zVar;
        l.m k9 = mVar.k();
        int i = 0;
        boolean z6 = k9 != mVar;
        if (z6) {
            mVar = k9;
        }
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37914n;
        z[] zVarArr = layoutInflaterFactory2C4533A.f37795r0;
        int length = zVarArr != null ? zVarArr.length : 0;
        while (true) {
            if (i < length) {
                zVar = zVarArr[i];
                if (zVar != null && zVar.f37934h == mVar) {
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
            if (!z6) {
                layoutInflaterFactory2C4533A.t(zVar, z3);
            } else {
                layoutInflaterFactory2C4533A.r(zVar.f37927a, zVar, k9);
                layoutInflaterFactory2C4533A.t(zVar, true);
            }
        }
    }

    @Override // l.x
    public boolean j(l.m mVar) {
        Window.Callback callback;
        if (mVar != mVar.k()) {
            return true;
        }
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37914n;
        if (!layoutInflaterFactory2C4533A.Y || (callback = layoutInflaterFactory2C4533A.f37762E.getCallback()) == null || layoutInflaterFactory2C4533A.f37800w0) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        boolean z3;
        boolean z6;
        int d2 = a02.d();
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = this.f37914n;
        layoutInflaterFactory2C4533A.getClass();
        int d9 = a02.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C4533A.f37780O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z3 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C4533A.f37780O.getLayoutParams();
            if (layoutInflaterFactory2C4533A.f37780O.isShown()) {
                if (layoutInflaterFactory2C4533A.f37771I0 == null) {
                    layoutInflaterFactory2C4533A.f37771I0 = new Rect();
                    layoutInflaterFactory2C4533A.f37772J0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C4533A.f37771I0;
                Rect rect2 = layoutInflaterFactory2C4533A.f37772J0;
                rect.set(a02.b(), a02.d(), a02.c(), a02.a());
                ViewGroup viewGroup = layoutInflaterFactory2C4533A.f37785T;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z9 = f1.f39146a;
                    e1.a(viewGroup, rect, rect2);
                } else {
                    if (!f1.f39146a) {
                        f1.f39146a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            f1.f39147b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                f1.f39147b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = f1.f39147b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e9) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                        }
                    }
                }
                int i = rect.top;
                int i6 = rect.left;
                int i9 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C4533A.f37785T;
                WeakHashMap weakHashMap = X.f2054a;
                A0 a9 = M.a(viewGroup2);
                int b9 = a9 == null ? 0 : a9.b();
                int c9 = a9 == null ? 0 : a9.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i9) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i9;
                    z6 = true;
                }
                Context context = layoutInflaterFactory2C4533A.f37760D;
                if (i <= 0 || layoutInflaterFactory2C4533A.f37787V != null) {
                    View view2 = layoutInflaterFactory2C4533A.f37787V;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != b9 || marginLayoutParams2.rightMargin != c9) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = b9;
                            marginLayoutParams2.rightMargin = c9;
                            layoutInflaterFactory2C4533A.f37787V.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C4533A.f37787V = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b9;
                    layoutParams.rightMargin = c9;
                    layoutInflaterFactory2C4533A.f37785T.addView(layoutInflaterFactory2C4533A.f37787V, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C4533A.f37787V;
                r8 = view4 != null;
                if (r8 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C4533A.f37787V;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? E.b.a(context, C5275R.color.abc_decor_view_status_guard_light) : E.b.a(context, C5275R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C4533A.f37791n0 && r8) {
                    d9 = 0;
                }
                z3 = r8;
                r8 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z3 = false;
            } else {
                z3 = false;
                r8 = false;
            }
            if (r8) {
                layoutInflaterFactory2C4533A.f37780O.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C4533A.f37787V;
        if (view6 != null) {
            view6.setVisibility(z3 ? 0 : 8);
        }
        return X.j(view, d2 != d9 ? a02.f(a02.b(), d9, a02.c(), a02.a()) : a02);
    }
}
