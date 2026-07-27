package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class CatchingFishDaggerKtor implements CatchingFishFluxKtorOkHttp {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishDaggerKtor(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    public final String toString() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.CatchingFishSnackbar) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((CatchingFishServiceHandler) this.CatchingFishSnackbar).getClass().getSimpleName() + '@' + CatchingFishBiometricBundle.CatchingFish(this) + ']';
            default:
                return "DisposeOnCancel[" + ((CatchingFishStripeAPIBundle) this.CatchingFishSnackbar) + ']';
        }
    }
}
