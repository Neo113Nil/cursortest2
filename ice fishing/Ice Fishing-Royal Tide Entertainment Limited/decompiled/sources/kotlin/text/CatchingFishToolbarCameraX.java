package kotlin.text;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishToolbarCameraX implements View.OnClickListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishToolbarCameraX(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishGradleSpannable) this.CatchingFishDaggerWebsocket).CatchingFishParcelableFAB();
                break;
            case 1:
                CatchingFishMVPWebsocket catchingFishMVPWebsocket = (CatchingFishMVPWebsocket) this.CatchingFishDaggerWebsocket;
                catchingFishMVPWebsocket.CatchingFishDaggerHiltFAB.obtainMessage(1, catchingFishMVPWebsocket.CatchingFishSnackbar).sendToTarget();
                break;
            case 2:
                CatchingFishRetrofitRealm catchingFishRetrofitRealm = (CatchingFishRetrofitRealm) this.CatchingFishDaggerWebsocket;
                int i = catchingFishRetrofitRealm.CatchingFishMoshiDaggerHilt;
                if (i != 2) {
                    if (i == 1) {
                        catchingFishRetrofitRealm.CatchingFishJobScheduler(2);
                        catchingFishRetrofitRealm.CatchingFishNavigationGson.announceForAccessibility(catchingFishRetrofitRealm.CatchingFishCardViewView().getResources().getString(R.string.mtrl_picker_toggled_to_year_selection));
                        break;
                    }
                } else {
                    catchingFishRetrofitRealm.CatchingFishJobScheduler(1);
                    catchingFishRetrofitRealm.CatchingFishRedux.announceForAccessibility(catchingFishRetrofitRealm.CatchingFishCardViewView().getResources().getString(R.string.mtrl_picker_toggled_to_day_selection));
                    break;
                }
                break;
            default:
                CatchingFishKtorUnitTesting catchingFishKtorUnitTesting = ((Toolbar) this.CatchingFishDaggerWebsocket).CatchingFishGradleManifest;
                CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishKtorUnitTesting == null ? null : catchingFishKtorUnitTesting.CatchingFishDaggerWebsocket;
                if (catchingFishKtorAdMob != null) {
                    catchingFishKtorAdMob.collapseActionView();
                    break;
                }
                break;
        }
    }
}
