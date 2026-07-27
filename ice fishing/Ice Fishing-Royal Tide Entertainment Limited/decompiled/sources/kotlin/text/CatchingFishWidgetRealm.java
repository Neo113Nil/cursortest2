package kotlin.text;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishWidgetRealm implements View.OnFocusChangeListener {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishDaggerFlux CatchingFishSnackbar;

    public /* synthetic */ CatchingFishWidgetRealm(CatchingFishDaggerFlux catchingFishDaggerFlux, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishDaggerFlux;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishServiceCardView catchingFishServiceCardView = (CatchingFishServiceCardView) this.CatchingFishSnackbar;
                catchingFishServiceCardView.CatchingFishJetpackCompose(catchingFishServiceCardView.CatchingFishCoroutineFlow());
                break;
            default:
                CatchingFishJUnitBundle catchingFishJUnitBundle = (CatchingFishJUnitBundle) this.CatchingFishSnackbar;
                catchingFishJUnitBundle.CatchingFishEspressoTesting = z;
                catchingFishJUnitBundle.CatchingFishRoomDatabase();
                if (!z) {
                    catchingFishJUnitBundle.CatchingFishJetpackCompose(false);
                    catchingFishJUnitBundle.CatchingFishOkHttp = false;
                    break;
                }
                break;
        }
    }
}
