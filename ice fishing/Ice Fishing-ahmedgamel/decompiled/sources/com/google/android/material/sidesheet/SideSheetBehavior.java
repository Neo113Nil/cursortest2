package com.google.android.material.sidesheet;

import B.b;
import D.x;
import G3.j;
import G3.k;
import H3.c;
import H3.d;
import H3.e;
import N3.C;
import O.L;
import O.X;
import P.f;
import P.u;
import Q.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.h.o;
import com.bumptech.glide.g;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public g f36806a;

    /* renamed from: b, reason: collision with root package name */
    public final G3.g f36807b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f36808c;

    /* renamed from: d, reason: collision with root package name */
    public final k f36809d;

    /* renamed from: e, reason: collision with root package name */
    public final e f36810e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36812g;

    /* renamed from: h, reason: collision with root package name */
    public int f36813h;
    public W.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36814j;

    /* renamed from: k, reason: collision with root package name */
    public final float f36815k;

    /* renamed from: l, reason: collision with root package name */
    public int f36816l;

    /* renamed from: m, reason: collision with root package name */
    public int f36817m;

    /* renamed from: n, reason: collision with root package name */
    public int f36818n;

    /* renamed from: o, reason: collision with root package name */
    public int f36819o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f36820p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f36821q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36822r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f36823s;

    /* renamed from: t, reason: collision with root package name */
    public int f36824t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f36825u;

    /* renamed from: v, reason: collision with root package name */
    public final c f36826v;

    public SideSheetBehavior() {
        this.f36810e = new e(this);
        this.f36812g = true;
        this.f36813h = 5;
        this.f36815k = 0.1f;
        this.f36822r = -1;
        this.f36825u = new LinkedHashSet();
        this.f36826v = new c(this, 0);
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f36820p = null;
        this.i = null;
    }

    @Override // B.b
    public final void e() {
        this.f36820p = null;
        this.i = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        W.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && X.e(view) == null) || !this.f36812g) {
            this.f36814j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f36823s) != null) {
            velocityTracker.recycle();
            this.f36823s = null;
        }
        if (this.f36823s == null) {
            this.f36823s = VelocityTracker.obtain();
        }
        this.f36823s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f36824t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f36814j) {
            this.f36814j = false;
            return false;
        }
        return (this.f36814j || (eVar = this.i) == null || !eVar.r(motionEvent)) ? false : true;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i4;
        View findViewById;
        int i6 = 0;
        int i9 = 1;
        G3.g gVar = this.f36807b;
        WeakHashMap weakHashMap = X.f2142a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36820p == null) {
            this.f36820p = new WeakReference(view);
            Context context = view.getContext();
            C.S(context, C5248R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            C.R(context, C5248R.attr.motionDurationMedium2, 300);
            C.R(context, C5248R.attr.motionDurationShort3, 150);
            C.R(context, C5248R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5248R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C5248R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C5248R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f2 = this.f36811f;
                if (f2 == -1.0f) {
                    f2 = L.i(view);
                }
                gVar.i(f2);
            } else {
                ColorStateList colorStateList = this.f36808c;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            int i10 = this.f36813h == 5 ? 4 : 0;
            if (view.getVisibility() != i10) {
                view.setVisibility(i10);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (X.e(view) == null) {
                X.p(view, view.getResources().getString(C5248R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i11 = Gravity.getAbsoluteGravity(((B.e) view.getLayoutParams()).f231c, i) == 3 ? 1 : 0;
        g gVar2 = this.f36806a;
        if (gVar2 == null || gVar2.q() != i11) {
            k kVar = this.f36809d;
            B.e eVar = null;
            if (i11 == 0) {
                this.f36806a = new H3.a(this, i9);
                if (kVar != null) {
                    WeakReference weakReference = this.f36820p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j e9 = kVar.e();
                        e9.f1121f = new G3.a(0.0f);
                        e9.f1122g = new G3.a(0.0f);
                        k a9 = e9.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a9);
                        }
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalArgumentException(x.j(i11, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f36806a = new H3.a(this, i6);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f36820p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j e10 = kVar.e();
                        e10.f1120e = new G3.a(0.0f);
                        e10.f1123h = new G3.a(0.0f);
                        k a10 = e10.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a10);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new W.e(coordinatorLayout.getContext(), coordinatorLayout, this.f36826v);
        }
        int n9 = this.f36806a.n(view);
        coordinatorLayout.q(i, view);
        this.f36817m = coordinatorLayout.getWidth();
        this.f36818n = this.f36806a.p(coordinatorLayout);
        this.f36816l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f36819o = marginLayoutParams != null ? this.f36806a.e(marginLayoutParams) : 0;
        int i12 = this.f36813h;
        if (i12 == 1 || i12 == 2) {
            i6 = n9 - this.f36806a.n(view);
        } else if (i12 != 3) {
            if (i12 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f36813h);
            }
            i6 = this.f36806a.k();
        }
        view.offsetLeftAndRight(i6);
        if (this.f36821q == null && (i4 = this.f36822r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.f36821q = new WeakReference(findViewById);
        }
        Iterator it = this.f36825u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f1243v;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f36813h = i;
    }

    @Override // B.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new d(this);
    }

    @Override // B.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36813h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f36823s) != null) {
            velocityTracker.recycle();
            this.f36823s = null;
        }
        if (this.f36823s == null) {
            this.f36823s = VelocityTracker.obtain();
        }
        this.f36823s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f36814j && s()) {
            float abs = Math.abs(this.f36824t - motionEvent.getX());
            W.e eVar = this.i;
            if (abs > eVar.f3510b) {
                eVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f36814j;
    }

    public final void r(int i) {
        View view;
        if (this.f36813h == i) {
            return;
        }
        this.f36813h = i;
        WeakReference weakReference = this.f36820p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i4 = this.f36813h == 5 ? 4 : 0;
        if (view.getVisibility() != i4) {
            view.setVisibility(i4);
        }
        Iterator it = this.f36825u.iterator();
        if (it.hasNext()) {
            throw x.i(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f36812g || this.f36813h == 1;
        }
        return false;
    }

    public final void t(View view, int i, boolean z6) {
        int i4;
        if (i == 3) {
            i4 = this.f36806a.i();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(Wv.f(i, "Invalid state to get outer edge offset: "));
            }
            i4 = this.f36806a.k();
        }
        W.e eVar = this.i;
        if (eVar == null || (!z6 ? eVar.s(i4, view.getTop(), view) : eVar.q(i4, view.getTop()))) {
            r(i);
        } else {
            r(2);
            this.f36810e.a(i);
        }
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f36820p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f8528d, view);
        X.i(0, view);
        final int i = 5;
        if (this.f36813h != 5) {
            X.m(view, f.f2331l, new u() { // from class: H3.b
                @Override // P.u
                public final boolean f(View view2) {
                    int i4 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i6 = i;
                    if (i6 == 1 || i6 == 2) {
                        throw new IllegalArgumentException(Wv.i(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36820p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i6);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36820p.get();
                    F.o oVar = new F.o(sideSheetBehavior, i6, i4);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2142a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(oVar);
                            return true;
                        }
                    }
                    oVar.run();
                    return true;
                }
            });
        }
        final int i4 = 3;
        if (this.f36813h != 3) {
            X.m(view, f.f2329j, new u() { // from class: H3.b
                @Override // P.u
                public final boolean f(View view2) {
                    int i42 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i6 = i4;
                    if (i6 == 1 || i6 == 2) {
                        throw new IllegalArgumentException(Wv.i(new StringBuilder("STATE_"), i6 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36820p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i6);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36820p.get();
                    F.o oVar = new F.o(sideSheetBehavior, i6, i42);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2142a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(oVar);
                            return true;
                        }
                    }
                    oVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f36810e = new e(this);
        this.f36812g = true;
        this.f36813h = 5;
        this.f36815k = 0.1f;
        this.f36822r = -1;
        this.f36825u = new LinkedHashSet();
        this.f36826v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39439w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36808c = com.bumptech.glide.f.j(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f36809d = k.b(context, attributeSet, 0, C5248R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f36822r = resourceId;
            WeakReference weakReference = this.f36821q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f36821q = null;
            WeakReference weakReference2 = this.f36820p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = X.f2142a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f36809d;
        if (kVar != null) {
            G3.g gVar = new G3.g(kVar);
            this.f36807b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f36808c;
            if (colorStateList != null) {
                this.f36807b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f36807b.setTint(typedValue.data);
            }
        }
        this.f36811f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f36812g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
