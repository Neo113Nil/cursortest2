package y1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g0 implements ComponentCallbacks2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Configuration f8548g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c2.c f8549h;

    public g0(Configuration configuration, c2.c cVar) {
        this.f8548g = configuration;
        this.f8549h = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f8548g;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f8549h.f1221a.entrySet().iterator();
        while (it.hasNext()) {
            c2.a aVar = (c2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(updateFrom, aVar.f1218b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f8549h.f1221a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f8549h.f1221a.clear();
    }
}
