package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishWidgetAndroidX extends CatchingFishToastHiltBundle {
    public int CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishReduxKtor;
    public boolean CatchingFishSnackbar;

    public CatchingFishWidgetAndroidX(CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask, int i) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishReduxKtor = catchingFishMVVMAsyncTask;
        this.CatchingFishCoroutine = i;
        this.CatchingFishSnackbar = false;
    }

    @Override // kotlin.text.CatchingFishToastHiltBundle, kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishCoroutine() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishMVVMAsyncTask) this.CatchingFishReduxKtor).CatchingFishParcelableFAB.setVisibility(0);
                break;
            default:
                if (!this.CatchingFishSnackbar) {
                    this.CatchingFishSnackbar = true;
                    CatchingFishCoroutineJUnit catchingFishCoroutineJUnit = ((CatchingFishGsonMVIRetrofit) this.CatchingFishReduxKtor).CatchingFishReduxKtor;
                    if (catchingFishCoroutineJUnit != null) {
                        catchingFishCoroutineJUnit.CatchingFishCoroutine();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineJUnit
    public final void CatchingFishParcelableFAB() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!this.CatchingFishSnackbar) {
                    ((CatchingFishMVVMAsyncTask) this.CatchingFishReduxKtor).CatchingFishParcelableFAB.setVisibility(this.CatchingFishCoroutine);
                    break;
                }
                break;
            default:
                int i = this.CatchingFishCoroutine + 1;
                this.CatchingFishCoroutine = i;
                CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit = (CatchingFishGsonMVIRetrofit) this.CatchingFishReduxKtor;
                if (i == catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB.size()) {
                    CatchingFishCoroutineJUnit catchingFishCoroutineJUnit = catchingFishGsonMVIRetrofit.CatchingFishReduxKtor;
                    if (catchingFishCoroutineJUnit != null) {
                        catchingFishCoroutineJUnit.CatchingFishParcelableFAB();
                    }
                    this.CatchingFishCoroutine = 0;
                    this.CatchingFishSnackbar = false;
                    catchingFishGsonMVIRetrofit.CatchingFishDaggerWebsocket = false;
                    break;
                }
                break;
        }
    }

    @Override // kotlin.text.CatchingFishToastHiltBundle, kotlin.text.CatchingFishCoroutineJUnit
    public void CatchingFishSnackbar() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishSnackbar = true;
                break;
        }
    }

    public CatchingFishWidgetAndroidX(CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit) {
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishReduxKtor = catchingFishGsonMVIRetrofit;
        this.CatchingFishSnackbar = false;
        this.CatchingFishCoroutine = 0;
    }
}
