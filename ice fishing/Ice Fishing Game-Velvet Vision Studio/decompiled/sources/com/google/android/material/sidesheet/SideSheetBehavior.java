package com.google.android.material.sidesheet;

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
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.d4.d0;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.e4.q;
import com.gamericefishpro.space.i2.i1;
import com.gamericefishpro.space.k4.e;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.m;
import com.gamericefishpro.space.ka.n;
import com.gamericefishpro.space.la.d;
import com.gamericefishpro.space.p3.a;
import com.gamericefishpro.space.p3.c;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.wa.b;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends a {
    public b a;
    public final j b;
    public final ColorStateList c;
    public final n d;
    public final i1 e;
    public final float f;
    public final boolean g;
    public int h;
    public e i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public final int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final d v;

    public SideSheetBehavior() {
        this.e = new i1(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new d(this, 0);
    }

    @Override // com.gamericefishpro.space.p3.a
    public final void c(c cVar) {
        this.p = null;
        this.i = null;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final void e() {
        this.p = null;
        this.i = null;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        e eVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && l0.d(view) == null) || !this.g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (eVar = this.i) == null || !eVar.p(motionEvent)) ? false : true;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.p;
        j jVar = this.b;
        int iB = 0;
        if (weakReference == null) {
            this.p = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            com.gamericefishpro.space.a.a.B(context, R.attr.motionDurationMedium2, 300);
            com.gamericefishpro.space.a.a.B(context, R.attr.motionDurationShort3, 150);
            com.gamericefishpro.space.a.a.B(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (jVar != null) {
                view.setBackground(jVar);
                float elevation = this.f;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                jVar.m(elevation);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    Field field = l0.a;
                    d0.g(view, colorStateList);
                }
            }
            int i4 = this.h == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (l0.d(view) == null) {
                l0.m(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((c) view.getLayoutParams()).c, i) == 3 ? 1 : 0;
        b bVar = this.a;
        if (bVar == null || bVar.E() != i5) {
            c cVar = null;
            n nVar = this.d;
            if (i5 == 0) {
                this.a = new com.gamericefishpro.space.la.a(this, i3);
                if (nVar != null) {
                    WeakReference weakReference2 = this.p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof c)) {
                        cVar = (c) view3.getLayoutParams();
                    }
                    if (cVar == null || ((ViewGroup.MarginLayoutParams) cVar).rightMargin <= 0) {
                        m mVarF = nVar.f();
                        mVarF.f = new com.gamericefishpro.space.ka.a(0.0f);
                        mVarF.g = new com.gamericefishpro.space.ka.a(0.0f);
                        n nVarA = mVarF.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(nVarA);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(y0.f(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.a = new com.gamericefishpro.space.la.a(this, iB);
                if (nVar != null) {
                    WeakReference weakReference3 = this.p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof c)) {
                        cVar = (c) view2.getLayoutParams();
                    }
                    if (cVar == null || ((ViewGroup.MarginLayoutParams) cVar).leftMargin <= 0) {
                        m mVarF2 = nVar.f();
                        mVarF2.e = new com.gamericefishpro.space.ka.a(0.0f);
                        mVarF2.h = new com.gamericefishpro.space.ka.a(0.0f);
                        n nVarA2 = mVarF2.a();
                        if (jVar != null) {
                            jVar.setShapeAppearanceModel(nVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new e(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int iB2 = this.a.B(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.a.C(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.o = marginLayoutParams != null ? this.a.h(marginLayoutParams) : 0;
        int i6 = this.h;
        if (i6 == 1 || i6 == 2) {
            iB = iB2 - this.a.B(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.h);
            }
            iB = this.a.x();
        }
        Field field2 = l0.a;
        view.offsetLeftAndRight(iB);
        if (this.q == null && (i2 = this.r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final void m(View view, Parcelable parcelable) {
        int i = ((com.gamericefishpro.space.la.e) parcelable).i;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // com.gamericefishpro.space.p3.a
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new com.gamericefishpro.space.la.e(this);
    }

    @Override // com.gamericefishpro.space.p3.a
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float fAbs = Math.abs(this.t - motionEvent.getX());
            e eVar = this.i;
            if (fAbs > eVar.b) {
                eVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final void r(int i) {
        View view;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.h == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        u();
    }

    public final boolean s() {
        if (this.i != null) {
            return this.g || this.h == 1;
        }
        return false;
    }

    public final void t(View view, int i, boolean z) {
        int iW;
        if (i == 3) {
            iW = this.a.w();
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Invalid state to get outer edge offset: "));
            }
            iW = this.a.x();
        }
        e eVar = this.i;
        if (eVar == null || (!z ? eVar.q(view, iW, view.getTop()) : eVar.o(iW, view.getTop()))) {
            r(i);
        } else {
            r(2);
            this.e.a(i);
        }
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        l0.i(view, 262144);
        l0.g(view, 0);
        l0.i(view, 1048576);
        l0.g(view, 0);
        final int i = 5;
        if (this.h != 5) {
            l0.j(view, com.gamericefishpro.space.e4.d.l, new q() { // from class: com.gamericefishpro.space.la.b
                @Override // com.gamericefishpro.space.e4.q
                public final boolean c(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(y0.j(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.d;
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.p.get();
                    c cVar = new c(i2, 0, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.h != 3) {
            l0.j(view, com.gamericefishpro.space.e4.d.j, new q() { // from class: com.gamericefishpro.space.la.b
                @Override // com.gamericefishpro.space.e4.q
                public final boolean c(View view2) {
                    int i3 = i2;
                    if (i3 == 1 || i3 == 2) {
                        throw new IllegalArgumentException(y0.j(new StringBuilder("STATE_"), i3 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.d;
                    WeakReference weakReference2 = sideSheetBehavior.p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i3);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.p.get();
                    c cVar = new c(i3, 0, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cVar);
                        return true;
                    }
                    cVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.e = new i1(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new d(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.gamericefishpro.space.s9.a.t);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c = com.gamericefishpro.space.hj.c.v(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.d = n.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        n nVar = this.d;
        if (nVar != null) {
            j jVar = new j(nVar);
            this.b = jVar;
            jVar.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
