package kotlin.text;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishIntentWidget extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishStateFlowRealm CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishIntentWidget(CatchingFishStateFlowRealm catchingFishStateFlowRealm, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishStateFlowRealm;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishHiltSnackbar catchingFishHiltSnackbar = (CatchingFishHiltSnackbar) obj;
                CatchingFishStateFlowRealm catchingFishStateFlowRealm = this.CatchingFishWorkManager;
                View CatchingFishViewModelScope = CatchingFishAdMobFAB.CatchingFishViewModelScope(catchingFishStateFlowRealm);
                if (!CatchingFishViewModelScope.isFocused() && !CatchingFishViewModelScope.hasFocus()) {
                    if (!CatchingFishRobolectricHilt.CatchingFishMotionLayout(CatchingFishViewModelScope, CatchingFishRobolectricHilt.CatchingFishRecyclerView(catchingFishHiltSnackbar.CatchingFishParcelableFAB), CatchingFishAdMobFAB.CatchingFishWorkManager(((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishStateFlowRealm)).getFocusOwner(), CatchingFishBiometricBundle.CatchingFishPayPalService(catchingFishStateFlowRealm), CatchingFishViewModelScope))) {
                        catchingFishHiltSnackbar.CatchingFishSnackbar = true;
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishHiltSnackbar catchingFishHiltSnackbar2 = (CatchingFishHiltSnackbar) obj;
                CatchingFishStateFlowRealm catchingFishStateFlowRealm2 = this.CatchingFishWorkManager;
                View CatchingFishViewModelScope2 = CatchingFishAdMobFAB.CatchingFishViewModelScope(catchingFishStateFlowRealm2);
                if (CatchingFishViewModelScope2.hasFocus()) {
                    CatchingFishViewManifest focusOwner = ((CatchingFishGradleCameraX) CatchingFishXMLLayoutGlide.CatchingFishPayPalService(catchingFishStateFlowRealm2)).getFocusOwner();
                    View CatchingFishPayPalService = CatchingFishBiometricBundle.CatchingFishPayPalService(catchingFishStateFlowRealm2);
                    if (CatchingFishViewModelScope2 instanceof ViewGroup) {
                        Rect CatchingFishWorkManager = CatchingFishAdMobFAB.CatchingFishWorkManager(focusOwner, CatchingFishPayPalService, CatchingFishViewModelScope2);
                        Integer CatchingFishRecyclerView = CatchingFishRobolectricHilt.CatchingFishRecyclerView(catchingFishHiltSnackbar2.CatchingFishParcelableFAB);
                        int intValue = CatchingFishRecyclerView != null ? CatchingFishRecyclerView.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = catchingFishStateFlowRealm2.CatchingFishNavigation;
                        View findNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) CatchingFishPayPalService, view, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) CatchingFishPayPalService, CatchingFishWorkManager, intValue);
                        if (findNextFocus != null && CatchingFishAdMobFAB.CatchingFishDaggerWebsocket(CatchingFishViewModelScope2, findNextFocus)) {
                            findNextFocus.requestFocus(intValue, CatchingFishWorkManager);
                            catchingFishHiltSnackbar2.CatchingFishSnackbar = true;
                        } else if (!CatchingFishPayPalService.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!CatchingFishPayPalService.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
        }
    }
}
