package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.combinations.level.experts.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class fd extends ed implements ff1, hz, yw0, il0, wi0 {
    public final j6IIN2O8eOU AvO7iQsrTN;
    public final dd E7jCp8Ls;
    public final tg EljAMC1QTz;
    public final cd JFJ3QoxA;
    public final CopyOnWriteArrayList Mjvvu5DE;
    public final CopyOnWriteArrayList WIEu4Ya2g8;
    public final CopyOnWriteArrayList XnEVoBF0td1l;
    public boolean Y6hRI1cF8;
    public final CopyOnWriteArrayList YmKjaVtbfp5Z;
    public final m71 cilMamHF;
    public final d encWxUiV2;
    public final CopyOnWriteArrayList iwATDS1i01k;
    public boolean jivtDDk9H;
    public final m71 lv06NcmrQ;
    public final CopyOnWriteArrayList mE4lRynR;
    public ef1 mOu10nynGul;
    public final m71 rQPn8YBR;
    public final CopyOnWriteArrayList uFEq9NpZ;

    public fd() {
        tg tgVar = new tg();
        this.EljAMC1QTz = tgVar;
        this.AvO7iQsrTN = new j6IIN2O8eOU(17);
        xw0 xw0Var = new xw0(this, new o1(13, this));
        d dVar = new d(xw0Var, 18);
        this.encWxUiV2 = dVar;
        this.JFJ3QoxA = new cd(this);
        final int i = 1;
        this.rQPn8YBR = new m71(new wc(this, 1));
        new AtomicInteger();
        this.E7jCp8Ls = new dd();
        this.XnEVoBF0td1l = new CopyOnWriteArrayList();
        this.uFEq9NpZ = new CopyOnWriteArrayList();
        this.iwATDS1i01k = new CopyOnWriteArrayList();
        this.WIEu4Ya2g8 = new CopyOnWriteArrayList();
        this.YmKjaVtbfp5Z = new CopyOnWriteArrayList();
        this.Mjvvu5DE = new CopyOnWriteArrayList();
        this.mE4lRynR = new CopyOnWriteArrayList();
        this.cilMamHF = new m71(new wc(this, 2));
        w90 w90Var = this.OOA6hdeuvCS;
        if (w90Var == null) {
            o4.jivtDDk9H("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i2 = 0;
        w90Var.GWasM1elztuh(new r90(this) { // from class: yc
            public final /* synthetic */ fd EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.r90
            public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
                Window window;
                View peekDecorView;
                int i3 = i2;
                fd fdVar = this.EljAMC1QTz;
                switch (i3) {
                    case 0:
                        if (l90Var == l90.ON_STOP && (window = fdVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (l90Var == l90.ON_DESTROY) {
                            fdVar.EljAMC1QTz.Yi7zF1RB1 = null;
                            if (!fdVar.isChangingConfigurations()) {
                                fdVar.OOA6hdeuvCS().GWasM1elztuh();
                            }
                            cd cdVar = fdVar.JFJ3QoxA;
                            fd fdVar2 = cdVar.encWxUiV2;
                            fdVar2.getWindow().getDecorView().removeCallbacks(cdVar);
                            fdVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(cdVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.OOA6hdeuvCS.GWasM1elztuh(new r90(this) { // from class: yc
            public final /* synthetic */ fd EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.r90
            public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
                Window window;
                View peekDecorView;
                int i3 = i;
                fd fdVar = this.EljAMC1QTz;
                switch (i3) {
                    case 0:
                        if (l90Var == l90.ON_STOP && (window = fdVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                            peekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (l90Var == l90.ON_DESTROY) {
                            fdVar.EljAMC1QTz.Yi7zF1RB1 = null;
                            if (!fdVar.isChangingConfigurations()) {
                                fdVar.OOA6hdeuvCS().GWasM1elztuh();
                            }
                            cd cdVar = fdVar.JFJ3QoxA;
                            fd fdVar2 = cdVar.encWxUiV2;
                            fdVar2.getWindow().getDecorView().removeCallbacks(cdVar);
                            fdVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(cdVar);
                            break;
                        }
                        break;
                }
            }
        });
        this.OOA6hdeuvCS.GWasM1elztuh(new jt0(i, this));
        xw0Var.GWasM1elztuh();
        fb1.lv06NcmrQ(this);
        ((d) dVar.AvO7iQsrTN).jivtDDk9H("android:support:activity-result", new zc(i2, this));
        ad adVar = new ad(this);
        fd fdVar = tgVar.Yi7zF1RB1;
        if (fdVar != null) {
            adVar.GWasM1elztuh(fdVar);
        }
        tgVar.GWasM1elztuh.add(adVar);
        new m71(new wc(this, 3));
        this.lv06NcmrQ = new m71(new wc(this, 4));
    }

    public static void EljAMC1QTz(fd fdVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!o30.rQPn8YBR(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!o30.rQPn8YBR(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.t90
    public final w90 AvO7iQsrTN() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.wi0
    public final rx0 GWasM1elztuh() {
        return Yi7zF1RB1().GWasM1elztuh();
    }

    @Override // defpackage.ff1
    public final ef1 OOA6hdeuvCS() {
        if (getApplication() == null) {
            o4.jivtDDk9H("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.mOu10nynGul == null) {
            bd bdVar = (bd) getLastNonConfigurationInstance();
            if (bdVar != null) {
                this.mOu10nynGul = bdVar.GWasM1elztuh;
            }
            if (this.mOu10nynGul == null) {
                this.mOu10nynGul = new ef1();
            }
        }
        ef1 ef1Var = this.mOu10nynGul;
        ef1Var.getClass();
        return ef1Var;
    }

    @Override // defpackage.yw0
    public final d X1lG3V04pd() {
        return (d) this.encWxUiV2.AvO7iQsrTN;
    }

    @Override // defpackage.il0
    public final hl0 Yi7zF1RB1() {
        return (hl0) this.lv06NcmrQ.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        encWxUiV2();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.JFJ3QoxA.GWasM1elztuh(decorView);
        super.addContentView(view, layoutParams);
    }

    public final void encWxUiV2() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.E7jCp8Ls.GWasM1elztuh(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((fm) this.cilMamHF.getValue()).GWasM1elztuh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.XnEVoBF0td1l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.ed, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.encWxUiV2.Mjvvu5DE(bundle);
        tg tgVar = this.EljAMC1QTz;
        tgVar.getClass();
        tgVar.Yi7zF1RB1 = this;
        Iterator it = tgVar.GWasM1elztuh.iterator();
        while (it.hasNext()) {
            ((ad) it.next()).GWasM1elztuh(this);
        }
        super.onCreate(bundle);
        int i = mu0.EljAMC1QTz;
        ku0.Yi7zF1RB1(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.AvO7iQsrTN.EljAMC1QTz).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        o4.YmKjaVtbfp5Z();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.AvO7iQsrTN.EljAMC1QTz).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                o4.YmKjaVtbfp5Z();
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.jivtDDk9H = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.jivtDDk9H = false;
            Iterator it = this.WIEu4Ya2g8.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((gg) it.next()).accept(new vt(8));
            }
        } catch (Throwable th) {
            this.jivtDDk9H = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.iwATDS1i01k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.AvO7iQsrTN.EljAMC1QTz).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            o4.YmKjaVtbfp5Z();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.Y6hRI1cF8 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.Y6hRI1cF8 = false;
            Iterator it = this.YmKjaVtbfp5Z.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((gg) it.next()).accept(new vt(13));
            }
        } catch (Throwable th) {
            this.Y6hRI1cF8 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        vt vtVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 14;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            vtVar = new vt(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            vtVar = new vt(i2);
        } else {
            vtVar = new vt(i2);
        }
        Iterator it = this.Mjvvu5DE.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(vtVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.AvO7iQsrTN.EljAMC1QTz).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        o4.YmKjaVtbfp5Z();
        return false;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.E7jCp8Ls.GWasM1elztuh(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        bd bdVar;
        ef1 ef1Var = this.mOu10nynGul;
        if (ef1Var == null && (bdVar = (bd) getLastNonConfigurationInstance()) != null) {
            ef1Var = bdVar.GWasM1elztuh;
        }
        if (ef1Var == null) {
            return null;
        }
        bd bdVar2 = new bd();
        bdVar2.GWasM1elztuh = ef1Var;
        return bdVar2;
    }

    @Override // defpackage.ed, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        w90 w90Var = this.OOA6hdeuvCS;
        if (w90Var != null) {
            w90Var.X1lG3V04pd("setCurrentState");
            w90Var.OOA6hdeuvCS(m90.AvO7iQsrTN);
        }
        super.onSaveInstanceState(bundle);
        this.encWxUiV2.mE4lRynR(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.uFEq9NpZ.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.mE4lRynR.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (l60.YmKjaVtbfp5Z()) {
                l60.encWxUiV2("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            vu vuVar = (vu) this.rQPn8YBR.getValue();
            synchronized (vuVar.GWasM1elztuh) {
                try {
                    vuVar.Yi7zF1RB1 = true;
                    ArrayList arrayList = vuVar.X1lG3V04pd;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((wu) obj).GWasM1elztuh();
                    }
                    vuVar.X1lG3V04pd.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        encWxUiV2();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.JFJ3QoxA.GWasM1elztuh(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.hz
    public final of0 xqGvceK5x() {
        of0 of0Var = new of0();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = of0Var.GWasM1elztuh;
        if (application != null) {
            linkedHashMap.put(ze1.xqGvceK5x, getApplication());
        }
        linkedHashMap.put(fb1.EljAMC1QTz, this);
        linkedHashMap.put(fb1.AvO7iQsrTN, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(fb1.encWxUiV2, extras);
        }
        return of0Var;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        encWxUiV2();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.JFJ3QoxA.GWasM1elztuh(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        encWxUiV2();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.JFJ3QoxA.GWasM1elztuh(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.jivtDDk9H) {
            return;
        }
        Iterator it = this.WIEu4Ya2g8.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(new vt(8));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.Y6hRI1cF8) {
            return;
        }
        Iterator it = this.YmKjaVtbfp5Z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((gg) it.next()).accept(new vt(13));
        }
    }
}
