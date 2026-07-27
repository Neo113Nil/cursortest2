package kotlin.text;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVVMGson implements Runnable {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final /* synthetic */ Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishMVVMGson(int i, int i2, Object obj) {
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishWorkManager = obj;
        this.CatchingFishDaggerWebsocket = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((CatchingFishOkHttpFAB) this.CatchingFishWorkManager).CatchingFishSensorManager(this.CatchingFishDaggerWebsocket);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.CatchingFishWorkManager;
                View view = (View) sideSheetBehavior.CatchingFishStateLiveData.get();
                if (view != null) {
                    sideSheetBehavior.CatchingFishJetpackCompose(view, this.CatchingFishDaggerWebsocket, false);
                    break;
                }
                break;
        }
    }
}
