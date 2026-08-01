package com.google.android.material.sidesheet;

import B.b;
import D.y;
import E3.g;
import E3.j;
import E3.k;
import F3.c;
import F3.d;
import F3.e;
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
import com.anythink.basead.exoplayer.h.o;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import com.icefishing.icefishingbigwin.C5275R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import u1.h;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* renamed from: a, reason: collision with root package name */
    public O3.b f36038a;

    /* renamed from: b, reason: collision with root package name */
    public final g f36039b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f36040c;

    /* renamed from: d, reason: collision with root package name */
    public final k f36041d;

    /* renamed from: e, reason: collision with root package name */
    public final e f36042e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36043f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36044g;

    /* renamed from: h, reason: collision with root package name */
    public int f36045h;
    public W.e i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f36046j;

    /* renamed from: k, reason: collision with root package name */
    public final float f36047k;

    /* renamed from: l, reason: collision with root package name */
    public int f36048l;

    /* renamed from: m, reason: collision with root package name */
    public int f36049m;

    /* renamed from: n, reason: collision with root package name */
    public int f36050n;

    /* renamed from: o, reason: collision with root package name */
    public int f36051o;

    /* renamed from: p, reason: collision with root package name */
    public WeakReference f36052p;

    /* renamed from: q, reason: collision with root package name */
    public WeakReference f36053q;

    /* renamed from: r, reason: collision with root package name */
    public final int f36054r;

    /* renamed from: s, reason: collision with root package name */
    public VelocityTracker f36055s;

    /* renamed from: t, reason: collision with root package name */
    public int f36056t;

    /* renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f36057u;

    /* renamed from: v, reason: collision with root package name */
    public final c f36058v;

    public SideSheetBehavior() {
        this.f36042e = new e(this);
        this.f36044g = true;
        this.f36045h = 5;
        this.f36047k = 0.1f;
        this.f36054r = -1;
        this.f36057u = new LinkedHashSet();
        this.f36058v = new c(this, 0);
    }

    @Override // B.b
    public final void c(B.e eVar) {
        this.f36052p = null;
        this.i = null;
    }

    @Override // B.b
    public final void e() {
        this.f36052p = null;
        this.i = null;
    }

    @Override // B.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        W.e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && X.e(view) == null) || !this.f36044g) {
            this.f36046j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f36055s) != null) {
            velocityTracker.recycle();
            this.f36055s = null;
        }
        if (this.f36055s == null) {
            this.f36055s = VelocityTracker.obtain();
        }
        this.f36055s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f36056t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f36046j) {
            this.f36046j = false;
            return false;
        }
        return (this.f36046j || (eVar = this.i) == null || !eVar.r(motionEvent)) ? false : true;
    }

    @Override // B.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i6;
        View findViewById;
        int i9 = 0;
        int i10 = 1;
        g gVar = this.f36039b;
        WeakHashMap weakHashMap = X.f2054a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f36052p == null) {
            this.f36052p = new WeakReference(view);
            Context context = view.getContext();
            t8.g.E(context, C5275R.attr.motionEasingStandardDecelerateInterpolator, a.b(0.0f, 0.0f, 0.0f, 1.0f));
            t8.g.D(context, C5275R.attr.motionDurationMedium2, 300);
            t8.g.D(context, C5275R.attr.motionDurationShort3, 150);
            t8.g.D(context, C5275R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(C5275R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(C5275R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(C5275R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float f3 = this.f36043f;
                if (f3 == -1.0f) {
                    f3 = L.i(view);
                }
                gVar.i(f3);
            } else {
                ColorStateList colorStateList = this.f36040c;
                if (colorStateList != null) {
                    L.q(view, colorStateList);
                }
            }
            int i11 = this.f36045h == 5 ? 4 : 0;
            if (view.getVisibility() != i11) {
                view.setVisibility(i11);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (X.e(view) == null) {
                X.p(view, view.getResources().getString(C5275R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i12 = Gravity.getAbsoluteGravity(((B.e) view.getLayoutParams()).f73c, i) == 3 ? 1 : 0;
        O3.b bVar = this.f36038a;
        if (bVar == null || bVar.v() != i12) {
            k kVar = this.f36041d;
            B.e eVar = null;
            if (i12 == 0) {
                this.f36038a = new F3.a(this, i10);
                if (kVar != null) {
                    WeakReference weakReference = this.f36052p;
                    if (weakReference != null && (view3 = (View) weakReference.get()) != null && (view3.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j e9 = kVar.e();
                        e9.f779f = new E3.a(0.0f);
                        e9.f780g = new E3.a(0.0f);
                        k a9 = e9.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a9);
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalArgumentException(y.k(i12, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f36038a = new F3.a(this, i9);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f36052p;
                    if (weakReference2 != null && (view2 = (View) weakReference2.get()) != null && (view2.getLayoutParams() instanceof B.e)) {
                        eVar = (B.e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j e10 = kVar.e();
                        e10.f778e = new E3.a(0.0f);
                        e10.f781h = new E3.a(0.0f);
                        k a10 = e10.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(a10);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new W.e(coordinatorLayout.getContext(), coordinatorLayout, this.f36058v);
        }
        int t6 = this.f36038a.t(view);
        coordinatorLayout.q(i, view);
        this.f36049m = coordinatorLayout.getWidth();
        this.f36050n = this.f36038a.u(coordinatorLayout);
        this.f36048l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f36051o = marginLayoutParams != null ? this.f36038a.f(marginLayoutParams) : 0;
        int i13 = this.f36045h;
        if (i13 == 1 || i13 == 2) {
            i9 = t6 - this.f36038a.t(view);
        } else if (i13 != 3) {
            if (i13 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f36045h);
            }
            i9 = this.f36038a.q();
        }
        view.offsetLeftAndRight(i9);
        if (this.f36053q == null && (i6 = this.f36054r) != -1 && (findViewById = coordinatorLayout.findViewById(i6)) != null) {
            this.f36053q = new WeakReference(findViewById);
        }
        Iterator it = this.f36057u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // B.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i6, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // B.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((d) parcelable).f958v;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f36045h = i;
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
        if (this.f36045h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f36055s) != null) {
            velocityTracker.recycle();
            this.f36055s = null;
        }
        if (this.f36055s == null) {
            this.f36055s = VelocityTracker.obtain();
        }
        this.f36055s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.f36046j && s()) {
            float abs = Math.abs(this.f36056t - motionEvent.getX());
            W.e eVar = this.i;
            if (abs > eVar.f3380b) {
                eVar.b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f36046j;
    }

    public final void r(int i) {
        View view;
        if (this.f36045h == i) {
            return;
        }
        this.f36045h = i;
        WeakReference weakReference = this.f36052p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i6 = this.f36045h == 5 ? 4 : 0;
        if (view.getVisibility() != i6) {
            view.setVisibility(i6);
        }
        Iterator it = this.f36057u.iterator();
        if (it.hasNext()) {
            throw y.j(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.f36044g || this.f36045h == 1;
        }
        return false;
    }

    public final void t(View view, int i, boolean z3) {
        int p9;
        if (i == 3) {
            p9 = this.f36038a.p();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC4404f.e(i, "Invalid state to get outer edge offset: "));
            }
            p9 = this.f36038a.q();
        }
        W.e eVar = this.i;
        if (eVar == null || (!z3 ? eVar.s(p9, view.getTop(), view) : eVar.q(p9, view.getTop()))) {
            r(i);
        } else {
            r(2);
            this.f36042e.a(i);
        }
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f36052p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        X.l(262144, view);
        X.i(0, view);
        X.l(o.f7742d, view);
        X.i(0, view);
        final int i = 5;
        if (this.f36045h != 5) {
            X.m(view, f.f2400l, new u() { // from class: F3.b
                @Override // P.u
                public final boolean a(View view2) {
                    int i6 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i9 = i;
                    if (i9 == 1 || i9 == 2) {
                        throw new IllegalArgumentException(h.g(new StringBuilder("STATE_"), i9 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36052p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i9);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36052p.get();
                    F.o oVar = new F.o(sideSheetBehavior, i9, i6);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2054a;
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
        final int i6 = 3;
        if (this.f36045h != 3) {
            X.m(view, f.f2398j, new u() { // from class: F3.b
                @Override // P.u
                public final boolean a(View view2) {
                    int i62 = 1;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i9 = i6;
                    if (i9 == 1 || i9 == 2) {
                        throw new IllegalArgumentException(h.g(new StringBuilder("STATE_"), i9 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    WeakReference weakReference2 = sideSheetBehavior.f36052p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i9);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f36052p.get();
                    F.o oVar = new F.o(sideSheetBehavior, i9, i62);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = X.f2054a;
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
        this.f36042e = new e(this);
        this.f36044g = true;
        this.f36045h = 5;
        this.f36047k = 0.1f;
        this.f36054r = -1;
        this.f36057u = new LinkedHashSet();
        this.f36058v = new c(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4632a.f38650w);
        if (obtainStyledAttributes.hasValue(3)) {
            this.f36040c = O3.b.m(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f36041d = k.b(context, attributeSet, 0, C5275R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f36054r = resourceId;
            WeakReference weakReference = this.f36053q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f36053q = null;
            WeakReference weakReference2 = this.f36052p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = X.f2054a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f36041d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f36039b = gVar;
            gVar.h(context);
            ColorStateList colorStateList = this.f36040c;
            if (colorStateList != null) {
                this.f36039b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f36039b.setTint(typedValue.data);
            }
        }
        this.f36043f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f36044g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
