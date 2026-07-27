package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRealmSpannable extends CatchingFishWorkManagerMVVM {
    public final /* synthetic */ CatchingFishCameraXRetrofit CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishFABFluxAndroidX CatchingFishSnackbar;

    public CatchingFishRealmSpannable(CatchingFishFABFluxAndroidX catchingFishFABFluxAndroidX, CatchingFishCameraXRetrofit catchingFishCameraXRetrofit) {
        this.CatchingFishSnackbar = catchingFishFABFluxAndroidX;
        this.CatchingFishParcelableFAB = catchingFishCameraXRetrofit;
    }

    @Override // kotlin.text.CatchingFishRetrofitView
    public final void CatchingFishCoroutine(CatchingFishMockkRedux catchingFishMockkRedux) {
        ((ArrayList) this.CatchingFishParcelableFAB.get(this.CatchingFishSnackbar.CatchingFishDaggerWebsocket)).remove(catchingFishMockkRedux);
        catchingFishMockkRedux.CatchingFishParcelableFlux(this);
    }
}
