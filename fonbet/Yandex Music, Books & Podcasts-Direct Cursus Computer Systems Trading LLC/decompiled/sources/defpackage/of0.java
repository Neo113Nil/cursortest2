package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class of0 implements ComponentCallbacks2 {
    public final /* synthetic */ u2o a;

    public of0(u2o u2oVar) {
        this.a = u2oVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        u2o u2oVar = this.a;
        synchronized (u2oVar) {
            u2oVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        u2o u2oVar = this.a;
        synchronized (u2oVar) {
            u2oVar.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        u2o u2oVar = this.a;
        synchronized (u2oVar) {
            u2oVar.a.c();
        }
    }
}
