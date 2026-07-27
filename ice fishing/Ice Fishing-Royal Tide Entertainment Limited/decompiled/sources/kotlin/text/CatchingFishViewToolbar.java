package kotlin.text;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class CatchingFishViewToolbar extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService CatchingFishParcelableFAB;

    public CatchingFishViewToolbar(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.CatchingFishParcelableFAB = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation((CatchingFishPayPalFluxGlide) iInterface, "callback");
        CatchingFishFirebaseDagger.CatchingFishNavigation(obj, "cookie");
        this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.remove((Integer) obj);
    }
}
