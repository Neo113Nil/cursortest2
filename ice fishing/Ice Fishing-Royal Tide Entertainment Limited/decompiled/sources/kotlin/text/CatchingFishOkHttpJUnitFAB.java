package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishOkHttpJUnitFAB extends CatchingFishSnackbarRoom {
    public final Object CatchingFishLayout;
    public final /* synthetic */ int CatchingFishViewModelFAB;

    public /* synthetic */ CatchingFishOkHttpJUnitFAB(int i, Object obj) {
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = obj;
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final boolean CatchingFishCloudMessaging() {
        switch (this.CatchingFishViewModelFAB) {
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final void CatchingFishEspressoTesting(Throwable th) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishServiceHandler) this.CatchingFishLayout).CatchingFishFragmentHandler(th);
                break;
            default:
                CatchingFishCoroutineMVVM catchingFishCoroutineMVVM = (CatchingFishCoroutineMVVM) this.CatchingFishLayout;
                Object obj = CatchingFishPicassoView.CatchingFishReduxKtor.get(CatchingFishFragmentHandler());
                if (!(obj instanceof CatchingFishStripeAPIMVI)) {
                    catchingFishCoroutineMVVM.CatchingFishViewModelFAB(CatchingFishXMLLayoutGlide.CatchingFishPayPalLiveData(obj));
                    break;
                } else {
                    catchingFishCoroutineMVVM.CatchingFishViewModelFAB(CatchingFishDaggerBiometric.CatchingFishViewModelFAB(((CatchingFishStripeAPIMVI) obj).CatchingFishParcelableFAB));
                    break;
                }
        }
    }
}
