package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zi implements android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ defpackage.aj WDYagTQQm9ns;

    public zi(defpackage.aj ajVar) {
        this.WDYagTQQm9ns = ajVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.WDYagTQQm9ns.JhCgjQRTAOCT(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        defpackage.aj ajVar = this.WDYagTQQm9ns;
        ajVar.oh71FJcDz6S2.ZpBGe2uQfcn8.clear();
        defpackage.c51 c51Var = ajVar.QiMR8OkAhezm;
        synchronized (c51Var) {
            c51Var.ZpBGe2uQfcn8.fWTAfUmVKrZq();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        defpackage.aj ajVar = this.WDYagTQQm9ns;
        ajVar.oh71FJcDz6S2.ZpBGe2uQfcn8.clear();
        defpackage.c51 c51Var = ajVar.QiMR8OkAhezm;
        synchronized (c51Var) {
            c51Var.ZpBGe2uQfcn8.fWTAfUmVKrZq();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.WDYagTQQm9ns.BHfvd2J71qpO.ZpBGe2uQfcn8.setValue(java.lang.Boolean.valueOf(z));
    }
}
