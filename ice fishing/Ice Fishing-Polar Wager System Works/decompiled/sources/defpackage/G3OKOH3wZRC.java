package defpackage;

/* loaded from: classes.dex */
public abstract class G3OKOH3wZRC extends android.view.ViewGroup {
    public defpackage.aq1 AARZUJiTa;
    public boolean DFo87pBq1E5;
    public defpackage.fh EXtogiMhuM;
    public boolean JlrlGoKF;
    public defpackage.nm1 SH1y5HwkJhh;
    public java.lang.ref.WeakReference adDC3e2L;
    public boolean ez2rX8ReCYw;
    public defpackage.zg riuEU0zW4;
    public android.os.IBinder xiZrDbcSW0;

    public G3OKOH3wZRC(android.content.Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        defpackage.m2 m2Var = new defpackage.m2(1, this);
        addOnAttachStateChangeListener(m2Var);
        defpackage.db dbVar = new defpackage.db(28);
        defpackage.l80.QoRHpC4k(this).IHQe1A4L2xu.add(dbVar);
        this.SH1y5HwkJhh = new defpackage.nm1(this, m2Var, dbVar);
    }

    private final void setParentContext(defpackage.fh fhVar) {
        if (this.EXtogiMhuM != fhVar) {
            this.EXtogiMhuM = fhVar;
            if (fhVar != null) {
                this.adDC3e2L = null;
            }
            defpackage.aq1 aq1Var = this.AARZUJiTa;
            if (aq1Var != null) {
                aq1Var.IHQe1A4L2xu();
                this.AARZUJiTa = null;
                if (isAttachedToWindow()) {
                    AARZUJiTa();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(android.os.IBinder iBinder) {
        if (this.xiZrDbcSW0 != iBinder) {
            this.xiZrDbcSW0 = iBinder;
            this.adDC3e2L = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void AARZUJiTa() {
        if (this.AARZUJiTa == null) {
            boolean z = false;
            java.lang.Object[] objArr = 0;
            try {
                this.JlrlGoKF = true;
                android.os.Trace.beginSection("Compose:initializeView");
                try {
                    defpackage.zg zgVar = this.riuEU0zW4;
                    if (zgVar == null) {
                        zgVar = SH1y5HwkJhh();
                    }
                    this.AARZUJiTa = defpackage.cq1.IHQe1A4L2xu(this, zgVar, new defpackage.sf(1003123809, new defpackage.QoRHpC4k(objArr == true ? 1 : 0, this), true));
                    android.os.Trace.endSection();
                } catch (java.lang.Throwable th) {
                    android.os.Trace.endSection();
                    throw th;
                }
            } finally {
                this.JlrlGoKF = false;
            }
        }
    }

    public void EXtogiMhuM(int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final void F7NU4MC0GW() {
        if (this.JlrlGoKF) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final defpackage.zg JlrlGoKF(android.view.View view, defpackage.zg zgVar) {
        defpackage.fh ez2rX8ReCYw = ez2rX8ReCYw();
        defpackage.ud0 SyNS6RMn = defpackage.a70.SyNS6RMn(view);
        defpackage.cn1 kd6TUFXn = defpackage.j70.kd6TUFXn(view);
        defpackage.i41 DFo87pBq1E5 = defpackage.f70.DFo87pBq1E5(view);
        defpackage.fh fhVar = zgVar.oh6vYeIP;
        defpackage.i41 i41Var = zgVar.F7NU4MC0GW;
        defpackage.ud0 ud0Var = zgVar.r1MBDhnF;
        if (ez2rX8ReCYw == fhVar && SyNS6RMn == ud0Var && kd6TUFXn == zgVar.adDC3e2L && DFo87pBq1E5 == i41Var) {
            return zgVar;
        }
        if (ez2rX8ReCYw.SH1y5HwkJhh() != zgVar.oh6vYeIP.SH1y5HwkJhh()) {
            xiZrDbcSW0();
        }
        if (SyNS6RMn == null) {
            SyNS6RMn = ud0Var;
        }
        defpackage.zg zgVar2 = new defpackage.zg(zgVar, view, ez2rX8ReCYw, SyNS6RMn, DFo87pBq1E5 == null ? i41Var : DFo87pBq1E5, kd6TUFXn);
        view.setTag(com.combinations.spin.balbi.R.id.androidx_compose_ui_view_compose_view_context, new java.lang.ref.WeakReference(zgVar2));
        return zgVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.zg SH1y5HwkJhh() {
        defpackage.zg composeViewContext;
        defpackage.zg QQUzIjv3iOC5;
        defpackage.cn1 cn1Var;
        if (getChildCount() != 0) {
            android.view.View childAt = getChildAt(0);
            defpackage.v0 v0Var = childAt instanceof defpackage.v0 ? (defpackage.v0) childAt : null;
            if (v0Var != null) {
                composeViewContext = v0Var.getComposeViewContext();
                android.view.View abhbClRa = defpackage.ci0.abhbClRa(this);
                QQUzIjv3iOC5 = defpackage.ci0.QQUzIjv3iOC5(abhbClRa);
                if (QQUzIjv3iOC5 == null) {
                    return JlrlGoKF(abhbClRa, QQUzIjv3iOC5);
                }
                defpackage.fh ez2rX8ReCYw = ez2rX8ReCYw();
                defpackage.ud0 SyNS6RMn = defpackage.a70.SyNS6RMn(abhbClRa);
                if (SyNS6RMn == null) {
                    SyNS6RMn = composeViewContext != null ? composeViewContext.r1MBDhnF : null;
                    if (SyNS6RMn == null) {
                        defpackage.db.AARZUJiTa("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        return null;
                    }
                }
                defpackage.ud0 ud0Var = SyNS6RMn;
                defpackage.i41 DFo87pBq1E5 = defpackage.f70.DFo87pBq1E5(abhbClRa);
                if (DFo87pBq1E5 == null) {
                    DFo87pBq1E5 = composeViewContext != null ? composeViewContext.F7NU4MC0GW : null;
                    if (DFo87pBq1E5 == null) {
                        defpackage.db.AARZUJiTa("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        return null;
                    }
                }
                defpackage.i41 i41Var = DFo87pBq1E5;
                defpackage.cn1 kd6TUFXn = defpackage.j70.kd6TUFXn(abhbClRa);
                if (kd6TUFXn == null) {
                    cn1Var = composeViewContext != null ? composeViewContext.adDC3e2L : null;
                } else {
                    cn1Var = kd6TUFXn;
                }
                defpackage.zg zgVar = new defpackage.zg(defpackage.ci0.QQUzIjv3iOC5(defpackage.ci0.abhbClRa(abhbClRa)), abhbClRa, ez2rX8ReCYw, ud0Var, i41Var, cn1Var);
                abhbClRa.setTag(com.combinations.spin.balbi.R.id.androidx_compose_ui_view_compose_view_context, new java.lang.ref.WeakReference(zgVar));
                return zgVar;
            }
        }
        composeViewContext = null;
        android.view.View abhbClRa2 = defpackage.ci0.abhbClRa(this);
        QQUzIjv3iOC5 = defpackage.ci0.QQUzIjv3iOC5(abhbClRa2);
        if (QQUzIjv3iOC5 == null) {
        }
    }

    public final void adDC3e2L() {
        defpackage.zg zgVar;
        android.view.View view;
        if (this.EXtogiMhuM == null && !isAttachedToWindow() && ((zgVar = this.riuEU0zW4) == null || (view = zgVar.IHQe1A4L2xu) == null || !view.isAttachedToWindow())) {
            defpackage.db.AARZUJiTa("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            AARZUJiTa();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        F7NU4MC0GW();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        F7NU4MC0GW();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.fh ez2rX8ReCYw() {
        defpackage.gz0 gz0Var;
        defpackage.lj ljVar;
        defpackage.o3 o3Var;
        defpackage.fh fhVar = this.EXtogiMhuM;
        if (fhVar == null) {
            fhVar = defpackage.np1.IHQe1A4L2xu(this);
            if (fhVar == null) {
                java.lang.Object parent = getParent();
                while (fhVar == null && (parent instanceof android.view.View)) {
                    android.view.View view = (android.view.View) parent;
                    fhVar = defpackage.np1.IHQe1A4L2xu(view);
                    parent = defpackage.e90.EgCjBq0SZwJ(view);
                }
            }
            if (fhVar != null) {
                defpackage.fh fhVar2 = (!(fhVar instanceof defpackage.gz0) || ((defpackage.dz0) ((defpackage.gz0) fhVar).kNAkVymC.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0) > 0) ? fhVar : null;
                if (fhVar2 != null) {
                    this.adDC3e2L = new java.lang.ref.WeakReference(fhVar2);
                }
            } else {
                fhVar = null;
            }
            if (fhVar == null) {
                java.lang.ref.WeakReference weakReference = this.adDC3e2L;
                if (weakReference == null || (fhVar = (defpackage.fh) weakReference.get()) == null || ((fhVar instanceof defpackage.gz0) && ((defpackage.dz0) ((defpackage.gz0) fhVar).kNAkVymC.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0) <= 0)) {
                    fhVar = null;
                }
                if (fhVar == null) {
                    if (!isAttachedToWindow()) {
                        defpackage.x50.oh6vYeIP("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(this);
                    android.view.View view2 = this;
                    while (EgCjBq0SZwJ instanceof android.view.View) {
                        android.view.View view3 = (android.view.View) EgCjBq0SZwJ;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        EgCjBq0SZwJ = view3.getParent();
                    }
                    defpackage.fh IHQe1A4L2xu = defpackage.np1.IHQe1A4L2xu(view2);
                    if (IHQe1A4L2xu == null) {
                        ((defpackage.gp1) defpackage.hp1.IHQe1A4L2xu.get()).getClass();
                        defpackage.lt ltVar = defpackage.lt.adDC3e2L;
                        defpackage.le1 le1Var = defpackage.l3.G3OKOH3wZRC;
                        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                            ljVar = (defpackage.lj) defpackage.l3.G3OKOH3wZRC.getValue();
                        } else {
                            ljVar = (defpackage.lj) defpackage.l3.kd6TUFXn.get();
                            if (ljVar == null) {
                                defpackage.db.AARZUJiTa("no AndroidUiDispatcher for this thread");
                                return null;
                            }
                        }
                        defpackage.lj JlrlGoKF = ljVar.JlrlGoKF(ltVar);
                        defpackage.o3 o3Var2 = (defpackage.o3) JlrlGoKF.cnag84Bm(defpackage.n.hkbnNdmy);
                        if (o3Var2 != null) {
                            defpackage.o3 o3Var3 = new defpackage.o3(o3Var2);
                            defpackage.q90 q90Var = (defpackage.q90) o3Var3.AARZUJiTa;
                            synchronized (q90Var.oh6vYeIP) {
                                q90Var.IHQe1A4L2xu = false;
                                o3Var = o3Var3;
                            }
                        } else {
                            o3Var = 0;
                        }
                        defpackage.rz0 rz0Var = new defpackage.rz0();
                        defpackage.lj ljVar2 = (defpackage.sj0) JlrlGoKF.cnag84Bm(defpackage.n.TFRaUu83X3E);
                        if (ljVar2 == null) {
                            ljVar2 = new defpackage.tj0(view2.getContext().getApplicationContext());
                            rz0Var.adDC3e2L = ljVar2;
                        }
                        if (o3Var != 0) {
                            ltVar = o3Var;
                        }
                        defpackage.lj JlrlGoKF2 = JlrlGoKF.JlrlGoKF(ltVar).JlrlGoKF(ljVar2);
                        defpackage.gz0 gz0Var2 = new defpackage.gz0(JlrlGoKF2);
                        synchronized (gz0Var2.r1MBDhnF) {
                            gz0Var2.fnWB2E7cs = true;
                        }
                        defpackage.dj oh6vYeIP = defpackage.h1.oh6vYeIP(JlrlGoKF2);
                        defpackage.ud0 SyNS6RMn = defpackage.a70.SyNS6RMn(view2);
                        defpackage.xd0 EXtogiMhuM = SyNS6RMn != null ? SyNS6RMn.EXtogiMhuM() : null;
                        if (EXtogiMhuM == null) {
                            defpackage.x50.r1MBDhnF("ViewTreeLifecycleOwner not found from " + view2);
                            throw new defpackage.cf();
                        }
                        view2.addOnAttachStateChangeListener(new defpackage.ip1(view2, gz0Var2));
                        EXtogiMhuM.IHQe1A4L2xu(new defpackage.kp1(oh6vYeIP, o3Var, gz0Var2, rz0Var));
                        view2.setTag(com.combinations.spin.balbi.R.id.androidx_compose_ui_view_composition_context, gz0Var2);
                        defpackage.j20 j20Var = defpackage.j20.adDC3e2L;
                        android.os.Handler handler = view2.getHandler();
                        int i = defpackage.f30.IHQe1A4L2xu;
                        view2.addOnAttachStateChangeListener(new defpackage.m2(2, defpackage.fm.SiPhmbmu(j20Var, new defpackage.e30(handler, "windowRecomposer cleanup", false).SH1y5HwkJhh, new defpackage.t01(gz0Var2, view2, r1, 14), 2)));
                        gz0Var = gz0Var2;
                    } else {
                        if (!(IHQe1A4L2xu instanceof defpackage.gz0)) {
                            defpackage.db.AARZUJiTa("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        gz0Var = (defpackage.gz0) IHQe1A4L2xu;
                    }
                    r1 = ((defpackage.dz0) gz0Var.kNAkVymC.getValue()).compareTo(defpackage.dz0.xiZrDbcSW0) > 0 ? gz0Var : null;
                    if (r1 != null) {
                        this.adDC3e2L = new java.lang.ref.WeakReference(r1);
                    }
                    return gz0Var;
                }
            }
        }
        return fhVar;
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        java.lang.Object tag = getTag(com.combinations.spin.balbi.R.id.auto_clear_focus_behavior_tag);
        defpackage.z6 z6Var = tag instanceof defpackage.z6 ? (defpackage.z6) tag : null;
        if (z6Var != null) {
            return z6Var.IHQe1A4L2xu;
        }
        return 1;
    }

    public final defpackage.zg getComposeViewContext$ui() {
        return this.riuEU0zW4;
    }

    public final boolean getHasComposition() {
        return this.AARZUJiTa != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.ez2rX8ReCYw;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.DFo87pBq1E5 || super.isTransitionGroup();
    }

    public abstract void oh6vYeIP(defpackage.t10 t10Var, int i);

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.nl0 nl0Var = defpackage.np1.IHQe1A4L2xu;
        java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(this);
        android.view.View view = this;
        while (EgCjBq0SZwJ instanceof android.view.View) {
            android.view.View view2 = (android.view.View) EgCjBq0SZwJ;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            EgCjBq0SZwJ = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new defpackage.cnag84Bm(0, this));
        } else {
            r1MBDhnF();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EXtogiMhuM(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        AARZUJiTa();
        riuEU0zW4(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void r1MBDhnF() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.riuEU0zW4 == null) {
                defpackage.v0 v0Var = null;
                if (getChildCount() != 0) {
                    android.view.View childAt = getChildAt(0);
                    if (childAt instanceof defpackage.v0) {
                        v0Var = (defpackage.v0) childAt;
                    }
                }
                if (v0Var != null) {
                    v0Var.setComposeViewContext(JlrlGoKF(defpackage.ci0.abhbClRa(this), v0Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                AARZUJiTa();
            }
        }
    }

    public void riuEU0zW4(int i, int i2) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(com.combinations.spin.balbi.R.id.auto_clear_focus_behavior_tag, new defpackage.z6(i));
    }

    public final void setComposeViewContext$ui(defpackage.zg zgVar) {
        if (this.riuEU0zW4 != zgVar) {
            if (zgVar == null) {
                xiZrDbcSW0();
            } else if (getChildCount() != 0) {
                android.view.View childAt = getChildAt(0);
                defpackage.v0 v0Var = childAt instanceof defpackage.v0 ? (defpackage.v0) childAt : null;
                if (v0Var != null) {
                    if (v0Var.getCoroutineContext() != zgVar.oh6vYeIP.SH1y5HwkJhh()) {
                        xiZrDbcSW0();
                    }
                    v0Var.setComposeViewContext(zgVar);
                }
            }
            this.riuEU0zW4 = zgVar;
        }
    }

    public final void setParentCompositionContext(defpackage.fh fhVar) {
        setParentContext(fhVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.ez2rX8ReCYw = z;
        android.view.KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((defpackage.v0) ((defpackage.ts0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.DFo87pBq1E5 = true;
    }

    public final void setViewCompositionStrategy(defpackage.om1 om1Var) {
        defpackage.nm1 nm1Var = this.SH1y5HwkJhh;
        if (nm1Var != null) {
            nm1Var.IHQe1A4L2xu();
        }
        ((defpackage.c80) om1Var).getClass();
        defpackage.m2 m2Var = new defpackage.m2(1, this);
        addOnAttachStateChangeListener(m2Var);
        defpackage.db dbVar = new defpackage.db(28);
        defpackage.l80.QoRHpC4k(this).IHQe1A4L2xu.add(dbVar);
        this.SH1y5HwkJhh = new defpackage.nm1(this, m2Var, dbVar);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void xiZrDbcSW0() {
        android.view.View childAt = getChildAt(0);
        defpackage.v0 v0Var = childAt instanceof defpackage.v0 ? (defpackage.v0) childAt : null;
        if (v0Var != null && v0Var.nMM9nLv63p) {
            v0Var.getComposeViewContext().oh6vYeIP();
            v0Var.nMM9nLv63p = false;
        }
        defpackage.aq1 aq1Var = this.AARZUJiTa;
        if (aq1Var != null) {
            aq1Var.IHQe1A4L2xu();
        }
        this.AARZUJiTa = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        F7NU4MC0GW();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        F7NU4MC0GW();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        F7NU4MC0GW();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        F7NU4MC0GW();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        F7NU4MC0GW();
        super.addView(view, i, layoutParams);
    }

    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
