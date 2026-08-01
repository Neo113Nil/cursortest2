package androidx.fragment.app;

import D1.h;
import D1.i;
import O.AbstractC0049z;
import O.K;
import O.j0;
import Y.a;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import Z.C0074w;
import Z.F;
import Z.M;
import Z.T;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.lumenpath.harispro.hrnavigator.R;
import h.AbstractActivityC0168i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1979a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1980b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1981c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1982d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f1979a = new ArrayList();
        this.f1980b = new ArrayList();
        this.f1982d = true;
    }

    public final void a(View view) {
        if (this.f1980b.contains(view)) {
            this.f1979a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        i.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0070s ? (AbstractComponentCallbacksC0070s) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        j0 j0Var;
        i.e(windowInsets, "insets");
        j0 g2 = j0.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1981c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            i.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j0Var = j0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = K.f747a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = AbstractC0049z.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = j0.g(this, b2);
                }
            }
            j0Var = g2;
        }
        if (!j0Var.f819a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = K.f747a;
                WindowInsets f3 = j0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = AbstractC0049z.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        j0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        if (this.f1982d) {
            Iterator it = this.f1979a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        i.e(canvas, "canvas");
        i.e(view, "child");
        if (this.f1982d) {
            ArrayList arrayList = this.f1979a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        i.e(view, "view");
        this.f1980b.remove(view);
        if (this.f1979a.remove(view)) {
            this.f1982d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0070s> F getFragment() {
        AbstractActivityC0168i abstractActivityC0168i;
        AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s;
        M m2;
        View view = this;
        while (true) {
            abstractActivityC0168i = null;
            if (view == null) {
                abstractComponentCallbacksC0070s = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0070s = tag instanceof AbstractComponentCallbacksC0070s ? (AbstractComponentCallbacksC0070s) tag : null;
            if (abstractComponentCallbacksC0070s != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0070s == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0168i) {
                    abstractActivityC0168i = (AbstractActivityC0168i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0168i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            m2 = ((C0074w) abstractActivityC0168i.f3211r.f10b).f1631d;
        } else {
            if (!abstractComponentCallbacksC0070s.n()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0070s + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            m2 = abstractComponentCallbacksC0070s.g();
        }
        return (F) m2.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        i.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                i.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        i.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        i.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        i.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            i.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1982d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        i.e(onApplyWindowInsetsListener, "listener");
        this.f1981c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        i.e(view, "view");
        if (view.getParent() == this) {
            this.f1980b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        i.e(context, "context");
        this.f1979a = new ArrayList();
        this.f1980b = new ArrayList();
        this.f1982d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1397b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, M m2) {
        super(context, attributeSet);
        View view;
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        i.e(m2, "fm");
        this.f1979a = new ArrayList();
        this.f1980b = new ArrayList();
        this.f1982d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1397b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0070s A2 = m2.A(id);
        if (classAttribute != null && A2 == null) {
            if (id == -1) {
                throw new IllegalStateException(h.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            F D2 = m2.D();
            context.getClassLoader();
            AbstractComponentCallbacksC0070s a2 = D2.a(classAttribute);
            i.d(a2, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a2.f1618w = id;
            a2.f1619x = id;
            a2.f1620y = string;
            a2.f1614s = m2;
            a2.f1615t = m2.f1452u;
            a2.y(context, attributeSet, null);
            C0053a c0053a = new C0053a(m2);
            c0053a.f1523p = true;
            a2.f1583E = this;
            c0053a.e(getId(), a2, string, 1);
            if (!c0053a.f1516g) {
                c0053a.f1517h = false;
                M m3 = c0053a.f1524q;
                if (m3.f1452u != null && !m3.f1429H) {
                    m3.w(true);
                    c0053a.a(m3.J, m3.f1431K);
                    m3.f1436b = true;
                    try {
                        m3.R(m3.J, m3.f1431K);
                        m3.d();
                        m3.c0();
                        if (m3.f1430I) {
                            m3.f1430I = false;
                            m3.a0();
                        }
                        ((HashMap) m3.f1437c.f28a).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        m3.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = m2.f1437c.h().iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = t2.f1485c;
            if (abstractComponentCallbacksC0070s.f1619x == getId() && (view = abstractComponentCallbacksC0070s.f1584F) != null && view.getParent() == null) {
                abstractComponentCallbacksC0070s.f1583E = this;
                t2.b();
            }
        }
    }
}
