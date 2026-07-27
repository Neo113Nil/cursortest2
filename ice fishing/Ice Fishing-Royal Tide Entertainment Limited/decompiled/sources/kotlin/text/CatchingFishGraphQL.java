package kotlin.text;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public final class CatchingFishGraphQL implements ComponentCallbacks2 {
    public final /* synthetic */ CatchingFishKtorRoom CatchingFishReduxKtor;

    public CatchingFishGraphQL(CatchingFishKtorRoom catchingFishKtorRoom) {
        this.CatchingFishReduxKtor = catchingFishKtorRoom;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        CatchingFishKtorRoom catchingFishKtorRoom = this.CatchingFishReduxKtor;
        synchronized (catchingFishKtorRoom) {
            catchingFishKtorRoom.CatchingFishParcelableFAB.CatchingFishCoroutine();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        CatchingFishKtorRoom catchingFishKtorRoom = this.CatchingFishReduxKtor;
        synchronized (catchingFishKtorRoom) {
            catchingFishKtorRoom.CatchingFishParcelableFAB.CatchingFishCoroutine();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        CatchingFishKtorRoom catchingFishKtorRoom = this.CatchingFishReduxKtor;
        synchronized (catchingFishKtorRoom) {
            catchingFishKtorRoom.CatchingFishParcelableFAB.CatchingFishCoroutine();
        }
    }
}
