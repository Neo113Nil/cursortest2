package androidx.fragment.app;

import O.A0;
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
import com.IceFishing.LiveIceFishing.C5248R;
import e0.AbstractC4471a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f4794n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4795u;

    /* renamed from: v, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4796v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4797w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        kotlin.jvm.internal.h.e(context, "context");
        this.f4794n = new ArrayList();
        this.f4795u = new ArrayList();
        this.f4797w = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4471a.f37211b, 0, 0);
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

    public final void a(View view) {
        if (this.f4795u.contains(view)) {
            this.f4794n.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.h.e(child, "child");
        Object tag = child.getTag(C5248R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0479s ? (AbstractComponentCallbacksC0479s) tag : null) != null) {
            super.addView(child, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        A0 j6;
        kotlin.jvm.internal.h.e(insets, "insets");
        A0 h3 = A0.h(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4796v;
        if (onApplyWindowInsetsListener != null) {
            kotlin.jvm.internal.h.b(onApplyWindowInsetsListener);
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j6 = A0.h(null, onApplyWindowInsets);
        } else {
            j6 = O.X.j(this, h3);
        }
        kotlin.jvm.internal.h.d(j6, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!j6.f2115a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                O.X.b(getChildAt(i), j6);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.h.e(canvas, "canvas");
        if (this.f4797w) {
            Iterator it = this.f4794n.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j6) {
        kotlin.jvm.internal.h.e(canvas, "canvas");
        kotlin.jvm.internal.h.e(child, "child");
        if (this.f4797w) {
            ArrayList arrayList = this.f4794n;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j6);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        this.f4795u.remove(view);
        if (this.f4794n.remove(view)) {
            this.f4797w = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0479s> F getFragment() {
        AbstractActivityC0484x abstractActivityC0484x;
        AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s;
        N supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0484x = null;
            if (view == null) {
                abstractComponentCallbacksC0479s = null;
                break;
            }
            Object tag = view.getTag(C5248R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0479s = tag instanceof AbstractComponentCallbacksC0479s ? (AbstractComponentCallbacksC0479s) tag : null;
            if (abstractComponentCallbacksC0479s != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0479s == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0484x) {
                    abstractActivityC0484x = (AbstractActivityC0484x) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0484x == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0484x.getSupportFragmentManager();
        } else {
            if (!abstractComponentCallbacksC0479s.i()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0479s + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = abstractComponentCallbacksC0479s.c();
        }
        return (F) supportFragmentManager.z(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.h.e(insets, "insets");
        return insets;
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
                View view = getChildAt(childCount);
                kotlin.jvm.internal.h.d(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View view = getChildAt(i);
        kotlin.jvm.internal.h.d(view, "view");
        a(view);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i6 = i + i4;
        for (int i9 = i; i9 < i6; i9++) {
            View view = getChildAt(i9);
            kotlin.jvm.internal.h.d(view, "view");
            a(view);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i6 = i + i4;
        for (int i9 = i; i9 < i6; i9++) {
            View view = getChildAt(i9);
            kotlin.jvm.internal.h.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f4797w = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.f4796v = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        if (view.getParent() == this) {
            this.f4795u.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, N fm) {
        super(context, attrs);
        View view;
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(attrs, "attrs");
        kotlin.jvm.internal.h.e(fm, "fm");
        this.f4794n = new ArrayList();
        this.f4795u = new ArrayList();
        this.f4797w = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC4471a.f37211b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0479s z6 = fm.z(id);
        if (classAttribute != null && z6 == null) {
            if (id == -1) {
                throw new IllegalStateException(D.x.l("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            G B3 = fm.B();
            context.getClassLoader();
            AbstractComponentCallbacksC0479s a9 = B3.a(classAttribute);
            kotlin.jvm.internal.h.d(a9, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a9.f5016V = true;
            C0483w c0483w = a9.f5006L;
            if ((c0483w == null ? null : c0483w.f5046z) != null) {
                a9.f5016V = true;
            }
            C0462a c0462a = new C0462a(fm);
            c0462a.f4910o = true;
            a9.f5017W = this;
            c0462a.e(getId(), a9, string, 1);
            if (!c0462a.f4903g) {
                N n9 = c0462a.f4911p;
                if (n9.f4836t != null && !n9.f4812G) {
                    n9.w(true);
                    c0462a.a(n9.f4814I, n9.J);
                    n9.f4819b = true;
                    try {
                        n9.P(n9.f4814I, n9.J);
                        n9.d();
                        n9.a0();
                        if (n9.f4813H) {
                            n9.f4813H = false;
                            n9.Y();
                        }
                        ((HashMap) n9.f4820c.f38946u).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th) {
                        n9.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm.f4820c.d().iterator();
        while (it.hasNext()) {
            V v9 = (V) it.next();
            AbstractComponentCallbacksC0479s abstractComponentCallbacksC0479s = v9.f4875c;
            if (abstractComponentCallbacksC0479s.f5010P == getId() && (view = abstractComponentCallbacksC0479s.f5018X) != null && view.getParent() == null) {
                abstractComponentCallbacksC0479s.f5017W = this;
                v9.b();
            }
        }
    }
}
