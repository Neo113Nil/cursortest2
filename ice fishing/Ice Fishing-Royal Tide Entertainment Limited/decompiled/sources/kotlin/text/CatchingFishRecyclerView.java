package kotlin.text;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishRecyclerView extends CatchingFishToastParcelable {
    public final /* synthetic */ int CatchingFishEspressoTesting = 0;
    public final /* synthetic */ CatchingFishToast CatchingFishOkHttp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRecyclerView(CatchingFishToast catchingFishToast, Context context, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, View view) {
        super(context, catchingFishSharedFlowAdMob, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.CatchingFishOkHttp = catchingFishToast;
        this.CatchingFishWorkManager = 8388613;
        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishToast.CatchingFishCardViewRealm;
        this.CatchingFishViewModelFAB = catchingFishServiceHilt;
        CatchingFishMVPEspresso catchingFishMVPEspresso = this.CatchingFishLayout;
        if (catchingFishMVPEspresso != null) {
            catchingFishMVPEspresso.CatchingFishFragmentHandler(catchingFishServiceHilt);
        }
    }

    @Override // kotlin.text.CatchingFishToastParcelable
    public final void CatchingFishCoroutine() {
        switch (this.CatchingFishEspressoTesting) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishToast catchingFishToast = this.CatchingFishOkHttp;
                catchingFishToast.CatchingFishSpannableWidget = null;
                catchingFishToast.getClass();
                super.CatchingFishCoroutine();
                break;
            default:
                CatchingFishToast catchingFishToast2 = this.CatchingFishOkHttp;
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishToast2.CatchingFishWorkManager;
                if (catchingFishSharedFlowAdMob != null) {
                    catchingFishSharedFlowAdMob.CatchingFishCoroutine(true);
                }
                catchingFishToast2.CatchingFishDaggerHiltFAB = null;
                super.CatchingFishCoroutine();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRecyclerView(CatchingFishToast catchingFishToast, Context context, CatchingFishGradleLifecycle catchingFishGradleLifecycle, View view) {
        super(context, catchingFishGradleLifecycle, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.CatchingFishOkHttp = catchingFishToast;
        if ((catchingFishGradleLifecycle.CatchingFishPayPal.CatchingFishParcelableFlux & 32) != 32) {
            View view2 = catchingFishToast.CatchingFishEspressoTesting;
            this.CatchingFishDaggerWebsocket = view2 == null ? (View) catchingFishToast.CatchingFishCloudMessaging : view2;
        }
        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishToast.CatchingFishCardViewRealm;
        this.CatchingFishViewModelFAB = catchingFishServiceHilt;
        CatchingFishMVPEspresso catchingFishMVPEspresso = this.CatchingFishLayout;
        if (catchingFishMVPEspresso != null) {
            catchingFishMVPEspresso.CatchingFishFragmentHandler(catchingFishServiceHilt);
        }
    }
}
