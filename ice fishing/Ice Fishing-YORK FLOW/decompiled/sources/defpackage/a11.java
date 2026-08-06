package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class a11 extends defpackage.XntWc4eZSQ8j {
    public final defpackage.hu BHfvd2J71qpO;
    public defpackage.sc0 IJ0hOnjhPOri;
    public boolean Mearx7yMn90V;
    public final defpackage.qp OcTWLQzke1i2;
    public defpackage.e11 T1fB7bDYiVJQ;
    public final defpackage.hf1 UmgHb6n58gfG;
    public final defpackage.pw0 VFeft99leXEK;
    public final android.view.View WmetiUbpKU9I;
    public java.lang.String XntWc4eZSQ8j;
    public final android.view.WindowManager ZVVdXbWmyCSK;
    public final android.graphics.Rect blKFvluuDQOf;
    public defpackage.q90 dG7RjM6DqYVL;
    public final int[] frSwwKIlbUhK;
    public defpackage.n10 gUjdnLbkVAaA;
    public final defpackage.pw0 jjTN4uUnoyEn;
    public defpackage.d11 maCixPsq4ml2;
    public final defpackage.pw0 oCu53ZX2v4Ju;
    public defpackage.t6 qjMheFZ0l9kA;
    public final boolean s0TASMVLSWD5;
    public final android.view.WindowManager.LayoutParams w7APNrr0aGRc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(defpackage.n10 n10Var, defpackage.e11 e11Var, java.lang.String str, android.view.View view, defpackage.hp hpVar, defpackage.d11 d11Var, java.util.UUID uuid, boolean z) {
        super(view.getContext());
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = 29;
        defpackage.hu c11Var = i >= 30 ? new defpackage.c11(i2) : i >= 29 ? new defpackage.b11(i2) : new defpackage.hu(i2);
        this.gUjdnLbkVAaA = n10Var;
        this.T1fB7bDYiVJQ = e11Var;
        this.XntWc4eZSQ8j = str;
        this.WmetiUbpKU9I = view;
        this.s0TASMVLSWD5 = z;
        this.BHfvd2J71qpO = c11Var;
        java.lang.Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.ZVVdXbWmyCSK = (android.view.WindowManager) systemService;
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        defpackage.e11 e11Var2 = this.T1fB7bDYiVJQ;
        boolean giKS3J6vZuNy = defpackage.h3.giKS3J6vZuNy(view);
        boolean z2 = e11Var2.giKS3J6vZuNy;
        int i3 = e11Var2.ZpBGe2uQfcn8;
        if (z2 && giKS3J6vZuNy) {
            i3 |= 8192;
        } else if (z2 && !giKS3J6vZuNy) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.T1fB7bDYiVJQ.oh71FJcDz6S2;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(com.ice.fishing.wolberta.R.string.default_popup_window_title));
        this.w7APNrr0aGRc = layoutParams;
        this.maCixPsq4ml2 = d11Var;
        this.IJ0hOnjhPOri = defpackage.sc0.WDYagTQQm9ns;
        this.VFeft99leXEK = defpackage.w60.hH0RRJrNssvh(null);
        this.oCu53ZX2v4Ju = defpackage.w60.hH0RRJrNssvh(null);
        this.OcTWLQzke1i2 = defpackage.w60.WmetiUbpKU9I(new defpackage.w2(11, this));
        this.blKFvluuDQOf = new android.graphics.Rect();
        this.UmgHb6n58gfG = new defpackage.hf1(new defpackage.d3(this, 2));
        setId(android.R.id.content);
        setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, defpackage.m90.BHfvd2J71qpO(view));
        setTag(com.ice.fishing.wolberta.R.id.view_tree_view_model_store_owner, defpackage.w60.OcTWLQzke1i2(view));
        setTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner, defpackage.wc1.Mearx7yMn90V(view));
        setTag(com.ice.fishing.wolberta.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(hpVar.dG7RjM6DqYVL(8.0f));
        setOutlineProvider(new defpackage.jq(1));
        this.jjTN4uUnoyEn = defpackage.w60.hH0RRJrNssvh(defpackage.ph.ZpBGe2uQfcn8);
        this.frSwwKIlbUhK = new int[2];
    }

    private final defpackage.c20 getContent() {
        return (defpackage.c20) this.jjTN4uUnoyEn.getValue();
    }

    private final defpackage.q90 getDisplayBounds() {
        int i = this.T1fB7bDYiVJQ.ZpBGe2uQfcn8 & 512;
        android.view.View view = this.WmetiUbpKU9I;
        android.graphics.Rect rect = this.blKFvluuDQOf;
        defpackage.hu huVar = this.BHfvd2J71qpO;
        if (i == 0) {
            huVar.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            huVar.gUjdnLbkVAaA(view, rect);
        }
        return new defpackage.q90(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final defpackage.rc0 getParentLayoutCoordinates() {
        return (defpackage.rc0) this.oCu53ZX2v4Ju.getValue();
    }

    private final void setContent(defpackage.c20 c20Var) {
        this.jjTN4uUnoyEn.setValue(c20Var);
    }

    private final void setParentLayoutCoordinates(defpackage.rc0 rc0Var) {
        this.oCu53ZX2v4Ju.setValue(rc0Var);
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void P05cfTpS5W5L(boolean z, int i, int i2, int i3, int i4) {
        super.P05cfTpS5W5L(z, i, i2, i3, i4);
        this.T1fB7bDYiVJQ.getClass();
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        android.view.WindowManager.LayoutParams layoutParams = this.w7APNrr0aGRc;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.BHfvd2J71qpO.getClass();
        this.ZVVdXbWmyCSK.updateViewLayout(this, layoutParams);
    }

    public final void T1fB7bDYiVJQ(defpackage.n10 n10Var, defpackage.e11 e11Var, java.lang.String str, defpackage.sc0 sc0Var) {
        int i;
        this.gUjdnLbkVAaA = n10Var;
        this.XntWc4eZSQ8j = str;
        if (!defpackage.ma0.QiMR8OkAhezm(this.T1fB7bDYiVJQ, e11Var)) {
            e11Var.getClass();
            this.T1fB7bDYiVJQ = e11Var;
            boolean giKS3J6vZuNy = defpackage.h3.giKS3J6vZuNy(this.WmetiUbpKU9I);
            boolean z = e11Var.giKS3J6vZuNy;
            int i2 = e11Var.ZpBGe2uQfcn8;
            if (z && giKS3J6vZuNy) {
                i2 |= 8192;
            } else if (z && !giKS3J6vZuNy) {
                i2 &= -8193;
            }
            android.view.WindowManager.LayoutParams layoutParams = this.w7APNrr0aGRc;
            layoutParams.flags = i2;
            this.BHfvd2J71qpO.getClass();
            this.ZVVdXbWmyCSK.updateViewLayout(this, layoutParams);
        }
        int ordinal = sc0Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                defpackage.h7.T1fB7bDYiVJQ();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    public final void WmetiUbpKU9I(defpackage.rc0 rc0Var) {
        setParentLayoutCoordinates(rc0Var);
        XntWc4eZSQ8j();
    }

    public final void XntWc4eZSQ8j() {
        defpackage.rc0 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.blKFvluuDQOf()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long GcLuU6pT9wO9 = parentLayoutCoordinates.GcLuU6pT9wO9();
            long fWTAfUmVKrZq = this.s0TASMVLSWD5 ? parentLayoutCoordinates.fWTAfUmVKrZq(0L) : parentLayoutCoordinates.e6mdH7fiFuta(0L);
            defpackage.q90 giKS3J6vZuNy = defpackage.wc1.giKS3J6vZuNy((java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq >> 32))) << 32) | (4294967295L & java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (fWTAfUmVKrZq & 4294967295L)))), GcLuU6pT9wO9);
            if (giKS3J6vZuNy.equals(this.dG7RjM6DqYVL)) {
                return;
            }
            this.dG7RjM6DqYVL = giKS3J6vZuNy;
            s0TASMVLSWD5();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!this.T1fB7bDYiVJQ.fWTAfUmVKrZq) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                defpackage.n10 n10Var = this.gUjdnLbkVAaA;
                if (n10Var != null) {
                    n10Var.ZpBGe2uQfcn8();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void e6mdH7fiFuta(int i, int i2) {
        this.T1fB7bDYiVJQ.getClass();
        defpackage.q90 displayBounds = getDisplayBounds();
        super.e6mdH7fiFuta(android.view.View.MeasureSpec.makeMeasureSpec(displayBounds.fWTAfUmVKrZq(), Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(displayBounds.giKS3J6vZuNy(), Integer.MIN_VALUE));
    }

    public final void gUjdnLbkVAaA(defpackage.gj gjVar, defpackage.c20 c20Var) {
        setParentCompositionContext(gjVar);
        setContent(c20Var);
        this.Mearx7yMn90V = true;
    }

    public final boolean getCanCalculatePosition() {
        return ((java.lang.Boolean) this.OcTWLQzke1i2.getValue()).booleanValue();
    }

    public final android.view.WindowManager.LayoutParams getParams$ui() {
        return this.w7APNrr0aGRc;
    }

    public final defpackage.sc0 getParentLayoutDirection() {
        return this.IJ0hOnjhPOri;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final defpackage.u90 m2getPopupContentSizebOM6tXw() {
        return (defpackage.u90) this.VFeft99leXEK.getValue();
    }

    public final defpackage.d11 getPositionProvider() {
        return this.maCixPsq4ml2;
    }

    @Override // defpackage.XntWc4eZSQ8j
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.Mearx7yMn90V;
    }

    public final java.lang.String getTestTag() {
        return this.XntWc4eZSQ8j;
    }

    public /* bridge */ /* synthetic */ android.view.View getViewRoot() {
        return null;
    }

    @Override // defpackage.XntWc4eZSQ8j
    public final void giKS3J6vZuNy(int i, defpackage.e30 e30Var) {
        e30Var.PS16moFv2oLu(-857613600);
        int i2 = (e30Var.P05cfTpS5W5L(this) ? 4 : 2) | i;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            getContent().QiMR8OkAhezm(e30Var, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.T1fB7bDYiVJQ(this, i, 7);
        }
    }

    @Override // defpackage.XntWc4eZSQ8j, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.UmgHb6n58gfG.WDYagTQQm9ns();
        if (!this.T1fB7bDYiVJQ.fWTAfUmVKrZq || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.qjMheFZ0l9kA == null) {
            this.qjMheFZ0l9kA = new defpackage.t6(0, this.gUjdnLbkVAaA);
        }
        defpackage.hwoZxnIesQBZ.oh71FJcDz6S2(this, this.qjMheFZ0l9kA);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.hf1 hf1Var = this.UmgHb6n58gfG;
        defpackage.it0 it0Var = hf1Var.P05cfTpS5W5L;
        if (it0Var != null) {
            it0Var.ZpBGe2uQfcn8();
        }
        hf1Var.ZpBGe2uQfcn8();
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            defpackage.hwoZxnIesQBZ.QiMR8OkAhezm(this, this.qjMheFZ0l9kA);
        }
        this.qjMheFZ0l9kA = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.T1fB7bDYiVJQ.JhCgjQRTAOCT) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            defpackage.n10 n10Var = this.gUjdnLbkVAaA;
            if (n10Var != null) {
                n10Var.ZpBGe2uQfcn8();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            defpackage.n10 n10Var2 = this.gUjdnLbkVAaA;
            if (n10Var2 != null) {
                n10Var2.ZpBGe2uQfcn8();
            }
        }
        return true;
    }

    public final void s0TASMVLSWD5() {
        defpackage.u90 m2getPopupContentSizebOM6tXw;
        defpackage.q90 q90Var = this.dG7RjM6DqYVL;
        if (q90Var == null || (m2getPopupContentSizebOM6tXw = m2getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m2getPopupContentSizebOM6tXw.ZpBGe2uQfcn8;
        defpackage.q90 displayBounds = getDisplayBounds();
        long giKS3J6vZuNy = (displayBounds.giKS3J6vZuNy() & 4294967295L) | (displayBounds.fWTAfUmVKrZq() << 32);
        defpackage.y31 y31Var = new defpackage.y31();
        y31Var.WDYagTQQm9ns = 0L;
        this.UmgHb6n58gfG.JhCgjQRTAOCT(this, defpackage.qv0.fNwYGHIYeJcR, new defpackage.z01(y31Var, this, q90Var, giKS3J6vZuNy, j));
        long j2 = y31Var.WDYagTQQm9ns;
        android.view.WindowManager.LayoutParams layoutParams = this.w7APNrr0aGRc;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.T1fB7bDYiVJQ.WDYagTQQm9ns;
        defpackage.hu huVar = this.BHfvd2J71qpO;
        if (z) {
            huVar.XntWc4eZSQ8j(this, (int) (giKS3J6vZuNy >> 32), (int) (giKS3J6vZuNy & 4294967295L));
        }
        huVar.getClass();
        this.ZVVdXbWmyCSK.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(defpackage.sc0 sc0Var) {
        this.IJ0hOnjhPOri = sc0Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m3setPopupContentSizefhxjrPA(defpackage.u90 u90Var) {
        this.VFeft99leXEK.setValue(u90Var);
    }

    public final void setPositionProvider(defpackage.d11 d11Var) {
        this.maCixPsq4ml2 = d11Var;
    }

    public final void setTestTag(java.lang.String str) {
        this.XntWc4eZSQ8j = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public defpackage.XntWc4eZSQ8j getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
