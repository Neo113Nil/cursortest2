package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class XntWc4eZSQ8j extends android.view.ViewGroup {
    public defpackage.au1 GE9mJIPrb8gP;
    public boolean Ns0WNyEWdPsk;
    public defpackage.gj P05cfTpS5W5L;
    public defpackage.qx1 QiMR8OkAhezm;
    public java.lang.ref.WeakReference WDYagTQQm9ns;
    public defpackage.aj e6mdH7fiFuta;
    public boolean fNwYGHIYeJcR;
    public boolean h3m55N1URyyK;
    public android.os.IBinder oh71FJcDz6S2;

    public XntWc4eZSQ8j(android.content.Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        defpackage.u1 u1Var = new defpackage.u1(1, this);
        addOnAttachStateChangeListener(u1Var);
        defpackage.p81 p81Var = new defpackage.p81(10);
        defpackage.m90.IJ0hOnjhPOri(this).ZpBGe2uQfcn8.add(p81Var);
        this.GE9mJIPrb8gP = new defpackage.au1(this, u1Var, p81Var);
    }

    private final void setParentContext(defpackage.gj gjVar) {
        if (this.P05cfTpS5W5L != gjVar) {
            this.P05cfTpS5W5L = gjVar;
            if (gjVar != null) {
                this.WDYagTQQm9ns = null;
            }
            defpackage.qx1 qx1Var = this.QiMR8OkAhezm;
            if (qx1Var != null) {
                qx1Var.ZpBGe2uQfcn8();
                this.QiMR8OkAhezm = null;
                if (isAttachedToWindow()) {
                    QiMR8OkAhezm();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder iBinder) {
        if (this.oh71FJcDz6S2 != iBinder) {
            this.oh71FJcDz6S2 = iBinder;
            this.WDYagTQQm9ns = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.aj GE9mJIPrb8gP() {
        defpackage.aj composeViewContext;
        defpackage.aj dG7RjM6DqYVL;
        defpackage.ru1 ru1Var;
        if (getChildCount() != 0) {
            android.view.View childAt = getChildAt(0);
            defpackage.u uVar = childAt instanceof defpackage.u ? (defpackage.u) childAt : null;
            if (uVar != null) {
                composeViewContext = uVar.getComposeViewContext();
                android.view.View VFeft99leXEK = defpackage.jr0.VFeft99leXEK(this);
                dG7RjM6DqYVL = defpackage.jr0.dG7RjM6DqYVL(VFeft99leXEK);
                if (dG7RjM6DqYVL == null) {
                    return fNwYGHIYeJcR(VFeft99leXEK, dG7RjM6DqYVL);
                }
                defpackage.gj Ns0WNyEWdPsk = Ns0WNyEWdPsk();
                defpackage.wg0 BHfvd2J71qpO = defpackage.m90.BHfvd2J71qpO(VFeft99leXEK);
                if (BHfvd2J71qpO == null) {
                    BHfvd2J71qpO = composeViewContext != null ? composeViewContext.fWTAfUmVKrZq : null;
                    if (BHfvd2J71qpO == null) {
                        defpackage.h7.P05cfTpS5W5L("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                defpackage.wg0 wg0Var = BHfvd2J71qpO;
                defpackage.b81 Mearx7yMn90V = defpackage.wc1.Mearx7yMn90V(VFeft99leXEK);
                if (Mearx7yMn90V == null) {
                    Mearx7yMn90V = composeViewContext != null ? composeViewContext.JhCgjQRTAOCT : null;
                    if (Mearx7yMn90V == null) {
                        defpackage.h7.P05cfTpS5W5L("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                defpackage.b81 b81Var = Mearx7yMn90V;
                defpackage.ru1 OcTWLQzke1i2 = defpackage.w60.OcTWLQzke1i2(VFeft99leXEK);
                if (OcTWLQzke1i2 == null) {
                    ru1Var = composeViewContext != null ? composeViewContext.WDYagTQQm9ns : null;
                } else {
                    ru1Var = OcTWLQzke1i2;
                }
                defpackage.aj ajVar = new defpackage.aj(defpackage.jr0.dG7RjM6DqYVL(defpackage.jr0.VFeft99leXEK(VFeft99leXEK)), VFeft99leXEK, Ns0WNyEWdPsk, wg0Var, b81Var, ru1Var);
                VFeft99leXEK.setTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_compose_view_context, new java.lang.ref.WeakReference(ajVar));
                return ajVar;
            }
        }
        composeViewContext = null;
        android.view.View VFeft99leXEK2 = defpackage.jr0.VFeft99leXEK(this);
        dG7RjM6DqYVL = defpackage.jr0.dG7RjM6DqYVL(VFeft99leXEK2);
        if (dG7RjM6DqYVL == null) {
        }
    }

    public final void JhCgjQRTAOCT() {
        if (this.fNwYGHIYeJcR) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.gj Ns0WNyEWdPsk() {
        defpackage.m31 m31Var;
        defpackage.jm jmVar;
        defpackage.q4 q4Var;
        defpackage.gj gjVar = this.P05cfTpS5W5L;
        if (gjVar == null) {
            gjVar = defpackage.jx1.ZpBGe2uQfcn8(this);
            if (gjVar == null) {
                java.lang.Object parent = getParent();
                while (gjVar == null && (parent instanceof android.view.View)) {
                    android.view.View view = (android.view.View) parent;
                    gjVar = defpackage.jx1.ZpBGe2uQfcn8(view);
                    parent = defpackage.t80.IJ0hOnjhPOri(view);
                }
            }
            if (gjVar != null) {
                defpackage.gj gjVar2 = (!(gjVar instanceof defpackage.m31) || ((defpackage.i31) ((defpackage.m31) gjVar).w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2) > 0) ? gjVar : null;
                if (gjVar2 != null) {
                    this.WDYagTQQm9ns = new java.lang.ref.WeakReference(gjVar2);
                }
            } else {
                gjVar = null;
            }
            if (gjVar == null) {
                java.lang.ref.WeakReference weakReference = this.WDYagTQQm9ns;
                if (weakReference == null || (gjVar = (defpackage.gj) weakReference.get()) == null || ((gjVar instanceof defpackage.m31) && ((defpackage.i31) ((defpackage.m31) gjVar).w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2) <= 0)) {
                    gjVar = null;
                }
                if (gjVar == null) {
                    if (!isAttachedToWindow()) {
                        defpackage.e80.giKS3J6vZuNy("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(this);
                    android.view.View view2 = this;
                    while (IJ0hOnjhPOri instanceof android.view.View) {
                        android.view.View view3 = (android.view.View) IJ0hOnjhPOri;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        IJ0hOnjhPOri = view3.getParent();
                    }
                    defpackage.gj ZpBGe2uQfcn8 = defpackage.jx1.ZpBGe2uQfcn8(view2);
                    if (ZpBGe2uQfcn8 == null) {
                        ((defpackage.bx1) defpackage.dx1.ZpBGe2uQfcn8.get()).getClass();
                        defpackage.xu xuVar = defpackage.xu.WDYagTQQm9ns;
                        defpackage.ti1 ti1Var = defpackage.o4.WmetiUbpKU9I;
                        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                            jmVar = (defpackage.jm) defpackage.o4.WmetiUbpKU9I.getValue();
                        } else {
                            jmVar = (defpackage.jm) defpackage.o4.s0TASMVLSWD5.get();
                            if (jmVar == null) {
                                defpackage.h7.P05cfTpS5W5L("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        defpackage.jm fNwYGHIYeJcR = jmVar.fNwYGHIYeJcR(xuVar);
                        defpackage.q4 q4Var2 = (defpackage.q4) fNwYGHIYeJcR.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Fu5WBEia9jBo);
                        if (q4Var2 != null) {
                            defpackage.q4 q4Var3 = new defpackage.q4(q4Var2);
                            defpackage.mc0 mc0Var = (defpackage.mc0) q4Var3.QiMR8OkAhezm;
                            synchronized (mc0Var.giKS3J6vZuNy) {
                                mc0Var.ZpBGe2uQfcn8 = false;
                                q4Var = q4Var3;
                            }
                        } else {
                            q4Var = 0;
                        }
                        defpackage.z31 z31Var = new defpackage.z31();
                        defpackage.jm jmVar2 = (defpackage.cm0) fNwYGHIYeJcR.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.CZa7MwI9IzLd);
                        if (jmVar2 == null) {
                            jmVar2 = new defpackage.dm0(view2.getContext().getApplicationContext());
                            z31Var.WDYagTQQm9ns = jmVar2;
                        }
                        if (q4Var != 0) {
                            xuVar = q4Var;
                        }
                        defpackage.jm fNwYGHIYeJcR2 = fNwYGHIYeJcR.fNwYGHIYeJcR(xuVar).fNwYGHIYeJcR(jmVar2);
                        m31Var = new defpackage.m31(fNwYGHIYeJcR2);
                        synchronized (m31Var.fWTAfUmVKrZq) {
                            m31Var.ZVVdXbWmyCSK = true;
                        }
                        defpackage.jl QiMR8OkAhezm = defpackage.ok0.QiMR8OkAhezm(fNwYGHIYeJcR2);
                        defpackage.wg0 BHfvd2J71qpO = defpackage.m90.BHfvd2J71qpO(view2);
                        defpackage.zg0 QiMR8OkAhezm2 = BHfvd2J71qpO != null ? BHfvd2J71qpO.QiMR8OkAhezm() : null;
                        if (QiMR8OkAhezm2 == null) {
                            defpackage.e80.fWTAfUmVKrZq("ViewTreeLifecycleOwner not found from " + view2);
                            defpackage.h7.JhCgjQRTAOCT();
                            return null;
                        }
                        view2.addOnAttachStateChangeListener(new defpackage.ex1(view2, m31Var));
                        QiMR8OkAhezm2.ZpBGe2uQfcn8(new defpackage.gx1(QiMR8OkAhezm, q4Var, m31Var, z31Var));
                        view2.setTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_composition_context, m31Var);
                        defpackage.s30 s30Var = defpackage.s30.WDYagTQQm9ns;
                        android.os.Handler handler = view2.getHandler();
                        int i = defpackage.t40.ZpBGe2uQfcn8;
                        view2.addOnAttachStateChangeListener(new defpackage.u1(2, defpackage.ok0.zJPqDeoF0Os1(s30Var, new defpackage.s40(handler, "windowRecomposer cleanup", false).GE9mJIPrb8gP, new defpackage.cx1(m31Var, view2, null), 2)));
                    } else {
                        if (!(ZpBGe2uQfcn8 instanceof defpackage.m31)) {
                            defpackage.h7.P05cfTpS5W5L("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        m31Var = (defpackage.m31) ZpBGe2uQfcn8;
                    }
                    defpackage.m31 m31Var2 = ((defpackage.i31) m31Var.w7APNrr0aGRc.getValue()).compareTo(defpackage.i31.oh71FJcDz6S2) > 0 ? m31Var : null;
                    if (m31Var2 != null) {
                        this.WDYagTQQm9ns = new java.lang.ref.WeakReference(m31Var2);
                    }
                    return m31Var;
                }
            }
        }
        return gjVar;
    }

    public void P05cfTpS5W5L(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void QiMR8OkAhezm() {
        if (this.QiMR8OkAhezm == null) {
            boolean z = false;
            java.lang.Object[] objArr = 0;
            try {
                this.fNwYGHIYeJcR = true;
                android.os.Trace.beginSection("Compose:initializeView");
                try {
                    defpackage.aj ajVar = this.e6mdH7fiFuta;
                    if (ajVar == null) {
                        ajVar = GE9mJIPrb8gP();
                    }
                    this.QiMR8OkAhezm = defpackage.sx1.ZpBGe2uQfcn8(this, ajVar, new defpackage.nh(1003123809, true, new defpackage.T1fB7bDYiVJQ(objArr == true ? 1 : 0, this)));
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            } finally {
                this.fNwYGHIYeJcR = false;
            }
        }
    }

    public final void WDYagTQQm9ns() {
        defpackage.aj ajVar;
        android.view.View view;
        if (this.P05cfTpS5W5L == null && !isAttachedToWindow() && ((ajVar = this.e6mdH7fiFuta) == null || (view = ajVar.ZpBGe2uQfcn8) == null || !view.isAttachedToWindow())) {
            defpackage.h7.P05cfTpS5W5L("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            QiMR8OkAhezm();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        JhCgjQRTAOCT();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        JhCgjQRTAOCT();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public void e6mdH7fiFuta(int i, int i2) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final defpackage.aj fNwYGHIYeJcR(android.view.View view, defpackage.aj ajVar) {
        defpackage.gj Ns0WNyEWdPsk = Ns0WNyEWdPsk();
        defpackage.wg0 BHfvd2J71qpO = defpackage.m90.BHfvd2J71qpO(view);
        defpackage.ru1 OcTWLQzke1i2 = defpackage.w60.OcTWLQzke1i2(view);
        defpackage.b81 Mearx7yMn90V = defpackage.wc1.Mearx7yMn90V(view);
        defpackage.gj gjVar = ajVar.giKS3J6vZuNy;
        defpackage.b81 b81Var = ajVar.JhCgjQRTAOCT;
        defpackage.wg0 wg0Var = ajVar.fWTAfUmVKrZq;
        if (Ns0WNyEWdPsk == gjVar && BHfvd2J71qpO == wg0Var && OcTWLQzke1i2 == ajVar.WDYagTQQm9ns && Mearx7yMn90V == b81Var) {
            return ajVar;
        }
        if (Ns0WNyEWdPsk.GE9mJIPrb8gP() != ajVar.giKS3J6vZuNy.GE9mJIPrb8gP()) {
            oh71FJcDz6S2();
        }
        if (BHfvd2J71qpO == null) {
            BHfvd2J71qpO = wg0Var;
        }
        defpackage.aj ajVar2 = new defpackage.aj(ajVar, view, Ns0WNyEWdPsk, BHfvd2J71qpO, Mearx7yMn90V == null ? b81Var : Mearx7yMn90V, OcTWLQzke1i2);
        view.setTag(com.ice.fishing.wolberta.R.id.androidx_compose_ui_view_compose_view_context, new java.lang.ref.WeakReference(ajVar2));
        return ajVar2;
    }

    public final void fWTAfUmVKrZq() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e6mdH7fiFuta == null) {
                defpackage.u uVar = null;
                if (getChildCount() != 0) {
                    android.view.View childAt = getChildAt(0);
                    if (childAt instanceof defpackage.u) {
                        uVar = (defpackage.u) childAt;
                    }
                }
                if (uVar != null) {
                    uVar.setComposeViewContext(fNwYGHIYeJcR(defpackage.jr0.VFeft99leXEK(this), uVar.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                QiMR8OkAhezm();
            }
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        java.lang.Object tag = getTag(com.ice.fishing.wolberta.R.id.auto_clear_focus_behavior_tag);
        defpackage.i8 i8Var = tag instanceof defpackage.i8 ? (defpackage.i8) tag : null;
        if (i8Var != null) {
            return i8Var.ZpBGe2uQfcn8;
        }
        return 1;
    }

    public final defpackage.aj getComposeViewContext$ui() {
        return this.e6mdH7fiFuta;
    }

    public final boolean getHasComposition() {
        return this.QiMR8OkAhezm != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.Ns0WNyEWdPsk;
    }

    public abstract void giKS3J6vZuNy(int i, defpackage.e30 e30Var);

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.h3m55N1URyyK || super.isTransitionGroup();
    }

    public final void oh71FJcDz6S2() {
        android.view.View childAt = getChildAt(0);
        defpackage.u uVar = childAt instanceof defpackage.u ? (defpackage.u) childAt : null;
        if (uVar != null && uVar.KN4muQto0Nd5) {
            uVar.getComposeViewContext().giKS3J6vZuNy();
            uVar.KN4muQto0Nd5 = false;
        }
        defpackage.qx1 qx1Var = this.QiMR8OkAhezm;
        if (qx1Var != null) {
            qx1Var.ZpBGe2uQfcn8();
        }
        this.QiMR8OkAhezm = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.yn0 yn0Var = defpackage.jx1.ZpBGe2uQfcn8;
        java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(this);
        android.view.View view = this;
        while (IJ0hOnjhPOri instanceof android.view.View) {
            android.view.View view2 = (android.view.View) IJ0hOnjhPOri;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            IJ0hOnjhPOri = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new defpackage.gUjdnLbkVAaA(0, this));
        } else {
            fWTAfUmVKrZq();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        P05cfTpS5W5L(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        QiMR8OkAhezm();
        e6mdH7fiFuta(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(com.ice.fishing.wolberta.R.id.auto_clear_focus_behavior_tag, new defpackage.i8(i));
    }

    public final void setComposeViewContext$ui(defpackage.aj ajVar) {
        if (this.e6mdH7fiFuta != ajVar) {
            if (ajVar == null) {
                oh71FJcDz6S2();
            } else if (getChildCount() != 0) {
                android.view.View childAt = getChildAt(0);
                defpackage.u uVar = childAt instanceof defpackage.u ? (defpackage.u) childAt : null;
                if (uVar != null) {
                    if (uVar.getCoroutineContext() != ajVar.giKS3J6vZuNy.GE9mJIPrb8gP()) {
                        oh71FJcDz6S2();
                    }
                    uVar.setComposeViewContext(ajVar);
                }
            }
            this.e6mdH7fiFuta = ajVar;
        }
    }

    public final void setParentCompositionContext(defpackage.gj gjVar) {
        setParentContext(gjVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.Ns0WNyEWdPsk = z;
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((defpackage.u) ((defpackage.ov0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.h3m55N1URyyK = true;
    }

    public final void setViewCompositionStrategy(defpackage.bu1 bu1Var) {
        defpackage.au1 au1Var = this.GE9mJIPrb8gP;
        if (au1Var != null) {
            au1Var.ZpBGe2uQfcn8();
        }
        ((defpackage.j80) bu1Var).getClass();
        defpackage.u1 u1Var = new defpackage.u1(1, this);
        addOnAttachStateChangeListener(u1Var);
        defpackage.p81 p81Var = new defpackage.p81(10);
        defpackage.m90.IJ0hOnjhPOri(this).ZpBGe2uQfcn8.add(p81Var);
        this.GE9mJIPrb8gP = new defpackage.au1(this, u1Var, p81Var);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        JhCgjQRTAOCT();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        JhCgjQRTAOCT();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        JhCgjQRTAOCT();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        JhCgjQRTAOCT();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        JhCgjQRTAOCT();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
