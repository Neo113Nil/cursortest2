package defpackage;

/* loaded from: classes.dex */
public final class yg implements android.content.ComponentCallbacks2, android.view.ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ defpackage.zg adDC3e2L;

    public yg(defpackage.zg zgVar) {
        this.adDC3e2L = zgVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        this.adDC3e2L.F7NU4MC0GW(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        defpackage.zg zgVar = this.adDC3e2L;
        ((java.util.HashMap) zgVar.xiZrDbcSW0.xiZrDbcSW0).clear();
        defpackage.c1NqjJifC7 c1nqjjifc7 = zgVar.AARZUJiTa;
        synchronized (c1nqjjifc7) {
            ((defpackage.xk0) c1nqjjifc7.xiZrDbcSW0).r1MBDhnF();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        defpackage.zg zgVar = this.adDC3e2L;
        ((java.util.HashMap) zgVar.xiZrDbcSW0.xiZrDbcSW0).clear();
        defpackage.c1NqjJifC7 c1nqjjifc7 = zgVar.AARZUJiTa;
        synchronized (c1nqjjifc7) {
            ((defpackage.xk0) c1nqjjifc7.xiZrDbcSW0).r1MBDhnF();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.adDC3e2L.EgCjBq0SZwJ.IHQe1A4L2xu.setValue(java.lang.Boolean.valueOf(z));
    }
}
