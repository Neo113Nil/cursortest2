package defpackage;

/* loaded from: classes.dex */
public final class qo extends android.app.Dialog implements defpackage.ud0, defpackage.uq0, defpackage.go0, defpackage.i41 {
    public final defpackage.le1 AARZUJiTa;
    public boolean DFo87pBq1E5;
    public final defpackage.le1 EXtogiMhuM;
    public final defpackage.lo JlrlGoKF;
    public defpackage.oo SH1y5HwkJhh;
    public defpackage.xd0 adDC3e2L;
    public final android.view.View ez2rX8ReCYw;
    public defpackage.vz riuEU0zW4;
    public final defpackage.F7NU4MC0GW xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(defpackage.vz vzVar, defpackage.oo ooVar, android.view.View view, defpackage.w90 w90Var, defpackage.qn qnVar, java.util.UUID uuid) {
        super(new android.view.ContextThemeWrapper(view.getContext(), ooVar.adDC3e2L ? com.combinations.spin.balbi.R.style.DialogWindowTheme : com.combinations.spin.balbi.R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.xiZrDbcSW0 = new defpackage.F7NU4MC0GW(new defpackage.h41(this, new defpackage.e3(16, this)));
        this.AARZUJiTa = new defpackage.le1(new defpackage.vz(this) { // from class: pf
            public final /* synthetic */ defpackage.qo xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i2 = i;
                defpackage.qo qoVar = this.xiZrDbcSW0;
                switch (i2) {
                    case 0:
                        defpackage.tp tpVar = new defpackage.tp();
                        qoVar.IHQe1A4L2xu().F7NU4MC0GW(tpVar);
                        return tpVar;
                    default:
                        return new defpackage.tq0(new defpackage.cnag84Bm(5, qoVar));
                }
            }
        });
        final int i2 = 1;
        this.EXtogiMhuM = new defpackage.le1(new defpackage.vz(this) { // from class: pf
            public final /* synthetic */ defpackage.qo xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                int i22 = i2;
                defpackage.qo qoVar = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        defpackage.tp tpVar = new defpackage.tp();
                        qoVar.IHQe1A4L2xu().F7NU4MC0GW(tpVar);
                        return tpVar;
                    default:
                        return new defpackage.tq0(new defpackage.cnag84Bm(5, qoVar));
                }
            }
        });
        this.riuEU0zW4 = vzVar;
        this.SH1y5HwkJhh = ooVar;
        this.ez2rX8ReCYw = view;
        android.view.Window window = getWindow();
        if (window == null) {
            defpackage.db.AARZUJiTa("Dialog has no window");
            throw null;
        }
        defpackage.oo ooVar2 = this.SH1y5HwkJhh;
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = ooVar2.AARZUJiTa;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        defpackage.s70.hyxIchWRW(window, this.SH1y5HwkJhh.adDC3e2L);
        window.setGravity(17);
        if (!this.SH1y5HwkJhh.adDC3e2L) {
            window.addFlags(65792);
            android.view.WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                defpackage.q5.IHQe1A4L2xu.IHQe1A4L2xu(attributes2);
            }
            if (i3 >= 30) {
                defpackage.r5 r5Var = defpackage.r5.IHQe1A4L2xu;
                r5Var.oh6vYeIP(attributes2, 0);
                r5Var.r1MBDhnF(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        defpackage.lo loVar = new defpackage.lo(getContext(), window);
        setTitle(this.SH1y5HwkJhh.xiZrDbcSW0);
        loVar.setTag(com.combinations.spin.balbi.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        loVar.setClipChildren(false);
        loVar.setElevation(qnVar.EgCjBq0SZwJ(8.0f));
        loVar.setOutlineProvider(new defpackage.po(0));
        this.JlrlGoKF = loVar;
        android.view.View decorView = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            adDC3e2L(viewGroup);
        }
        setContentView(loVar);
        loVar.setTag(com.combinations.spin.balbi.R.id.view_tree_lifecycle_owner, defpackage.a70.SyNS6RMn(view));
        loVar.setTag(com.combinations.spin.balbi.R.id.view_tree_view_model_store_owner, defpackage.j70.kd6TUFXn(view));
        loVar.setTag(com.combinations.spin.balbi.R.id.view_tree_saved_state_registry_owner, defpackage.f70.DFo87pBq1E5(view));
        riuEU0zW4(this.riuEU0zW4, this.SH1y5HwkJhh, w90Var);
        defpackage.tq0 oh6vYeIP = oh6vYeIP();
        defpackage.s1 s1Var = new defpackage.s1(this, 1);
        oh6vYeIP.getClass();
        defpackage.p7 p7Var = new defpackage.p7(s1Var);
        final defpackage.xd0 xiZrDbcSW0 = xiZrDbcSW0();
        if (xiZrDbcSW0.EXtogiMhuM == defpackage.nd0.adDC3e2L) {
            return;
        }
        defpackage.nq0 nq0Var = new defpackage.nq0(p7Var, new defpackage.oq0(p7Var, this));
        p7Var.IHQe1A4L2xu.add(nq0Var);
        nq0Var.AARZUJiTa(false);
        defpackage.y.r1MBDhnF(oh6vYeIP.IHQe1A4L2xu(), nq0Var);
        final defpackage.an anVar = new defpackage.an(nq0Var, oh6vYeIP, xiZrDbcSW0);
        xiZrDbcSW0.IHQe1A4L2xu(anVar);
        p7Var.r1MBDhnF.add(new java.lang.AutoCloseable() { // from class: pq0
            @Override // java.lang.AutoCloseable
            public final void close() {
                defpackage.xd0.this.xiZrDbcSW0(anVar);
            }
        });
    }

    public static void F7NU4MC0GW(defpackage.qo qoVar) {
        super.onBackPressed();
    }

    public static final void adDC3e2L(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof defpackage.lo) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                adDC3e2L(viewGroup2);
            }
        }
    }

    public final void AARZUJiTa() {
        android.view.Window window = getWindow();
        window.getClass();
        android.view.View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(com.combinations.spin.balbi.R.id.view_tree_lifecycle_owner, this);
        android.view.Window window2 = getWindow();
        window2.getClass();
        android.view.View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.combinations.spin.balbi.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.Window window3 = getWindow();
        window3.getClass();
        android.view.View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(com.combinations.spin.balbi.R.id.view_tree_saved_state_registry_owner, this);
        android.view.Window window4 = getWindow();
        window4.getClass();
        android.view.View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(com.combinations.spin.balbi.R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.ud0
    public final defpackage.xd0 EXtogiMhuM() {
        return xiZrDbcSW0();
    }

    @Override // defpackage.go0
    public final defpackage.y IHQe1A4L2xu() {
        return oh6vYeIP().IHQe1A4L2xu();
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        AARZUJiTa();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.uq0
    public final defpackage.tq0 oh6vYeIP() {
        return (defpackage.tq0) this.EXtogiMhuM.getValue();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((defpackage.tp) this.AARZUJiTa.getValue()).IHQe1A4L2xu();
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.tq0 oh6vYeIP = oh6vYeIP();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            oh6vYeIP.oh6vYeIP(onBackInvokedDispatcher);
        }
        this.xiZrDbcSW0.PAEGRtP0bX(bundle);
        xiZrDbcSW0().F7NU4MC0GW(defpackage.md0.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (!this.SH1y5HwkJhh.IHQe1A4L2xu || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.riuEU0zW4.IHQe1A4L2xu();
        return true;
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.xiZrDbcSW0.abhbClRa(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        xiZrDbcSW0().F7NU4MC0GW(defpackage.md0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        xiZrDbcSW0().F7NU4MC0GW(defpackage.md0.ON_DESTROY);
        this.adDC3e2L = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r5 <= r1) goto L31;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.SH1y5HwkJhh.oh6vYeIP) {
            defpackage.lo loVar = this.JlrlGoKF;
            loVar.getClass();
            if (java.lang.Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && java.lang.Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = loVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + loVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + loVar.getTop();
                int height = childAt.getHeight() + top;
                int TFRaUu83X3E = defpackage.ci0.TFRaUu83X3E(motionEvent.getX());
                if (left <= TFRaUu83X3E) {
                    if (TFRaUu83X3E <= width) {
                        int TFRaUu83X3E2 = defpackage.ci0.TFRaUu83X3E(motionEvent.getY());
                        if (top <= TFRaUu83X3E2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.DFo87pBq1E5 = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.DFo87pBq1E5 = false;
                    return onTouchEvent;
                }
            } else if (this.DFo87pBq1E5) {
                this.riuEU0zW4.IHQe1A4L2xu();
                this.DFo87pBq1E5 = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.DFo87pBq1E5 = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // defpackage.i41
    public final defpackage.F7NU4MC0GW r1MBDhnF() {
        return (defpackage.F7NU4MC0GW) this.xiZrDbcSW0.AARZUJiTa;
    }

    public final void riuEU0zW4(defpackage.vz vzVar, defpackage.oo ooVar, defpackage.w90 w90Var) {
        int i;
        this.riuEU0zW4 = vzVar;
        this.SH1y5HwkJhh = ooVar;
        defpackage.j61 j61Var = ooVar.r1MBDhnF;
        int i2 = defpackage.a3.IHQe1A4L2xu;
        android.view.ViewGroup.LayoutParams layoutParams = this.ez2rX8ReCYw.getRootView().getLayoutParams();
        android.view.WindowManager.LayoutParams layoutParams2 = layoutParams instanceof android.view.WindowManager.LayoutParams ? (android.view.WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = j61Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = true;
            } else {
                if (ordinal != 2) {
                    defpackage.db.F7NU4MC0GW();
                    return;
                }
                z = false;
            }
        }
        android.view.Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int ordinal2 = w90Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                defpackage.db.F7NU4MC0GW();
                return;
            }
            i = 1;
        }
        defpackage.lo loVar = this.JlrlGoKF;
        loVar.setLayoutDirection(i);
        boolean z2 = ooVar.adDC3e2L;
        boolean z3 = ooVar.F7NU4MC0GW;
        android.view.Window window2 = loVar.SyNS6RMn;
        boolean z4 = (loVar.kd6TUFXn && z3 == loVar.QoRHpC4k && z2 == loVar.G3OKOH3wZRC) ? false : true;
        loVar.QoRHpC4k = z3;
        loVar.G3OKOH3wZRC = z2;
        if (z4) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z3 ? -2 : -1;
            if (i3 != attributes.width || !loVar.kd6TUFXn) {
                window2.setLayout(i3, -2);
                loVar.kd6TUFXn = true;
            }
        }
        setCanceledOnTouchOutside(ooVar.oh6vYeIP);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z2 ? 0 : android.os.Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view) {
        view.getClass();
        AARZUJiTa();
        super.setContentView(view);
    }

    public final defpackage.xd0 xiZrDbcSW0() {
        defpackage.xd0 xd0Var = this.adDC3e2L;
        if (xd0Var != null) {
            return xd0Var;
        }
        defpackage.xd0 xd0Var2 = new defpackage.xd0(this, true);
        this.adDC3e2L = xd0Var2;
        return xd0Var2;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        AARZUJiTa();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        AARZUJiTa();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
