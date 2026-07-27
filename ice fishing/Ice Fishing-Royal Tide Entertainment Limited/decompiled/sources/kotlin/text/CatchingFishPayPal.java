package kotlin.text;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishPayPal implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishPayPal(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishFABViewModel catchingFishFABViewModel = (CatchingFishFABViewModel) this.CatchingFishSnackbar;
                catchingFishFABViewModel.CatchingFishCloudMessaging = catchingFishFABViewModel.CatchingFishViewModelScope.getEnabledAccessibilityServiceList(-1);
                break;
            default:
                CatchingFishJUnitBundle catchingFishJUnitBundle = (CatchingFishJUnitBundle) this.CatchingFishSnackbar;
                AutoCompleteTextView autoCompleteTextView = catchingFishJUnitBundle.CatchingFishViewModelFAB;
                if (autoCompleteTextView != null && !CatchingFishXMLLayoutGlide.CatchingFishParcelableFlux(autoCompleteTextView)) {
                    catchingFishJUnitBundle.CatchingFishReduxKtor.setImportantForAccessibility(z ? 2 : 1);
                    break;
                }
                break;
        }
    }
}
