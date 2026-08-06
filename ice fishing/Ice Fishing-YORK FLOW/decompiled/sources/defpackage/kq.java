package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kq extends android.app.Dialog implements defpackage.wg0, defpackage.mt0, defpackage.qq0, defpackage.b81 {
    public defpackage.iq GE9mJIPrb8gP;
    public final android.view.View Ns0WNyEWdPsk;
    public final defpackage.ti1 P05cfTpS5W5L;
    public final defpackage.ti1 QiMR8OkAhezm;
    public defpackage.zg0 WDYagTQQm9ns;
    public defpackage.n10 e6mdH7fiFuta;
    public final defpackage.fq fNwYGHIYeJcR;
    public boolean h3m55N1URyyK;
    public final defpackage.n80 oh71FJcDz6S2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(defpackage.n10 n10Var, defpackage.iq iqVar, android.view.View view, defpackage.sc0 sc0Var, defpackage.hp hpVar, java.util.UUID uuid) {
        super(new android.view.ContextThemeWrapper(view.getContext(), iqVar.WDYagTQQm9ns ? com.ice.fishing.wolberta.R.style.DialogWindowTheme : com.ice.fishing.wolberta.R.style.FloatingDialogWindowTheme), 0);
        final int i = 0;
        this.oh71FJcDz6S2 = new defpackage.n80(new defpackage.a81(this, new defpackage.l3(26, this)), 28);
        this.QiMR8OkAhezm = new defpackage.ti1(new defpackage.n10(this) { // from class: ih
            public final /* synthetic */ defpackage.kq oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                int i2 = i;
                defpackage.kq kqVar = this.oh71FJcDz6S2;
                switch (i2) {
                    case 0:
                        defpackage.lq lqVar = new defpackage.lq();
                        kqVar.ZpBGe2uQfcn8().JhCgjQRTAOCT(lqVar);
                        return lqVar;
                    default:
                        return new defpackage.lt0(new defpackage.gUjdnLbkVAaA(6, kqVar));
                }
            }
        });
        final int i2 = 1;
        this.P05cfTpS5W5L = new defpackage.ti1(new defpackage.n10(this) { // from class: ih
            public final /* synthetic */ defpackage.kq oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                int i22 = i2;
                defpackage.kq kqVar = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        defpackage.lq lqVar = new defpackage.lq();
                        kqVar.ZpBGe2uQfcn8().JhCgjQRTAOCT(lqVar);
                        return lqVar;
                    default:
                        return new defpackage.lt0(new defpackage.gUjdnLbkVAaA(6, kqVar));
                }
            }
        });
        this.e6mdH7fiFuta = n10Var;
        this.GE9mJIPrb8gP = iqVar;
        this.Ns0WNyEWdPsk = view;
        android.view.Window window = getWindow();
        if (window == null) {
            defpackage.h7.P05cfTpS5W5L("Dialog has no window");
            throw null;
        }
        defpackage.iq iqVar2 = this.GE9mJIPrb8gP;
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = iqVar2.QiMR8OkAhezm;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        defpackage.n70.qjMheFZ0l9kA(window, this.GE9mJIPrb8gP.WDYagTQQm9ns);
        window.setGravity(17);
        if (!this.GE9mJIPrb8gP.WDYagTQQm9ns) {
            window.addFlags(65792);
            android.view.WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                defpackage.p6.ZpBGe2uQfcn8.ZpBGe2uQfcn8(attributes2);
            }
            if (i3 >= 30) {
                defpackage.q6 q6Var = defpackage.q6.ZpBGe2uQfcn8;
                q6Var.giKS3J6vZuNy(attributes2, 0);
                q6Var.fWTAfUmVKrZq(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        defpackage.fq fqVar = new defpackage.fq(getContext(), window);
        setTitle(this.GE9mJIPrb8gP.oh71FJcDz6S2);
        fqVar.setTag(com.ice.fishing.wolberta.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        fqVar.setClipChildren(false);
        fqVar.setElevation(hpVar.dG7RjM6DqYVL(8.0f));
        fqVar.setOutlineProvider(new defpackage.jq(0));
        this.fNwYGHIYeJcR = fqVar;
        android.view.View decorView = window.getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            WDYagTQQm9ns(viewGroup);
        }
        setContentView(fqVar);
        fqVar.setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, defpackage.m90.BHfvd2J71qpO(view));
        fqVar.setTag(com.ice.fishing.wolberta.R.id.view_tree_view_model_store_owner, defpackage.w60.OcTWLQzke1i2(view));
        fqVar.setTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner, defpackage.wc1.Mearx7yMn90V(view));
        e6mdH7fiFuta(this.e6mdH7fiFuta, this.GE9mJIPrb8gP, sc0Var);
        defpackage.lt0 giKS3J6vZuNy = giKS3J6vZuNy();
        defpackage.z0 z0Var = new defpackage.z0(this, 1);
        giKS3J6vZuNy.getClass();
        defpackage.a9 a9Var = new defpackage.a9(z0Var);
        final defpackage.zg0 oh71FJcDz6S2 = oh71FJcDz6S2();
        if (oh71FJcDz6S2.P05cfTpS5W5L == defpackage.pg0.WDYagTQQm9ns) {
            return;
        }
        defpackage.ft0 ft0Var = new defpackage.ft0(a9Var, new defpackage.gt0(a9Var, this));
        a9Var.ZpBGe2uQfcn8.add(ft0Var);
        ft0Var.QiMR8OkAhezm(false);
        defpackage.s81.fWTAfUmVKrZq(giKS3J6vZuNy.ZpBGe2uQfcn8(), ft0Var);
        final defpackage.io ioVar = new defpackage.io(ft0Var, giKS3J6vZuNy, oh71FJcDz6S2);
        oh71FJcDz6S2.ZpBGe2uQfcn8(ioVar);
        a9Var.fWTAfUmVKrZq.add(new java.lang.AutoCloseable() { // from class: ht0
            @Override // java.lang.AutoCloseable
            public final void close() {
                defpackage.zg0.this.oh71FJcDz6S2(ioVar);
            }
        });
    }

    public static void JhCgjQRTAOCT(defpackage.kq kqVar) {
        super.onBackPressed();
    }

    public static final void WDYagTQQm9ns(android.view.ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof defpackage.fq) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                WDYagTQQm9ns(viewGroup2);
            }
        }
    }

    public final void P05cfTpS5W5L() {
        android.view.Window window = getWindow();
        window.getClass();
        android.view.View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, this);
        android.view.Window window2 = getWindow();
        window2.getClass();
        android.view.View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.ice.fishing.wolberta.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.Window window3 = getWindow();
        window3.getClass();
        android.view.View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner, this);
        android.view.Window window4 = getWindow();
        window4.getClass();
        android.view.View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(com.ice.fishing.wolberta.R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.wg0
    public final defpackage.zg0 QiMR8OkAhezm() {
        return oh71FJcDz6S2();
    }

    @Override // defpackage.qq0
    public final defpackage.s81 ZpBGe2uQfcn8() {
        return giKS3J6vZuNy().ZpBGe2uQfcn8();
    }

    @Override // android.app.Dialog
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        P05cfTpS5W5L();
        super.addContentView(view, layoutParams);
    }

    public final void e6mdH7fiFuta(defpackage.n10 n10Var, defpackage.iq iqVar, defpackage.sc0 sc0Var) {
        int i;
        this.e6mdH7fiFuta = n10Var;
        this.GE9mJIPrb8gP = iqVar;
        defpackage.z91 z91Var = iqVar.fWTAfUmVKrZq;
        boolean giKS3J6vZuNy = defpackage.h3.giKS3J6vZuNy(this.Ns0WNyEWdPsk);
        int ordinal = z91Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                giKS3J6vZuNy = true;
            } else {
                if (ordinal != 2) {
                    defpackage.h7.T1fB7bDYiVJQ();
                    return;
                }
                giKS3J6vZuNy = false;
            }
        }
        android.view.Window window = getWindow();
        window.getClass();
        window.setFlags(giKS3J6vZuNy ? 8192 : -8193, 8192);
        int ordinal2 = sc0Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
            i = 1;
        }
        defpackage.fq fqVar = this.fNwYGHIYeJcR;
        fqVar.setLayoutDirection(i);
        boolean z = iqVar.WDYagTQQm9ns;
        boolean z2 = iqVar.JhCgjQRTAOCT;
        android.view.Window window2 = fqVar.gUjdnLbkVAaA;
        boolean z3 = (fqVar.s0TASMVLSWD5 && z2 == fqVar.XntWc4eZSQ8j && z == fqVar.WmetiUbpKU9I) ? false : true;
        fqVar.XntWc4eZSQ8j = z2;
        fqVar.WmetiUbpKU9I = z;
        if (z3) {
            android.view.WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !fqVar.s0TASMVLSWD5) {
                window2.setLayout(i2, -2);
                fqVar.s0TASMVLSWD5 = true;
            }
        }
        setCanceledOnTouchOutside(iqVar.giKS3J6vZuNy);
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : android.os.Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // defpackage.b81
    public final defpackage.n80 fWTAfUmVKrZq() {
        return (defpackage.n80) this.oh71FJcDz6S2.QiMR8OkAhezm;
    }

    @Override // defpackage.mt0
    public final defpackage.lt0 giKS3J6vZuNy() {
        return (defpackage.lt0) this.P05cfTpS5W5L.getValue();
    }

    public final defpackage.zg0 oh71FJcDz6S2() {
        defpackage.zg0 zg0Var = this.WDYagTQQm9ns;
        if (zg0Var != null) {
            return zg0Var;
        }
        defpackage.zg0 zg0Var2 = new defpackage.zg0(this, true);
        this.WDYagTQQm9ns = zg0Var2;
        return zg0Var2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((defpackage.lq) this.QiMR8OkAhezm.getValue()).ZpBGe2uQfcn8();
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.lt0 giKS3J6vZuNy = giKS3J6vZuNy();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            giKS3J6vZuNy.giKS3J6vZuNy(onBackInvokedDispatcher);
        }
        this.oh71FJcDz6S2.dG7RjM6DqYVL(bundle);
        oh71FJcDz6S2().JhCgjQRTAOCT(defpackage.og0.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (!this.GE9mJIPrb8gP.ZpBGe2uQfcn8 || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.e6mdH7fiFuta.ZpBGe2uQfcn8();
        return true;
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
        android.os.Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.oh71FJcDz6S2.OcTWLQzke1i2(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        oh71FJcDz6S2().JhCgjQRTAOCT(defpackage.og0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        oh71FJcDz6S2().JhCgjQRTAOCT(defpackage.og0.ON_DESTROY);
        this.WDYagTQQm9ns = null;
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
        if (this.GE9mJIPrb8gP.giKS3J6vZuNy) {
            defpackage.fq fqVar = this.fNwYGHIYeJcR;
            fqVar.getClass();
            if (java.lang.Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && java.lang.Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = fqVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + fqVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + fqVar.getTop();
                int height = childAt.getHeight() + top;
                int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(motionEvent.getX());
                if (left <= CZa7MwI9IzLd) {
                    if (CZa7MwI9IzLd <= width) {
                        int CZa7MwI9IzLd2 = defpackage.ok0.CZa7MwI9IzLd(motionEvent.getY());
                        if (top <= CZa7MwI9IzLd2) {
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.h3m55N1URyyK = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.h3m55N1URyyK = false;
                    return onTouchEvent;
                }
            } else if (this.h3m55N1URyyK) {
                this.e6mdH7fiFuta.ZpBGe2uQfcn8();
                this.h3m55N1URyyK = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.h3m55N1URyyK = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view) {
        view.getClass();
        P05cfTpS5W5L();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(int i) {
        P05cfTpS5W5L();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        P05cfTpS5W5L();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
