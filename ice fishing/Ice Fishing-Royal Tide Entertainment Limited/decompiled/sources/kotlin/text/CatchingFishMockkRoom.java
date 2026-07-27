package kotlin.text;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishMockkRoom implements CatchingFishFluxContext {
    public Bundle CatchingFishCoroutine;
    public final CatchingFishViewModelIntent CatchingFishParcelableFAB;
    public final CatchingFishKtorHiltIntent CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishMockkRoom(CatchingFishViewModelIntent catchingFishViewModelIntent, CatchingFishDataStoreFlux catchingFishDataStoreFlux) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishViewModelIntent, "savedStateRegistry");
        this.CatchingFishParcelableFAB = catchingFishViewModelIntent;
        this.CatchingFishReduxKtor = CatchingFishXMLLayoutGlide.CatchingFishPayPal(new CatchingFishFluxPicasso(5, catchingFishDataStoreFlux));
    }

    @Override // kotlin.text.CatchingFishFluxContext
    public final Bundle CatchingFishParcelableFAB() {
        Bundle CatchingFishFragmentHandler = CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(new CatchingFishGsonWorkManager[0], 0));
        Bundle bundle = this.CatchingFishCoroutine;
        if (bundle != null) {
            CatchingFishFragmentHandler.putAll(bundle);
        }
        for (Map.Entry entry : ((CatchingFishLayoutCameraX) this.CatchingFishReduxKtor.getValue()).CatchingFishSnackbar.entrySet()) {
            String str = (String) entry.getKey();
            Bundle CatchingFishParcelableFAB = ((CatchingFishViewCardView) ((CatchingFishSnackbarRedux) entry.getValue()).CatchingFishParcelableFAB.CatchingFishViewModelFAB).CatchingFishParcelableFAB();
            if (!CatchingFishParcelableFAB.isEmpty()) {
                CatchingFishFirebaseDagger.CatchingFishNavigation(str, "key");
                CatchingFishFragmentHandler.putBundle(str, CatchingFishParcelableFAB);
            }
        }
        this.CatchingFishSnackbar = false;
        return CatchingFishFragmentHandler;
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishSnackbar) {
            return;
        }
        Bundle CatchingFishDaggerWebsocket = this.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle CatchingFishFragmentHandler = CatchingFishGsonCardView.CatchingFishFragmentHandler((CatchingFishGsonWorkManager[]) Arrays.copyOf(new CatchingFishGsonWorkManager[0], 0));
        Bundle bundle = this.CatchingFishCoroutine;
        if (bundle != null) {
            CatchingFishFragmentHandler.putAll(bundle);
        }
        if (CatchingFishDaggerWebsocket != null) {
            CatchingFishFragmentHandler.putAll(CatchingFishDaggerWebsocket);
        }
        this.CatchingFishCoroutine = CatchingFishFragmentHandler;
        this.CatchingFishSnackbar = true;
    }
}
