package kotlin.text;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFragmentPayPal extends CatchingFishViewWebsocket implements CatchingFishJUnitGlide {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishGradleCameraX CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishFragmentPayPal(CatchingFishGradleCameraX catchingFishGradleCameraX, int i) {
        super(0);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishGradleCameraX;
    }

    @Override // kotlin.text.CatchingFishJUnitGlide
    public final Object CatchingFishParcelableFAB() {
        int actionMasked;
        CatchingFishWidgetAdMob catchingFishWidgetAdMob;
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGradleCameraX catchingFishGradleCameraX = this.CatchingFishWorkManager;
                MotionEvent motionEvent = catchingFishGradleCameraX.CatchingFishGraphQLGlide;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    catchingFishGradleCameraX.CatchingFishStateFlowIntent = SystemClock.uptimeMillis();
                    catchingFishGradleCameraX.post(catchingFishGradleCameraX.CatchingFishRealmKtorRealm);
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                catchingFishWidgetAdMob = this.CatchingFishWorkManager.get_viewTreeOwners();
                return catchingFishWidgetAdMob;
        }
    }
}
