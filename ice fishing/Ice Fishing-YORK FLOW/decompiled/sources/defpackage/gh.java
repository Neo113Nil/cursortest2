package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class gh extends defpackage.fh implements defpackage.ru1, defpackage.y40, defpackage.b81, defpackage.mt0, defpackage.qq0 {
    public final java.util.concurrent.CopyOnWriteArrayList BHfvd2J71qpO;
    public final defpackage.dh GE9mJIPrb8gP;
    public final defpackage.ti1 IJ0hOnjhPOri;
    public final defpackage.ti1 Ns0WNyEWdPsk;
    public final defpackage.n80 P05cfTpS5W5L;
    public final defpackage.k0 QiMR8OkAhezm;
    public final java.util.concurrent.CopyOnWriteArrayList T1fB7bDYiVJQ;
    public final java.util.concurrent.CopyOnWriteArrayList WmetiUbpKU9I;
    public final java.util.concurrent.CopyOnWriteArrayList XntWc4eZSQ8j;
    public boolean ZVVdXbWmyCSK;
    public defpackage.qu1 e6mdH7fiFuta;
    public final defpackage.eh fNwYGHIYeJcR;
    public final java.util.concurrent.CopyOnWriteArrayList gUjdnLbkVAaA;
    public final java.util.concurrent.CopyOnWriteArrayList h3m55N1URyyK;
    public final defpackage.ti1 maCixPsq4ml2;
    public final defpackage.bl oh71FJcDz6S2;
    public final java.util.concurrent.CopyOnWriteArrayList s0TASMVLSWD5;
    public boolean w7APNrr0aGRc;

    public gh() {
        defpackage.bl blVar = new defpackage.bl();
        this.oh71FJcDz6S2 = blVar;
        final int i = 0;
        this.QiMR8OkAhezm = new defpackage.k0(13, (byte) 0);
        defpackage.a81 a81Var = new defpackage.a81(this, new defpackage.l3(26, this));
        defpackage.n80 n80Var = new defpackage.n80(a81Var, 28);
        this.P05cfTpS5W5L = n80Var;
        this.GE9mJIPrb8gP = new defpackage.dh(this);
        final int i2 = 1;
        this.Ns0WNyEWdPsk = new defpackage.ti1(new defpackage.xg(this, i2));
        new java.util.concurrent.atomic.AtomicInteger();
        this.fNwYGHIYeJcR = new defpackage.eh();
        this.h3m55N1URyyK = new java.util.concurrent.CopyOnWriteArrayList();
        this.gUjdnLbkVAaA = new java.util.concurrent.CopyOnWriteArrayList();
        this.T1fB7bDYiVJQ = new java.util.concurrent.CopyOnWriteArrayList();
        this.XntWc4eZSQ8j = new java.util.concurrent.CopyOnWriteArrayList();
        this.WmetiUbpKU9I = new java.util.concurrent.CopyOnWriteArrayList();
        this.s0TASMVLSWD5 = new java.util.concurrent.CopyOnWriteArrayList();
        this.BHfvd2J71qpO = new java.util.concurrent.CopyOnWriteArrayList();
        this.maCixPsq4ml2 = new defpackage.ti1(new defpackage.xg(this, 2));
        defpackage.zg0 zg0Var = this.WDYagTQQm9ns;
        if (zg0Var == null) {
            defpackage.h7.P05cfTpS5W5L("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        zg0Var.ZpBGe2uQfcn8(new defpackage.ug0(this) { // from class: zg
            public final /* synthetic */ defpackage.gh oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.ug0
            public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
                android.view.Window window;
                android.view.View peekDecorView;
                int i3 = i;
                defpackage.gh ghVar = this.oh71FJcDz6S2;
                switch (i3) {
                    case 0:
                        if (og0Var == defpackage.og0.ON_STOP && (window = ghVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (og0Var == defpackage.og0.ON_DESTROY) {
                            ghVar.oh71FJcDz6S2.giKS3J6vZuNy = null;
                            if (!ghVar.isChangingConfigurations()) {
                                ghVar.WDYagTQQm9ns().ZpBGe2uQfcn8();
                            }
                            defpackage.dh dhVar = ghVar.GE9mJIPrb8gP;
                            defpackage.gh ghVar2 = dhVar.P05cfTpS5W5L;
                            ghVar2.getWindow().getDecorView().removeCallbacks(dhVar);
                            ghVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(dhVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(new defpackage.ug0(this) { // from class: zg
            public final /* synthetic */ defpackage.gh oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.ug0
            public final void e6mdH7fiFuta(defpackage.wg0 wg0Var, defpackage.og0 og0Var) {
                android.view.Window window;
                android.view.View peekDecorView;
                int i3 = i2;
                defpackage.gh ghVar = this.oh71FJcDz6S2;
                switch (i3) {
                    case 0:
                        if (og0Var == defpackage.og0.ON_STOP && (window = ghVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (og0Var == defpackage.og0.ON_DESTROY) {
                            ghVar.oh71FJcDz6S2.giKS3J6vZuNy = null;
                            if (!ghVar.isChangingConfigurations()) {
                                ghVar.WDYagTQQm9ns().ZpBGe2uQfcn8();
                            }
                            defpackage.dh dhVar = ghVar.GE9mJIPrb8gP;
                            defpackage.gh ghVar2 = dhVar.P05cfTpS5W5L;
                            ghVar2.getWindow().getDecorView().removeCallbacks(dhVar);
                            ghVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(dhVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.WDYagTQQm9ns.ZpBGe2uQfcn8(new defpackage.r31(i2, this));
        a81Var.ZpBGe2uQfcn8();
        defpackage.ok0.OcTWLQzke1i2(this);
        ((defpackage.n80) n80Var.QiMR8OkAhezm).blKFvluuDQOf("android:support:activity-result", new defpackage.ah(i, this));
        defpackage.bh bhVar = new defpackage.bh(this);
        defpackage.gh ghVar = blVar.giKS3J6vZuNy;
        if (ghVar != null) {
            bhVar.ZpBGe2uQfcn8(ghVar);
        }
        blVar.ZpBGe2uQfcn8.add(bhVar);
        new defpackage.ti1(new defpackage.xg(this, 3));
        this.IJ0hOnjhPOri = new defpackage.ti1(new defpackage.xg(this, 4));
    }

    public static void oh71FJcDz6S2(defpackage.gh ghVar) {
        try {
            super.onBackPressed();
        } catch (java.lang.IllegalStateException e) {
            if (!defpackage.ma0.QiMR8OkAhezm(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (java.lang.NullPointerException e2) {
            if (!defpackage.ma0.QiMR8OkAhezm(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.y40
    public final defpackage.dn0 JhCgjQRTAOCT() {
        defpackage.dn0 dn0Var = new defpackage.dn0();
        android.app.Application application = getApplication();
        java.util.LinkedHashMap linkedHashMap = dn0Var.ZpBGe2uQfcn8;
        if (application != null) {
            linkedHashMap.put(defpackage.lu1.JhCgjQRTAOCT, getApplication());
        }
        linkedHashMap.put(defpackage.ok0.P05cfTpS5W5L, this);
        linkedHashMap.put(defpackage.ok0.e6mdH7fiFuta, this);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(defpackage.ok0.GE9mJIPrb8gP, extras);
        }
        return dn0Var;
    }

    public final void P05cfTpS5W5L() {
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner, this);
        android.view.View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.ice.fishing.wolberta.R.id.view_tree_view_model_store_owner, this);
        android.view.View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(com.ice.fishing.wolberta.R.id.view_tree_saved_state_registry_owner, this);
        android.view.View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(com.ice.fishing.wolberta.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(com.ice.fishing.wolberta.R.id.report_drawn, this);
        android.view.View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(com.ice.fishing.wolberta.R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.wg0
    public final defpackage.zg0 QiMR8OkAhezm() {
        return this.WDYagTQQm9ns;
    }

    @Override // defpackage.ru1
    public final defpackage.qu1 WDYagTQQm9ns() {
        if (getApplication() == null) {
            defpackage.h7.P05cfTpS5W5L("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.e6mdH7fiFuta == null) {
            defpackage.ch chVar = (defpackage.ch) getLastNonConfigurationInstance();
            if (chVar != null) {
                this.e6mdH7fiFuta = chVar.ZpBGe2uQfcn8;
            }
            if (this.e6mdH7fiFuta == null) {
                this.e6mdH7fiFuta = new defpackage.qu1();
            }
        }
        defpackage.qu1 qu1Var = this.e6mdH7fiFuta;
        qu1Var.getClass();
        return qu1Var;
    }

    @Override // defpackage.qq0
    public final defpackage.s81 ZpBGe2uQfcn8() {
        return giKS3J6vZuNy().ZpBGe2uQfcn8();
    }

    @Override // android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        P05cfTpS5W5L();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.b81
    public final defpackage.n80 fWTAfUmVKrZq() {
        return (defpackage.n80) this.P05cfTpS5W5L.QiMR8OkAhezm;
    }

    @Override // defpackage.mt0
    public final defpackage.lt0 giKS3J6vZuNy() {
        return (defpackage.lt0) this.IJ0hOnjhPOri.getValue();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.fNwYGHIYeJcR.ZpBGe2uQfcn8(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((defpackage.lq) this.maCixPsq4ml2.getValue()).ZpBGe2uQfcn8();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.h3m55N1URyyK.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(configuration);
        }
    }

    @Override // defpackage.fh, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.P05cfTpS5W5L.dG7RjM6DqYVL(bundle);
        defpackage.bl blVar = this.oh71FJcDz6S2;
        blVar.getClass();
        blVar.giKS3J6vZuNy = this;
        java.util.Iterator it = blVar.ZpBGe2uQfcn8.iterator();
        while (it.hasNext()) {
            ((defpackage.bh) it.next()).ZpBGe2uQfcn8(this);
        }
        super.onCreate(bundle);
        int i = defpackage.t41.oh71FJcDz6S2;
        defpackage.r41.giKS3J6vZuNy(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.QiMR8OkAhezm.oh71FJcDz6S2).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        defpackage.p81.ZpBGe2uQfcn8();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.QiMR8OkAhezm.oh71FJcDz6S2).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                defpackage.p81.ZpBGe2uQfcn8();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.ZVVdXbWmyCSK = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.ZVVdXbWmyCSK = false;
            java.util.Iterator it = this.XntWc4eZSQ8j.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.h00) it.next()).ZpBGe2uQfcn8(new defpackage.hu(18));
            }
        } catch (java.lang.Throwable th) {
            this.ZVVdXbWmyCSK = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        java.util.Iterator it = this.T1fB7bDYiVJQ.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        menu.getClass();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.QiMR8OkAhezm.oh71FJcDz6S2).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            defpackage.p81.ZpBGe2uQfcn8();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.w7APNrr0aGRc = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.w7APNrr0aGRc = false;
            java.util.Iterator it = this.WmetiUbpKU9I.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.h00) it.next()).ZpBGe2uQfcn8(new defpackage.hu(24));
            }
        } catch (java.lang.Throwable th) {
            this.w7APNrr0aGRc = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        defpackage.hu huVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = 25;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            huVar = new defpackage.hu(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            huVar = new defpackage.hu(i2);
        } else {
            huVar = new defpackage.hu(i2);
        }
        java.util.Iterator it = this.s0TASMVLSWD5.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(huVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.QiMR8OkAhezm.oh71FJcDz6S2).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        defpackage.p81.ZpBGe2uQfcn8();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.fNwYGHIYeJcR.ZpBGe2uQfcn8(i, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        defpackage.ch chVar;
        defpackage.qu1 qu1Var = this.e6mdH7fiFuta;
        if (qu1Var == null && (chVar = (defpackage.ch) getLastNonConfigurationInstance()) != null) {
            qu1Var = chVar.ZpBGe2uQfcn8;
        }
        if (qu1Var == null) {
            return null;
        }
        defpackage.ch chVar2 = new defpackage.ch();
        chVar2.ZpBGe2uQfcn8 = qu1Var;
        return chVar2;
    }

    @Override // defpackage.fh, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.zg0 zg0Var = this.WDYagTQQm9ns;
        if (zg0Var != null) {
            zg0Var.fWTAfUmVKrZq("setCurrentState");
            zg0Var.WDYagTQQm9ns(defpackage.pg0.QiMR8OkAhezm);
        }
        super.onSaveInstanceState(bundle);
        this.P05cfTpS5W5L.OcTWLQzke1i2(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator it = this.gUjdnLbkVAaA.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.BHfvd2J71qpO.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (defpackage.v70.OcTWLQzke1i2()) {
                defpackage.v70.Ns0WNyEWdPsk("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            defpackage.m10 m10Var = (defpackage.m10) this.Ns0WNyEWdPsk.getValue();
            synchronized (m10Var.ZpBGe2uQfcn8) {
                try {
                    m10Var.giKS3J6vZuNy = true;
                    java.util.ArrayList arrayList = m10Var.fWTAfUmVKrZq;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        i++;
                        ((defpackage.n10) obj).ZpBGe2uQfcn8();
                    }
                    m10Var.fWTAfUmVKrZq.clear();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        P05cfTpS5W5L();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        P05cfTpS5W5L();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        P05cfTpS5W5L();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.GE9mJIPrb8gP.ZpBGe2uQfcn8(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.ZVVdXbWmyCSK) {
            return;
        }
        java.util.Iterator it = this.XntWc4eZSQ8j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(new defpackage.hu(18));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.w7APNrr0aGRc) {
            return;
        }
        java.util.Iterator it = this.WmetiUbpKU9I.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.h00) it.next()).ZpBGe2uQfcn8(new defpackage.hu(24));
        }
    }
}
