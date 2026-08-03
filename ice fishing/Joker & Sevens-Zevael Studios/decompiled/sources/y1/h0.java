package y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 implements ComponentCallbacks2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c2.d f8552g;

    public h0(c2.d dVar) {
        this.f8552g = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        c2.d dVar = this.f8552g;
        synchronized (dVar) {
            dVar.f1222a.c();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        c2.d dVar = this.f8552g;
        synchronized (dVar) {
            dVar.f1222a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        c2.d dVar = this.f8552g;
        synchronized (dVar) {
            dVar.f1222a.c();
        }
    }
}
