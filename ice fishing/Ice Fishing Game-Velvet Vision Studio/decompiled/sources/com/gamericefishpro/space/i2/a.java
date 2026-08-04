package com.gamericefishpro.space.i2;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.gamericefishpro.space.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {
    public boolean A;
    public WeakReference d;
    public IBinder e;
    public p2 i;
    public com.gamericefishpro.space.t0.u v;
    public w1 w;
    public boolean y;
    public boolean z;

    public a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        x1 x1Var = new x1(0, this);
        addOnAttachStateChangeListener(x1Var);
        com.gamericefishpro.space.bb.s listener = new com.gamericefishpro.space.bb.s(12);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.i4.a aVarD = com.gamericefishpro.space.wa.b.D(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVarD.a.add(listener);
        this.w = new w1(this, x1Var, listener);
    }

    private final void setParentContext(com.gamericefishpro.space.t0.u uVar) {
        if (this.v != uVar) {
            this.v = uVar;
            if (uVar != null) {
                this.d = null;
            }
            p2 p2Var = this.i;
            if (p2Var != null) {
                p2Var.a();
                this.i = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.e != iBinder) {
            this.e = iBinder;
            this.d = null;
        }
    }

    public abstract void a(com.gamericefishpro.space.t0.r rVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (this.z) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.i == null) {
            try {
                this.z = true;
                this.i = r2.a(this, f(), new com.gamericefishpro.space.b1.h(-656146368, new com.gamericefishpro.space.g3.e(3, this), true));
            } finally {
                this.z = false;
            }
        }
    }

    public void d(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void e(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final com.gamericefishpro.space.t0.u f() {
        com.gamericefishpro.space.t0.u1 u1Var;
        CoroutineContext coroutineContext;
        com.gamericefishpro.space.t0.h1 h1Var;
        int i;
        Object objB;
        com.gamericefishpro.space.t0.u uVarB = this.v;
        if (uVarB == null) {
            uVarB = m2.b(this);
            if (uVarB == null) {
                ViewParent parent = getParent();
                while (true) {
                    if (uVarB != null || !(objB instanceof View)) {
                        objB = parent;
                        break;
                    }
                    objB = parent;
                    View view = (View) objB;
                    uVarB = m2.b(view);
                    objB = com.gamericefishpro.space.hj.c.B(view);
                }
            }
            boolean z = false;
            if (uVarB != null) {
                com.gamericefishpro.space.t0.u uVar = (!(uVarB instanceof com.gamericefishpro.space.t0.u1) || ((com.gamericefishpro.space.t0.r1) ((com.gamericefishpro.space.t0.u1) uVarB).u.getValue()).compareTo(com.gamericefishpro.space.t0.r1.e) > 0) ? uVarB : null;
                if (uVar != null) {
                    this.d = new WeakReference(uVar);
                }
            } else {
                uVarB = null;
            }
            if (uVarB == null) {
                WeakReference weakReference = this.d;
                if (weakReference == null || (uVarB = (com.gamericefishpro.space.t0.u) weakReference.get()) == null || ((uVarB instanceof com.gamericefishpro.space.t0.u1) && ((com.gamericefishpro.space.t0.r1) ((com.gamericefishpro.space.t0.u1) uVarB).u.getValue()).compareTo(com.gamericefishpro.space.t0.r1.e) <= 0)) {
                    uVarB = null;
                }
                if (uVarB == null) {
                    if (!isAttachedToWindow()) {
                        com.gamericefishpro.space.e2.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    View view2 = this;
                    Object parent2 = getParent();
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    com.gamericefishpro.space.t0.u uVarB2 = m2.b(view2);
                    if (uVarB2 == null) {
                        ((d2) e2.a.get()).getClass();
                        CoroutineContext coroutineContext2 = kotlin.coroutines.g.d;
                        coroutineContext2.j(kotlin.coroutines.d.x);
                        com.gamericefishpro.space.oh.s sVar = l0.F;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            coroutineContext = (CoroutineContext) l0.F.getValue();
                        } else {
                            coroutineContext = (CoroutineContext) l0.G.get();
                            if (coroutineContext == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        CoroutineContext coroutineContextO = coroutineContext.o(coroutineContext2);
                        com.gamericefishpro.space.t0.s0 s0Var = (com.gamericefishpro.space.t0.s0) coroutineContextO.j(com.gamericefishpro.space.t0.f.i);
                        if (s0Var != null) {
                            h1Var = new com.gamericefishpro.space.t0.h1(s0Var);
                            com.gamericefishpro.space.h0.z0 z0Var = h1Var.e;
                            synchronized (z0Var.b) {
                                z0Var.a = false;
                                Unit unit = Unit.a;
                            }
                        } else {
                            h1Var = null;
                        }
                        com.gamericefishpro.space.ei.a0 a0Var = new com.gamericefishpro.space.ei.a0();
                        CoroutineContext p1Var = (com.gamericefishpro.space.h1.n) coroutineContextO.j(com.gamericefishpro.space.h1.b.I);
                        if (p1Var == null) {
                            p1Var = new p1();
                            a0Var.d = p1Var;
                        }
                        if (h1Var != null) {
                            coroutineContext2 = h1Var;
                        }
                        CoroutineContext coroutineContextO2 = coroutineContextO.o(coroutineContext2).o(p1Var);
                        u1Var = new com.gamericefishpro.space.t0.u1(coroutineContextO2);
                        synchronized (u1Var.c) {
                            i = 1;
                            u1Var.t = true;
                            Unit unit2 = Unit.a;
                        }
                        com.gamericefishpro.space.ui.c cVarB = com.gamericefishpro.space.pi.a0.b(coroutineContextO2);
                        com.gamericefishpro.space.z4.u uVarE = com.gamericefishpro.space.z4.m0.e(view2);
                        com.gamericefishpro.space.z4.w wVarG = uVarE != null ? uVarE.g() : null;
                        if (wVarG == null) {
                            com.gamericefishpro.space.e2.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new com.gamericefishpro.space.oh.e();
                        }
                        view2.addOnAttachStateChangeListener(new f2(view2, u1Var));
                        wVarG.a(new j2(cVarB, h1Var, u1Var, a0Var, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, u1Var);
                        com.gamericefishpro.space.pi.x0 x0Var = com.gamericefishpro.space.pi.x0.d;
                        Handler handler = view2.getHandler();
                        int i2 = com.gamericefishpro.space.qi.e.a;
                        view2.addOnAttachStateChangeListener(new x1(i, com.gamericefishpro.space.pi.a0.u(x0Var, new com.gamericefishpro.space.qi.d(handler, "windowRecomposer cleanup", false).y, new com.gamericefishpro.space.b0.o(u1Var, view2, z ? 1 : 0, 9), 2)));
                    } else {
                        if (!(uVarB2 instanceof com.gamericefishpro.space.t0.u1)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        u1Var = (com.gamericefishpro.space.t0.u1) uVarB2;
                    }
                    com.gamericefishpro.space.t0.u1 u1Var2 = ((com.gamericefishpro.space.t0.r1) u1Var.u.getValue()).compareTo(com.gamericefishpro.space.t0.r1.e) > 0 ? u1Var : null;
                    if (u1Var2 != null) {
                        this.d = new WeakReference(u1Var2);
                    }
                    return u1Var;
                }
            }
        }
        return uVarB;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        t0 t0Var = tag instanceof t0 ? (t0) tag : null;
        if (t0Var != null) {
            return t0Var.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.i != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.y;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.A || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c();
        e(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new t0(i));
    }

    public final void setParentCompositionContext(com.gamericefishpro.space.t0.u uVar) {
        setParentContext(uVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.y = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((t) ((com.gamericefishpro.space.h2.o1) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A = true;
    }

    public final void setViewCompositionStrategy(y1 y1Var) {
        w1 w1Var = this.w;
        if (w1Var != null) {
            w1Var.invoke();
        }
        ((f0) y1Var).getClass();
        x1 x1Var = new x1(0, this);
        addOnAttachStateChangeListener(x1Var);
        com.gamericefishpro.space.bb.s listener = new com.gamericefishpro.space.bb.s(12);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        com.gamericefishpro.space.i4.a aVarD = com.gamericefishpro.space.wa.b.D(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        aVarD.a.add(listener);
        this.w = new w1(this, x1Var, listener);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        b();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
