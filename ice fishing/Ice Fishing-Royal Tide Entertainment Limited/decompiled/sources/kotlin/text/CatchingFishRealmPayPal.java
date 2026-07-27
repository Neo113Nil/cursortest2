package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;

/* loaded from: classes.dex */
public final class CatchingFishRealmPayPal extends CatchingFishPayPalLifecycle {
    public final /* synthetic */ int CatchingFishDaggerWebsocket = 1;
    public final /* synthetic */ Object CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRealmPayPal(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, Object[] objArr) {
        super("OkHttp %s ping", objArr);
        this.CatchingFishWorkManager = catchingFishSharedFlowMoshi;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = (CatchingFishSharedFlowMoshi) this.CatchingFishWorkManager;
                catchingFishSharedFlowMoshi.getClass();
                try {
                    catchingFishSharedFlowMoshi.CatchingFishSpannableWidget.CatchingFishEspressoTesting(2, 0, false);
                    break;
                } catch (IOException e) {
                    catchingFishSharedFlowMoshi.CatchingFishSnackbar(2, 2, e);
                    return;
                }
            default:
                CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi2 = (CatchingFishSharedFlowMoshi) ((CatchingFishGradleAndroidX) this.CatchingFishWorkManager).CatchingFishWorkManager;
                catchingFishSharedFlowMoshi2.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB(catchingFishSharedFlowMoshi2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRealmPayPal(CatchingFishGradleAndroidX catchingFishGradleAndroidX, Object[] objArr) {
        super("OkHttp %s settings", objArr);
        this.CatchingFishWorkManager = catchingFishGradleAndroidX;
    }
}
