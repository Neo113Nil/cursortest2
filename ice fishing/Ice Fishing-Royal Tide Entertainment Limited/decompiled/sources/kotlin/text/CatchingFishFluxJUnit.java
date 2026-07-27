package kotlin.text;

import android.view.accessibility.AccessibilityEvent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFluxJUnit extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishFABViewModel CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishFluxJUnit(CatchingFishFABViewModel catchingFishFABViewModel, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishFABViewModel;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = this.CatchingFishWorkManager;
                return Boolean.valueOf(catchingFishFABViewModel.CatchingFishReduxKtor.getParent().requestSendAccessibilityEvent(catchingFishFABViewModel.CatchingFishReduxKtor, (AccessibilityEvent) obj));
            default:
                CatchingFishManifestHiltFAB catchingFishManifestHiltFAB = (CatchingFishManifestHiltFAB) obj;
                if (catchingFishManifestHiltFAB.CatchingFishDaggerWebsocket.contains(catchingFishManifestHiltFAB)) {
                    CatchingFishFABViewModel catchingFishFABViewModel2 = this.CatchingFishWorkManager;
                    catchingFishFABViewModel2.CatchingFishReduxKtor.getSnapshotObserver().CatchingFishParcelableFAB(catchingFishManifestHiltFAB, catchingFishFABViewModel2.CatchingFishHandler, new CatchingFishViewPagerRedux(catchingFishManifestHiltFAB, catchingFishFABViewModel2));
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
