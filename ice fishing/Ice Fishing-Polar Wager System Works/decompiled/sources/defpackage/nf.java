package defpackage;

/* loaded from: classes.dex */
public abstract class nf extends defpackage.mf implements defpackage.cn1, defpackage.h30, defpackage.i41, defpackage.uq0, defpackage.go0 {
    public final defpackage.c1NqjJifC7 AARZUJiTa;
    public final java.util.concurrent.CopyOnWriteArrayList DFo87pBq1E5;
    public final defpackage.F7NU4MC0GW EXtogiMhuM;
    public final java.util.concurrent.CopyOnWriteArrayList EgCjBq0SZwJ;
    public final java.util.concurrent.CopyOnWriteArrayList G3OKOH3wZRC;
    public final defpackage.lf JlrlGoKF;
    public final defpackage.le1 PAEGRtP0bX;
    public final java.util.concurrent.CopyOnWriteArrayList QoRHpC4k;
    public final defpackage.kf SH1y5HwkJhh;
    public final java.util.concurrent.CopyOnWriteArrayList SyNS6RMn;
    public final defpackage.le1 V7bD7b8KA;
    public final defpackage.le1 abhbClRa;
    public final java.util.concurrent.CopyOnWriteArrayList cnag84Bm;
    public final defpackage.le1 ez2rX8ReCYw;
    public boolean fnWB2E7cs;
    public boolean kNAkVymC;
    public final java.util.concurrent.CopyOnWriteArrayList kd6TUFXn;
    public defpackage.bn1 riuEU0zW4;
    public final defpackage.cj xiZrDbcSW0;

