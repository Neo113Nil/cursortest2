package kotlin.text;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishGlideGoogleMaps implements ComponentCallbacks2 {
    public final /* synthetic */ CatchingFishIntentEspresso CatchingFishDaggerWebsocket;
    public final /* synthetic */ Configuration CatchingFishReduxKtor;

    public CatchingFishGlideGoogleMaps(Configuration configuration, CatchingFishIntentEspresso catchingFishIntentEspresso) {
        this.CatchingFishReduxKtor = configuration;
        this.CatchingFishDaggerWebsocket = catchingFishIntentEspresso;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.CatchingFishReduxKtor;
        int updateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.entrySet().iterator();
        while (it.hasNext()) {
            CatchingFishHiltFluxGraphQL catchingFishHiltFluxGraphQL = (CatchingFishHiltFluxGraphQL) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (catchingFishHiltFluxGraphQL == null || Configuration.needNewResources(updateFrom, catchingFishHiltFluxGraphQL.CatchingFishSnackbar)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB.clear();
    }
}
