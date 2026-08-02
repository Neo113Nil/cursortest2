package ru.yandex.taxi.design.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.Div2View;
import defpackage.cpl0;
import defpackage.dl40;
import defpackage.el40;
import defpackage.fl40;
import defpackage.g18;
import defpackage.h73;
import defpackage.jx81;
import defpackage.k751;
import defpackage.kdc;
import defpackage.kp50;
import defpackage.n751;
import defpackage.oo31;
import defpackage.op31;
import defpackage.qje;
import defpackage.rp31;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sls;
import defpackage.tje;
import defpackage.vng;
import defpackage.xq31;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.ui.DebounceClickListener;

/* loaded from: classes9.dex */
public abstract class c {
    public static final void A(View view, long j, Runnable runnable) {
        el40 sharedMultiClickHandler;
        if (j > 0) {
            sharedMultiClickHandler = new dl40(j);
        } else {
            Object context = view.getContext();
            sharedMultiClickHandler = context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0);
        }
        view.setOnClickListener(new DebounceClickListener(sharedMultiClickHandler, runnable));
    }

    public static final void B(View view, Runnable runnable) {
        if (runnable == null) {
            view.setOnClickListener(null);
        } else {
            Object context = view.getContext();
            view.setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), runnable));
        }
    }

    public static final void C(int i, View view) {
        D(view.getLayoutParams().width, i, view);
    }

    public static final void D(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i == layoutParams.width && i2 == layoutParams.height) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static final void E(int i, View view) {
        D(i, view.getLayoutParams().height, view);
    }

    public static final float F(float f, View view) {
        return tje.b0(view.getContext(), f);
    }

    public static final String G(int i, View view) {
        return view.getContext().getString(i);
    }

    public static final String H(View view, int i, Object... objArr) {
        Context context = view.getContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return context.getString(i, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final int a(int i, View view) {
        return view.getContext().getColor(i);
    }

    public static final int b(View view, kdc kdcVar) {
        return s8o.m(kdcVar, view.getContext());
    }

    public static final int c(int i, View view) {
        return qje.t(i, view.getContext());
    }

    public static final int d(int i, View view) {
        return tje.r(i, view.getContext());
    }

    public static final void e(View view, Runnable runnable) {
        OneShotPreDrawListener.add(view, new cpl0(2, runnable));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, xq31] */
    public static final g18 f(View view, final Runnable runnable) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        final boolean z = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.design.utils.ViewExtensionsKt$doOnPreDrawCancelable$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                runnable.run();
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new xq31(viewTreeObserver, onPreDrawListener, view);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        return (g18) ref$ObjectRef.element;
    }

    public static final int g(float f, View view) {
        return tje.v(view.getContext(), f);
    }

    public static final int h(int i, View view) {
        return tje.u(i, view.getContext());
    }

    public static final float i(float f, View view) {
        return tje.x(view.getContext(), f);
    }

    public static final float j(int i, View view) {
        return tje.w(i, view.getContext());
    }

    public static final Drawable k(int i, View view) {
        return vng.t(i, view.getContext());
    }

    public static final Drawable l(int i, View view) {
        return tje.y(i, view.getContext());
    }

    public static final ArrayList m(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(m((ViewGroup) childAt));
            }
            if (childAt.getClass().equals(Div2View.class)) {
                arrayList.add(childAt);
            }
        }
        if (viewGroup.getClass().equals(Div2View.class)) {
            arrayList.add(viewGroup);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RecyclerView n(View view) {
        RecyclerView recyclerView;
        if (view instanceof RecyclerView) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            if (ViewCompat$Api21Impl.j(view)) {
                return (RecyclerView) view;
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList i = scc.i(view);
            while (!i.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) kp50.L(i);
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        recyclerView = null;
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null && (childAt instanceof RecyclerView)) {
                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                        if (ViewCompat$Api21Impl.j(childAt)) {
                            recyclerView = (RecyclerView) childAt;
                            break;
                        }
                    }
                    if (childAt instanceof ViewGroup) {
                        i.add(childAt);
                    }
                    i2++;
                }
                if (recyclerView != null) {
                    return recyclerView;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View o(View view) {
        View view2;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (ViewCompat$Api21Impl.j(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ArrayList i = scc.i(view);
            while (!i.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) kp50.L(i);
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        view2 = null;
                        break;
                    }
                    view2 = viewGroup.getChildAt(i2);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = androidx.core.view.b.a;
                        if (ViewCompat$Api21Impl.j(view2)) {
                            break;
                        }
                    }
                    if (view2 instanceof ViewGroup) {
                        i.add(view2);
                    }
                    i2++;
                }
                if (view2 != null) {
                    return view2;
                }
            }
        }
        return null;
    }

    public static final Activity p(View view) {
        Context context = view.getContext();
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return p(view);
        }
        return null;
    }

    public static final View q(ViewGroup viewGroup, int i, boolean z) {
        return oo31.f(viewGroup, i, viewGroup, z);
    }

    public static final boolean r(View view) {
        Activity p;
        Window window;
        View decorView;
        int i;
        int systemBars;
        int i2;
        int systemBars2;
        if (view.getVisibility() == 0 && view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0 && (p = p(view)) != null && (window = p.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            n751 a = op31.a(view);
            if (a == null) {
                i = 0;
            } else {
                k751 k751Var = a.a;
                if (jx81.d()) {
                    systemBars = WindowInsets.Type.systemBars();
                    i = k751Var.h(systemBars).b;
                } else {
                    i = k751Var.j().b;
                }
            }
            n751 a2 = op31.a(view);
            if (a2 == null) {
                i2 = 0;
            } else {
                k751 k751Var2 = a2.a;
                if (jx81.d()) {
                    systemBars2 = WindowInsets.Type.systemBars();
                    i2 = k751Var2.h(systemBars2).d;
                } else {
                    i2 = k751Var2.j().d;
                }
            }
            int i3 = i2 + i;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i4 = iArr[0];
            int i5 = iArr[1] - i;
            if (i4 < decorView.getWidth() && view.getMeasuredWidth() + i4 > 0 && i5 < decorView.getHeight() - i3 && view.getMeasuredHeight() + i5 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final h73 s(ViewGroup viewGroup) {
        return new h73(2, new ViewExtensionsKt$nonGoneChildrenSequence$1(viewGroup, null));
    }

    public static final void t(View view, int i, Runnable runnable) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        B((View) rp31.d(view, i), runnable);
    }

    public static final String u(View view, int i, int i2, Object... objArr) {
        return tje.T(view.getContext(), i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String v(View view, int i, int i2, int i3, Object... objArr) {
        return tje.U(view.getContext(), i, i2, i3, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void w(View view, View view2) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        view2.setId(view.getId());
        int indexOfChild = viewGroup.indexOfChild(view);
        viewGroup.removeViewInLayout(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view2, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view2, indexOfChild);
        }
    }

    public static final int x(View view, kdc kdcVar) {
        return s8o.m(kdcVar, view.getContext());
    }

    public static final void y(View view, boolean z) {
        view.setImportantForAccessibility(z ? 1 : 2);
    }

    public static final void z(sls slsVar, View view) {
        if (slsVar == null) {
            view.setOnClickListener(null);
        } else {
            Object context = view.getContext();
            view.setOnClickListener(new DebounceClickListener(context instanceof fl40 ? ((fl40) context).sharedMultiClickHandler() : new dl40(0), slsVar));
        }
    }
}
