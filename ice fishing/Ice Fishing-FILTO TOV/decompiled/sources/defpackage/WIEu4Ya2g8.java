package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.combinations.level.experts.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class WIEu4Ya2g8 extends ViewGroup {
    public fi1 AvO7iQsrTN;
    public boolean E7jCp8Ls;
    public IBinder EljAMC1QTz;
    public oe1 JFJ3QoxA;
    public WeakReference OOA6hdeuvCS;
    public boolean XnEVoBF0td1l;
    public ye encWxUiV2;
    public se mOu10nynGul;
    public boolean rQPn8YBR;

    public WIEu4Ya2g8(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        u0 u0Var = new u0(1, this);
        addOnAttachStateChangeListener(u0Var);
        o4 o4Var = new o4(29);
        o50.Y6hRI1cF8(this).GWasM1elztuh.add(o4Var);
        this.JFJ3QoxA = new oe1(this, u0Var, o4Var);
    }

    private final void setParentContext(ye yeVar) {
        if (this.encWxUiV2 != yeVar) {
            this.encWxUiV2 = yeVar;
            if (yeVar != null) {
                this.OOA6hdeuvCS = null;
            }
            fi1 fi1Var = this.AvO7iQsrTN;
            if (fi1Var != null) {
                fi1Var.xqGvceK5x();
                this.AvO7iQsrTN = null;
                if (isAttachedToWindow()) {
                    AvO7iQsrTN();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.EljAMC1QTz != iBinder) {
            this.EljAMC1QTz = iBinder;
            this.OOA6hdeuvCS = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AvO7iQsrTN() {
        if (this.AvO7iQsrTN == null) {
            boolean z = false;
            Object[] objArr = 0;
            try {
                this.E7jCp8Ls = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    se seVar = this.mOu10nynGul;
                    if (seVar == null) {
                        seVar = JFJ3QoxA();
                    }
                    this.AvO7iQsrTN = hi1.GWasM1elztuh(this, seVar, new jd(1003123809, true, new iwATDS1i01k(objArr == true ? 1 : 0, this)));
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } finally {
                this.E7jCp8Ls = false;
            }
        }
    }

    public final se E7jCp8Ls(View view, se seVar) {
        ye rQPn8YBR = rQPn8YBR();
        t90 WIEu4Ya2g8 = q70.WIEu4Ya2g8(view);
        ff1 WIEu4Ya2g82 = z50.WIEu4Ya2g8(view);
        yw0 WIEu4Ya2g83 = o50.WIEu4Ya2g8(view);
        ye yeVar = seVar.Yi7zF1RB1;
        yw0 yw0Var = seVar.xqGvceK5x;
        t90 t90Var = seVar.X1lG3V04pd;
        if (rQPn8YBR == yeVar && WIEu4Ya2g8 == t90Var && WIEu4Ya2g82 == seVar.OOA6hdeuvCS && WIEu4Ya2g83 == yw0Var) {
            return seVar;
        }
        if (rQPn8YBR.JFJ3QoxA() != seVar.Yi7zF1RB1.JFJ3QoxA()) {
            EljAMC1QTz();
        }
        if (WIEu4Ya2g8 == null) {
            WIEu4Ya2g8 = t90Var;
        }
        se seVar2 = new se(seVar, view, rQPn8YBR, WIEu4Ya2g8, WIEu4Ya2g83 == null ? yw0Var : WIEu4Ya2g83, WIEu4Ya2g82);
        view.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(seVar2));
        return seVar2;
    }

    public final void EljAMC1QTz() {
        View childAt = getChildAt(0);
        c cVar = childAt instanceof c ? (c) childAt : null;
        if (cVar != null && cVar.bfDgRvRIg) {
            cVar.getComposeViewContext().Yi7zF1RB1();
            cVar.bfDgRvRIg = false;
        }
        fi1 fi1Var = this.AvO7iQsrTN;
        if (fi1Var != null) {
            fi1Var.xqGvceK5x();
        }
        this.AvO7iQsrTN = null;
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final se JFJ3QoxA() {
        se composeViewContext;
        se lv06NcmrQ;
        ff1 ff1Var;
        if (getChildCount() != 0) {
            View childAt = getChildAt(0);
            c cVar = childAt instanceof c ? (c) childAt : null;
            if (cVar != null) {
                composeViewContext = cVar.getComposeViewContext();
                View jivtDDk9H = qj.jivtDDk9H(this);
                lv06NcmrQ = qj.lv06NcmrQ(jivtDDk9H);
                if (lv06NcmrQ == null) {
                    return E7jCp8Ls(jivtDDk9H, lv06NcmrQ);
                }
                ye rQPn8YBR = rQPn8YBR();
                t90 WIEu4Ya2g8 = q70.WIEu4Ya2g8(jivtDDk9H);
                if (WIEu4Ya2g8 == null) {
                    WIEu4Ya2g8 = composeViewContext != null ? composeViewContext.X1lG3V04pd : null;
                    if (WIEu4Ya2g8 == null) {
                        o4.jivtDDk9H("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                t90 t90Var = WIEu4Ya2g8;
                yw0 WIEu4Ya2g82 = o50.WIEu4Ya2g8(jivtDDk9H);
                if (WIEu4Ya2g82 == null) {
                    WIEu4Ya2g82 = composeViewContext != null ? composeViewContext.xqGvceK5x : null;
                    if (WIEu4Ya2g82 == null) {
                        o4.jivtDDk9H("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                yw0 yw0Var = WIEu4Ya2g82;
                ff1 WIEu4Ya2g83 = z50.WIEu4Ya2g8(jivtDDk9H);
                if (WIEu4Ya2g83 == null) {
                    ff1Var = composeViewContext != null ? composeViewContext.OOA6hdeuvCS : null;
                } else {
                    ff1Var = WIEu4Ya2g83;
                }
                se seVar = new se(qj.lv06NcmrQ(qj.jivtDDk9H(jivtDDk9H)), jivtDDk9H, rQPn8YBR, t90Var, yw0Var, ff1Var);
                jivtDDk9H.setTag(R.id.androidx_compose_ui_view_compose_view_context, new WeakReference(seVar));
                return seVar;
            }
        }
        composeViewContext = null;
        View jivtDDk9H2 = qj.jivtDDk9H(this);
        lv06NcmrQ = qj.lv06NcmrQ(jivtDDk9H2);
        if (lv06NcmrQ == null) {
        }
    }

    public final void OOA6hdeuvCS() {
        se seVar;
        View view;
        if (this.encWxUiV2 == null && !isAttachedToWindow() && ((seVar = this.mOu10nynGul) == null || (view = seVar.GWasM1elztuh) == null || !view.isAttachedToWindow())) {
            o4.jivtDDk9H("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            AvO7iQsrTN();
        }
    }

    public final void X1lG3V04pd() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.mOu10nynGul == null) {
                c cVar = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof c) {
                        cVar = (c) childAt;
                    }
                }
                if (cVar != null) {
                    cVar.setComposeViewContext(E7jCp8Ls(qj.jivtDDk9H(this), cVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                AvO7iQsrTN();
            }
        }
    }

    public abstract void Yi7zF1RB1(int i, qx qxVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        xqGvceK5x();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        xqGvceK5x();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public void encWxUiV2(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        j5 j5Var = tag instanceof j5 ? (j5) tag : null;
        if (j5Var != null) {
            return j5Var.GWasM1elztuh;
        }
        return 1;
    }

    public final se getComposeViewContext$ui() {
        return this.mOu10nynGul;
    }

    public final boolean getHasComposition() {
        return this.AvO7iQsrTN != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.rQPn8YBR;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.XnEVoBF0td1l || super.isTransitionGroup();
    }

    public void mOu10nynGul(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hg0 hg0Var = sh1.GWasM1elztuh;
        Object mE4lRynR = d70.mE4lRynR(this);
        View view = this;
        while (mE4lRynR instanceof View) {
            View view2 = (View) mE4lRynR;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            mE4lRynR = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new uFEq9NpZ(0, this));
        } else {
            X1lG3V04pd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        encWxUiV2(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AvO7iQsrTN();
        mOu10nynGul(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ye rQPn8YBR() {
        gt0 gt0Var;
        gh ghVar;
        y1 y1Var;
        ye yeVar = this.encWxUiV2;
        if (yeVar == null) {
            yeVar = sh1.GWasM1elztuh(this);
            if (yeVar == null) {
                Object parent = getParent();
                while (yeVar == null && (parent instanceof View)) {
                    View view = (View) parent;
                    yeVar = sh1.GWasM1elztuh(view);
                    parent = d70.mE4lRynR(view);
                }
            }
            if (yeVar != null) {
                ye yeVar2 = (!(yeVar instanceof gt0) || ((dt0) ((gt0) yeVar).Y6hRI1cF8.getValue()).compareTo(dt0.EljAMC1QTz) > 0) ? yeVar : null;
                if (yeVar2 != null) {
                    this.OOA6hdeuvCS = new WeakReference(yeVar2);
                }
            } else {
                yeVar = null;
            }
            if (yeVar == null) {
                WeakReference weakReference = this.OOA6hdeuvCS;
                if (weakReference == null || (yeVar = (ye) weakReference.get()) == null || ((yeVar instanceof gt0) && ((dt0) ((gt0) yeVar).Y6hRI1cF8.getValue()).compareTo(dt0.EljAMC1QTz) <= 0)) {
                    yeVar = null;
                }
                if (yeVar == null) {
                    if (!isAttachedToWindow()) {
                        t10.Yi7zF1RB1("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object mE4lRynR = d70.mE4lRynR(this);
                    View view2 = this;
                    while (mE4lRynR instanceof View) {
                        View view3 = (View) mE4lRynR;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        mE4lRynR = view3.getParent();
                    }
                    ye GWasM1elztuh = sh1.GWasM1elztuh(view2);
                    if (GWasM1elztuh == null) {
                        ((lh1) mh1.GWasM1elztuh.get()).getClass();
                        vp vpVar = vp.OOA6hdeuvCS;
                        m71 m71Var = v1.YmKjaVtbfp5Z;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            ghVar = (gh) v1.YmKjaVtbfp5Z.getValue();
                        } else {
                            ghVar = (gh) v1.Mjvvu5DE.get();
                            if (ghVar == null) {
                                o4.jivtDDk9H("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        gh mOu10nynGul = ghVar.mOu10nynGul(vpVar);
                        y1 y1Var2 = (y1) mOu10nynGul.E7jCp8Ls(b9xEq24R1.z19UFEN2I);
                        if (y1Var2 != null) {
                            y1 y1Var3 = new y1(y1Var2);
                            i50 i50Var = (i50) y1Var3.AvO7iQsrTN;
                            synchronized (i50Var.Yi7zF1RB1) {
                                i50Var.GWasM1elztuh = false;
                                y1Var = y1Var3;
                            }
                        } else {
                            y1Var = 0;
                        }
                        rt0 rt0Var = new rt0();
                        gh ghVar2 = (pe0) mOu10nynGul.E7jCp8Ls(b9xEq24R1.YXi2hvwn7WL);
                        if (ghVar2 == null) {
                            ghVar2 = new qe0(view2.getContext().getApplicationContext());
                            rt0Var.OOA6hdeuvCS = ghVar2;
                        }
                        if (y1Var != 0) {
                            vpVar = y1Var;
                        }
                        gh mOu10nynGul2 = mOu10nynGul.mOu10nynGul(vpVar).mOu10nynGul(ghVar2);
                        gt0 gt0Var2 = new gt0(mOu10nynGul2);
                        synchronized (gt0Var2.X1lG3V04pd) {
                            gt0Var2.jivtDDk9H = true;
                        }
                        ug X1lG3V04pd = fb1.X1lG3V04pd(mOu10nynGul2);
                        t90 WIEu4Ya2g8 = q70.WIEu4Ya2g8(view2);
                        w90 AvO7iQsrTN = WIEu4Ya2g8 != null ? WIEu4Ya2g8.AvO7iQsrTN() : null;
                        if (AvO7iQsrTN == null) {
                            t10.X1lG3V04pd("ViewTreeLifecycleOwner not found from " + view2);
                            throw new vc();
                        }
                        view2.addOnAttachStateChangeListener(new nh1(view2, gt0Var2));
                        AvO7iQsrTN.GWasM1elztuh(new ph1(X1lG3V04pd, y1Var, gt0Var2, rt0Var));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, gt0Var2);
                        Handler handler = view2.getHandler();
                        int i = ez.GWasM1elztuh;
                        gh ghVar3 = new dz(handler, "windowRecomposer cleanup", false).JFJ3QoxA;
                        xqGvceK5x xqgvcek5x = new xqGvceK5x(gt0Var2, view2, r1, 27);
                        sh shVar = sh.encWxUiV2;
                        if ((2 & 1) != 0) {
                            ghVar3 = vp.OOA6hdeuvCS;
                        }
                        if ((2 & 2) != 0) {
                            shVar = sh.OOA6hdeuvCS;
                        }
                        gh lv06NcmrQ = o30.lv06NcmrQ(vp.OOA6hdeuvCS, ghVar3, true);
                        pk pkVar = mm.GWasM1elztuh;
                        if (lv06NcmrQ != pkVar && lv06NcmrQ.E7jCp8Ls(b9xEq24R1.arNh8D4Z5gB) == null) {
                            lv06NcmrQ = lv06NcmrQ.mOu10nynGul(pkVar);
                        }
                        YmKjaVtbfp5Z y80Var = shVar == sh.EljAMC1QTz ? new y80(lv06NcmrQ, xqgvcek5x) : new f51(lv06NcmrQ, true);
                        y80Var.rASgSCrgZkT7(shVar, y80Var, xqgvcek5x);
                        view2.addOnAttachStateChangeListener(new u0(2, y80Var));
                        gt0Var = gt0Var2;
                    } else {
                        if (!(GWasM1elztuh instanceof gt0)) {
                            o4.jivtDDk9H("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        gt0Var = (gt0) GWasM1elztuh;
                    }
                    r1 = ((dt0) gt0Var.Y6hRI1cF8.getValue()).compareTo(dt0.EljAMC1QTz) > 0 ? gt0Var : null;
                    if (r1 != null) {
                        this.OOA6hdeuvCS = new WeakReference(r1);
                    }
                    return gt0Var;
                }
            }
        }
        return yeVar;
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, new j5(i));
    }

    public final void setComposeViewContext$ui(se seVar) {
        if (this.mOu10nynGul != seVar) {
            if (seVar == null) {
                EljAMC1QTz();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                c cVar = childAt instanceof c ? (c) childAt : null;
                if (cVar != null) {
                    if (cVar.getCoroutineContext() != seVar.Yi7zF1RB1.JFJ3QoxA()) {
                        EljAMC1QTz();
                    }
                    cVar.setComposeViewContext(seVar);
                }
            }
            this.mOu10nynGul = seVar;
        }
    }

    public final void setParentCompositionContext(ye yeVar) {
        setParentContext(yeVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.rQPn8YBR = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((c) ((gn0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.XnEVoBF0td1l = true;
    }

    public final void setViewCompositionStrategy(pe1 pe1Var) {
        oe1 oe1Var = this.JFJ3QoxA;
        if (oe1Var != null) {
            oe1Var.GWasM1elztuh();
        }
        ((b70) pe1Var).getClass();
        u0 u0Var = new u0(1, this);
        addOnAttachStateChangeListener(u0Var);
        o4 o4Var = new o4(29);
        o50.Y6hRI1cF8(this).GWasM1elztuh.add(o4Var);
        this.JFJ3QoxA = new oe1(this, u0Var, o4Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void xqGvceK5x() {
        if (this.E7jCp8Ls) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        xqGvceK5x();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        xqGvceK5x();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        xqGvceK5x();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        xqGvceK5x();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        xqGvceK5x();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
