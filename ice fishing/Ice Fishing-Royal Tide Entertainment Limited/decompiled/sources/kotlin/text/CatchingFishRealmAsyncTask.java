package kotlin.text;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishRealmAsyncTask extends CatchingFishPayPalLifecycle {
    public final CatchingFishViewModelIntent CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishDaggerWebSocket CatchingFishViewModelScope;
    public volatile AtomicInteger CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishRealmAsyncTask(CatchingFishDaggerWebSocket catchingFishDaggerWebSocket, CatchingFishViewModelIntent catchingFishViewModelIntent) {
        super("OkHttp %s", catchingFishDaggerWebSocket.CatchingFishWorkManager.CatchingFishParcelableFAB.CatchingFishCloudMessaging());
        this.CatchingFishViewModelScope = catchingFishDaggerWebSocket;
        this.CatchingFishWorkManager = new AtomicInteger(0);
        this.CatchingFishDaggerWebsocket = catchingFishViewModelIntent;
    }

    @Override // kotlin.text.CatchingFishPayPalLifecycle
    public final void CatchingFishParcelableFAB() {
        CatchingFishViewModelIntent catchingFishViewModelIntent = this.CatchingFishDaggerWebsocket;
        CatchingFishDaggerWebSocket catchingFishDaggerWebSocket = this.CatchingFishViewModelScope;
        CatchingFishMoshiMVP catchingFishMoshiMVP = catchingFishDaggerWebSocket.CatchingFishReduxKtor;
        catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket.CatchingFishLayout();
        boolean z = false;
        try {
            try {
                try {
                    catchingFishViewModelIntent.CatchingFishCoroutineFlow(catchingFishDaggerWebSocket.CatchingFishParcelableFAB());
                } catch (IOException e) {
                    e = e;
                    z = true;
                    if (z) {
                        CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishOkHttp(4, "Callback failure for " + catchingFishDaggerWebSocket.CatchingFishSnackbar(), e);
                    } else {
                        ((CatchingFishWidgetMVVMAdMob) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishCoroutine(e);
                    }
                    catchingFishMoshiMVP.CatchingFishReduxKtor.CatchingFishEspressoTesting(this);
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket.CatchingFishParcelableFAB();
                    if (!z) {
                        IOException iOException = new IOException("canceled due to " + th);
                        iOException.addSuppressed(th);
                        ((CatchingFishWidgetMVVMAdMob) catchingFishViewModelIntent.CatchingFishWorkManager).CatchingFishCoroutine(iOException);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                catchingFishMoshiMVP.CatchingFishReduxKtor.CatchingFishEspressoTesting(this);
                throw th2;
            }
        } catch (IOException e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
        }
        catchingFishMoshiMVP.CatchingFishReduxKtor.CatchingFishEspressoTesting(this);
    }
}
