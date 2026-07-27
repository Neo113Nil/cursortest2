package kotlin.text;

import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGoogleMapsRoom implements Runnable {
    public final /* synthetic */ ComponentActivity CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishGoogleMapsRoom(ComponentActivity componentActivity, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.CatchingFishReduxKtor;
        ComponentActivity componentActivity = this.CatchingFishDaggerWebsocket;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity.CatchingFishWorkManager(componentActivity);
                break;
            default:
                int i2 = ComponentActivity.CatchingFishParcelableFlux;
                componentActivity.invalidateOptionsMenu();
                break;
        }
    }
}
