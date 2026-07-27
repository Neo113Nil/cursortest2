package kotlin.text;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishMoshiToolbar implements Runnable {
    public final /* synthetic */ ActionBarOverlayLayout CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMoshiToolbar(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.CatchingFishDaggerWebsocket;
                actionBarOverlayLayout.CatchingFishDaggerWebsocket();
                actionBarOverlayLayout.CatchingFishCardViewRealm = actionBarOverlayLayout.CatchingFishViewModelScope.animate().translationY(0.0f).setListener(actionBarOverlayLayout.CatchingFishPayPal);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.CatchingFishDaggerWebsocket;
                actionBarOverlayLayout2.CatchingFishDaggerWebsocket();
                actionBarOverlayLayout2.CatchingFishCardViewRealm = actionBarOverlayLayout2.CatchingFishViewModelScope.animate().translationY(-actionBarOverlayLayout2.CatchingFishViewModelScope.getHeight()).setListener(actionBarOverlayLayout2.CatchingFishPayPal);
                break;
        }
    }
}
