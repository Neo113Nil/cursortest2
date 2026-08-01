package com.google.android.material.sidesheet;

import B.c;
import B0.f;
import D1.h;
import F.m;
import M0.b;
import O.B;
import O.K;
import P.o;
import R.j;
import S0.g;
import S0.k;
import T0.a;
import T0.d;
import U.e;
import a.AbstractC0078a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import b.C0106b;
import b0.C0117a;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lumenpath.harispro.hrnavigator.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.AbstractC0358a;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends c implements b {

    /* renamed from: a, reason: collision with root package name */
    public j f2564a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2565b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f2566c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2567d;
    public final B0.k e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2568f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2569g;

    /* renamed from: h, reason: collision with root package name */
    public int f2570h;
    public e i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final float f2571k;

    /* renamed from: l, reason: collision with root package name */
    public int f2572l;

    /* renamed from: m, reason: collision with root package name */
    public int f2573m;

    /* renamed from: n, reason: collision with root package name */
    public int f2574n;

    /* renamed from: o, reason: collision with root package name */
    public int f2575o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f2576p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f2577q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2578r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f2579s;

    /* renamed from: t, reason: collision with root package name */
    public M0.k f2580t;

    /* renamed from: u, reason: collision with root package name */
    public int f2581u;

    /* renamed from: v, reason: collision with root package name */
    public final LinkedHashSet f2582v;

    /* renamed from: w, reason: collision with root package name */
    public final f f2583w;

    public SideSheetBehavior() {
        this.e = new B0.k(this);
        this.f2569g = true;
        this.f2570h = 5;
        this.f2571k = 0.1f;
        this.f2578r = -1;
        this.f2582v = new LinkedHashSet();
        this.f2583w = new f(1, this);
    }

    @Override // M0.b
    public final void a() {
        int i;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        M0.k kVar = this.f2580t;
        if (kVar == null) {
            return;
        }
        C0106b c0106b = kVar.f609f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        kVar.f609f = null;
        int i2 = 5;
        if (c0106b == null || Build.VERSION.SDK_INT < 34) {
            v(5);
            return;
        }
        j jVar = this.f2564a;
        if (jVar != null && jVar.H() != 0) {
            i2 = 3;
        }
        B0.c cVar = new B0.c(3, this);
        WeakReference weakReference = this.f2577q;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            final int u2 = this.f2564a.u(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: T0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SideSheetBehavior.this.f2564a.s0(marginLayoutParams, AbstractC0360a.c(u2, 0, valueAnimator.getAnimatedFraction()));
                    view.requestLayout();
                }
            };
        }
        boolean z2 = c0106b.f2267d == 0;
        WeakHashMap weakHashMap = K.f747a;
        View view2 = kVar.f606b;
        boolean z3 = (Gravity.getAbsoluteGravity(i2, view2.getLayoutDirection()) & 3) == 3;
        float scaleX = view2.getScaleX() * view2.getWidth();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            i = z3 ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin;
        } else {
            i = 0;
        }
        float f2 = scaleX + i;
        Property property = View.TRANSLATION_X;
        if (z3) {
            f2 = -f2;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, f2);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new C0117a(1));
        ofFloat.setDuration(AbstractC0360a.c(kVar.f607c, kVar.f608d, c0106b.f2266c));
        ofFloat.addListener(new M0.j(kVar, z2, i2));
        ofFloat.addListener(cVar);
        ofFloat.start();
    }

    @Override // M0.b
    public final void b(C0106b c0106b) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        M0.k kVar = this.f2580t;
        if (kVar == null) {
            return;
        }
        j jVar = this.f2564a;
        int i = 5;
        if (jVar != null && jVar.H() != 0) {
            i = 3;
        }
        if (kVar.f609f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0106b c0106b2 = kVar.f609f;
        kVar.f609f = c0106b;
        if (c0106b2 != null) {
            kVar.a(c0106b.f2266c, c0106b.f2267d == 0, i);
        }
        WeakReference weakReference = this.f2576p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f2576p.get();
        WeakReference weakReference2 = this.f2577q;
        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
        if (view2 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) == null) {
            return;
        }
        this.f2564a.s0(marginLayoutParams, (int) ((view.getScaleX() * this.f2572l) + this.f2575o));
        view2.requestLayout();
    }

    @Override // M0.b
    public final void c(C0106b c0106b) {
        M0.k kVar = this.f2580t;
        if (kVar == null) {
            return;
        }
        kVar.f609f = c0106b;
    }

    @Override // M0.b
    public final void d() {
        M0.k kVar = this.f2580t;
        if (kVar == null) {
            return;
        }
        if (kVar.f609f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0106b c0106b = kVar.f609f;
        kVar.f609f = null;
        if (c0106b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = kVar.f606b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(kVar.e);
        animatorSet.start();
    }

    @Override // B.c
    public final void g(B.f fVar) {
        this.f2576p = null;
        this.i = null;
        this.f2580t = null;
    }

    @Override // B.c
    public final void i() {
        this.f2576p = null;
        this.i = null;
        this.f2580t = null;
    }

    @Override // B.c
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && K.d(view) == null) || !this.f2569g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f2579s) != null) {
            velocityTracker.recycle();
            this.f2579s = null;
        }
        if (this.f2579s == null) {
            this.f2579s = VelocityTracker.obtain();
        }
        this.f2579s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f2581u = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (eVar = this.i) == null || !eVar.t(motionEvent)) ? false : true;
    }

    @Override // B.c
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View findViewById;
        int i3 = 0;
        int i4 = 1;
        g gVar = this.f2565b;
        WeakHashMap weakHashMap = K.f747a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f2576p == null) {
            this.f2576p = new WeakReference(view);
            this.f2580t = new M0.k(view);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f2568f;
                if (f2 == -1.0f) {
                    f2 = B.e(view);
                }
                gVar.l(f2);
            } else {
                ColorStateList colorStateList = this.f2566c;
                if (colorStateList != null) {
                    B.i(view, colorStateList);
                }
            }
            int i5 = this.f2570h == 5 ? 4 : 0;
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            z();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (K.d(view) == null) {
                K.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i6 = Gravity.getAbsoluteGravity(((B.f) view.getLayoutParams()).f14c, i) == 3 ? 1 : 0;
        j jVar = this.f2564a;
        if (jVar == null || jVar.H() != i6) {
            k kVar = this.f2567d;
            B.f fVar = null;
            if (i6 == 0) {
                this.f2564a = new a(this, i4);
                if (kVar != null) {
                    WeakReference weakReference = this.f2576p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof B.f)) {
                        fVar = (B.f) view3.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).rightMargin <= 0) {
                        S0.j e = kVar.e();
                        e.f1100f = new S0.a(RecyclerView.f2111C0);
                        e.f1101g = new S0.a(RecyclerView.f2111C0);
                        k a2 = e.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a2);
                        }
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalArgumentException("Invalid sheet edge position value: " + i6 + ". Must be 0 or 1.");
                }
                this.f2564a = new a(this, i3);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f2576p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof B.f)) {
                        fVar = (B.f) view2.getLayoutParams();
                    }
                    if (fVar == null || ((ViewGroup.MarginLayoutParams) fVar).leftMargin <= 0) {
                        S0.j e2 = kVar.e();
                        e2.e = new S0.a(RecyclerView.f2111C0);
                        e2.f1102h = new S0.a(RecyclerView.f2111C0);
                        k a3 = e2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a3);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2583w);
        }
        int F2 = this.f2564a.F(view);
        coordinatorLayout.q(view, i);
        this.f2573m = coordinatorLayout.getWidth();
        this.f2574n = this.f2564a.G(coordinatorLayout);
        this.f2572l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f2575o = marginLayoutParams != null ? this.f2564a.i(marginLayoutParams) : 0;
        int i7 = this.f2570h;
        if (i7 == 1 || i7 == 2) {
            i3 = F2 - this.f2564a.F(view);
        } else if (i7 != 3) {
            if (i7 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f2570h);
            }
            i3 = this.f2564a.A();
        }
        view.offsetLeftAndRight(i3);
        if (this.f2577q == null && (i2 = this.f2578r) != -1 && (findViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.f2577q = new WeakReference(findViewById);
        }
        Iterator it = this.f2582v.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // B.c
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.c
    public final void q(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f1156c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f2570h = i;
    }

    @Override // B.c
    public final Parcelable r(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // B.c
    public final boolean u(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2570h == 1 && actionMasked == 0) {
            return true;
        }
        if (x()) {
            this.i.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f2579s) != null) {
            velocityTracker.recycle();
            this.f2579s = null;
        }
        if (this.f2579s == null) {
            this.f2579s = VelocityTracker.obtain();
        }
        this.f2579s.addMovement(motionEvent);
        if (x() && actionMasked == 2 && !this.j && x()) {
            float abs = Math.abs(this.f2581u - motionEvent.getX());
            e eVar = this.i;
            if (abs > eVar.f1175b) {
                eVar.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void v(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(h.h(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f2576p;
        if (weakReference == null || weakReference.get() == null) {
            w(i);
            return;
        }
        View view = (View) this.f2576p.get();
        m mVar = new m(i, 1, this);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = K.f747a;
            if (view.isAttachedToWindow()) {
                view.post(mVar);
                return;
            }
        }
        mVar.run();
    }

    public final void w(int i) {
        View view;
        if (this.f2570h == i) {
            return;
        }
        this.f2570h = i;
        WeakReference weakReference = this.f2576p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.f2570h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.f2582v.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        z();
    }

    public final boolean x() {
        return this.i != null && (this.f2569g || this.f2570h == 1);
    }

    public final void y(View view, int i, boolean z2) {
        int y2;
        if (i == 3) {
            y2 = this.f2564a.y();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(h.e("Invalid state to get outer edge offset: ", i));
            }
            y2 = this.f2564a.A();
        }
        e eVar = this.i;
        if (eVar == null || (!z2 ? eVar.u(view, y2, view.getTop()) : eVar.s(y2, view.getTop()))) {
            w(i);
        } else {
            w(2);
            this.e.a(i);
        }
    }

    public final void z() {
        View view;
        WeakReference weakReference = this.f2576p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        K.i(view, 262144);
        K.g(view, 0);
        K.i(view, 1048576);
        K.g(view, 0);
        final int i = 5;
        if (this.f2570h != 5) {
            K.j(view, P.d.j, new o() { // from class: T0.b
                @Override // P.o
                public final boolean a(View view2) {
                    SideSheetBehavior.this.v(i);
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.f2570h != 3) {
            K.j(view, P.d.f884h, new o() { // from class: T0.b
                @Override // P.o
                public final boolean a(View view2) {
                    SideSheetBehavior.this.v(i2);
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new B0.k(this);
        this.f2569g = true;
        this.f2570h = 5;
        this.f2571k = 0.1f;
        this.f2578r = -1;
        this.f2582v = new LinkedHashSet();
        this.f2583w = new f(1, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0358a.f4433D);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2566c = AbstractC0078a.B(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f2567d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f2578r = resourceId;
            WeakReference weakReference = this.f2577q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f2577q = null;
            WeakReference weakReference2 = this.f2576p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = K.f747a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f2567d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f2565b = gVar;
            gVar.j(context);
            ColorStateList colorStateList = this.f2566c;
            if (colorStateList != null) {
                this.f2565b.m(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f2565b.setTint(typedValue.data);
            }
        }
        this.f2568f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f2569g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
