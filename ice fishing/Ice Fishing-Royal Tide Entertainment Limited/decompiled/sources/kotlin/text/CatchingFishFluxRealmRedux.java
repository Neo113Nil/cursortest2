package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class CatchingFishFluxRealmRedux implements Runnable {
    public final /* synthetic */ CatchingFishWidgetMVVMAdMob CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFluxRealmRedux(CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishWidgetMVVMAdMob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.CatchingFishDaggerWebsocket.CatchingFishWorkManager.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                return;
            default:
                CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = this.CatchingFishDaggerWebsocket;
                synchronized (catchingFishWidgetMVVMAdMob) {
                    try {
                        if (catchingFishWidgetMVVMAdMob.CatchingFish) {
                            return;
                        }
                        CatchingFishMVIRecyclerView catchingFishMVIRecyclerView = catchingFishWidgetMVVMAdMob.CatchingFishLayout;
                        int i = catchingFishWidgetMVVMAdMob.CatchingFishCoroutineFlow ? catchingFishWidgetMVVMAdMob.CatchingFishJetpackCompose : -1;
                        catchingFishWidgetMVVMAdMob.CatchingFishJetpackCompose++;
                        catchingFishWidgetMVVMAdMob.CatchingFishCoroutineFlow = true;
                        if (i == -1) {
                            try {
                                catchingFishMVIRecyclerView.CatchingFishParcelableFAB(9, CatchingFishWebSocketMockk.CatchingFishViewModelScope);
                                return;
                            } catch (IOException e) {
                                catchingFishWidgetMVVMAdMob.CatchingFishCoroutine(e);
                                return;
                            }
                        }
                        catchingFishWidgetMVVMAdMob.CatchingFishCoroutine(new SocketTimeoutException("sent ping but didn't receive pong within " + catchingFishWidgetMVVMAdMob.CatchingFishReduxKtor + "ms (after " + (i - 1) + " successful ping/pongs)"));
                        return;
                    } finally {
                    }
                }
        }
    }
}
