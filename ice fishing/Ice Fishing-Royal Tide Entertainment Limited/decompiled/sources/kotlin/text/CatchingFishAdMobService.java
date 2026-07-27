package kotlin.text;

import android.os.Parcelable;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishAdMobService extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishReduxRetrofit CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishAdMobService(CatchingFishReduxRetrofit catchingFishReduxRetrofit, int i) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishReduxRetrofit;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        CatchingFishGlideBiometric snapshotObserver;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishWorkManager.getLayoutNode().CatchingFishParcelableFlux();
                break;
            case 1:
                CatchingFishReduxRetrofit catchingFishReduxRetrofit = this.CatchingFishWorkManager;
                if (catchingFishReduxRetrofit.CatchingFishViewModelFAB && catchingFishReduxRetrofit.isAttachedToWindow() && catchingFishReduxRetrofit.getView().getParent() == catchingFishReduxRetrofit) {
                    snapshotObserver = catchingFishReduxRetrofit.getSnapshotObserver();
                    snapshotObserver.CatchingFishParcelableFAB(catchingFishReduxRetrofit, CatchingFishMVI.CatchingFishFragmentHandler, catchingFishReduxRetrofit.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.CatchingFishWorkManager.CatchingFishMVPRobolectric.saveHierarchyState(sparseArray);
                break;
            case 3:
                CatchingFishReduxRetrofit catchingFishReduxRetrofit2 = this.CatchingFishWorkManager;
                catchingFishReduxRetrofit2.getReleaseBlock().CatchingFishFragmentHandler(catchingFishReduxRetrofit2.CatchingFishMVPRobolectric);
                CatchingFishReduxRetrofit.CatchingFishOkHttp(catchingFishReduxRetrofit2);
                break;
            case 4:
                CatchingFishReduxRetrofit catchingFishReduxRetrofit3 = this.CatchingFishWorkManager;
                catchingFishReduxRetrofit3.getResetBlock().CatchingFishFragmentHandler(catchingFishReduxRetrofit3.CatchingFishMVPRobolectric);
                break;
            default:
                CatchingFishReduxRetrofit catchingFishReduxRetrofit4 = this.CatchingFishWorkManager;
                catchingFishReduxRetrofit4.getUpdateBlock().CatchingFishFragmentHandler(catchingFishReduxRetrofit4.CatchingFishMVPRobolectric);
                break;
        }
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
