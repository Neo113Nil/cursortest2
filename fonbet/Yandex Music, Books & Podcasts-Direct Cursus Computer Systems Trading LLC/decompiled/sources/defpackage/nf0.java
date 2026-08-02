package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class nf0 implements ComponentCallbacks2 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ ede b;

    public nf0(Configuration configuration, ede edeVar) {
        this.a = configuration;
        this.b = edeVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.a;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.b.a.entrySet().iterator();
        while (it.hasNext()) {
            cde cdeVar = (cde) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (cdeVar == null || Configuration.needNewResources(updateFrom, cdeVar.b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.b.a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.b.a.clear();
    }
}
