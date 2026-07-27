package kotlin.text;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class CatchingFishHiltIntentMVVM implements ComponentCallbacks2 {
    public final /* synthetic */ CatchingFishAsyncTaskRedux CatchingFishReduxKtor;

    public CatchingFishHiltIntentMVVM(CatchingFishAsyncTaskRedux catchingFishAsyncTaskRedux) {
        this.CatchingFishReduxKtor = catchingFishAsyncTaskRedux;
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            this.CatchingFishReduxKtor.getClass();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
