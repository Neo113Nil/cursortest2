package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.kolosta.rejin.jilosa.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class n7 extends m7 implements vg0, gm, s50 {
    public boolean KlHjfFWx;
    public final d9 MdtA4re8 = new d9();
    public final CopyOnWriteArrayList OnDfzHZD;
    public final CopyOnWriteArrayList OxcuoDLp;
    public final q50 P7K7Inc8;
    public t50 Qr9iLBAD;
    public final xo VgvYg0wo;
    public boolean amk52bBQ;
    public ug0 b2ZJblxo;
    public final l7 eVhOlqcC;
    public ax jb9XjC4I;
    public final nk k3x7lurq;
    public final CopyOnWriteArrayList lDXGDhIF;
    public final h7 ow5vqvCr;
    public final CopyOnWriteArrayList sjUBp5pO;
    public final f0 wxUZMvaN;
    public final CopyOnWriteArrayList ygLcUYwZ;

    public n7() {
        f4UNdked f4undked = (f4UNdked) this;
        this.wxUZMvaN = new f0(new d3vfVszL(3, f4undked));
        xo xoVar = new xo(this);
        this.VgvYg0wo = xoVar;
        q50 q50Var = new q50(new r50(this, new e7(8, this)));
        this.P7K7Inc8 = q50Var;
        this.jb9XjC4I = null;
        l7 l7Var = new l7(f4undked);
        this.eVhOlqcC = l7Var;
        int i = 0;
        this.k3x7lurq = new nk(l7Var, new e7(i, f4undked));
        new AtomicInteger();
        this.ow5vqvCr = new h7();
        this.OnDfzHZD = new CopyOnWriteArrayList();
        this.ygLcUYwZ = new CopyOnWriteArrayList();
        this.lDXGDhIF = new CopyOnWriteArrayList();
        this.sjUBp5pO = new CopyOnWriteArrayList();
        this.OxcuoDLp = new CopyOnWriteArrayList();
        this.amk52bBQ = false;
        this.KlHjfFWx = false;
        xoVar.qoPGr6Ce(new i7(f4undked, i));
        xoVar.qoPGr6Ce(new i7(f4undked, 1));
        xoVar.qoPGr6Ce(new i7(f4undked, 2));
        q50Var.Qr9iLBAD();
        w30.OxcuoDLp(this);
        ((mcXgUFR8) q50Var.NCTxEWno).eIA6dogk("android:support:activity-result", new f7(f4undked, i));
        eVhOlqcC(new g7(f4undked, i));
    }

    @Override // defpackage.vg0
    public final ug0 P7K7Inc8() {
        if (getApplication() == null) {
            m1.Ey6iv0m0("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        ug0 ug0Var = this.b2ZJblxo;
        if (ug0Var != null) {
            return ug0Var;
        }
        k7 k7Var = (k7) getLastNonConfigurationInstance();
        if (k7Var != null) {
            this.b2ZJblxo = k7Var.qoPGr6Ce;
        }
        ug0 ug0Var2 = this.b2ZJblxo;
        if (ug0Var2 != null) {
            return ug0Var2;
        }
        ug0 ug0Var3 = new ug0();
        this.b2ZJblxo = ug0Var3;
        return ug0Var3;
    }

    @Override // defpackage.gm
    public final mt VgvYg0wo() {
        mt mtVar = new mt(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = mtVar.qoPGr6Ce;
        if (application != null) {
            linkedHashMap.put(qg0.wxUZMvaN, getApplication());
        }
        linkedHashMap.put(w30.b2ZJblxo, this);
        linkedHashMap.put(w30.Qr9iLBAD, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(w30.jb9XjC4I, getIntent().getExtras());
        }
        return mtVar;
    }

    @Override // defpackage.vo
    public final xo b2ZJblxo() {
        return this.VgvYg0wo;
    }

    public final void eVhOlqcC(bx bxVar) {
        d9 d9Var = this.MdtA4re8;
        d9Var.getClass();
        if (d9Var.NCTxEWno != null) {
            bxVar.qoPGr6Ce();
        }
        d9Var.qoPGr6Ce.add(bxVar);
    }

    public final void jb9XjC4I(w8 w8Var) {
        this.OnDfzHZD.add(w8Var);
    }

    public final ax k3x7lurq() {
        if (this.jb9XjC4I == null) {
            this.jb9XjC4I = new ax(new i1(2, this));
            this.VgvYg0wo.qoPGr6Ce(new i10(1, this));
        }
        return this.jb9XjC4I;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.ow5vqvCr.qoPGr6Ce(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        k3x7lurq().NCTxEWno();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.OnDfzHZD.iterator();
        while (it.hasNext()) {
            ((w8) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.m7, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.P7K7Inc8.jb9XjC4I(bundle);
        d9 d9Var = this.MdtA4re8;
        d9Var.getClass();
        d9Var.NCTxEWno = this;
        Iterator it = d9Var.qoPGr6Ce.iterator();
        while (it.hasNext()) {
            ((bx) it.next()).qoPGr6Ce();
        }
        super.onCreate(bundle);
        int i = x20.MdtA4re8;
        v20.NCTxEWno(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.wxUZMvaN.VgvYg0wo).iterator();
        while (it.hasNext()) {
            ((xi) it.next()).qoPGr6Ce.eVhOlqcC();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.wxUZMvaN.VgvYg0wo).iterator();
            while (it.hasNext()) {
                if (((xi) it.next()).qoPGr6Ce.lDXGDhIF()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.amk52bBQ = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.amk52bBQ = false;
            Iterator it = this.sjUBp5pO.iterator();
            while (it.hasNext()) {
                w8 w8Var = (w8) it.next();
                configuration.getClass();
                w8Var.accept(new lt(z));
            }
        } catch (Throwable th) {
            this.amk52bBQ = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.lDXGDhIF.iterator();
        while (it.hasNext()) {
            ((w8) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.wxUZMvaN.VgvYg0wo).iterator();
        while (it.hasNext()) {
            ((xi) it.next()).qoPGr6Ce.sjUBp5pO();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.KlHjfFWx = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.KlHjfFWx = false;
            Iterator it = this.OxcuoDLp.iterator();
            while (it.hasNext()) {
                w8 w8Var = (w8) it.next();
                configuration.getClass();
                w8Var.accept(new lz(z));
            }
        } catch (Throwable th) {
            this.KlHjfFWx = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.wxUZMvaN.VgvYg0wo).iterator();
        while (it.hasNext()) {
            ((xi) it.next()).qoPGr6Ce.KlHjfFWx();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.ow5vqvCr.qoPGr6Ce(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        k7 k7Var;
        ug0 ug0Var = this.b2ZJblxo;
        if (ug0Var == null && (k7Var = (k7) getLastNonConfigurationInstance()) != null) {
            ug0Var = k7Var.qoPGr6Ce;
        }
        if (ug0Var == null) {
            return null;
        }
        k7 k7Var2 = new k7();
        k7Var2.qoPGr6Ce = ug0Var;
        return k7Var2;
    }

    @Override // defpackage.m7, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        xo xoVar = this.VgvYg0wo;
        if (xoVar != null) {
            xoVar.b2ZJblxo(po.wxUZMvaN);
        }
        super.onSaveInstanceState(bundle);
        this.P7K7Inc8.eVhOlqcC(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.ygLcUYwZ.iterator();
        while (it.hasNext()) {
            ((w8) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final void ow5vqvCr() {
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
    }

    @Override // defpackage.s50
    public final mcXgUFR8 qoPGr6Ce() {
        return (mcXgUFR8) this.P7K7Inc8.NCTxEWno;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (f50.k3x7lurq()) {
                f50.wxUZMvaN("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            nk nkVar = this.k3x7lurq;
            synchronized (nkVar.qoPGr6Ce) {
                try {
                    nkVar.NCTxEWno = true;
                    ArrayList arrayList = nkVar.MdtA4re8;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((ok) obj).qoPGr6Ce();
                    }
                    nkVar.MdtA4re8.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        ow5vqvCr();
        View decorView = getWindow().getDecorView();
        l7 l7Var = this.eVhOlqcC;
        if (!l7Var.wxUZMvaN) {
            l7Var.wxUZMvaN = true;
            decorView.getViewTreeObserver().addOnDrawListener(l7Var);
        }
        super.setContentView(view);
    }

    public abstract rg0 wxUZMvaN();

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.amk52bBQ) {
            return;
        }
        Iterator it = this.sjUBp5pO.iterator();
        while (it.hasNext()) {
            ((w8) it.next()).accept(new lt(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.KlHjfFWx) {
            return;
        }
        Iterator it = this.OxcuoDLp.iterator();
        while (it.hasNext()) {
            ((w8) it.next()).accept(new lz(z));
        }
    }
}
