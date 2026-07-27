package kotlin.text;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMoshiBundle {
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishJUnitLiveData CatchingFishParcelableFAB;
    public final CatchingFishFluxPicasso CatchingFishSnackbar;
    public boolean CatchingFishViewModelScope;
    public Bundle CatchingFishWorkManager;
    public final CatchingFishMoshiFluxMoshi CatchingFishCoroutine = new CatchingFishMoshiFluxMoshi(29);
    public final LinkedHashMap CatchingFishReduxKtor = new LinkedHashMap();
    public boolean CatchingFishViewModelFAB = true;

    public CatchingFishMoshiBundle(CatchingFishJUnitLiveData catchingFishJUnitLiveData, CatchingFishFluxPicasso catchingFishFluxPicasso) {
        this.CatchingFishParcelableFAB = catchingFishJUnitLiveData;
        this.CatchingFishSnackbar = catchingFishFluxPicasso;
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishJUnitLiveData catchingFishJUnitLiveData = this.CatchingFishParcelableFAB;
        if (catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishReduxKtor != CatchingFishMockkFirebase.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.CatchingFishDaggerWebsocket) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.CatchingFishSnackbar.CatchingFishParcelableFAB();
        catchingFishJUnitLiveData.CatchingFishDaggerWebsocket().CatchingFishParcelableFAB(new CatchingFishRoomRetrofit(2, this));
        this.CatchingFishDaggerWebsocket = true;
    }
}