    public nf() {
        defpackage.cj cjVar = new defpackage.cj();
        this.xiZrDbcSW0 = cjVar;
        final com.corsair.ledger.MainActivity mainActivity = (com.corsair.ledger.MainActivity) this;
        this.AARZUJiTa = new defpackage.c1NqjJifC7(19);
        defpackage.h41 h41Var = new defpackage.h41(this, new defpackage.e3(16, this));
        defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(h41Var);
        this.EXtogiMhuM = f7nu4mc0gw;
        this.SH1y5HwkJhh = new defpackage.kf(mainActivity);
        final int i = 1;
        this.ez2rX8ReCYw = new defpackage.le1(new defpackage.df(mainActivity, i));
        new java.util.concurrent.atomic.AtomicInteger();
        this.JlrlGoKF = new defpackage.lf();
        this.DFo87pBq1E5 = new java.util.concurrent.CopyOnWriteArrayList();
        this.SyNS6RMn = new java.util.concurrent.CopyOnWriteArrayList();
        this.cnag84Bm = new java.util.concurrent.CopyOnWriteArrayList();
        this.QoRHpC4k = new java.util.concurrent.CopyOnWriteArrayList();
        this.G3OKOH3wZRC = new java.util.concurrent.CopyOnWriteArrayList();
        this.kd6TUFXn = new java.util.concurrent.CopyOnWriteArrayList();
        this.EgCjBq0SZwJ = new java.util.concurrent.CopyOnWriteArrayList();
        this.V7bD7b8KA = new defpackage.le1(new defpackage.df(mainActivity, 2));
        defpackage.xd0 xd0Var = this.adDC3e2L;
        if (xd0Var == null) {
            defpackage.db.AARZUJiTa("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        xd0Var.IHQe1A4L2xu(new defpackage.sd0() { // from class: ff
            @Override // defpackage.sd0
            public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
                android.view.Window window;
                android.view.View peekDecorView;
                int i3 = i2;
                com.corsair.ledger.MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (md0Var == defpackage.md0.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (md0Var == defpackage.md0.ON_DESTROY) {
                            mainActivity2.xiZrDbcSW0.oh6vYeIP = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.AARZUJiTa().IHQe1A4L2xu();
                            }
                            defpackage.kf kfVar = mainActivity2.SH1y5HwkJhh;
                            com.corsair.ledger.MainActivity mainActivity3 = kfVar.EXtogiMhuM;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(kfVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kfVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.adDC3e2L.IHQe1A4L2xu(new defpackage.sd0() { // from class: ff
            @Override // defpackage.sd0
            public final void riuEU0zW4(defpackage.ud0 ud0Var, defpackage.md0 md0Var) {
                android.view.Window window;
                android.view.View peekDecorView;
                int i3 = i;
                com.corsair.ledger.MainActivity mainActivity2 = mainActivity;
                switch (i3) {
                    case 0:
                        if (md0Var == defpackage.md0.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (md0Var == defpackage.md0.ON_DESTROY) {
                            mainActivity2.xiZrDbcSW0.oh6vYeIP = null;
                            if (!mainActivity2.isChangingConfigurations()) {
                                mainActivity2.AARZUJiTa().IHQe1A4L2xu();
                            }
                            defpackage.kf kfVar = mainActivity2.SH1y5HwkJhh;
                            com.corsair.ledger.MainActivity mainActivity3 = kfVar.EXtogiMhuM;
                            mainActivity3.getWindow().getDecorView().removeCallbacks(kfVar);
                            mainActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kfVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.adDC3e2L.IHQe1A4L2xu(new defpackage.jz0(i, mainActivity));
        h41Var.IHQe1A4L2xu();
        defpackage.w70.fnWB2E7cs(this);
        ((defpackage.F7NU4MC0GW) f7nu4mc0gw.AARZUJiTa).NHJTzaLwkd("android:support:activity-result", new defpackage.gf(i2, mainActivity));
        defpackage.vq0 vq0Var = new defpackage.vq0() { // from class: hf
            @Override // defpackage.vq0
            public final void IHQe1A4L2xu(defpackage.nf nfVar) {
                nfVar.getClass();
                com.corsair.ledger.MainActivity mainActivity2 = com.corsair.ledger.MainActivity.this;
                android.os.Bundle cnag84Bm = ((defpackage.F7NU4MC0GW) mainActivity2.EXtogiMhuM.AARZUJiTa).cnag84Bm("android:support:activity-result");
                if (cnag84Bm != null) {
                    defpackage.lf lfVar = mainActivity2.JlrlGoKF;
                    java.util.LinkedHashMap linkedHashMap = lfVar.IHQe1A4L2xu;
                    android.os.Bundle bundle = lfVar.xiZrDbcSW0;
                    java.util.LinkedHashMap linkedHashMap2 = lfVar.oh6vYeIP;
                    java.util.ArrayList<java.lang.Integer> integerArrayList = cnag84Bm.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    java.util.ArrayList<java.lang.String> stringArrayList = cnag84Bm.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    java.util.ArrayList<java.lang.String> stringArrayList2 = cnag84Bm.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        lfVar.r1MBDhnF.addAll(stringArrayList2);
                    }
                    android.os.Bundle bundle2 = cnag84Bm.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        java.lang.String str = stringArrayList.get(i3);
                        if (linkedHashMap2.containsKey(str)) {
                            java.lang.Integer num = (java.lang.Integer) linkedHashMap2.remove(str);
                            if (!bundle.containsKey(str)) {
                                defpackage.mj1.fnWB2E7cs(linkedHashMap).remove(num);
                            }
                        }
                        java.lang.Integer num2 = integerArrayList.get(i3);
                        num2.getClass();
                        int intValue = num2.intValue();
                        java.lang.String str2 = stringArrayList.get(i3);
                        str2.getClass();
                        java.lang.String str3 = str2;
                        linkedHashMap.put(java.lang.Integer.valueOf(intValue), str3);
                        linkedHashMap2.put(str3, java.lang.Integer.valueOf(intValue));
                    }
                }
            }
        };
        defpackage.nf nfVar = cjVar.oh6vYeIP;
        if (nfVar != null) {
            vq0Var.IHQe1A4L2xu(nfVar);
        }
        cjVar.IHQe1A4L2xu.add(vq0Var);
        this.PAEGRtP0bX = new defpackage.le1(new defpackage.df(mainActivity, 3));
        this.abhbClRa = new defpackage.le1(new defpackage.df(mainActivity, 4));
    }

    public static void riuEU0zW4(com.corsair.ledger.MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (java.lang.IllegalStateException e) {
            if (!defpackage.x70.QoRHpC4k(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (java.lang.NullPointerException e2) {
            if (!defpackage.x70.QoRHpC4k(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.cn1
    public final defpackage.bn1 AARZUJiTa() {
        if (getApplication() == null) {
            defpackage.db.AARZUJiTa("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.riuEU0zW4 == null) {
            defpackage.jf jfVar = (defpackage.jf) getLastNonConfigurationInstance();
            if (jfVar != null) {
                this.riuEU0zW4 = jfVar.IHQe1A4L2xu;
            }
            if (this.riuEU0zW4 == null) {
                this.riuEU0zW4 = new defpackage.bn1();
            }
        }
        defpackage.bn1 bn1Var = this.riuEU0zW4;
        bn1Var.getClass();
        return bn1Var;
    }

    @Override // defpackage.ud0
    public final defpackage.xd0 EXtogiMhuM() {
        return this.adDC3e2L;
    }

    @Override // defpackage.go0
    public final defpackage.y IHQe1A4L2xu() {
        return oh6vYeIP().IHQe1A4L2xu();
    }

    public final void SH1y5HwkJhh() {
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(com.combinations.spin.balbi.R.id.view_tree_lifecycle_owner, this);
        android.view.View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(com.combinations.spin.balbi.R.id.view_tree_view_model_store_owner, this);
        android.view.View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(com.combinations.spin.balbi.R.id.view_tree_saved_state_registry_owner, this);
        android.view.View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(com.combinations.spin.balbi.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        android.view.View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(com.combinations.spin.balbi.R.id.report_drawn, this);
        android.view.View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(com.combinations.spin.balbi.R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        SH1y5HwkJhh();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.SH1y5HwkJhh.IHQe1A4L2xu(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.uq0
    public final defpackage.tq0 oh6vYeIP() {
        return (defpackage.tq0) this.abhbClRa.getValue();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.JlrlGoKF.IHQe1A4L2xu(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((defpackage.tp) this.V7bD7b8KA.getValue()).IHQe1A4L2xu();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.DFo87pBq1E5.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.mf, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.EXtogiMhuM.PAEGRtP0bX(bundle);
        defpackage.cj cjVar = this.xiZrDbcSW0;
        cjVar.getClass();
        cjVar.oh6vYeIP = this;
        java.util.Iterator it = cjVar.IHQe1A4L2xu.iterator();
        while (it.hasNext()) {
            ((defpackage.vq0) it.next()).IHQe1A4L2xu(this);
        }
        super.onCreate(bundle);
        int i = defpackage.g11.xiZrDbcSW0;
        defpackage.e11.oh6vYeIP(this);
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
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.AARZUJiTa.xiZrDbcSW0).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        defpackage.db.kd6TUFXn();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.AARZUJiTa.xiZrDbcSW0).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                defpackage.db.kd6TUFXn();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.fnWB2E7cs = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.fnWB2E7cs = false;
            java.util.Iterator it = this.QoRHpC4k.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.oi) it.next()).accept(new defpackage.ky(9));
            }
        } catch (java.lang.Throwable th) {
            this.fnWB2E7cs = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(android.content.Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        java.util.Iterator it = this.cnag84Bm.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        menu.getClass();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.AARZUJiTa.xiZrDbcSW0).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            defpackage.db.kd6TUFXn();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.kNAkVymC = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.kNAkVymC = false;
            java.util.Iterator it = this.G3OKOH3wZRC.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.oi) it.next()).accept(new defpackage.ky(15));
            }
        } catch (java.lang.Throwable th) {
            this.kNAkVymC = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        defpackage.ky kyVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = 16;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            kyVar = new defpackage.ky(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            kyVar = new defpackage.ky(i2);
        } else {
            kyVar = new defpackage.ky(i2);
        }
        java.util.Iterator it = this.kd6TUFXn.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(kyVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.AARZUJiTa.xiZrDbcSW0).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        defpackage.db.kd6TUFXn();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.JlrlGoKF.IHQe1A4L2xu(i, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        defpackage.jf jfVar;
        defpackage.bn1 bn1Var = this.riuEU0zW4;
        if (bn1Var == null && (jfVar = (defpackage.jf) getLastNonConfigurationInstance()) != null) {
            bn1Var = jfVar.IHQe1A4L2xu;
        }
        if (bn1Var == null) {
            return null;
        }
        defpackage.jf jfVar2 = new defpackage.jf();
        jfVar2.IHQe1A4L2xu = bn1Var;
        return jfVar2;
    }

    @Override // defpackage.mf, android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.xd0 xd0Var = this.adDC3e2L;
        if (xd0Var != null) {
            xd0Var.r1MBDhnF("setCurrentState");
            xd0Var.adDC3e2L(defpackage.nd0.AARZUJiTa);
        }
        super.onSaveInstanceState(bundle);
        this.EXtogiMhuM.abhbClRa(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator it = this.SyNS6RMn.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.EgCjBq0SZwJ.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // defpackage.i41
    public final defpackage.F7NU4MC0GW r1MBDhnF() {
        return (defpackage.F7NU4MC0GW) this.EXtogiMhuM.AARZUJiTa;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (defpackage.l80.kNAkVymC()) {
                defpackage.l80.AARZUJiTa("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            defpackage.uz uzVar = (defpackage.uz) this.ez2rX8ReCYw.getValue();
            synchronized (uzVar.IHQe1A4L2xu) {
                try {
                    uzVar.oh6vYeIP = true;
                    java.util.ArrayList arrayList = uzVar.r1MBDhnF;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        i++;
                        ((defpackage.vz) obj).IHQe1A4L2xu();
                    }
                    uzVar.r1MBDhnF.clear();
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
        SH1y5HwkJhh();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.SH1y5HwkJhh.IHQe1A4L2xu(decorView);
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

    @Override // defpackage.h30
    public final defpackage.uk0 xiZrDbcSW0() {
        defpackage.uk0 uk0Var = new defpackage.uk0();
        android.app.Application application = getApplication();
        java.util.LinkedHashMap linkedHashMap = uk0Var.IHQe1A4L2xu;
        if (application != null) {
            linkedHashMap.put(defpackage.ym1.F7NU4MC0GW, getApplication());
        }
        linkedHashMap.put(defpackage.w70.XZx205DYe, this);
        linkedHashMap.put(defpackage.w70.mAr5m2L7gYDP, this);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(defpackage.w70.hyxIchWRW, extras);
        }
        return uk0Var;
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
        SH1y5HwkJhh();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.SH1y5HwkJhh.IHQe1A4L2xu(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        SH1y5HwkJhh();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.SH1y5HwkJhh.IHQe1A4L2xu(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.fnWB2E7cs) {
            return;
        }
        java.util.Iterator it = this.QoRHpC4k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(new defpackage.ky(9));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.kNAkVymC) {
            return;
        }
        java.util.Iterator it = this.G3OKOH3wZRC.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.oi) it.next()).accept(new defpackage.ky(15));
        }
    }
}
