package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskMockk implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor = 1;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public CatchingFishAsyncTaskMockk(CatchingFishBundleViewModel catchingFishBundleViewModel, CatchingFishStateFlowMockk catchingFishStateFlowMockk) {
        this.CatchingFishWorkManager = catchingFishBundleViewModel;
        this.CatchingFishDaggerWebsocket = catchingFishStateFlowMockk;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishStateFlowMockk catchingFishStateFlowMockk = (CatchingFishStateFlowMockk) this.CatchingFishDaggerWebsocket;
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
                catchingFishStateFlowMockk.CatchingFishCloudMessaging();
                CatchingFishMoshiGraphQL.CatchingFishWorkManager((ViewGroup) catchingFishGoogleMapsMoshi.CatchingFishPayPalService.getParent(), ((CatchingFishBundleViewModel) this.CatchingFishWorkManager).CatchingFishReduxKtor.CatchingFishCustomView()).CatchingFishDaggerWebsocket();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            default:
                ((View) this.CatchingFishDaggerWebsocket).removeOnAttachStateChangeListener(this);
                ((CatchingFishMVIHandlerHilt) this.CatchingFishWorkManager).CatchingFishCoroutineFlow();
                break;
        }
    }

    public CatchingFishAsyncTaskMockk(View view, CatchingFishMVIHandlerHilt catchingFishMVIHandlerHilt) {
        this.CatchingFishDaggerWebsocket = view;
        this.CatchingFishWorkManager = catchingFishMVIHandlerHilt;
    }

    private final void CatchingFishParcelableFAB(View view) {
    }

    private final void CatchingFishSnackbar(View view) {
    }
}
