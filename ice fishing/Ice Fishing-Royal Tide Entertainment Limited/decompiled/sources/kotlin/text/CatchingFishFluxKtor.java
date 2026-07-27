package kotlin.text;

import android.os.Bundle;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFluxKtor {
    public final int CatchingFishCoroutine;
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final int CatchingFishParcelableFAB;
    public final Bundle CatchingFishReduxKtor;
    public final CatchingFishAndroidXPayPal CatchingFishSnackbar = new CatchingFishAndroidXPayPal();

    public CatchingFishFluxKtor(int i, int i2, Bundle bundle, int i3) {
        this.CatchingFishDaggerWebsocket = i3;
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishCoroutine = i2;
        this.CatchingFishReduxKtor = bundle;
    }

    public final boolean CatchingFishParcelableFAB() {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    public final void CatchingFishSnackbar(CatchingFishSnackbarIntent catchingFishSnackbarIntent) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            catchingFishSnackbarIntent.toString();
        }
        this.CatchingFishSnackbar.CatchingFishParcelableFAB.CatchingFishCloudMessaging(catchingFishSnackbarIntent);
    }

    public final String toString() {
        return "Request { what=" + this.CatchingFishCoroutine + " id=" + this.CatchingFishParcelableFAB + " oneWay=" + CatchingFishParcelableFAB() + "}";
    }
}
