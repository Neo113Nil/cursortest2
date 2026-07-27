package kotlin.text;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishWebSocketGson implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ CatchingFishJUnitToastKtor CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ View CatchingFishSnackbar;

    public /* synthetic */ CatchingFishWebSocketGson(CatchingFishJUnitToastKtor catchingFishJUnitToastKtor, View view, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishCoroutine = catchingFishJUnitToastKtor;
        this.CatchingFishSnackbar = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.CatchingFishCoroutine;
                if (z && hideBottomViewOnScrollBehavior.CatchingFishFragmentHandler == 1) {
                    hideBottomViewOnScrollBehavior.CatchingFishNavigation(this.CatchingFishSnackbar);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.CatchingFishCoroutine;
                if (z && hideViewOnScrollBehavior.CatchingFishFragmentHandler == 1) {
                    hideViewOnScrollBehavior.CatchingFish(this.CatchingFishSnackbar);
                    break;
                }
                break;
        }
    }
}
