package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRealmSnackbar {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishKtorDataStore CatchingFishSnackbar;

    public /* synthetic */ CatchingFishRealmSnackbar(CatchingFishKtorDataStore catchingFishKtorDataStore, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishKtorDataStore;
    }

    public final int CatchingFishCoroutine() {
        int i;
        int CatchingFishMutableLiveData;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishKtorDataStore catchingFishKtorDataStore = this.CatchingFishSnackbar;
                i = catchingFishKtorDataStore.CatchingFishUnitTesting;
                CatchingFishMutableLiveData = catchingFishKtorDataStore.CatchingFishMutableLiveData();
                break;
            default:
                CatchingFishKtorDataStore catchingFishKtorDataStore2 = this.CatchingFishSnackbar;
                i = catchingFishKtorDataStore2.CatchingFishAnimationMockk;
                CatchingFishMutableLiveData = catchingFishKtorDataStore2.CatchingFishCustomView();
                break;
        }
        return i - CatchingFishMutableLiveData;
    }

    public final int CatchingFishParcelableFAB(View view) {
        int right;
        int i;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
                right = view.getRight() + ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.right;
                i = ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).rightMargin;
                break;
            default:
                CatchingFishGradleDagger catchingFishGradleDagger2 = (CatchingFishGradleDagger) view.getLayoutParams();
                right = view.getBottom() + ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.bottom;
                i = ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int CatchingFishReduxKtor() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return this.CatchingFishSnackbar.CatchingFishFragmentFactory();
            default:
                return this.CatchingFishSnackbar.CatchingFishJobScheduler();
        }
    }

    public final int CatchingFishSnackbar(View view) {
        int left;
        int i;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGradleDagger catchingFishGradleDagger = (CatchingFishGradleDagger) view.getLayoutParams();
                left = view.getLeft() - ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.left;
                i = ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger).leftMargin;
                break;
            default:
                CatchingFishGradleDagger catchingFishGradleDagger2 = (CatchingFishGradleDagger) view.getLayoutParams();
                left = view.getTop() - ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishSnackbar.top;
                i = ((ViewGroup.MarginLayoutParams) catchingFishGradleDagger2).topMargin;
                break;
        }
        return left - i;
    }
}
